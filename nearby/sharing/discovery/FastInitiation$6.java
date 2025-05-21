package com.google.android.gms.nearby.sharing.discovery;

import android.bluetooth.le.ScanResult;
import android.content.Context;
import com.google.android.gms.nearby.sharing.discovery.FastInitiation$6;
import defpackage.bhiy;
import defpackage.cfdg;
import defpackage.clqf;
import defpackage.cmtr;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class FastInitiation$6 extends bhiy {
    public final /* synthetic */ cmtr a;
    final /* synthetic */ clqf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FastInitiation$6(cmtr cmtrVar, Context context, clqf clqfVar) {
        super(context, "nearby");
        this.b = clqfVar;
        this.a = cmtrVar;
    }

    @Override // defpackage.bhiy
    public final void b(final int i) {
        ((cfdg) this.a.a).submit(new Runnable() { // from class: cmtn
            @Override // java.lang.Runnable
            public final void run() {
                FastInitiation$6.this.a.d(i);
            }
        });
    }

    @Override // defpackage.bhiy
    public final void c(int i, final ScanResult scanResult) {
        final clqf clqfVar = this.b;
        ((cfdg) this.a.a).submit(new Runnable() { // from class: cmtm
            @Override // java.lang.Runnable
            public final void run() {
                FastInitiation$6.this.a.n(clqfVar, scanResult);
            }
        });
    }
}
