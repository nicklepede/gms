package com.google.android.gms.reminders.provider;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.arwb;
import defpackage.cxdz;
import defpackage.cxhj;
import defpackage.frrh;
import defpackage.frrk;
import java.util.TimeZone;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class TimeZoneChangeIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if ("android.intent.action.TIMEZONE_CHANGED".equals(intent.getAction())) {
            Context applicationContext = getApplicationContext();
            String string = cxhj.a(applicationContext).getString("last_timezone_id", null);
            String id = TimeZone.getDefault().getID();
            if (!arwb.b(string, id)) {
                cxhj.a(applicationContext).edit().putString("last_timezone_id", id).apply();
            } else if (!frrk.k()) {
                return;
            }
            getContentResolver().update(cxdz.c, frrh.c() ? new ContentValues() : null, null, null);
        }
    }
}
