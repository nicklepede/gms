package com.google.android.gms.drivingmode;

import android.content.Intent;
import android.util.Log;
import defpackage.axpf;
import defpackage.axqg;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class DrivingModeLocationFrxIntentOperation extends axpf {
    @Override // defpackage.axpf, com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        Log.i("CAR.DRIVINGMODE", "DrivingModeFrxIntentOperation onHandleIntent from location module");
        if ("com.google.android.gms.drivingmode.GEARHEAD_FRX_COMPLETED".equals(intent.getAction())) {
            axqg.b();
            getApplicationContext().getSharedPreferences("driving_mode_frx_prefs", 0).edit().putBoolean("gearhead_frx_completed", true).apply();
        }
    }
}
