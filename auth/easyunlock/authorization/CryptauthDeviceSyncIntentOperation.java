package com.google.android.gms.auth.easyunlock.authorization;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.fkxx;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class CryptauthDeviceSyncIntentOperation extends IntentOperation {
    public CryptauthDeviceSyncIntentOperation() {
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (fkxx.d() && Objects.equals(intent.getAction(), "com.google.android.gms.auth.proximity.DEVICE_SYNC_FINISHED")) {
            startService(EasyUnlockChimeraService.a(this));
        }
    }

    public CryptauthDeviceSyncIntentOperation(Context context) {
        attachBaseContext(context);
    }
}
