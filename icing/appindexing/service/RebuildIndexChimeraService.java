package com.google.android.gms.icing.appindexing.service;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.atzb;
import defpackage.bnmh;
import defpackage.bnmo;
import defpackage.bnqh;
import defpackage.bntc;
import defpackage.bnte;
import defpackage.boaf;
import defpackage.boah;
import defpackage.cauf;
import defpackage.frug;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public abstract class RebuildIndexChimeraService extends GmsTaskChimeraService {
    private boaf a;
    private bnmh b;

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        bnmh bnmhVar = this.b;
        if (bnmhVar == null) {
            bnmo.a("RebuildIndexService is unavailable on this device");
            return 0;
        }
        if (!frug.h()) {
            bnmo.a("Bail out as 3P appindexing is disabled.");
            return 0;
        }
        atzb.l(Looper.getMainLooper() != Looper.myLooper());
        if (!bnmhVar.F()) {
            bnmo.a("IndexManager initialization failed. Rescheduling!");
            return 1;
        }
        Context applicationContext = getApplicationContext();
        boah boahVar = bnmhVar.f;
        atzb.s(boahVar);
        bntc bntcVar = bnmhVar.r;
        new bnte(applicationContext);
        return d(caufVar, new bnqh(applicationContext, boahVar, bntcVar));
    }

    public abstract int d(cauf caufVar, bnqh bnqhVar);

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        if (frug.j()) {
            boaf c = boaf.c(getApplicationContext());
            this.a = c;
            if (c != null) {
                this.b = c.a();
            }
        }
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.chimera.Service
    public final void onDestroy() {
        boaf boafVar = this.a;
        if (boafVar != null) {
            boafVar.b();
        }
        super.onDestroy();
    }
}
