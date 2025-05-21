package com.google.android.gms.reminders.notification;

import android.content.Intent;
import android.database.Cursor;
import com.google.android.chimera.IntentOperation;
import defpackage.cxdz;
import defpackage.cxfa;
import defpackage.cxfb;
import defpackage.cxhg;
import java.util.HashMap;
import java.util.Map;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class ScheduleTimeRemindersIntentOperation extends IntentOperation {
    cxfb a;

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        this.a = new cxfb(getApplicationContext());
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        char c;
        long[] longArrayExtra;
        String action = intent.getAction();
        int hashCode = action.hashCode();
        if (hashCode == -1713960234) {
            if (action.equals("com.google.android.gms.reminders.notification.ACTION_TIME_REMINDERS_SCHEDULE_IN_RANGE")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != -756346452) {
            if (hashCode == 1506284739 && action.equals("com.google.android.gms.reminders.notification.ACTION_TIME_REMINDERS_SCHEDULE_BY_IDS")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (action.equals("com.google.android.gms.reminders.notification.ACTION_TIME_REMINDERS_SCHEDULE_UNSCHEDULE_BY_IDS")) {
                c = 2;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c != 1) {
                if (c == 2 && (longArrayExtra = intent.getLongArrayExtra("SCHEDULE_TIME_REMINDERS_EXTRA_REMINDER_IDS")) != null) {
                    for (long j : longArrayExtra) {
                        this.a.b(j);
                    }
                    return;
                }
                return;
            }
            HashMap hashMap = (HashMap) intent.getSerializableExtra("SCHEDULE_TIME_REMINDERS_EXTRA_REMINDER_IDS_AND_TRIGGER_TIME");
            if (hashMap != null) {
                for (Map.Entry entry : hashMap.entrySet()) {
                    this.a.a(((Long) entry.getKey()).longValue(), ((Long) entry.getValue()).longValue());
                }
                return;
            }
            return;
        }
        long longExtra = intent.getLongExtra("SCHEDULE_TIME_REMINDERS_EXTRA_RANGE_START", -1L);
        long longExtra2 = intent.getLongExtra("SCHEDULE_TIME_REMINDERS_EXTRA_RANGE_END", -1L);
        if (longExtra == -1 || longExtra2 == -1) {
            return;
        }
        cxfb cxfbVar = this.a;
        cxhg.a();
        Cursor query = cxfbVar.b.getContentResolver().query(cxdz.a, cxfb.a, "due_date_millis>=? AND due_date_millis<? AND ".concat(String.valueOf(cxfa.a)), new String[]{String.valueOf(longExtra), String.valueOf(longExtra2)}, null);
        if (query != null) {
            while (query.moveToNext()) {
                try {
                    cxfbVar.a(query.getLong(0), query.getLong(1));
                } finally {
                    query.close();
                }
            }
        }
    }
}
