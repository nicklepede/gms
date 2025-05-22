package com.google.android.gms.drivingmode;

import android.content.Intent;
import android.util.Log;
import defpackage.aztf;
import defpackage.azug;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class DrivingModeLocationFrxIntentOperation extends aztf {
    @Override // defpackage.aztf, com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        Log.i("CAR.DRIVINGMODE", "DrivingModeFrxIntentOperation onHandleIntent from location module");
        if ("com.google.android.gms.drivingmode.GEARHEAD_FRX_COMPLETED".equals(intent.getAction())) {
            azug.b();
            getApplicationContext().getSharedPreferences("driving_mode_frx_prefs", 0).edit().putBoolean("gearhead_frx_completed", true).apply();
        }
    }
}
