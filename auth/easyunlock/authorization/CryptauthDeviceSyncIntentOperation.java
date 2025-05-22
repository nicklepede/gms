package com.google.android.gms.auth.easyunlock.authorization;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.fnpd;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class CryptauthDeviceSyncIntentOperation extends IntentOperation {
    public CryptauthDeviceSyncIntentOperation() {
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (fnpd.d() && Objects.equals(intent.getAction(), "com.google.android.gms.auth.proximity.DEVICE_SYNC_FINISHED")) {
            startService(EasyUnlockChimeraService.a(this));
        }
    }

    public CryptauthDeviceSyncIntentOperation(Context context) {
        attachBaseContext(context);
    }
}
