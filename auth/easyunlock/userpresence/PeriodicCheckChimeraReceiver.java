package com.google.android.gms.auth.easyunlock.userpresence;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.WakefulBroadcastReceiver;
import defpackage.aaws;
import defpackage.deqy;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class PeriodicCheckChimeraReceiver extends deqy {
    static {
        aaws.a("PeriodicCheckReceiver");
    }

    public static Intent a(Context context) {
        return new Intent().setClassName(context, "com.google.android.gms.auth.easyunlock.userpresence.PeriodicCheckReceiver");
    }

    @Override // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        WakefulBroadcastReceiver.startWakefulService(context, UserPresenceUpdateIntentOperation.a(context, 4));
    }
}
