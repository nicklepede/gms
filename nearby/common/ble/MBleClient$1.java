package com.google.android.gms.nearby.common.ble;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.gms.nearby.common.ble.MBleClient$1;
import defpackage.chfw;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class MBleClient$1 extends TracingBroadcastReceiver {
    public final /* synthetic */ chfw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MBleClient$1(chfw chfwVar) {
        super("nearby", "NearbyConnectionStateReceiver");
        this.a = chfwVar;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jP(Context context, final Intent intent) {
        this.a.k.execute(new Runnable() { // from class: chft
            @Override // java.lang.Runnable
            public final void run() {
                MBleClient$1.this.a.h(intent.getBooleanExtra("HAS_24GHZ_WIFI_CONNECTION", false));
            }
        });
    }
}
