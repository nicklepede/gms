package com.google.android.gms.nearby.discovery.fastpair.scanner;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.cjyc;
import defpackage.cjyh;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class FastPairScannerImpl$3 extends TracingBroadcastReceiver {
    public final /* synthetic */ cjyh a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FastPairScannerImpl$3(cjyh cjyhVar) {
        super("nearby", "NearbyConnectionStateReceiver");
        this.a = cjyhVar;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jP(Context context, Intent intent) {
        this.a.b.f(new cjyc(this, intent));
    }
}
