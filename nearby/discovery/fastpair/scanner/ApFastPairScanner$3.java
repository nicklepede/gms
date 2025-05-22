package com.google.android.gms.nearby.discovery.fastpair.scanner;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.cjxh;
import defpackage.cjxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class ApFastPairScanner$3 extends TracingBroadcastReceiver {
    public final /* synthetic */ cjxm a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApFastPairScanner$3(cjxm cjxmVar) {
        super("nearby", "NearbyConnectionStateReceiver");
        this.a = cjxmVar;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jP(Context context, Intent intent) {
        this.a.b.f(new cjxh(this, intent));
    }
}
