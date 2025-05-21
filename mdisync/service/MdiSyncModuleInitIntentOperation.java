package com.google.android.gms.mdisync.service;

import android.content.Intent;
import defpackage.anya;
import defpackage.ccqb;
import defpackage.ccrp;
import defpackage.dphg;
import defpackage.eijr;
import defpackage.eijy;
import defpackage.enpf;
import defpackage.fqbt;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class MdiSyncModuleInitIntentOperation extends anya {
    private final eijr a;
    private final eijr b;

    public MdiSyncModuleInitIntentOperation() {
        this(new eijr() { // from class: ccrn
            @Override // defpackage.eijr
            public final Object a() {
                ccog a = ccog.a();
                return new ccrp((byxs) a.B.a(), (ccqc) a.Q.a(), (dphg) a.E.a());
            }
        }, new eijr() { // from class: ccro
            @Override // defpackage.eijr
            public final Object a() {
                return ccog.a().c();
            }
        });
    }

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        if (!fqbt.g()) {
            ((dphg) this.b.a()).b().ah(6379).x("Disabled - skipping module initialization.");
            return;
        }
        ((dphg) this.b.a()).b().ah(6377).x("initializing module...");
        ccrp ccrpVar = (ccrp) this.a.a();
        try {
            ((enpf) ccrpVar.c.f()).u();
            ccrpVar.a.d(2);
        } catch (InterruptedException unused) {
            ccrpVar.a.d(6);
            ccqb.b().j().ah(6381).x("Scheduling was interrupted.");
            Thread.currentThread().interrupt();
        } catch (ExecutionException e) {
            ccrpVar.a.d(4);
            ccrpVar.b.d().s(e.getCause()).ah(6380).x("Failed to schedule periodic tasks.");
        }
        ((dphg) this.b.a()).b().ah(6378).x("module initialization completed");
    }

    public MdiSyncModuleInitIntentOperation(eijr eijrVar, eijr eijrVar2) {
        this.a = eijy.a(eijrVar);
        this.b = eijy.a(eijrVar2);
    }
}
