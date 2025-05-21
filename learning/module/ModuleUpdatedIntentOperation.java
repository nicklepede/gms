package com.google.android.gms.learning.module;

import android.content.Intent;
import com.google.android.chimera.config.ModuleManager;
import defpackage.anya;
import defpackage.bqem;
import defpackage.bqex;
import defpackage.bqkp;
import defpackage.bqld;
import defpackage.bqle;
import defpackage.dtgd;
import defpackage.dtgh;
import defpackage.enre;
import defpackage.ensj;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class ModuleUpdatedIntentOperation extends anya {
    @Override // defpackage.anya
    protected final void c(Intent intent, boolean z) {
        bqld.a();
        dtgd b = dtgd.b(this);
        try {
            bqem bqemVar = (bqem) b.c(bqem.class);
            bqex bqexVar = (bqex) b.c(bqex.class);
            long a = ((dtgh) b.c(dtgh.class)).a() - TimeUnit.DAYS.toMillis(bqemVar.z());
            bqkp bqkpVar = (bqkp) b.c(bqkp.class);
            ModuleManager moduleManager = ModuleManager.get(this);
            b.d();
            ensj.t(bqkpVar.a(), new bqle(moduleManager, a, bqemVar, bqexVar, b), enre.a);
            if (b != null) {
                b.close();
            }
        } catch (Throwable th) {
            if (b == null) {
                throw th;
            }
            try {
                b.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }
}
