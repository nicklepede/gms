package com.google.android.gms.gcm.gmsproc.cm;

import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.bifk;
import defpackage.bifl;
import defpackage.byjl;
import defpackage.byln;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class GcmCmTriggerTaskService extends GmsTaskChimeraService {
    private bifk a;

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        this.a.c();
        return 0;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        this.a = new bifk(this, new bifl(this, byjl.a(this)));
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.chimera.Service
    public final void onDestroy() {
        super.onDestroy();
        bifk.d();
    }
}
