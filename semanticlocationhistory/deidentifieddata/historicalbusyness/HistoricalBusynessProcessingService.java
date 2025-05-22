package com.google.android.gms.semanticlocationhistory.deidentifieddata.historicalbusyness;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.chimera.modules.semanticlocationhistory.AppContextProvider;
import com.google.android.gms.leveldb.LevelDbException;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.android.gms.semanticlocationhistory.deidentifieddata.historicalbusyness.HistoricalBusynessProcessingService;
import defpackage.auid;
import defpackage.ausn;
import defpackage.cauf;
import defpackage.dbtc;
import defpackage.dbte;
import defpackage.dbvg;
import defpackage.dcnm;
import defpackage.dcnp;
import defpackage.dcry;
import defpackage.dcvx;
import defpackage.dcwm;
import defpackage.dcze;
import defpackage.ddxc;
import defpackage.ddxd;
import defpackage.ekut;
import defpackage.eqci;
import defpackage.eqcj;
import defpackage.eqdl;
import defpackage.eqdu;
import defpackage.eqdv;
import defpackage.eqex;
import defpackage.eqgb;
import defpackage.eqgc;
import defpackage.eqgl;
import defpackage.fuqs;
import defpackage.fush;
import defpackage.futj;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class HistoricalBusynessProcessingService extends GmsTaskBoundService {
    public static final ausn a = ausn.c("LocationHistory", auid.SEMANTIC_LOCATION_HISTORY, "HistoricalBusyness");
    public static final String b = HistoricalBusynessProcessingService.class.getName();
    public dcze c;
    private dcnm d;
    private ddxd e;
    private dbtc f;
    private eqcj g;
    private dbvg h;
    private dcry j;

    public static boolean f() {
        return fush.Q() && fuqs.c();
    }

    private final dbvg g() {
        if (this.h == null) {
            this.h = new dbvg(d());
        }
        return this.h;
    }

    public final dbtc d() {
        if (this.f == null) {
            this.f = new dbtc();
        }
        return this.f;
    }

    public final dcry e() {
        if (this.j == null) {
            this.j = new dcry();
        }
        return this.j;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final eqgl iB(cauf caufVar) {
        eqgl f;
        if (!f()) {
            return eqgc.i(0);
        }
        d().e("HistoricalBusynessJobCount");
        Context a2 = AppContextProvider.a();
        if (this.d == null) {
            this.d = dcnp.w(a2);
        }
        eqgb h = eqgb.h(new dcvx(a2, this.d, g(), d(), dbte.a()).c());
        eqdv eqdvVar = new eqdv() { // from class: dcwb
            @Override // defpackage.eqdv
            public final eqgl a(Object obj) {
                final elgq elgqVar = (elgq) obj;
                boolean C = elgqVar.C();
                final HistoricalBusynessProcessingService historicalBusynessProcessingService = HistoricalBusynessProcessingService.this;
                if (!C) {
                    return eqdl.f(eqgb.h(new dcry().b()), new ekut() { // from class: dcwc
                        @Override // defpackage.ekut
                        public final Object apply(Object obj2) {
                            HistoricalBusynessProcessingService historicalBusynessProcessingService2 = HistoricalBusynessProcessingService.this;
                            elgq elgqVar2 = elgqVar;
                            String str = (String) obj2;
                            try {
                                Account account = (Account) elgqVar2.z().v().get(0);
                                if (!str.isEmpty()) {
                                    Account account2 = new Account(str, "com.google");
                                    if (elgqVar2.u(account2)) {
                                        account = account2;
                                    }
                                }
                                elgp elgpVar = new elgp();
                                elgpVar.c(account, elgqVar2.a(account));
                                if (historicalBusynessProcessingService2.c == null) {
                                    historicalBusynessProcessingService2.c = dcze.b();
                                }
                                historicalBusynessProcessingService2.c.d(elgpVar.a());
                                historicalBusynessProcessingService2.d().e("HistoricalBusynessJobNonEmptyOutput");
                                return true;
                            } catch (LevelDbException e) {
                                ((eluo) ((eluo) ((eluo) HistoricalBusynessProcessingService.a.j()).s(e)).ai((char) 10275)).x("Failed to write historical busyness visits to cache");
                                return false;
                            }
                        }
                    }, eqex.a);
                }
                historicalBusynessProcessingService.d().e("HistoricalBusynessJobEmptyOutput");
                return eqgc.i(true);
            }
        };
        eqex eqexVar = eqex.a;
        final eqgl g = eqdl.g(h, eqdvVar, eqexVar);
        if (futj.a.lK().m()) {
            dbvg g2 = g();
            if (this.g == null) {
                this.g = eqci.a;
            }
            dbvg g3 = g();
            if (this.e == null) {
                this.e = new ddxc(g3);
            }
            f = eqdl.f(eqgb.h(new dcwm(a2, g2, this.e, d(), dbte.a()).c()), new ekut() { // from class: dcwa
                @Override // defpackage.ekut
                public final Object apply(Object obj) {
                    ausn ausnVar = HistoricalBusynessProcessingService.a;
                    return true;
                }
            }, eqexVar);
        } else {
            f = eqgc.i(true);
        }
        return eqgc.b(g, f).b(new eqdu() { // from class: dcwd
            @Override // defpackage.eqdu
            public final eqgl a() {
                boolean booleanValue = ((Boolean) eqgc.r(g)).booleanValue();
                HistoricalBusynessProcessingService historicalBusynessProcessingService = HistoricalBusynessProcessingService.this;
                if (booleanValue) {
                    historicalBusynessProcessingService.d().e("HistoricalBusynessJobSuccess");
                    return fuqy.d() ? eqdl.f(historicalBusynessProcessingService.e().e("HistoricalBusyness", false), new ekut() { // from class: dcvy
                        @Override // defpackage.ekut
                        public final Object apply(Object obj) {
                            ausn ausnVar = HistoricalBusynessProcessingService.a;
                            return 0;
                        }
                    }, eqex.a) : eqgc.i(0);
                }
                historicalBusynessProcessingService.d().e("HistoricalBusynessJobFail");
                return fuqy.d() ? eqdl.f(historicalBusynessProcessingService.e().g("HistoricalBusyness", fgvq.h(System.currentTimeMillis())), new ekut() { // from class: dcvz
                    @Override // defpackage.ekut
                    public final Object apply(Object obj) {
                        ausn ausnVar = HistoricalBusynessProcessingService.a;
                        return 2;
                    }
                }, eqex.a) : eqgc.i(2);
            }
        }, eqexVar);
    }
}
