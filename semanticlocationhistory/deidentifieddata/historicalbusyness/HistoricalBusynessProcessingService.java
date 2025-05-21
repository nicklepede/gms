package com.google.android.gms.semanticlocationhistory.deidentifieddata.historicalbusyness;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.chimera.modules.semanticlocationhistory.AppContextProvider;
import com.google.android.gms.leveldb.LevelDbException;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.android.gms.semanticlocationhistory.deidentifieddata.historicalbusyness.HistoricalBusynessProcessingService;
import defpackage.asej;
import defpackage.asot;
import defpackage.byln;
import defpackage.czje;
import defpackage.czjg;
import defpackage.czlk;
import defpackage.dade;
import defpackage.dadh;
import defpackage.dahq;
import defpackage.dalp;
import defpackage.dame;
import defpackage.daow;
import defpackage.dbmw;
import defpackage.dbmx;
import defpackage.eiho;
import defpackage.enop;
import defpackage.enoq;
import defpackage.enps;
import defpackage.enqb;
import defpackage.enqc;
import defpackage.enre;
import defpackage.ensi;
import defpackage.ensj;
import defpackage.enss;
import defpackage.frvy;
import defpackage.frxn;
import defpackage.fryp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class HistoricalBusynessProcessingService extends GmsTaskBoundService {
    public static final asot a = asot.c("LocationHistory", asej.SEMANTIC_LOCATION_HISTORY, "HistoricalBusyness");
    public static final String b = HistoricalBusynessProcessingService.class.getName();
    public daow c;
    private dade d;
    private dbmx e;
    private czje f;
    private enoq g;
    private czlk h;
    private dahq j;

    public static boolean f() {
        return frxn.Q() && frvy.c();
    }

    private final czlk g() {
        if (this.h == null) {
            this.h = new czlk(d());
        }
        return this.h;
    }

    public final czje d() {
        if (this.f == null) {
            this.f = new czje();
        }
        return this.f;
    }

    public final dahq e() {
        if (this.j == null) {
            this.j = new dahq();
        }
        return this.j;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final enss im(byln bylnVar) {
        enss f;
        if (!f()) {
            return ensj.i(0);
        }
        d().e("HistoricalBusynessJobCount");
        Context a2 = AppContextProvider.a();
        if (this.d == null) {
            this.d = dadh.w(a2);
        }
        ensi h = ensi.h(new dalp(a2, this.d, g(), d(), czjg.a()).c());
        enqc enqcVar = new enqc() { // from class: dalt
            @Override // defpackage.enqc
            public final enss a(Object obj) {
                final eitl eitlVar = (eitl) obj;
                boolean C = eitlVar.C();
                final HistoricalBusynessProcessingService historicalBusynessProcessingService = HistoricalBusynessProcessingService.this;
                if (!C) {
                    return enps.f(ensi.h(new dahq().b()), new eiho() { // from class: dalu
                        @Override // defpackage.eiho
                        public final Object apply(Object obj2) {
                            HistoricalBusynessProcessingService historicalBusynessProcessingService2 = HistoricalBusynessProcessingService.this;
                            eitl eitlVar2 = eitlVar;
                            String str = (String) obj2;
                            try {
                                Account account = (Account) eitlVar2.z().v().get(0);
                                if (!str.isEmpty()) {
                                    Account account2 = new Account(str, "com.google");
                                    if (eitlVar2.u(account2)) {
                                        account = account2;
                                    }
                                }
                                eitk eitkVar = new eitk();
                                eitkVar.c(account, eitlVar2.a(account));
                                if (historicalBusynessProcessingService2.c == null) {
                                    historicalBusynessProcessingService2.c = daow.b();
                                }
                                historicalBusynessProcessingService2.c.d(eitkVar.a());
                                historicalBusynessProcessingService2.d().e("HistoricalBusynessJobNonEmptyOutput");
                                return true;
                            } catch (LevelDbException e) {
                                ((ejhf) ((ejhf) ((ejhf) HistoricalBusynessProcessingService.a.j()).s(e)).ah((char) 10269)).x("Failed to write historical busyness visits to cache");
                                return false;
                            }
                        }
                    }, enre.a);
                }
                historicalBusynessProcessingService.d().e("HistoricalBusynessJobEmptyOutput");
                return ensj.i(true);
            }
        };
        enre enreVar = enre.a;
        final enss g = enps.g(h, enqcVar, enreVar);
        if (fryp.a.a().m()) {
            czlk g2 = g();
            if (this.g == null) {
                this.g = enop.a;
            }
            czlk g3 = g();
            if (this.e == null) {
                this.e = new dbmw(g3);
            }
            f = enps.f(ensi.h(new dame(a2, g2, this.e, d(), czjg.a()).c()), new eiho() { // from class: dals
                @Override // defpackage.eiho
                public final Object apply(Object obj) {
                    asot asotVar = HistoricalBusynessProcessingService.a;
                    return true;
                }
            }, enreVar);
        } else {
            f = ensj.i(true);
        }
        return ensj.b(g, f).b(new enqb() { // from class: dalv
            @Override // defpackage.enqb
            public final enss a() {
                boolean booleanValue = ((Boolean) ensj.r(g)).booleanValue();
                HistoricalBusynessProcessingService historicalBusynessProcessingService = HistoricalBusynessProcessingService.this;
                if (booleanValue) {
                    historicalBusynessProcessingService.d().e("HistoricalBusynessJobSuccess");
                    return frwe.d() ? enps.f(historicalBusynessProcessingService.e().e("HistoricalBusyness", false), new eiho() { // from class: dalq
                        @Override // defpackage.eiho
                        public final Object apply(Object obj) {
                            asot asotVar = HistoricalBusynessProcessingService.a;
                            return 0;
                        }
                    }, enre.a) : ensj.i(0);
                }
                historicalBusynessProcessingService.d().e("HistoricalBusynessJobFail");
                return frwe.d() ? enps.f(historicalBusynessProcessingService.e().g("HistoricalBusyness", fegx.h(System.currentTimeMillis())), new eiho() { // from class: dalr
                    @Override // defpackage.eiho
                    public final Object apply(Object obj) {
                        asot asotVar = HistoricalBusynessProcessingService.a;
                        return 2;
                    }
                }, enre.a) : ensj.i(2);
            }
        }, enreVar);
    }
}
