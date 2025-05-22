package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import defpackage.cfyg;
import defpackage.cfyh;
import defpackage.jtg;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class AppMeasurementReceiver extends jtg implements cfyg {
    private cfyh a;

    @Override // defpackage.cfyg
    public final void c(Context context, Intent intent) {
        a(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.a == null) {
            this.a = new cfyh(this);
        }
        this.a.a(context, intent);
    }
}
