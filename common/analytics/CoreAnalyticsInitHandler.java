package com.google.android.gms.common.analytics;

import android.content.Intent;
import defpackage.apzs;
import defpackage.aszh;
import defpackage.aszi;
import defpackage.auid;
import defpackage.auqz;
import defpackage.aura;
import defpackage.aurb;
import defpackage.ausn;
import defpackage.epng;
import defpackage.epnn;
import defpackage.epno;
import defpackage.fpks;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class CoreAnalyticsInitHandler extends apzs {
    static {
        ausn.b("CoreAnalyticsInit", auid.CORE);
    }

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        if ((i & 2) > 0) {
            aszi.c();
            aszi.b(this, 9, fpks.a.lK().b());
        }
        if ((i & 8) > 0) {
            int i2 = getSharedPreferences("coreanalyticsprefs", 0).getInt("last_install_version_code", 0);
            auqz auqzVar = aura.a;
            int a = aurb.a(this);
            if (i2 != a) {
                aszh.a();
                epnn epnnVar = (epnn) epno.a.v();
                epng b = aszh.b(this);
                if (!epnnVar.b.L()) {
                    epnnVar.U();
                }
                epno epnoVar = (epno) epnnVar.b;
                b.getClass();
                epnoVar.c = b;
                epnoVar.b |= 1;
                aszh.c("install", (epno) epnnVar.Q());
                getSharedPreferences("coreanalyticsprefs", 0).edit().putInt("last_install_version_code", a).apply();
            }
            aszi.c();
            aszi.b(this, 10, fpks.c());
        }
    }
}
