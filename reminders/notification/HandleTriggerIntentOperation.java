package com.google.android.gms.reminders.notification;

import android.app.PendingIntent;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.auid;
import defpackage.ausn;
import defpackage.cznr;
import defpackage.cznv;
import defpackage.czrc;
import defpackage.fult;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class HandleTriggerIntentOperation extends IntentOperation {
    static {
        ausn.b("RemindersNS", auid.REMINDERS);
    }

    public static PendingIntent a(Context context, long j) {
        Intent startIntent = IntentOperation.getStartIntent(context, HandleTriggerIntentOperation.class, "com.google.android.gms.reminders.notification.ACTION_TIME_REMINDER_ALARM_TRIGGERED");
        startIntent.setData(ContentUris.withAppendedId(cznr.a, j));
        startIntent.putExtra("HANDLE_NOTIFICATION_TRIGGER_EXTRA_NOTIFICATION_ID", j);
        return PendingIntent.getService(context, 0, startIntent, 134217728);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        String action = intent.getAction();
        if (action.hashCode() == 1517183795 && action.equals("com.google.android.gms.reminders.notification.ACTION_TIME_REMINDER_ALARM_TRIGGERED")) {
            long longExtra = intent.getLongExtra("HANDLE_NOTIFICATION_TRIGGER_EXTRA_NOTIFICATION_ID", -1L);
            czrc.a();
            if (longExtra < 0) {
                return;
            }
            getContentResolver().update(ContentUris.withAppendedId(cznv.e, longExtra), fult.c() ? new ContentValues() : null, null, null);
        }
    }
}
