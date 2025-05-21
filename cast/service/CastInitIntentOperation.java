package com.google.android.gms.cast.service;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.chimera.modules.cast.AppContextProvider;
import defpackage.amlm;
import defpackage.anhk;
import defpackage.annw;
import defpackage.anoc;
import defpackage.anya;
import defpackage.asbo;
import defpackage.asnz;
import defpackage.bxdd;
import defpackage.bxdf;
import defpackage.bxdg;
import defpackage.bxek;
import defpackage.dfee;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class CastInitIntentOperation extends anya {
    static final String[] a = {"CAST_ACTIVE_NETWORK_MAP", "PREF_CAST_SENDER_NONCE", "PREF_CAST_SENDER_ID"};
    private final annw b = new annw("CastInitIntentOperation");

    private final void e() {
        asbo f = asbo.f(AppContextProvider.a());
        Set b = new anhk(this, asnz.a).b();
        if (f == null || b.isEmpty()) {
            return;
        }
        this.b.p("Removing %d RCNs: %s", Integer.valueOf(b.size()), TextUtils.join(", ", b));
        Iterator it = b.iterator();
        while (it.hasNext()) {
            f.o("CastRCN", ((Integer) it.next()).intValue(), dfee.CAST_REMOTE_CONTROL_NOTIFICATION);
        }
    }

    @Override // defpackage.anya
    protected final void a(Intent intent, boolean z) {
        String[] strArr = a;
        for (int i = 0; i < 3; i++) {
            String str = strArr[i];
            bxdd c = anoc.e(getApplicationContext()).c();
            bxdf a2 = bxek.a(getApplicationContext(), "cast", str, 0);
            Map d = bxdg.d(a2);
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
            bxdg.f(c);
            bxdd c2 = a2.c();
            c2.d();
            bxdg.f(c2);
        }
        e();
    }

    @Override // defpackage.anya
    protected final void c(Intent intent, boolean z) {
        e();
    }

    @Override // defpackage.anya
    protected final void d(Intent intent) {
        Context applicationContext = getApplicationContext();
        String str = amlm.a;
        bxdf e = anoc.e(applicationContext);
        bxdd c = e.c();
        c.j("PREF_CAST_SENDER_NONCE");
        bxdg.f(c);
        bxdd c2 = e.c();
        c2.j("PREF_CAST_SENDER_NONCE_GENERATED_TIME");
        bxdg.f(c2);
    }
}
