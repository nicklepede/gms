package com.google.android.gms.gcm.gmsproc.cm;

import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.bkjz;
import defpackage.bkka;
import defpackage.casd;
import defpackage.cauf;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class GcmCmTriggerTaskService extends GmsTaskChimeraService {
    private bkjz a;

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        this.a.c();
        return 0;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        this.a = new bkjz(this, new bkka(this, casd.a(this)));
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.chimera.Service
    public final void onDestroy() {
        super.onDestroy();
        bkjz.d();
    }
}
