package com.google.android.gms.nearby.mediums.bluetooth;

import android.bluetooth.le.ScanResult;
import com.google.android.gms.nearby.common.ble.BleSighting;
import com.google.android.gms.nearby.mediums.bluetooth.BluetoothLowEnergy$2;
import defpackage.bjnn;
import defpackage.clsv;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class BluetoothLowEnergy$2 extends bjnn {
    final /* synthetic */ String a;
    public final /* synthetic */ clsv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BluetoothLowEnergy$2(clsv clsvVar, String str) {
        super("nearby", "BluetoothLowEnergy");
        this.a = str;
        this.b = clsvVar;
    }

    @Override // defpackage.bjnn
    public final void b(final int i) {
        final String str = this.a;
        this.b.o(new Runnable() { // from class: clrn
            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                clnc.j(str, 6, faic.START_LEGACY_DISCOVERING_FAILED, clnf.a(i2), String.format(Locale.US, "Failure code : %d", Integer.valueOf(i2)));
            }
        });
    }

    @Override // defpackage.bjnn
    public final void c(int i, final ScanResult scanResult) {
        this.b.o(new Runnable() { // from class: clrm
            @Override // java.lang.Runnable
            public final void run() {
                BleSighting a = BleSighting.a(scanResult);
                if (a == null) {
                    clno.a.e().p("Failed to doScanResult due to invalid scanResult.", new Object[0]);
                } else {
                    BluetoothLowEnergy$2.this.b.p(a);
                }
            }
        });
    }
}
