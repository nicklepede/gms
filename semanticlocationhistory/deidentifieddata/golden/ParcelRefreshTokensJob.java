package com.google.android.gms.semanticlocationhistory.deidentifieddata.golden;

import android.accounts.Account;
import com.google.android.gms.chimera.modules.semanticlocationhistory.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.android.gms.semanticlocationhistory.deidentifieddata.golden.ParcelRefreshTokensJob;
import defpackage.asej;
import defpackage.asot;
import defpackage.byln;
import defpackage.czix;
import defpackage.czje;
import defpackage.czlk;
import defpackage.czlp;
import defpackage.daky;
import defpackage.dbhz;
import defpackage.eiho;
import defpackage.enps;
import defpackage.enqc;
import defpackage.enre;
import defpackage.ensi;
import defpackage.ensj;
import defpackage.enss;
import defpackage.frve;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class ParcelRefreshTokensJob extends GmsTaskBoundService {
    public static final String a = "com.google.android.gms.semanticlocationhistory.deidentifieddata.golden.ParcelRefreshTokensJob";
    public dbhz b;
    private final daky c = new daky();
    private czlk d;
    private czje e;

    static {
        asot.c("LocationHistory", asej.SEMANTIC_LOCATION_HISTORY, "ParcelRefreshTokenJob");
    }

    private final czlk e() {
        if (this.d == null) {
            this.d = new czlk(d());
        }
        return this.d;
    }

    public final czje d() {
        if (this.e == null) {
            this.e = new czje();
        }
        return this.e;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final enss im(byln bylnVar) {
        if (!frve.d()) {
            return ensj.i(0);
        }
        ArrayList arrayList = new ArrayList();
        for (final Account account : czix.d(AppContextProvider.a())) {
            if (e().R(account)) {
                enre enreVar = enre.a;
                String str = account.name;
                d().k("DeidentifiedGoldenData", 7);
                enss f = enps.f(ensi.h(czlp.h(e(), account, enreVar)), new eiho() { // from class: dajg
                    @Override // defpackage.eiho
                    public final Object apply(Object obj) {
                        String str2 = (String) obj;
                        if (str2.isEmpty()) {
                            Account account2 = account;
                            ParcelRefreshTokensJob parcelRefreshTokensJob = ParcelRefreshTokensJob.this;
                            String str3 = account2.name;
                            parcelRefreshTokensJob.d().k("DeidentifiedGoldenData", 16);
                        }
                        return str2;
                    }
                }, enreVar);
                final daky dakyVar = this.c;
                Objects.requireNonNull(dakyVar);
                arrayList.add(enps.f(enps.g(f, new enqc() { // from class: dajh
                    @Override // defpackage.enqc
                    public final enss a(Object obj) {
                        return daky.this.a((String) obj);
                    }
                }, enreVar), new eiho() { // from class: daji
                    @Override // defpackage.eiho
                    public final Object apply(Object obj) {
                        eitj eitjVar;
                        eitj eitjVar2 = (eitj) obj;
                        boolean isEmpty = eitjVar2.isEmpty();
                        Account account2 = account;
                        if (isEmpty) {
                            String str2 = account2.name;
                            ejck ejckVar = ejck.a;
                            return new dajk(ejckVar, ejckVar);
                        }
                        ParcelRefreshTokensJob parcelRefreshTokensJob = ParcelRefreshTokensJob.this;
                        eitjVar2.size();
                        String str3 = account2.name;
                        if (parcelRefreshTokensJob.b == null) {
                            parcelRefreshTokensJob.b = new dbhz();
                        }
                        dbhz dbhzVar = parcelRefreshTokensJob.b;
                        etpy etpyVar = etpy.a;
                        fecj v = etpyVar.v();
                        if (!v.b.L()) {
                            v.U();
                        }
                        etpy etpyVar2 = (etpy) v.b;
                        fedh fedhVar = etpyVar2.b;
                        if (!fedhVar.c()) {
                            etpyVar2.b = fecp.E(fedhVar);
                        }
                        feab.E(eitjVar2, etpyVar2.b);
                        etpy etpyVar3 = (etpy) v.Q();
                        try {
                            if (frve.d()) {
                                try {
                                    dbia dbiaVar = new dbia(dbhzVar.d(), bzgc.a, bxye.b);
                                    arts a2 = dbhzVar.a(account2);
                                    long j = dbia.a;
                                    if (dbia.h == null) {
                                        ftxd ftxdVar = ftxd.UNARY;
                                        febw febwVar = furo.a;
                                        dbia.h = new ftxe(ftxdVar, "google.internal.locationhistory.v1.LocationHistoryService/RefreshTokens", new furn(etpyVar), new furn(etpz.a), false);
                                    }
                                    etpz etpzVar = (etpz) dbiaVar.j.f(dbia.h, a2, etpyVar3, j, TimeUnit.MILLISECONDS, dbiaVar.k);
                                    dbhzVar.g("LHServerRefreshTokens");
                                    eitjVar = eitj.i(etpzVar.b);
                                } catch (ftye | ftyg | unx e) {
                                    dbhzVar.f(e, "RefreshTokens");
                                    dbhzVar.h(e, "LHServerRefreshTokens");
                                    eitjVar = ejcb.a;
                                }
                            } else {
                                eitjVar = ejcb.a;
                            }
                            return new dajk(eiuu.G(eitjVar2), eiuu.G(eitjVar));
                        } finally {
                            dbhzVar.i();
                        }
                    }
                }, enreVar));
            }
        }
        return enps.f(ensj.e(arrayList), new eiho() { // from class: dajj
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                int i = 0;
                for (dajk dajkVar : (List) obj) {
                    ParcelRefreshTokensJob parcelRefreshTokensJob = ParcelRefreshTokensJob.this;
                    eiuu eiuuVar = dajkVar.a;
                    eiuu eiuuVar2 = dajkVar.b;
                    if (!eiuuVar.equals(eiuuVar2)) {
                        eiuuVar.size();
                        eiuuVar2.size();
                        parcelRefreshTokensJob.d().k("DeidentifiedGoldenData", 9);
                        i = 2;
                    } else if (eiuuVar.isEmpty()) {
                        parcelRefreshTokensJob.d().k("DeidentifiedGoldenData", 15);
                    } else {
                        eiuuVar.size();
                        parcelRefreshTokensJob.d().k("DeidentifiedGoldenData", 8);
                        parcelRefreshTokensJob.d().l("DeidentifiedGoldenData", 17, eiuuVar.size());
                    }
                }
                return Integer.valueOf(i);
            }
        }, enre.a);
    }
}
