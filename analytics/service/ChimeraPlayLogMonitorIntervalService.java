package com.google.android.gms.analytics.service;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.google.android.chimera.IntentOperation;
import defpackage.aumn;
import defpackage.vjm;
import defpackage.vjn;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class ChimeraPlayLogMonitorIntervalService extends IntentOperation {
    public static void a(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, "com.google.android.gms.analytics.internal.PlayLogReportingService"));
        PendingIntent service = PendingIntent.getService(context, 0, intent, 0);
        aumn aumnVar = new aumn(context);
        aumnVar.a(service);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        vjm vjmVar = vjn.x;
        aumnVar.n("PlayLogMonitorIntervalService", 3, ((elapsedRealtime / ((Long) vjmVar.a()).longValue()) + 1) * ((Long) vjmVar.a()).longValue(), ((Long) vjmVar.a()).longValue(), service);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        a(getBaseContext());
    }
}
