package com.google.android.gms.carsetup.frx;

import defpackage.aluv;
import defpackage.alvg;
import defpackage.alvi;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@alvi(a = {})
/* loaded from: classes3.dex */
public class SetupFsm$SetupFailedState extends alvg {
    @Override // defpackage.alvg
    public final int a() {
        return 11;
    }

    @Override // defpackage.alvg
    public final boolean b(String str, Object obj) {
        return true;
    }

    @Override // defpackage.alvg
    public final void c(String str) {
        aluv aluvVar = (aluv) this.c.k;
        int x = aluvVar.x();
        boolean z = true;
        if (x != 0 && x != 1) {
            z = false;
        }
        aluvVar.H(z);
    }
}
