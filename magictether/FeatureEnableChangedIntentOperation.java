package com.google.android.gms.magictether;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.magictether.wifisync.WifiSyncChimeraService;
import defpackage.esjn;
import defpackage.fpzu;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class FeatureEnableChangedIntentOperation extends IntentOperation {
    public FeatureEnableChangedIntentOperation() {
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (fpzu.g() || !fpzu.e() || intent == null || !"com.google.android.gms.auth.proximity.ACTION_FEATURE_ENABLED_CHANGE".equals(intent.getAction())) {
            return;
        }
        if (esjn.WIFI_SYNC_HOST.name().equals(intent.getStringExtra("EXTRA_FEATURE_NAME"))) {
            startService(WifiSyncChimeraService.a(this));
        }
    }

    FeatureEnableChangedIntentOperation(Context context) {
        attachBaseContext(context);
    }
}
