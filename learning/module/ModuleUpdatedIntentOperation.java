package com.google.android.gms.learning.module;

import android.content.Intent;
import com.google.android.chimera.config.ModuleManager;
import defpackage.apzs;
import defpackage.bsmc;
import defpackage.bsmn;
import defpackage.bsse;
import defpackage.bsss;
import defpackage.bsst;
import defpackage.dvql;
import defpackage.dvqp;
import defpackage.eqex;
import defpackage.eqgc;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class ModuleUpdatedIntentOperation extends apzs {
    @Override // defpackage.apzs
    protected final void c(Intent intent, boolean z) {
        bsss.a();
        dvql b = dvql.b(this);
        try {
            bsmc bsmcVar = (bsmc) b.c(bsmc.class);
            bsmn bsmnVar = (bsmn) b.c(bsmn.class);
            long a = ((dvqp) b.c(dvqp.class)).a() - TimeUnit.DAYS.toMillis(bsmcVar.z());
            bsse bsseVar = (bsse) b.c(bsse.class);
            ModuleManager moduleManager = ModuleManager.get(this);
            b.d();
            eqgc.t(bsseVar.a(), new bsst(moduleManager, a, bsmcVar, bsmnVar, b), eqex.a);
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
