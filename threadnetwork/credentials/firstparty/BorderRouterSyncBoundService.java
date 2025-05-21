package com.google.android.gms.threadnetwork.credentials.firstparty;

import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.asot;
import defpackage.byln;
import defpackage.byzc;
import defpackage.dfgl;
import defpackage.dfgm;
import defpackage.dfgn;
import defpackage.dfhp;
import defpackage.dfhw;
import defpackage.dfle;
import defpackage.dfpu;
import defpackage.eiho;
import defpackage.ejhf;
import defpackage.enps;
import defpackage.enqc;
import defpackage.ensi;
import defpackage.ensj;
import defpackage.ensm;
import defpackage.enss;
import defpackage.ensw;
import defpackage.fslv;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class BorderRouterSyncBoundService extends GmsTaskBoundService {
    private static final asot b = byzc.a("BorderRouterSyncBoundService");
    public static final String a = BorderRouterSyncBoundService.class.getName();

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        enss h;
        if (!"PeriodicBrSync".equals(bylnVar.a)) {
            return 2;
        }
        if (!dfgn.c(getApplicationContext())) {
            ((ejhf) ((ejhf) b.h()).ah((char) 11185)).x("Skip periodic Border Router sync: Wi-Fi/Ethernet network not connected");
            return 2;
        }
        if (!dfle.g()) {
            ((ejhf) ((ejhf) b.j()).ah((char) 11184)).x("Skip periodic Border Router sync: 1P Border Router sync is not enabled");
            return 2;
        }
        ((ejhf) ((ejhf) b.h()).ah((char) 11182)).x("Border Router sync service run task");
        try {
            final dfle b2 = dfle.b(getApplicationContext());
            final dfpu dfpuVar = dfpu.TRIGGER_PERIODIC_TASK;
            if (dfle.g()) {
                try {
                    final dfgm a2 = dfgm.a(b2.b);
                    ((ejhf) ((ejhf) dfle.a.h()).ah((char) 11192)).x("Start syncing 1P Border Routers");
                    dfhp dfhpVar = b2.e;
                    long c = fslv.a.a().c();
                    synchronized (((dfhw) dfhpVar).e) {
                        ((dfhw) dfhpVar).d();
                    }
                    ensw enswVar = ((dfhw) dfhpVar).c;
                    final dfhw dfhwVar = (dfhw) dfhpVar;
                    ensi h2 = ensi.h(enswVar.schedule(new Callable() { // from class: dfhs
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            dfhw dfhwVar2 = dfhw.this;
                            eitj i = eitj.i(dfhwVar2.d.values());
                            dfhwVar2.e();
                            return i;
                        }
                    }, c, TimeUnit.MILLISECONDS));
                    enqc enqcVar = new enqc() { // from class: dfko
                        @Override // defpackage.enqc
                        public final enss a(Object obj) {
                            eitj eitjVar = (eitj) obj;
                            if (!dfle.g()) {
                                ((ejhf) ((ejhf) dfle.a.h()).ah((char) 11207)).x("Skip 1P Border Router sync: the feature is disabled");
                                return ensm.a;
                            }
                            if (eitjVar.isEmpty()) {
                                return ensm.a;
                            }
                            dfgm dfgmVar = a2;
                            dfpu dfpuVar2 = dfpuVar;
                            dfle dfleVar = dfle.this;
                            if (fsmf.q()) {
                                fecj v = dfpr.a.v();
                                int size = eitjVar.size();
                                if (!v.b.L()) {
                                    v.U();
                                }
                                dfpr dfprVar = (dfpr) v.b;
                                dfprVar.b |= 1;
                                dfprVar.c = size;
                                boolean d = dfgn.d(dfleVar.b);
                                if (!v.b.L()) {
                                    v.U();
                                }
                                dfpr dfprVar2 = (dfpr) v.b;
                                dfprVar2.b |= 2;
                                dfprVar2.d = d;
                                if (fsmf.a.a().v()) {
                                    if (!v.b.L()) {
                                        v.U();
                                    }
                                    dfpr dfprVar3 = (dfpr) v.b;
                                    dfprVar3.e = dfpuVar2.a();
                                    dfprVar3.b |= 4;
                                    dfgu.d(eitjVar, v);
                                }
                                if (fsmf.p()) {
                                    dfgu.e(eitjVar, dfle.c(dfgmVar, dfleVar.h, eitjVar), v);
                                }
                                dfgu.h((dfpr) v.Q());
                            }
                            ArrayList arrayList = new ArrayList(eitjVar.size());
                            int size2 = eitjVar.size();
                            for (int i = 0; i < size2; i++) {
                                byzf byzfVar = (byzf) eitjVar.get(i);
                                enss d2 = dfleVar.d(dfpuVar2, dfgmVar, byzfVar);
                                ensj.t(d2, new dflb(byzfVar), enre.a);
                                arrayList.add(d2);
                            }
                            return ensj.a(arrayList).a(new Callable() { // from class: dfkr
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    asot asotVar = dfle.a;
                                    return null;
                                }
                            }, dfleVar.i);
                        }
                    };
                    ensw enswVar2 = b2.i;
                    h = enps.f(enps.g(h2, enqcVar, enswVar2), new eiho() { // from class: dfks
                        @Override // defpackage.eiho
                        public final Object apply(Object obj) {
                            dfle.this.f();
                            return null;
                        }
                    }, enswVar2);
                } catch (dfgl e) {
                    h = ensj.h(e);
                }
            } else {
                ((ejhf) ((ejhf) dfle.a.h()).ah((char) 11193)).x("Skip 1P Border Router sync: the feature is disabled");
                h = ensm.a;
            }
            h.get();
            return 0;
        } catch (InterruptedException | ExecutionException e2) {
            if (e2 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            ((ejhf) ((ejhf) ((ejhf) b.j()).s(e2)).ah((char) 11183)).x("Failed to sync 1P Border Routers");
            return 2;
        }
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final void fR() {
    }
}
