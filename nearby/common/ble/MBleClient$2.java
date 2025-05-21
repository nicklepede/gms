package com.google.android.gms.nearby.common.ble;

import android.bluetooth.le.ScanResult;
import com.google.android.gms.nearby.common.ble.MBleClient$2;
import defpackage.bhiy;
import defpackage.ceyl;
import defpackage.ensv;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class MBleClient$2 extends bhiy {
    public final /* synthetic */ ceyl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MBleClient$2(ceyl ceylVar) {
        super("nearby", "MBleClient");
        this.a = ceylVar;
    }

    @Override // defpackage.bhiy
    public final void b(final int i) {
        ensv ensvVar = this.a.e;
        if (ensvVar == null) {
            return;
        }
        ensvVar.execute(new Runnable() { // from class: ceyj
            @Override // java.lang.Runnable
            public final void run() {
                MBleClient$2.this.a.f(i);
            }
        });
    }

    @Override // defpackage.bhiy
    public final void c(int i, final ScanResult scanResult) {
        ensv ensvVar = this.a.e;
        if (ensvVar == null) {
            return;
        }
        ensvVar.execute(new Runnable() { // from class: ceyk
            @Override // java.lang.Runnable
            public final void run() {
                MBleClient$2.this.a.i(scanResult);
            }
        });
    }

    @Override // defpackage.bhiy
    public final void a(List list) {
    }
}
