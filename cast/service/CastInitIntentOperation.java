package com.google.android.gms.cast.service;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.chimera.modules.cast.AppContextProvider;
import defpackage.aomx;
import defpackage.apix;
import defpackage.appp;
import defpackage.appv;
import defpackage.apzs;
import defpackage.aued;
import defpackage.aurt;
import defpackage.bzlt;
import defpackage.bzlv;
import defpackage.bzlw;
import defpackage.bzna;
import defpackage.dhpk;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class CastInitIntentOperation extends apzs {
    static final String[] a = {"CAST_ACTIVE_NETWORK_MAP", "PREF_CAST_SENDER_NONCE", "PREF_CAST_SENDER_ID"};
    private final appp b = new appp("CastInitIntentOperation");

    private final void e() {
        aued f = aued.f(AppContextProvider.a());
        Set b = new apix(this, aurt.a).b();
        if (f == null || b.isEmpty()) {
            return;
        }
        this.b.p("Removing %d RCNs: %s", Integer.valueOf(b.size()), TextUtils.join(", ", b));
        Iterator it = b.iterator();
        while (it.hasNext()) {
            f.o("CastRCN", ((Integer) it.next()).intValue(), dhpk.CAST_REMOTE_CONTROL_NOTIFICATION);
        }
    }

    @Override // defpackage.apzs
    protected final void a(Intent intent, boolean z) {
        String[] strArr = a;
        for (int i = 0; i < 3; i++) {
            String str = strArr[i];
            bzlt c = appv.e(getApplicationContext()).c();
            bzlv a2 = bzna.a(getApplicationContext(), "cast", str, 0);
            Map d = bzlw.d(a2);
            for (String str2 : d.keySet()) {
                Object obj = d.get(str2);
                if (obj instanceof Boolean) {
                    c.e(str2, ((Boolean) obj).booleanValue());
                } else if (obj instanceof String) {
                    c.h(str2, (String) obj);
                } else if (obj instanceof Float) {
                    c.c(str2, ((Float) obj).floatValue());
                } else if (obj instanceof Integer) {
                    c.f(str2, ((Integer) obj).intValue());
                } else if (obj instanceof Long) {
                    c.g(str2, ((Long) obj).longValue());
                } else if (obj instanceof Set) {
                    c.i(str2, (Set) obj);
                }
            }
            bzlw.f(c);
            bzlt c2 = a2.c();
            c2.d();
            bzlw.f(c2);
        }
        e();
    }

    @Override // defpackage.apzs
    protected final void c(Intent intent, boolean z) {
        e();
    }

    @Override // defpackage.apzs
    protected final void d(Intent intent) {
        Context applicationContext = getApplicationContext();
        String str = aomx.a;
        bzlv e = appv.e(applicationContext);
        bzlt c = e.c();
        c.j("PREF_CAST_SENDER_NONCE");
        bzlw.f(c);
        bzlt c2 = e.c();
        c2.j("PREF_CAST_SENDER_NONCE_GENERATED_TIME");
        bzlw.f(c2);
    }
}
