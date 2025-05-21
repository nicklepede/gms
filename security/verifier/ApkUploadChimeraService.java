package com.google.android.gms.security.verifier;

import android.content.ComponentName;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import defpackage.cyrt;
import defpackage.czff;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class ApkUploadChimeraService extends Service {
    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null || intent.getAction() == null || !intent.getAction().equals("com.google.android.gms.security.verifyapps.UPLOAD_APK")) {
            czff.a("Ignoring unrecognized intent: %s", intent.toString());
        } else {
            intent.setComponent(new ComponentName(this, cyrt.c(InternalApkUploadChimeraService.class)));
            startService(intent);
        }
        stopSelf(i2);
        return 3;
    }
}
