package com.google.android.gms.nearby.mediums.bluetooth;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.gms.nearby.mediums.bluetooth.BluetoothRadio$2;
import defpackage.cjkt;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class BluetoothRadio$2 extends TracingBroadcastReceiver {
    public final /* synthetic */ cjkt a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BluetoothRadio$2(cjkt cjktVar) {
        super("nearby", "BleStateReceiver");
        this.a = cjktVar;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jz(Context context, final Intent intent) {
        this.a.b(new Runnable() { // from class: cjks
            @Override // java.lang.Runnable
            public final void run() {
                BluetoothRadio$2.this.a.c(intent);
            }
        });
    }
}
