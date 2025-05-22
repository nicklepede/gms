package com.google.android.gms.scheduler;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;
import defpackage.aupz;
import defpackage.daln;
import defpackage.eqgo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class SchedulerChimeraReceiver extends BroadcastReceiver {
    private static final eqgo b = new aupz(1, 10);

    @Override // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        b.execute(new daln(context, intent, null));
    }
}
