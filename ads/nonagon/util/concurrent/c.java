package com.google.android.gms.ads.nonagon.util.concurrent;

import defpackage.byhj;
import defpackage.byhp;
import defpackage.fixe;
import defpackage.fixl;
import defpackage.fixm;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class c implements fixe {
    private final fixm a;

    public c(fixm fixmVar) {
        this.a = fixmVar;
    }

    @Override // defpackage.fuuq, defpackage.fuup
    public final /* bridge */ /* synthetic */ Object a() {
        ScheduledExecutorService i = byhj.b.i((ThreadFactory) this.a.a(), byhp.HIGH_SPEED);
        fixl.e(i);
        return i;
    }
}
