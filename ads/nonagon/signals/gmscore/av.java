package com.google.android.gms.ads.nonagon.signals.gmscore;

import defpackage.flnb;
import defpackage.flnj;
import defpackage.uzd;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class av implements flnb {
    private final flnj a;
    private final flnj b;
    private final flnj c;
    private final flnj d;
    private final flnj e;
    private final flnj f;
    private final flnj g;

    public av(flnj flnjVar, flnj flnjVar2, flnj flnjVar3, flnj flnjVar4, flnj flnjVar5, flnj flnjVar6, flnj flnjVar7) {
        this.a = flnjVar;
        this.b = flnjVar2;
        this.c = flnjVar3;
        this.d = flnjVar4;
        this.e = flnjVar5;
        this.f = flnjVar6;
        this.g = flnjVar7;
    }

    @Override // defpackage.fxqo, defpackage.fxqn
    public final /* synthetic */ Object a() {
        flnj flnjVar = this.a;
        return new at(com.google.android.gms.ads.internal.c.d(), ((am) flnjVar).a().booleanValue(), ((an) this.b).a().booleanValue(), ((uzd) this.c).a(), com.google.android.gms.ads.nonagon.util.concurrent.b.b(), ((aj) this.d).a(), (ScheduledExecutorService) this.e.a(), ((ap) this.f).a().intValue(), ((aq) this.g).a().intValue());
    }
}
