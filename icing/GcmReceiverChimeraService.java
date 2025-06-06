package com.google.android.gms.icing;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import defpackage.bnmo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class GcmReceiverChimeraService extends Service {
    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        bnmo.d("Received gcm intent: %s extras: %s", intent, intent != null ? intent.getExtras() : "");
        if (intent == null) {
            stopSelf(i2);
            return 2;
        }
        if (!intent.hasExtra("mdh-pn-base64") && intent.hasExtra("icing-gcm-msg-base64")) {
            intent.setClassName(this, "com.google.android.gms.icing.service.IndexWorkerService");
            startService(intent);
        }
        stopSelf(i2);
        return 2;
    }
}
