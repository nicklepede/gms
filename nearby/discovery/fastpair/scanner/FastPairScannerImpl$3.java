package com.google.android.gms.nearby.discovery.fastpair.scanner;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.chqb;
import defpackage.chqg;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class FastPairScannerImpl$3 extends TracingBroadcastReceiver {
    public final /* synthetic */ chqg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FastPairScannerImpl$3(chqg chqgVar) {
        super("nearby", "NearbyConnectionStateReceiver");
        this.a = chqgVar;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jz(Context context, Intent intent) {
        this.a.b.f(new chqb(this, intent));
    }
}
