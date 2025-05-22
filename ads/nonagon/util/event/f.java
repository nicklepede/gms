package com.google.android.gms.ads.nonagon.util.event;

import com.google.android.gms.ads.nonagon.util.concurrent.n;
import defpackage.eqgo;
import defpackage.flnb;
import defpackage.flnj;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class f implements flnb {
    private final flnj a;
    private final flnj b;

    public f(flnj flnjVar, flnj flnjVar2) {
        this.a = flnjVar;
        this.b = flnjVar2;
    }

    @Override // defpackage.fxqo, defpackage.fxqn
    public final /* synthetic */ Object a() {
        flnj flnjVar = this.a;
        eqgo b = com.google.android.gms.ads.nonagon.util.concurrent.b.b();
        return new n(b, ((g) this.b).a());
    }
}
