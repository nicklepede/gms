package com.google.android.gms.ads.nonagon.csi;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.ads.internal.config.p;
import com.google.android.gms.ads.internal.util.client.m;
import com.google.android.gms.ads.internal.util.q;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class i {
    protected final Map a;
    protected final Context b;
    protected final Executor c;
    protected final m d;
    protected final boolean e;
    public final AtomicReference f;
    private final com.google.android.gms.ads.nonagon.util.logging.csi.c g;
    private final boolean h;
    private final boolean i;
    private final AtomicBoolean j;

    public i(Executor executor, m mVar, com.google.android.gms.ads.nonagon.util.logging.csi.c cVar, Context context, byte[] bArr) {
        this(executor, mVar, cVar, context);
        this.a.put("s", "gmob_sdk");
    }

    public final ConcurrentHashMap a() {
        return new ConcurrentHashMap(this.a);
    }

    public final void b(Map map) {
        c(map, false);
    }

    public final void c(Map map, boolean z) {
        if (map.isEmpty()) {
            int i = com.google.android.gms.ads.internal.util.c.a;
            com.google.android.gms.ads.internal.util.client.h.d("Empty paramMap.");
            return;
        }
        if (map.isEmpty()) {
            int i2 = com.google.android.gms.ads.internal.util.c.a;
            com.google.android.gms.ads.internal.util.client.h.d("Empty or null paramMap.");
        } else {
            if (!this.j.getAndSet(true)) {
                final String str = (String) p.br.g();
                this.f.set(q.a(this.b, str, new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.ads.nonagon.csi.h
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str2) {
                        i iVar = i.this;
                        iVar.f.set(q.b(iVar.b, str));
                    }
                }));
            }
            Bundle bundle = (Bundle) this.f.get();
            for (String str2 : bundle.keySet()) {
                map.put(str2, String.valueOf(bundle.get(str2)));
            }
        }
        Uri.Builder buildUpon = Uri.parse(this.g.a).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        final String uri = buildUpon.build().toString();
        boolean parseBoolean = Boolean.parseBoolean((String) map.get("scar"));
        if (this.e) {
            if (!z || this.h) {
                if (!parseBoolean || this.i) {
                    this.c.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.csi.g
                        @Override // java.lang.Runnable
                        public final void run() {
                            i.this.d.a(uri);
                        }
                    });
                }
            }
        }
    }

    protected i(Executor executor, m mVar, com.google.android.gms.ads.nonagon.util.logging.csi.c cVar, Context context) {
        this.a = new HashMap();
        this.j = new AtomicBoolean();
        this.f = new AtomicReference(new Bundle());
        this.c = executor;
        this.d = mVar;
        this.e = ((Boolean) p.M.g()).booleanValue();
        this.g = cVar;
        this.h = ((Boolean) p.N.g()).booleanValue();
        this.i = ((Boolean) p.aS.g()).booleanValue();
        this.b = context;
    }
}
