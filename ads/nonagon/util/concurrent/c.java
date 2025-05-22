package com.google.android.gms.ads.nonagon.util.concurrent;

import defpackage.caqb;
import defpackage.caqh;
import defpackage.flnb;
import defpackage.flni;
import defpackage.flnj;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class c implements flnb {
    private final flnj a;

    public c(flnj flnjVar) {
        this.a = flnjVar;
    }

    @Override // defpackage.fxqo, defpackage.fxqn
    public final /* bridge */ /* synthetic */ Object a() {
        ScheduledExecutorService i = caqb.b.i((ThreadFactory) this.a.a(), caqh.HIGH_SPEED);
        flni.e(i);
        return i;
    }
}
