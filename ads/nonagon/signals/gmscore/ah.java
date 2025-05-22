package com.google.android.gms.ads.nonagon.signals.gmscore;

import defpackage.flnb;
import defpackage.flnj;
import defpackage.uyw;
import defpackage.uzb;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class ah implements flnb {
    private final flnj a;
    private final flnj b;

    public ah(flnj flnjVar, flnj flnjVar2) {
        this.a = flnjVar;
        this.b = flnjVar2;
    }

    @Override // defpackage.fxqo, defpackage.fxqn
    public final /* synthetic */ Object a() {
        return new af(uzb.b(), (ScheduledExecutorService) this.a.a(), ((uyw) this.b).a());
    }
}
