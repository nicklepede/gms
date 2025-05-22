package com.google.android.gms.auth.proximity;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.aecy;
import defpackage.aecz;
import defpackage.dhbu;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class BleBackgroundAdvertiser$WakeUpBroadcastReceiver extends TracingBroadcastReceiver {
    public final /* synthetic */ aecz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BleBackgroundAdvertiser$WakeUpBroadcastReceiver(aecz aeczVar) {
        super("auth_proximity");
        this.a = aeczVar;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jP(Context context, Intent intent) {
        aecz.a.h("Waking up to rotate advertisement data.", new Object[0]);
        dhbu dhbuVar = new dhbu(context, 1, "BleBackgroundAdvertiser");
        dhbuVar.c(aecz.b);
        aecz aeczVar = this.a;
        aeczVar.d();
        aeczVar.c(new aecy(this, dhbuVar));
    }
}
