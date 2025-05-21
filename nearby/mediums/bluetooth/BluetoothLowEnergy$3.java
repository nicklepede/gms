package com.google.android.gms.nearby.mediums.bluetooth;

import android.bluetooth.le.ScanResult;
import com.google.android.gms.nearby.common.ble.BleSighting;
import com.google.android.gms.nearby.mediums.bluetooth.BluetoothLowEnergy$3;
import defpackage.bhiy;
import defpackage.cjex;
import defpackage.cjkq;
import defpackage.extd;
import defpackage.extr;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class BluetoothLowEnergy$3 extends bhiy {
    final /* synthetic */ String a;
    public final /* synthetic */ cjkq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BluetoothLowEnergy$3(cjkq cjkqVar, String str) {
        super("nearby", "BluetoothLowEnergy");
        this.a = str;
        this.b = cjkqVar;
    }

    @Override // defpackage.bhiy
    public final void b(int i) {
        cjex.j(this.a, 6, extr.START_EXTENDED_DISCOVERING_FAILED, i != 1 ? i != 2 ? i != 3 ? i != 4 ? extd.UNKNOWN : extd.SCAN_FAILED_FEATURE_UNSUPPORTED : extd.SCAN_FAILED_INTERNAL_ERROR : extd.SCAN_FAILED_APPLICATION_REGISTRATION_FAILED : extd.SCAN_FAILED_ALREADY_STARTED, String.format(Locale.US, "Failure code : %d", Integer.valueOf(i)));
    }

    @Override // defpackage.bhiy
    public final void c(int i, final ScanResult scanResult) {
        this.b.o(new Runnable() { // from class: cjjj
            @Override // java.lang.Runnable
            public final void run() {
                BleSighting a = BleSighting.a(scanResult);
                if (a == null) {
                    cjfj.a.e().p("Failed to doScanResult due to invalid scanResult.", new Object[0]);
                } else {
                    BluetoothLowEnergy$3.this.b.p(a);
                }
            }
        });
    }
}
