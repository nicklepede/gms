package com.google.android.gms.ads.nonagon.signals.gmscore;

import com.google.android.gms.ads.social.GmsDoritosProvider;
import defpackage.fixe;
import defpackage.fixm;
import defpackage.tcx;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class aa implements fixe {
    private final fixm a;
    private final fixm b;

    public aa(fixm fixmVar, fixm fixmVar2) {
        this.a = fixmVar;
        this.b = fixmVar2;
    }

    @Override // defpackage.fuuq, defpackage.fuup
    public final /* bridge */ /* synthetic */ Object a() {
        GmsDoritosProvider a = ((tcx) this.a).a();
        com.google.android.gms.ads.nonagon.util.concurrent.b.b();
        return new y(a, ((aj) this.b).a());
    }
}
