package com.google.android.gms.security.safebrowsing;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.byln;
import defpackage.cyuw;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class SafeBrowsingUpdateTaskChimeraService extends GmsTaskChimeraService {
    private final IBinder a = new cyuw();

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        long j = SafeBrowsingUpdateChimeraIntentService.a;
        startService(IntentOperation.getStartIntent(this, SafeBrowsingUpdateChimeraIntentService.class, "com.google.android.gms.security.safebrowsing.ACTION_XLB_UPDATE"));
        return 0;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final void fR() {
        SafeBrowsingUpdateChimeraIntentService.a(this);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        IBinder onBind = super.onBind(intent);
        return onBind != null ? onBind : this.a;
    }
}
