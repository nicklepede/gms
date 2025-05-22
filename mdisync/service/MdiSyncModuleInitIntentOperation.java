package com.google.android.gms.mdisync.service;

import android.content.Intent;
import defpackage.apzs;
import defpackage.ceyv;
import defpackage.cfaj;
import defpackage.drrp;
import defpackage.ekww;
import defpackage.ekxd;
import defpackage.eqcy;
import defpackage.fsvs;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class MdiSyncModuleInitIntentOperation extends apzs {
    private final ekww a;
    private final ekww b;

    public MdiSyncModuleInitIntentOperation() {
        this(new ekww() { // from class: cfah
            @Override // defpackage.ekww
            public final Object lK() {
                cexa a = cexa.a();
                return new cfaj((cbgj) a.B.a(), (ceyw) a.Q.a(), (drrp) a.E.a());
            }
        }, new ekww() { // from class: cfai
            @Override // defpackage.ekww
            public final Object lK() {
                return cexa.a().c();
            }
        });
    }

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        if (!fsvs.g()) {
            ((drrp) this.b.lK()).b().ai(6398).x("Disabled - skipping module initialization.");
            return;
        }
        ((drrp) this.b.lK()).b().ai(6396).x("initializing module...");
        cfaj cfajVar = (cfaj) this.a.lK();
        try {
            ((eqcy) cfajVar.c.f()).u();
            cfajVar.a.d(2);
        } catch (InterruptedException unused) {
            cfajVar.a.d(6);
            ceyv.b().j().ai(6400).x("Scheduling was interrupted.");
            Thread.currentThread().interrupt();
        } catch (ExecutionException e) {
            cfajVar.a.d(4);
            cfajVar.b.d().s(e.getCause()).ai(6399).x("Failed to schedule periodic tasks.");
        }
        ((drrp) this.b.lK()).b().ai(6397).x("module initialization completed");
    }

    public MdiSyncModuleInitIntentOperation(ekww ekwwVar, ekww ekwwVar2) {
        this.a = ekxd.a(ekwwVar);
        this.b = ekxd.a(ekwwVar2);
    }
}
