package com.google.android.gms.nearby.mediums.bluetooth;

import android.bluetooth.le.ScanResult;
import com.google.android.gms.nearby.common.ble.BleSighting;
import com.google.android.gms.nearby.mediums.bluetooth.BluetoothLowEnergy$3;
import defpackage.bjnn;
import defpackage.clnc;
import defpackage.clsv;
import defpackage.faho;
import defpackage.faic;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class BluetoothLowEnergy$3 extends bjnn {
    final /* synthetic */ String a;
    public final /* synthetic */ clsv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BluetoothLowEnergy$3(clsv clsvVar, String str) {
        super("nearby", "BluetoothLowEnergy");
        this.a = str;
        this.b = clsvVar;
    }

    @Override // defpackage.bjnn
    public final void b(int i) {
        clnc.j(this.a, 6, faic.START_EXTENDED_DISCOVERING_FAILED, i != 1 ? i != 2 ? i != 3 ? i != 4 ? faho.UNKNOWN : faho.SCAN_FAILED_FEATURE_UNSUPPORTED : faho.SCAN_FAILED_INTERNAL_ERROR : faho.SCAN_FAILED_APPLICATION_REGISTRATION_FAILED : faho.SCAN_FAILED_ALREADY_STARTED, String.format(Locale.US, "Failure code : %d", Integer.valueOf(i)));
    }

    @Override // defpackage.bjnn
    public final void c(int i, final ScanResult scanResult) {
        this.b.o(new Runnable() { // from class: clro
            @Override // java.lang.Runnable
            public final void run() {
                BleSighting a = BleSighting.a(scanResult);
                if (a == null) {
                    clno.a.e().p("Failed to doScanResult due to invalid scanResult.", new Object[0]);
                } else {
                    BluetoothLowEnergy$3.this.b.p(a);
                }
            }
        });
    }
}
