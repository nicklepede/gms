package com.google.android.gms.nearby.mediums.bluetooth.classic;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.gms.nearby.mediums.bluetooth.classic.BluetoothClassicScanner$1;
import defpackage.clno;
import defpackage.clte;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class BluetoothClassicScanner$1 extends TracingBroadcastReceiver {
    public final /* synthetic */ clte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BluetoothClassicScanner$1(clte clteVar) {
        super("nearby", "ScanReceiver");
        this.a = clteVar;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jP(Context context, final Intent intent) {
        if (intent == null) {
            clno.a.e().h("%s Ignoring Bluetooth Classic scan result because the broadcasted intent is null.", "[BluetoothClassicScanner]");
            return;
        }
        clte clteVar = this.a;
        clteVar.c.execute(new Runnable() { // from class: cltd
            @Override // java.lang.Runnable
            public final void run() {
                BluetoothClassicScanner$1.this.a.d(intent);
            }
        });
    }
}
