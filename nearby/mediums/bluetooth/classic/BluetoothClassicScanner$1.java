package com.google.android.gms.nearby.mediums.bluetooth.classic;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.gms.nearby.mediums.bluetooth.classic.BluetoothClassicScanner$1;
import defpackage.cjfj;
import defpackage.cjkz;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class BluetoothClassicScanner$1 extends TracingBroadcastReceiver {
    public final /* synthetic */ cjkz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BluetoothClassicScanner$1(cjkz cjkzVar) {
        super("nearby", "ScanReceiver");
        this.a = cjkzVar;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jz(Context context, final Intent intent) {
        if (intent == null) {
            cjfj.a.e().h("%s Ignoring Bluetooth Classic scan result because the broadcasted intent is null.", "[BluetoothClassicScanner]");
            return;
        }
        cjkz cjkzVar = this.a;
        cjkzVar.c.execute(new Runnable() { // from class: cjky
            @Override // java.lang.Runnable
            public final void run() {
                BluetoothClassicScanner$1.this.a.d(intent);
            }
        });
    }
}
