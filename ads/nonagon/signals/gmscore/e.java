package com.google.android.gms.ads.nonagon.signals.gmscore;

import defpackage.flnb;
import defpackage.flnj;
import defpackage.uyw;
import defpackage.uzc;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class e implements flnb {
    private final flnj a;
    private final flnj b;
    private final flnj c;
    private final flnj d;
    private final flnj e;
    private final flnj f;

    public e(flnj flnjVar, flnj flnjVar2, flnj flnjVar3, flnj flnjVar4, flnj flnjVar5, flnj flnjVar6) {
        this.a = flnjVar;
        this.b = flnjVar2;
        this.c = flnjVar3;
        this.d = flnjVar4;
        this.e = flnjVar5;
        this.f = flnjVar6;
    }

    @Override // defpackage.fxqo, defpackage.fxqn
    public final /* bridge */ /* synthetic */ Object a() {
        ((uzc) this.a).a();
        return new c(((uyw) this.b).a(), (ScheduledExecutorService) this.c.a(), com.google.android.gms.ads.nonagon.util.concurrent.b.b(), ((ak) this.d).a().intValue(), ((al) this.e).a().booleanValue(), ((an) this.f).a().booleanValue());
    }
}
