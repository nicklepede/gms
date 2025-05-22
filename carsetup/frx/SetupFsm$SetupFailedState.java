package com.google.android.gms.carsetup.frx;

import defpackage.anwg;
import defpackage.anwr;
import defpackage.anwt;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@anwt(a = {})
/* loaded from: classes3.dex */
public class SetupFsm$SetupFailedState extends anwr {
    @Override // defpackage.anwr
    public final int a() {
        return 11;
    }

    @Override // defpackage.anwr
    public final boolean b(String str, Object obj) {
        return true;
    }

    @Override // defpackage.anwr
    public final void c(String str) {
        anwg anwgVar = (anwg) this.c.k;
        int x = anwgVar.x();
        boolean z = true;
        if (x != 0 && x != 1) {
            z = false;
        }
        anwgVar.H(z);
    }
}
