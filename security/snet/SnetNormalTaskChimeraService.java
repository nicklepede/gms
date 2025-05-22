package com.google.android.gms.security.snet;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.cauf;
import defpackage.dblt;
import defpackage.fuoj;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class SnetNormalTaskChimeraService extends GmsTaskChimeraService {
    private final IBinder a = new dblt();

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        String str = caufVar.a;
        if (str.hashCode() != -487742654 || !str.equals("event_log_collector_runner") || !fuoj.i()) {
            return 0;
        }
        int i = SnetGcmSchedulerChimeraIntentService.a;
        startService(IntentOperation.getStartIntent(this, SnetGcmSchedulerChimeraIntentService.class, "com.google.android.gms.security.snet.ACTION_EVENT_LOG_COLLECTOR_RUN"));
        return 0;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final void gf() {
        SnetGcmSchedulerChimeraIntentService.a(this);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        IBinder onBind = super.onBind(intent);
        return onBind != null ? onBind : this.a;
    }
}
