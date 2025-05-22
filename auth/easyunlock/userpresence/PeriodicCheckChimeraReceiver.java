package com.google.android.gms.auth.easyunlock.userpresence;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.WakefulBroadcastReceiver;
import defpackage.acws;
import defpackage.dhcb;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class PeriodicCheckChimeraReceiver extends dhcb {
    static {
        acws.a("PeriodicCheckReceiver");
    }

    public static Intent a(Context context) {
        return new Intent().setClassName(context, "com.google.android.gms.auth.easyunlock.userpresence.PeriodicCheckReceiver");
    }

    @Override // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        WakefulBroadcastReceiver.startWakefulService(context, UserPresenceUpdateIntentOperation.a(context, 4));
    }
}
