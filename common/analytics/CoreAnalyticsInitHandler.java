package com.google.android.gms.common.analytics;

import android.content.Intent;
import defpackage.anya;
import defpackage.aqws;
import defpackage.aqwt;
import defpackage.asej;
import defpackage.asnf;
import defpackage.asng;
import defpackage.asnh;
import defpackage.asot;
import defpackage.emzp;
import defpackage.emzw;
import defpackage.emzx;
import defpackage.fmsu;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class CoreAnalyticsInitHandler extends anya {
    static {
        asot.b("CoreAnalyticsInit", asej.CORE);
    }

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        if ((i & 2) > 0) {
            aqwt.c();
            aqwt.b(this, 9, fmsu.a.a().b());
        }
        if ((i & 8) > 0) {
            int i2 = getSharedPreferences("coreanalyticsprefs", 0).getInt("last_install_version_code", 0);
            asnf asnfVar = asng.a;
            int a = asnh.a(this);
            if (i2 != a) {
                aqws.a();
                emzw emzwVar = (emzw) emzx.a.v();
                emzp b = aqws.b(this);
                if (!emzwVar.b.L()) {
                    emzwVar.U();
                }
                emzx emzxVar = (emzx) emzwVar.b;
                b.getClass();
                emzxVar.c = b;
                emzxVar.b |= 1;
                aqws.c("install", (emzx) emzwVar.Q());
                getSharedPreferences("coreanalyticsprefs", 0).edit().putInt("last_install_version_code", a).apply();
            }
            aqwt.c();
            aqwt.b(this, 10, fmsu.c());
        }
    }
}
