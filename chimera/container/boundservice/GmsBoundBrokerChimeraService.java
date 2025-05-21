package com.google.android.gms.chimera.container.boundservice;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.BoundService;
import com.google.android.gms.common.apiservice.ILifecycleSynchronizerRequired;
import com.google.android.gms.common.apiservice.LifecycleSynchronizer;
import defpackage.aoci;
import defpackage.aoco;
import defpackage.aocv;
import defpackage.asng;
import defpackage.fmqj;
import defpackage.prq;
import defpackage.prt;
import defpackage.pse;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class GmsBoundBrokerChimeraService extends prq {
    private static final LifecycleSynchronizer d = new LifecycleSynchronizer();
    private LifecycleSynchronizer e;

    public GmsBoundBrokerChimeraService() {
        super(null);
        this.e = d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void f(pse pseVar, BoundService boundService) {
        if (boundService instanceof ILifecycleSynchronizerRequired) {
            LifecycleSynchronizer g = g();
            if (fmqj.a.a().d() || e(boundService)) {
                g = fmqj.a.a().k() ? new aoci(pseVar, g) : new aoci(boundService, g);
            }
            ((ILifecycleSynchronizerRequired) boundService).setLifecycleSynchronizer(g);
        }
    }

    @Override // defpackage.prq, defpackage.prp
    protected final pse a(prt prtVar) {
        pse a = super.a(prtVar);
        if (a == null) {
            return null;
        }
        f(a, a.getBoundService());
        return a;
    }

    @Override // android.content.ContextWrapper
    protected final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        ((prq) this).c = new aoco(this);
    }

    @Override // defpackage.prq
    protected final BoundService c(String str, String str2) {
        int i = GmsBoundServiceRouter.a;
        aocv aocvVar = new aocv();
        Bundle bundle = new Bundle();
        bundle.putBinder("lifecycleSynchronizer", aocvVar);
        GmsBoundServiceRouter gmsBoundServiceRouter = new GmsBoundServiceRouter(this, str, str2, bundle, aocvVar);
        gmsBoundServiceRouter.setModuleContext(this);
        return gmsBoundServiceRouter;
    }

    @Override // defpackage.prq
    public final pse d(prt prtVar, pse pseVar) {
        pse d2 = super.d(prtVar, pseVar);
        if (d2 == null) {
            return null;
        }
        f(pseVar, d2.getBoundService());
        return d2;
    }

    public final LifecycleSynchronizer g() {
        if (this.e == d && !asng.V()) {
            this.e = new LifecycleSynchronizer(this);
        }
        return this.e;
    }

    @Override // defpackage.prp, com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        g().onServiceStart();
        return 2;
    }
}
