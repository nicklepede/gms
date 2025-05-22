package com.google.android.gms.chimera.container.boundservice;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.BoundService;
import com.google.android.gms.common.apiservice.ILifecycleSynchronizerRequired;
import com.google.android.gms.common.apiservice.LifecycleSynchronizer;
import defpackage.aqea;
import defpackage.aqeg;
import defpackage.aqen;
import defpackage.aura;
import defpackage.fpih;
import defpackage.rku;
import defpackage.rkx;
import defpackage.rli;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class GmsBoundBrokerChimeraService extends rku {
    private static final LifecycleSynchronizer d = new LifecycleSynchronizer();
    private LifecycleSynchronizer e;

    public GmsBoundBrokerChimeraService() {
        super(null);
        this.e = d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void f(rli rliVar, BoundService boundService) {
        if (boundService instanceof ILifecycleSynchronizerRequired) {
            LifecycleSynchronizer g = g();
            fpih fpihVar = fpih.a;
            if (fpihVar.lK().d() || e(boundService)) {
                g = fpihVar.lK().k() ? new aqea(rliVar, g) : new aqea(boundService, g);
            }
            ((ILifecycleSynchronizerRequired) boundService).setLifecycleSynchronizer(g);
        }
    }

    @Override // defpackage.rku, defpackage.rkt
    protected final rli a(rkx rkxVar) {
        rli a = super.a(rkxVar);
        if (a == null) {
            return null;
        }
        f(a, a.getBoundService());
        return a;
    }

    @Override // android.content.ContextWrapper
    protected final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        ((rku) this).c = new aqeg(this);
    }

    @Override // defpackage.rku
    protected final BoundService c(String str, String str2) {
        int i = GmsBoundServiceRouter.a;
        aqen aqenVar = new aqen();
        Bundle bundle = new Bundle();
        bundle.putBinder("lifecycleSynchronizer", aqenVar);
        GmsBoundServiceRouter gmsBoundServiceRouter = new GmsBoundServiceRouter(this, str, str2, bundle, aqenVar);
        gmsBoundServiceRouter.setModuleContext(this);
        return gmsBoundServiceRouter;
    }

    @Override // defpackage.rku
    public final rli d(rkx rkxVar, rli rliVar) {
        rli d2 = super.d(rkxVar, rliVar);
        if (d2 == null) {
            return null;
        }
        f(rliVar, d2.getBoundService());
        return d2;
    }

    public final LifecycleSynchronizer g() {
        if (this.e == d && !aura.V()) {
            this.e = new LifecycleSynchronizer(this);
        }
        return this.e;
    }

    @Override // defpackage.rkt, com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        g().onServiceStart();
        return 2;
    }
}
