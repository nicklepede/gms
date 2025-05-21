package com.google.android.gms.magictether.host;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.fpzd;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class CryptauthDeviceSyncIntentOperation extends IntentOperation {
    public CryptauthDeviceSyncIntentOperation() {
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (fpzd.e() && "com.google.android.gms.auth.proximity.DEVICE_SYNC_FINISHED".equals(intent.getAction())) {
            startService(TetherListenerChimeraService.a(this));
        }
    }

    CryptauthDeviceSyncIntentOperation(Context context) {
        attachBaseContext(context);
    }
}
