package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import defpackage.cdpi;
import defpackage.cdpj;
import defpackage.jmr;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class AppMeasurementReceiver extends jmr implements cdpi {
    private cdpj a;

    @Override // defpackage.cdpi
    public final void c(Context context, Intent intent) {
        a(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.a == null) {
            this.a = new cdpj(this);
        }
        this.a.a(context, intent);
    }
}
