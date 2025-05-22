package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.HurlStack;
import com.android.volley.toolbox.Volley;
import defpackage.aurj;
import defpackage.eqgl;
import java.util.Map;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class aa {
    private static RequestQueue a;
    private static final Object b = new Object();

    public aa(Context context) {
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (b) {
            if (a == null) {
                com.google.android.gms.ads.internal.config.p.c(context);
                a = (aurj.d() || !((Boolean) com.google.android.gms.ads.internal.config.p.as.g()).booleanValue()) ? Volley.newRequestQueue(context) : r.a(context, new r(context, new HurlStack()));
            }
        }
    }

    public final eqgl a(int i, String str, Map map, byte[] bArr) {
        x xVar = new x();
        v vVar = new v(str, xVar);
        new com.google.android.gms.ads.internal.util.client.g(null);
        w wVar = new w(i, str, xVar, vVar, bArr, map);
        com.google.android.gms.ads.internal.util.client.g.a();
        a.add(wVar);
        return xVar;
    }
}
