package com.google.android.gms.auth.proximity;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.accy;
import defpackage.accz;
import defpackage.deqr;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class BleBackgroundAdvertiser$WakeUpBroadcastReceiver extends TracingBroadcastReceiver {
    public final /* synthetic */ accz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BleBackgroundAdvertiser$WakeUpBroadcastReceiver(accz acczVar) {
        super("auth_proximity");
        this.a = acczVar;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jz(Context context, Intent intent) {
        accz.a.h("Waking up to rotate advertisement data.", new Object[0]);
        deqr deqrVar = new deqr(context, 1, "BleBackgroundAdvertiser");
        deqrVar.c(accz.b);
        accz acczVar = this.a;
        acczVar.d();
        acczVar.c(new accy(this, deqrVar));
    }
}
