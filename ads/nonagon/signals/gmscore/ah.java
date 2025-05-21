package com.google.android.gms.ads.nonagon.signals.gmscore;

import defpackage.fixe;
import defpackage.fixm;
import defpackage.tcw;
import defpackage.tdb;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class ah implements fixe {
    private final fixm a;
    private final fixm b;

    public ah(fixm fixmVar, fixm fixmVar2) {
        this.a = fixmVar;
        this.b = fixmVar2;
    }

    @Override // defpackage.fuuq, defpackage.fuup
    public final /* synthetic */ Object a() {
        return new af(tdb.b(), (ScheduledExecutorService) this.a.a(), ((tcw) this.b).a());
    }
}
