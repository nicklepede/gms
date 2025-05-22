package com.google.android.gms.drivingmode;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.R;
import defpackage.aztq;
import defpackage.aztt;
import defpackage.eolj;
import defpackage.eolk;
import defpackage.fomr;
import defpackage.ilo;
import defpackage.ilr;
import defpackage.ilt;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class DrivingModeLocationNotificationIntentOperation extends aztt {
    @Override // defpackage.aztt, com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        char c;
        Log.i("CAR.DRIVINGMODE", "DrivingModeNotificationIntentOperation onHandleIntent from location module");
        if (intent.getAction() == null) {
            return;
        }
        String action = intent.getAction();
        int hashCode = action.hashCode();
        if (hashCode != -480690540) {
            if (hashCode == 1918395325 && action.equals("com.google.android.gms.carsetup.drivingmode.NOTIFICATION_LAUNCH_APP_SNOOZE")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (action.equals("com.google.android.gms.carsetup.drivingmode.NOTIFICATION_LAUNCH_APP_SHOW")) {
                c = 1;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c != 1) {
                Log.w("CAR.DRIVINGMODE", "Unexpected notification intent action received: ".concat(String.valueOf(intent.getAction())));
                return;
            } else {
                this.a.k();
                this.a.l();
                return;
            }
        }
        Log.i("CAR.DRIVINGMODE", "Snooze Driving Mode launch from notification.");
        this.b.b(eolk.DRIVING_MODE, eolj.hP);
        aztq aztqVar = this.a;
        aztqVar.j();
        long c2 = fomr.c();
        aztqVar.a.i("CAR.DRIVINGMODE", 3, SystemClock.elapsedRealtime() + c2, aztqVar.e(), "");
        Context context = aztqVar.c;
        ilo iloVar = new ilo(0, context.getString(R.string.car_driving_mode_common_turn_on), aztqVar.d());
        ilo iloVar2 = new ilo(0, context.getString(R.string.car_driving_mode_notification_stop_title), aztqVar.b());
        String h = aztqVar.h(c2, R.plurals.car_driving_mode_notification_eta_mins, R.plurals.car_driving_mode_notification_eta_secs);
        ilt f = aztqVar.f();
        f.j(h);
        ilr ilrVar = new ilr();
        ilrVar.d(h);
        f.o(ilrVar);
        f.v(true);
        f.f(iloVar);
        f.f(iloVar2);
        aztqVar.p(50384636, f.b());
    }
}
