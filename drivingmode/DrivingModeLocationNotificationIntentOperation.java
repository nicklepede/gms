package com.google.android.gms.drivingmode;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.R;
import defpackage.axpq;
import defpackage.axpt;
import defpackage.elxv;
import defpackage.elxw;
import defpackage.flvi;
import defpackage.ijy;
import defpackage.ikb;
import defpackage.ikd;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class DrivingModeLocationNotificationIntentOperation extends axpt {
    @Override // defpackage.axpt, com.google.android.chimera.IntentOperation
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
        this.b.b(elxw.DRIVING_MODE, elxv.hP);
        axpq axpqVar = this.a;
        axpqVar.j();
        long c2 = flvi.c();
        axpqVar.a.i("CAR.DRIVINGMODE", 3, SystemClock.elapsedRealtime() + c2, axpqVar.e(), "");
        Context context = axpqVar.c;
        ijy ijyVar = new ijy(0, context.getString(R.string.car_driving_mode_common_turn_on), axpqVar.d());
        ijy ijyVar2 = new ijy(0, context.getString(R.string.car_driving_mode_notification_stop_title), axpqVar.b());
        String h = axpqVar.h(c2, R.plurals.car_driving_mode_notification_eta_mins, R.plurals.car_driving_mode_notification_eta_secs);
        ikd f = axpqVar.f();
        f.l(h);
        ikb ikbVar = new ikb();
        ikbVar.d(h);
        f.v(ikbVar);
        f.r(true);
        f.i(ijyVar);
        f.i(ijyVar2);
        axpqVar.p(50384636, f.b());
    }
}
