package com.google.android.gms.ads.nonagon.signals.gmscore;

import defpackage.fixe;
import defpackage.fixm;
import defpackage.tcs;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class o implements fixe {
    private final fixm a;
    private final fixm b;
    private final fixm c;

    public o(fixm fixmVar, fixm fixmVar2, fixm fixmVar3) {
        this.a = fixmVar;
        this.b = fixmVar2;
        this.c = fixmVar3;
    }

    @Override // defpackage.fuuq, defpackage.fuup
    public final /* synthetic */ Object a() {
        return new m(((aj) this.a).a(), ((tcs) this.b).a(), com.google.android.gms.ads.internal.c.d(), (ScheduledExecutorService) this.c.a(), com.google.android.gms.ads.nonagon.util.concurrent.b.b());
    }
}
