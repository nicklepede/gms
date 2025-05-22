package com.google.android.gms.security.safebrowsing;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.cauf;
import defpackage.dbeu;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class SafeBrowsingUpdateTaskChimeraService extends GmsTaskChimeraService {
    private final IBinder a = new dbeu();

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        long j = SafeBrowsingUpdateChimeraIntentService.a;
        startService(IntentOperation.getStartIntent(this, SafeBrowsingUpdateChimeraIntentService.class, "com.google.android.gms.security.safebrowsing.ACTION_XLB_UPDATE"));
        return 0;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final void gf() {
        SafeBrowsingUpdateChimeraIntentService.a(this);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        IBinder onBind = super.onBind(intent);
        return onBind != null ? onBind : this.a;
    }
}
