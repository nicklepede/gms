package com.google.android.gms.ads.nonagon.util.event;

import com.google.android.gms.ads.nonagon.util.concurrent.n;
import defpackage.ensv;
import defpackage.fixe;
import defpackage.fixm;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class f implements fixe {
    private final fixm a;
    private final fixm b;

    public f(fixm fixmVar, fixm fixmVar2) {
        this.a = fixmVar;
        this.b = fixmVar2;
    }

    @Override // defpackage.fuuq, defpackage.fuup
    public final /* synthetic */ Object a() {
        fixm fixmVar = this.a;
        ensv b = com.google.android.gms.ads.nonagon.util.concurrent.b.b();
        return new n(b, ((g) this.b).a());
    }
}
