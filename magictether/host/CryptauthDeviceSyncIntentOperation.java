package com.google.android.gms.magictether.host;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.fssz;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class CryptauthDeviceSyncIntentOperation extends IntentOperation {
    public CryptauthDeviceSyncIntentOperation() {
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (fssz.e() && "com.google.android.gms.auth.proximity.DEVICE_SYNC_FINISHED".equals(intent.getAction())) {
            startService(TetherListenerChimeraService.a(this));
        }
    }

    CryptauthDeviceSyncIntentOperation(Context context) {
        attachBaseContext(context);
    }
}
