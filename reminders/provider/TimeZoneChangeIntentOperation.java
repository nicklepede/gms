package com.google.android.gms.reminders.provider;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.atyq;
import defpackage.cznv;
import defpackage.czrf;
import defpackage.fult;
import defpackage.fulw;
import java.util.TimeZone;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class TimeZoneChangeIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if ("android.intent.action.TIMEZONE_CHANGED".equals(intent.getAction())) {
            Context applicationContext = getApplicationContext();
            String string = czrf.a(applicationContext).getString("last_timezone_id", null);
            String id = TimeZone.getDefault().getID();
            if (!atyq.b(string, id)) {
                czrf.a(applicationContext).edit().putString("last_timezone_id", id).apply();
            } else if (!fulw.k()) {
                return;
            }
            getContentResolver().update(cznv.c, fult.c() ? new ContentValues() : null, null, null);
        }
    }
}
