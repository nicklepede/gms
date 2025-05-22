package com.google.android.gms.magictether;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.magictether.wifisync.WifiSyncChimeraService;
import defpackage.euzc;
import defpackage.fstq;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class FeatureEnableChangedIntentOperation extends IntentOperation {
    public FeatureEnableChangedIntentOperation() {
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (fstq.f() || !fstq.d() || intent == null || !"com.google.android.gms.auth.proximity.ACTION_FEATURE_ENABLED_CHANGE".equals(intent.getAction())) {
            return;
        }
        if (euzc.WIFI_SYNC_HOST.name().equals(intent.getStringExtra("EXTRA_FEATURE_NAME"))) {
            startService(WifiSyncChimeraService.a(this));
        }
    }

    FeatureEnableChangedIntentOperation(Context context) {
        attachBaseContext(context);
    }
}
