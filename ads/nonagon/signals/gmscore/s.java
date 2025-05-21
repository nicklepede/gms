package com.google.android.gms.ads.nonagon.signals.gmscore;

import defpackage.fixe;
import defpackage.fixm;
import defpackage.tcw;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class s implements fixe {
    private final fixm a;

    public s(fixm fixmVar) {
        this.a = fixmVar;
    }

    @Override // defpackage.fuuq, defpackage.fuup
    public final /* synthetic */ Object a() {
        return new q(new com.google.android.gms.ads.cache.l(), com.google.android.gms.ads.nonagon.util.concurrent.b.b(), ((tcw) this.a).a());
    }
}
