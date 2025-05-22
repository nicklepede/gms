package com.google.android.gms.ads.nonagon.signals.gmscore;

import defpackage.flnb;
import defpackage.flnj;
import defpackage.uys;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class o implements flnb {
    private final flnj a;
    private final flnj b;
    private final flnj c;

    public o(flnj flnjVar, flnj flnjVar2, flnj flnjVar3) {
        this.a = flnjVar;
        this.b = flnjVar2;
        this.c = flnjVar3;
    }

    @Override // defpackage.fxqo, defpackage.fxqn
    public final /* synthetic */ Object a() {
        return new m(((aj) this.a).a(), ((uys) this.b).a(), com.google.android.gms.ads.internal.c.d(), (ScheduledExecutorService) this.c.a(), com.google.android.gms.ads.nonagon.util.concurrent.b.b());
    }
}
