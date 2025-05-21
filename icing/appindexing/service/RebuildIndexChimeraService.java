package com.google.android.gms.icing.appindexing.service;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.arwm;
import defpackage.blfp;
import defpackage.blfw;
import defpackage.bljp;
import defpackage.blmk;
import defpackage.blmm;
import defpackage.bltn;
import defpackage.bltp;
import defpackage.byln;
import defpackage.fpaz;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public abstract class RebuildIndexChimeraService extends GmsTaskChimeraService {
    private bltn a;
    private blfp b;

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        blfp blfpVar = this.b;
        if (blfpVar == null) {
            blfw.a("RebuildIndexService is unavailable on this device");
            return 0;
        }
        if (!fpaz.h()) {
            blfw.a("Bail out as 3P appindexing is disabled.");
            return 0;
        }
        arwm.l(Looper.getMainLooper() != Looper.myLooper());
        if (!blfpVar.F()) {
            blfw.a("IndexManager initialization failed. Rescheduling!");
            return 1;
        }
        Context applicationContext = getApplicationContext();
        bltp bltpVar = blfpVar.f;
        arwm.s(bltpVar);
        blmk blmkVar = blfpVar.r;
        new blmm(applicationContext);
        return d(bylnVar, new bljp(applicationContext, bltpVar, blmkVar));
    }

    public abstract int d(byln bylnVar, bljp bljpVar);

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        if (fpaz.j()) {
            bltn c = bltn.c(getApplicationContext());
            this.a = c;
            if (c != null) {
                this.b = c.a();
            }
        }
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.chimera.Service
    public final void onDestroy() {
        bltn bltnVar = this.a;
        if (bltnVar != null) {
            bltnVar.b();
        }
        super.onDestroy();
    }
}
