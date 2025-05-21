package com.google.android.gms.nearby.common.ble;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.gms.nearby.common.ble.MBleClient$1;
import defpackage.ceyl;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class MBleClient$1 extends TracingBroadcastReceiver {
    public final /* synthetic */ ceyl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MBleClient$1(ceyl ceylVar) {
        super("nearby", "NearbyConnectionStateReceiver");
        this.a = ceylVar;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jz(Context context, final Intent intent) {
        this.a.k.execute(new Runnable() { // from class: ceyi
            @Override // java.lang.Runnable
            public final void run() {
                MBleClient$1.this.a.h(intent.getBooleanExtra("HAS_24GHZ_WIFI_CONNECTION", false));
            }
        });
    }
}
