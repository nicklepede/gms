package com.google.android.gms.semanticlocationhistory.deidentifieddata.historicalbusyness;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.chimera.modules.semanticlocationhistory.AppContextProvider;
import com.google.android.gms.leveldb.LevelDbException;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.android.gms.semanticlocationhistory.deidentifieddata.historicalbusyness.TransientHistoricalBusynessProcessingService;
import defpackage.asej;
import defpackage.asot;
import defpackage.byln;
import defpackage.czje;
import defpackage.czjg;
import defpackage.czlk;
import defpackage.dahq;
import defpackage.dame;
import defpackage.daow;
import defpackage.dbmw;
import defpackage.dbmx;
import defpackage.enop;
import defpackage.enoq;
import defpackage.enps;
import defpackage.enqc;
import defpackage.enre;
import defpackage.ensi;
import defpackage.ensj;
import defpackage.enss;
import defpackage.fryp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class TransientHistoricalBusynessProcessingService extends GmsTaskBoundService {
    public static final asot a = asot.c("LocationHistory", asej.SEMANTIC_LOCATION_HISTORY, "TransientHistoricalBusyness");
    public static final String b = TransientHistoricalBusynessProcessingService.class.getName();
    public daow c;
    private czje d;
    private czlk e;
    private dbmx f;
    private dahq g;
    private enoq h;

    private final czlk f() {
        if (this.e == null) {
            this.e = new czlk(d());
        }
        return this.e;
    }

    public final czje d() {
        if (this.d == null) {
            this.d = new czje();
        }
        return this.d;
    }

    public final dahq e() {
        if (this.g == null) {
            this.g = new dahq();
        }
        return this.g;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final enss im(byln bylnVar) {
        if (!fryp.j()) {
            return ensj.i(0);
        }
        d().e("TransientHistoricalBusynessJobCount");
        Context a2 = AppContextProvider.a();
        czlk f = f();
        if (this.h == null) {
            this.h = enop.a;
        }
        czlk f2 = f();
        if (this.f == null) {
            this.f = new dbmw(f2);
        }
        ensi h = ensi.h(new dame(a2, f, this.f, d(), czjg.a()).c());
        enqc enqcVar = new enqc() { // from class: dami
            @Override // defpackage.enqc
            public final enss a(Object obj) {
                final eitl eitlVar = (eitl) obj;
                if (!fryp.a.a().y()) {
                    return ensj.i(true);
                }
                final TransientHistoricalBusynessProcessingService transientHistoricalBusynessProcessingService = TransientHistoricalBusynessProcessingService.this;
                if (!eitlVar.C()) {
                    return enps.f(ensi.h(transientHistoricalBusynessProcessingService.e().b()), new eiho() { // from class: damf
                        @Override // defpackage.eiho
                        public final Object apply(Object obj2) {
                            TransientHistoricalBusynessProcessingService transientHistoricalBusynessProcessingService2 = TransientHistoricalBusynessProcessingService.this;
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
                                if (transientHistoricalBusynessProcessingService2.c == null) {
                                    transientHistoricalBusynessProcessingService2.c = daow.b();
                                }
                                transientHistoricalBusynessProcessingService2.c.d(eitkVar.a());
                                transientHistoricalBusynessProcessingService2.d().e("TransientHistoricalBusynessJobNonEmptyOutput");
                                return true;
                            } catch (LevelDbException e) {
                                ((ejhf) ((ejhf) ((ejhf) TransientHistoricalBusynessProcessingService.a.j()).s(e)).ah((char) 10282)).x("Failed to write historical busyness visits to cache");
                                return false;
                            }
                        }
                    }, enre.a);
                }
                transientHistoricalBusynessProcessingService.d().e("TransientHistoricalBusynessJobEmptyOutput");
                return ensj.i(true);
            }
        };
        enre enreVar = enre.a;
        return enps.g(enps.g(h, enqcVar, enreVar), new enqc() { // from class: damj
            @Override // defpackage.enqc
            public final enss a(Object obj) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                TransientHistoricalBusynessProcessingService transientHistoricalBusynessProcessingService = TransientHistoricalBusynessProcessingService.this;
                if (booleanValue) {
                    transientHistoricalBusynessProcessingService.d().e("TransientHistoricalBusynessJobSuccess");
                    return frwe.d() ? enps.f(transientHistoricalBusynessProcessingService.e().e("TransientHistoricalBusyness", false), new eiho() { // from class: damg
                        @Override // defpackage.eiho
                        public final Object apply(Object obj2) {
                            asot asotVar = TransientHistoricalBusynessProcessingService.a;
                            return 0;
                        }
                    }, enre.a) : ensj.i(0);
                }
                transientHistoricalBusynessProcessingService.d().e("TransientHistoricalBusynessJobFail");
                return frwe.d() ? enps.f(transientHistoricalBusynessProcessingService.e().g("TransientHistoricalBusyness", fegx.h(System.currentTimeMillis())), new eiho() { // from class: damh
                    @Override // defpackage.eiho
                    public final Object apply(Object obj2) {
                        asot asotVar = TransientHistoricalBusynessProcessingService.a;
                        return 2;
                    }
                }, enre.a) : ensj.i(2);
            }
        }, enreVar);
    }
}
