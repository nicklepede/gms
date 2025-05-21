package com.google.android.gms.ads.nonagon.signals.gmscore;

import defpackage.fixe;
import defpackage.fixm;
import defpackage.tcw;
import defpackage.tdc;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class e implements fixe {
    private final fixm a;
    private final fixm b;
    private final fixm c;
    private final fixm d;
    private final fixm e;
    private final fixm f;

    public e(fixm fixmVar, fixm fixmVar2, fixm fixmVar3, fixm fixmVar4, fixm fixmVar5, fixm fixmVar6) {
        this.a = fixmVar;
        this.b = fixmVar2;
        this.c = fixmVar3;
        this.d = fixmVar4;
        this.e = fixmVar5;
        this.f = fixmVar6;
    }

    @Override // defpackage.fuuq, defpackage.fuup
    public final /* bridge */ /* synthetic */ Object a() {
        ((tdc) this.a).a();
        return new c(((tcw) this.b).a(), (ScheduledExecutorService) this.c.a(), com.google.android.gms.ads.nonagon.util.concurrent.b.b(), ((ak) this.d).a().intValue(), ((al) this.e).a().booleanValue(), ((an) this.f).a().booleanValue());
    }
}
