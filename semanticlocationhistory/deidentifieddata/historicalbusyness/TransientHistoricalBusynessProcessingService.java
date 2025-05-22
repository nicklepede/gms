package com.google.android.gms.semanticlocationhistory.deidentifieddata.historicalbusyness;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.chimera.modules.semanticlocationhistory.AppContextProvider;
import com.google.android.gms.leveldb.LevelDbException;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.android.gms.semanticlocationhistory.deidentifieddata.historicalbusyness.TransientHistoricalBusynessProcessingService;
import defpackage.auid;
import defpackage.ausn;
import defpackage.cauf;
import defpackage.dbtc;
import defpackage.dbte;
import defpackage.dbvg;
import defpackage.dcry;
import defpackage.dcwm;
import defpackage.dcze;
import defpackage.ddxc;
import defpackage.ddxd;
import defpackage.eqci;
import defpackage.eqcj;
import defpackage.eqdl;
import defpackage.eqdv;
import defpackage.eqex;
import defpackage.eqgb;
import defpackage.eqgc;
import defpackage.eqgl;
import defpackage.futj;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class TransientHistoricalBusynessProcessingService extends GmsTaskBoundService {
    public static final ausn a = ausn.c("LocationHistory", auid.SEMANTIC_LOCATION_HISTORY, "TransientHistoricalBusyness");
    public static final String b = TransientHistoricalBusynessProcessingService.class.getName();
    public dcze c;
    private dbtc d;
    private dbvg e;
    private ddxd f;
    private dcry g;
    private eqcj h;

    private final dbvg f() {
        if (this.e == null) {
            this.e = new dbvg(d());
        }
        return this.e;
    }

    public final dbtc d() {
        if (this.d == null) {
            this.d = new dbtc();
        }
        return this.d;
    }

    public final dcry e() {
        if (this.g == null) {
            this.g = new dcry();
        }
        return this.g;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final eqgl iB(cauf caufVar) {
        if (!futj.j()) {
            return eqgc.i(0);
        }
        d().e("TransientHistoricalBusynessJobCount");
        Context a2 = AppContextProvider.a();
        dbvg f = f();
        if (this.h == null) {
            this.h = eqci.a;
        }
        dbvg f2 = f();
        if (this.f == null) {
            this.f = new ddxc(f2);
        }
        eqgb h = eqgb.h(new dcwm(a2, f, this.f, d(), dbte.a()).c());
        eqdv eqdvVar = new eqdv() { // from class: dcwq
            @Override // defpackage.eqdv
            public final eqgl a(Object obj) {
                final elgq elgqVar = (elgq) obj;
                if (!futj.a.lK().y()) {
                    return eqgc.i(true);
                }
                final TransientHistoricalBusynessProcessingService transientHistoricalBusynessProcessingService = TransientHistoricalBusynessProcessingService.this;
                if (!elgqVar.C()) {
                    return eqdl.f(eqgb.h(transientHistoricalBusynessProcessingService.e().b()), new ekut() { // from class: dcwn
                        @Override // defpackage.ekut
                        public final Object apply(Object obj2) {
                            TransientHistoricalBusynessProcessingService transientHistoricalBusynessProcessingService2 = TransientHistoricalBusynessProcessingService.this;
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
                                if (transientHistoricalBusynessProcessingService2.c == null) {
                                    transientHistoricalBusynessProcessingService2.c = dcze.b();
                                }
                                transientHistoricalBusynessProcessingService2.c.d(elgpVar.a());
                                transientHistoricalBusynessProcessingService2.d().e("TransientHistoricalBusynessJobNonEmptyOutput");
                                return true;
                            } catch (LevelDbException e) {
                                ((eluo) ((eluo) ((eluo) TransientHistoricalBusynessProcessingService.a.j()).s(e)).ai((char) 10288)).x("Failed to write historical busyness visits to cache");
                                return false;
                            }
                        }
                    }, eqex.a);
                }
                transientHistoricalBusynessProcessingService.d().e("TransientHistoricalBusynessJobEmptyOutput");
                return eqgc.i(true);
            }
        };
        eqex eqexVar = eqex.a;
        return eqdl.g(eqdl.g(h, eqdvVar, eqexVar), new eqdv() { // from class: dcwr
            @Override // defpackage.eqdv
            public final eqgl a(Object obj) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                TransientHistoricalBusynessProcessingService transientHistoricalBusynessProcessingService = TransientHistoricalBusynessProcessingService.this;
                if (booleanValue) {
                    transientHistoricalBusynessProcessingService.d().e("TransientHistoricalBusynessJobSuccess");
                    return fuqy.d() ? eqdl.f(transientHistoricalBusynessProcessingService.e().e("TransientHistoricalBusyness", false), new ekut() { // from class: dcwo
                        @Override // defpackage.ekut
                        public final Object apply(Object obj2) {
                            ausn ausnVar = TransientHistoricalBusynessProcessingService.a;
                            return 0;
                        }
                    }, eqex.a) : eqgc.i(0);
                }
                transientHistoricalBusynessProcessingService.d().e("TransientHistoricalBusynessJobFail");
                return fuqy.d() ? eqdl.f(transientHistoricalBusynessProcessingService.e().g("TransientHistoricalBusyness", fgvq.h(System.currentTimeMillis())), new ekut() { // from class: dcwp
                    @Override // defpackage.ekut
                    public final Object apply(Object obj2) {
                        ausn ausnVar = TransientHistoricalBusynessProcessingService.a;
                        return 2;
                    }
                }, eqex.a) : eqgc.i(2);
            }
        }, eqexVar);
    }
}
