package com.google.android.gms.nearby.sharing.discovery;

import android.bluetooth.le.ScanResult;
import android.content.Context;
import com.google.android.gms.nearby.sharing.discovery.FastInitiation$6;
import defpackage.bjnn;
import defpackage.chks;
import defpackage.cnyn;
import defpackage.cpbz;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class FastInitiation$6 extends bjnn {
    public final /* synthetic */ cpbz a;
    final /* synthetic */ cnyn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FastInitiation$6(cpbz cpbzVar, Context context, cnyn cnynVar) {
        super(context, "nearby");
        this.b = cnynVar;
        this.a = cpbzVar;
    }

    @Override // defpackage.bjnn
    public final void b(final int i) {
        ((chks) this.a.a).submit(new Runnable() { // from class: cpbv
            @Override // java.lang.Runnable
            public final void run() {
                FastInitiation$6.this.a.d(i);
            }
        });
    }

    @Override // defpackage.bjnn
    public final void c(int i, final ScanResult scanResult) {
        final cnyn cnynVar = this.b;
        ((chks) this.a.a).submit(new Runnable() { // from class: cpbu
            @Override // java.lang.Runnable
            public final void run() {
                FastInitiation$6.this.a.n(cnynVar, scanResult);
            }
        });
    }
}
