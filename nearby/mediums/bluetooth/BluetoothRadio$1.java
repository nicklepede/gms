package com.google.android.gms.nearby.mediums.bluetooth;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.gms.nearby.mediums.bluetooth.BluetoothRadio$1;
import defpackage.cjkt;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class BluetoothRadio$1 extends TracingBroadcastReceiver {
    public final /* synthetic */ cjkt a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BluetoothRadio$1(cjkt cjktVar) {
        super("nearby", "ManualRadioStateReceiver");
        this.a = cjktVar;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jz(Context context, final Intent intent) {
        this.a.b(new Runnable() { // from class: cjkr
            @Override // java.lang.Runnable
            public final void run() {
                BluetoothRadio$1.this.a.d(intent);
            }
        });
    }
}
