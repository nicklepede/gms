package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.WakefulBroadcastReceiver;
import defpackage.cfyg;
import defpackage.cfyh;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class ChimeraPackageMeasurementReceiver extends WakefulBroadcastReceiver implements cfyg {
    private cfyh b;

    @Override // defpackage.cfyg
    public final void c(Context context, Intent intent) {
        startWakefulService(context, intent);
    }

    @Override // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.b == null) {
            this.b = new cfyh(this);
        }
        this.b.a(context, intent);
    }
}
