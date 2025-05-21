package com.google.android.gms.ads.nonagon.signals.gmscore;

import defpackage.fixe;
import defpackage.fixm;
import defpackage.tdd;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class av implements fixe {
    private final fixm a;
    private final fixm b;
    private final fixm c;
    private final fixm d;
    private final fixm e;
    private final fixm f;
    private final fixm g;

    public av(fixm fixmVar, fixm fixmVar2, fixm fixmVar3, fixm fixmVar4, fixm fixmVar5, fixm fixmVar6, fixm fixmVar7) {
        this.a = fixmVar;
        this.b = fixmVar2;
        this.c = fixmVar3;
        this.d = fixmVar4;
        this.e = fixmVar5;
        this.f = fixmVar6;
        this.g = fixmVar7;
    }

    @Override // defpackage.fuuq, defpackage.fuup
    public final /* synthetic */ Object a() {
        fixm fixmVar = this.a;
        return new at(com.google.android.gms.ads.internal.c.d(), ((am) fixmVar).a().booleanValue(), ((an) this.b).a().booleanValue(), ((tdd) this.c).a(), com.google.android.gms.ads.nonagon.util.concurrent.b.b(), ((aj) this.d).a(), (ScheduledExecutorService) this.e.a(), ((ap) this.f).a().intValue(), ((aq) this.g).a().intValue());
    }
}
