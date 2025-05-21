package com.google.android.gms.scheduler;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;
import defpackage.asmf;
import defpackage.cybp;
import defpackage.ensv;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class SchedulerChimeraReceiver extends BroadcastReceiver {
    private static final ensv b = new asmf(1, 10);

    @Override // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        b.execute(new cybp(context, intent, null));
    }
}
