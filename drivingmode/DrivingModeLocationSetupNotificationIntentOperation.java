package com.google.android.gms.drivingmode;

import android.content.Intent;
import android.util.Log;
import defpackage.axqd;
import defpackage.axqe;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class DrivingModeLocationSetupNotificationIntentOperation extends axqd {
    @Override // defpackage.axqd, com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        char c;
        Log.i("CAR.DRIVINGMODE", "DrivingModeNotificationIntentOperation onHandleIntent from location module");
        axqe axqeVar = new axqe(getApplicationContext());
        intent.getAction();
        String action = intent.getAction();
        int hashCode = action.hashCode();
        if (hashCode == -268809479) {
            if (action.equals("com.google.android.drivingmode.SEND_SETUP_NOTIFICATION")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != -185034830) {
            if (hashCode == 1695542314 && action.equals("com.google.android.drivingmode.SETUP_CLEAR_NOTIFICATION")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (action.equals("com.google.android.drivingmode.SETUP_REMIND_ME_LATER")) {
                c = 2;
            }
            c = 65535;
        }
        if (c == 0) {
            axqeVar.l();
            return;
        }
        if (c == 1) {
            Log.i("CAR.DRIVINGMODE", "Setting set up notification to not show again");
            axqeVar.a.edit().putBoolean("do_not_show_notification_again", true).apply();
            axqeVar.k();
        } else if (c != 2) {
            Log.i("CAR.DRIVINGMODE", "Unknown action received in DrivingModeSetupNotificationIntentOperation:".concat(String.valueOf(intent.getAction())));
        } else {
            axqeVar.k();
        }
    }
}
