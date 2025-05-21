package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.WakefulBroadcastReceiver;
import defpackage.cdpi;
import defpackage.cdpj;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class ChimeraPackageMeasurementReceiver extends WakefulBroadcastReceiver implements cdpi {
    private cdpj b;

    @Override // defpackage.cdpi
    public final void c(Context context, Intent intent) {
        startWakefulService(context, intent);
    }

    @Override // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.b == null) {
            this.b = new cdpj(this);
        }
        this.b.a(context, intent);
    }
}
