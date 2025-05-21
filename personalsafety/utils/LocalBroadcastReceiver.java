package com.google.android.gms.personalsafety.utils;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.iln;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class LocalBroadcastReceiver extends TracingBroadcastReceiver {
    public LocalBroadcastReceiver() {
        super("personalsafety");
    }

    public static void c(Context context, Intent intent) {
        context.sendBroadcast(intent.setPackage(context.getPackageName()), "com.google.android.gms.permission.INTERNAL_BROADCAST");
    }

    public final void b(Context context, IntentFilter intentFilter) {
        iln.c(context, this, intentFilter, "com.google.android.gms.permission.INTERNAL_BROADCAST", null, 4);
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public void jz(Context context, Intent intent) {
    }
}
