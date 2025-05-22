package com.google.android.gms.nearby.common.ble;

import android.bluetooth.le.ScanResult;
import com.google.android.gms.nearby.common.ble.MBleClient$2;
import defpackage.bjnn;
import defpackage.chfw;
import defpackage.eqgo;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class MBleClient$2 extends bjnn {
    public final /* synthetic */ chfw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MBleClient$2(chfw chfwVar) {
        super("nearby", "MBleClient");
        this.a = chfwVar;
    }

    @Override // defpackage.bjnn
    public final void b(final int i) {
        eqgo eqgoVar = this.a.e;
        if (eqgoVar == null) {
            return;
        }
        eqgoVar.execute(new Runnable() { // from class: chfu
            @Override // java.lang.Runnable
            public final void run() {
                MBleClient$2.this.a.f(i);
            }
        });
    }

    @Override // defpackage.bjnn
    public final void c(int i, final ScanResult scanResult) {
        eqgo eqgoVar = this.a.e;
        if (eqgoVar == null) {
            return;
        }
        eqgoVar.execute(new Runnable() { // from class: chfv
            @Override // java.lang.Runnable
            public final void run() {
                MBleClient$2.this.a.i(scanResult);
            }
        });
    }

    @Override // defpackage.bjnn
    public final void a(List list) {
    }
}
