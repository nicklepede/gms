package com.google.android.gms.analytics.service;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.google.android.chimera.IntentOperation;
import defpackage.asit;
import defpackage.tnm;
import defpackage.tnn;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class ChimeraPlayLogMonitorIntervalService extends IntentOperation {
    public static void a(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, "com.google.android.gms.analytics.internal.PlayLogReportingService"));
        PendingIntent service = PendingIntent.getService(context, 0, intent, 0);
        asit asitVar = new asit(context);
        asitVar.a(service);
        long elapsedRealtime = (SystemClock.elapsedRealtime() / ((Long) tnn.x.a()).longValue()) + 1;
        tnm tnmVar = tnn.x;
        asitVar.n("PlayLogMonitorIntervalService", 3, elapsedRealtime * ((Long) tnmVar.a()).longValue(), ((Long) tnmVar.a()).longValue(), service);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        a(getBaseContext());
    }
}
