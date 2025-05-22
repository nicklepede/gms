package com.google.android.gms.threadnetwork.credentials.firstparty;

import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.ausn;
import defpackage.cauf;
import defpackage.cbht;
import defpackage.dhrt;
import defpackage.dhru;
import defpackage.dhrv;
import defpackage.dhsx;
import defpackage.dhte;
import defpackage.dhwj;
import defpackage.diaz;
import defpackage.ekut;
import defpackage.eluo;
import defpackage.eqdl;
import defpackage.eqdv;
import defpackage.eqgb;
import defpackage.eqgc;
import defpackage.eqgf;
import defpackage.eqgl;
import defpackage.eqgp;
import defpackage.fvhd;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class BorderRouterSyncBoundService extends GmsTaskBoundService {
    private static final ausn b = cbht.a("BorderRouterSyncBoundService");
    public static final String a = BorderRouterSyncBoundService.class.getName();

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        eqgl h;
        if (!"PeriodicBrSync".equals(caufVar.a)) {
            return 2;
        }
        if (!dhrv.b(getApplicationContext())) {
            ((eluo) ((eluo) b.h()).ai((char) 11190)).x("Skip periodic Border Router sync: Wi-Fi/Ethernet network not connected");
            return 2;
        }
        if (!dhwj.f()) {
            ((eluo) ((eluo) b.j()).ai((char) 11189)).x("Skip periodic Border Router sync: 1P Border Router sync is not enabled");
            return 2;
        }
        ((eluo) ((eluo) b.h()).ai((char) 11187)).x("Border Router sync service run task");
        try {
            final dhwj a2 = dhwj.a(getApplicationContext());
            final diaz diazVar = diaz.TRIGGER_PERIODIC_TASK;
            if (dhwj.f()) {
                try {
                    final dhru a3 = dhru.a(a2.b);
                    ((eluo) ((eluo) dhwj.a.h()).ai((char) 11194)).x("Start syncing 1P Border Routers");
                    dhsx dhsxVar = a2.d;
                    long c = fvhd.a.lK().c();
                    synchronized (((dhte) dhsxVar).e) {
                        ((dhte) dhsxVar).d();
                    }
                    eqgp eqgpVar = ((dhte) dhsxVar).c;
                    final dhte dhteVar = (dhte) dhsxVar;
                    eqgb h2 = eqgb.h(eqgpVar.schedule(new Callable() { // from class: dhta
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            dhte dhteVar2 = dhte.this;
                            elgo i = elgo.i(dhteVar2.d.values());
                            dhteVar2.e();
                            return i;
                        }
                    }, c, TimeUnit.MILLISECONDS));
                    eqdv eqdvVar = new eqdv() { // from class: dhvw
                        @Override // defpackage.eqdv
                        public final eqgl a(Object obj) {
                            elgo elgoVar = (elgo) obj;
                            if (!dhwj.f()) {
                                ((eluo) ((eluo) dhwj.a.h()).ai((char) 11209)).x("Skip 1P Border Router sync: the feature is disabled");
                                return eqgf.a;
                            }
                            if (elgoVar.isEmpty()) {
                                return eqgf.a;
                            }
                            dhru dhruVar = a3;
                            diaz diazVar2 = diazVar;
                            dhwj dhwjVar = dhwj.this;
                            if (fvhn.q()) {
                                fgrc v = diaw.a.v();
                                int size = elgoVar.size();
                                if (!v.b.L()) {
                                    v.U();
                                }
                                diaw diawVar = (diaw) v.b;
                                diawVar.b |= 1;
                                diawVar.c = size;
                                boolean c2 = dhrv.c(dhwjVar.b);
                                if (!v.b.L()) {
                                    v.U();
                                }
                                diaw diawVar2 = (diaw) v.b;
                                diawVar2.b |= 2;
                                diawVar2.d = c2;
                                if (fvhn.a.lK().v()) {
                                    if (!v.b.L()) {
                                        v.U();
                                    }
                                    diaw diawVar3 = (diaw) v.b;
                                    diawVar3.e = diazVar2.a();
                                    diawVar3.b |= 4;
                                    dhsc.d(elgoVar, v);
                                }
                                if (fvhn.p()) {
                                    dhsc.e(elgoVar, dhwj.b(dhruVar, dhwjVar.f, elgoVar), v);
                                }
                                dhsc.h((diaw) v.Q());
                            }
                            ArrayList arrayList = new ArrayList(elgoVar.size());
                            int size2 = elgoVar.size();
                            for (int i = 0; i < size2; i++) {
                                cbhw cbhwVar = (cbhw) elgoVar.get(i);
                                eqgl c3 = dhwjVar.c(diazVar2, dhruVar, cbhwVar);
                                eqgc.t(c3, new dhwh(cbhwVar), eqex.a);
                                arrayList.add(c3);
                            }
                            return eqgc.a(arrayList).a(new Callable() { // from class: dhvx
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    ausn ausnVar = dhwj.a;
                                    return null;
                                }
                            }, dhwjVar.g);
                        }
                    };
                    eqgp eqgpVar2 = a2.g;
                    h = eqdl.f(eqdl.g(h2, eqdvVar, eqgpVar2), new ekut() { // from class: dhvy
                        @Override // defpackage.ekut
                        public final Object apply(Object obj) {
                            dhwj.this.e();
                            return null;
                        }
                    }, eqgpVar2);
                } catch (dhrt e) {
                    h = eqgc.h(e);
                }
            } else {
                ((eluo) ((eluo) dhwj.a.h()).ai((char) 11195)).x("Skip 1P Border Router sync: the feature is disabled");
                h = eqgf.a;
            }
            h.get();
            return 0;
        } catch (InterruptedException | ExecutionException e2) {
            if (e2 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            ((eluo) ((eluo) ((eluo) b.j()).s(e2)).ai((char) 11188)).x("Failed to sync 1P Border Routers");
            return 2;
        }
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final void gf() {
    }
}
