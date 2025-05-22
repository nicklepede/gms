package com.google.android.gms.nearby.mediums.bluetooth;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.gms.nearby.mediums.bluetooth.BluetoothRadio$1;
import defpackage.clsy;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class BluetoothRadio$1 extends TracingBroadcastReceiver {
    public final /* synthetic */ clsy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BluetoothRadio$1(clsy clsyVar) {
        super("nearby", "ManualRadioStateReceiver");
        this.a = clsyVar;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jP(Context context, final Intent intent) {
        this.a.b(new Runnable() { // from class: clsw
            @Override // java.lang.Runnable
            public final void run() {
                BluetoothRadio$1.this.a.d(intent);
            }
        });
    }
}
