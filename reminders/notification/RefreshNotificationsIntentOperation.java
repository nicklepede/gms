package com.google.android.gms.reminders.notification;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.asej;
import defpackage.asit;
import defpackage.asot;
import defpackage.cxhd;
import defpackage.cxhg;
import defpackage.frrk;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class RefreshNotificationsIntentOperation extends IntentOperation {
    public static final /* synthetic */ int b = 0;
    asit a;
    private Context c;

    static {
        asot.b("RemindersNS", asej.REMINDERS);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        this.c = getApplicationContext();
        this.a = new asit(getApplicationContext());
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        char c;
        String action = intent.getAction();
        int hashCode = action.hashCode();
        if (hashCode == -1317652597) {
            if (action.equals("com.google.android.gms.reminders.notification.ACTION_INITIALIZE")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != 190662830) {
            if (hashCode == 505380757 && action.equals("android.intent.action.TIME_SET")) {
                c = 2;
            }
            c = 65535;
        } else {
            if (action.equals("com.google.android.gms.reminders.notification.ACTION_REFRESH_TIME_REMINDERS")) {
                c = 1;
            }
            c = 65535;
        }
        if (c == 0 || c == 1 || c == 2) {
            cxhg.a();
            long currentTimeMillis = System.currentTimeMillis();
            long timeInMillis = "com.google.android.gms.reminders.notification.ACTION_REFRESH_TIME_REMINDERS".equals(intent.getAction()) ? cxhd.e(currentTimeMillis).getTimeInMillis() : currentTimeMillis - frrk.f();
            long b2 = cxhd.b(currentTimeMillis);
            Context context = this.c;
            Intent startIntent = IntentOperation.getStartIntent(context, ScheduleTimeRemindersIntentOperation.class, "com.google.android.gms.reminders.notification.ACTION_TIME_REMINDERS_SCHEDULE_IN_RANGE");
            startIntent.putExtra("SCHEDULE_TIME_REMINDERS_EXTRA_RANGE_START", timeInMillis);
            startIntent.putExtra("SCHEDULE_TIME_REMINDERS_EXTRA_RANGE_END", b2);
            context.startService(startIntent);
            this.a.k("REFRESH_TIME_REMINDERS_ALARM", b2, PendingIntent.getService(this.c, 0, IntentOperation.getStartIntent(this.c, RefreshNotificationsIntentOperation.class, "com.google.android.gms.reminders.notification.ACTION_REFRESH_TIME_REMINDERS"), 134217728));
        }
    }
}
