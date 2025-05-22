package com.google.android.gms.personalsafety.utils;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.ind;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class LocalBroadcastReceiver extends TracingBroadcastReceiver {
    public LocalBroadcastReceiver() {
        super("personalsafety");
    }

    public static void c(Context context, Intent intent) {
        context.sendBroadcast(intent.setPackage(context.getPackageName()), "com.google.android.gms.permission.INTERNAL_BROADCAST");
    }

    public final void b(Context context, IntentFilter intentFilter) {
        ind.c(context, this, intentFilter, "com.google.android.gms.permission.INTERNAL_BROADCAST", null, 4);
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public void jP(Context context, Intent intent) {
    }
}
