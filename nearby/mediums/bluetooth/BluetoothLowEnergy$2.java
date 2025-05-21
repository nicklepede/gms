package com.google.android.gms.nearby.mediums.bluetooth;

import android.bluetooth.le.ScanResult;
import com.google.android.gms.nearby.common.ble.BleSighting;
import com.google.android.gms.nearby.mediums.bluetooth.BluetoothLowEnergy$2;
import defpackage.bhiy;
import defpackage.cjkq;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class BluetoothLowEnergy$2 extends bhiy {
    final /* synthetic */ String a;
    public final /* synthetic */ cjkq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BluetoothLowEnergy$2(cjkq cjkqVar, String str) {
        super("nearby", "BluetoothLowEnergy");
        this.a = str;
        this.b = cjkqVar;
    }

    @Override // defpackage.bhiy
    public final void b(final int i) {
        final String str = this.a;
        this.b.o(new Runnable() { // from class: cjji
            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                cjex.j(str, 6, extr.START_LEGACY_DISCOVERING_FAILED, cjfa.a(i2), String.format(Locale.US, "Failure code : %d", Integer.valueOf(i2)));
            }
        });
    }

    @Override // defpackage.bhiy
    public final void c(int i, final ScanResult scanResult) {
        this.b.o(new Runnable() { // from class: cjjh
            @Override // java.lang.Runnable
            public final void run() {
                BleSighting a = BleSighting.a(scanResult);
                if (a == null) {
                    cjfj.a.e().p("Failed to doScanResult due to invalid scanResult.", new Object[0]);
                } else {
                    BluetoothLowEnergy$2.this.b.p(a);
                }
            }
        });
    }
}
