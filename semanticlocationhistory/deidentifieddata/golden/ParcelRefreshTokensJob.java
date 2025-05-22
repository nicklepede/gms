package com.google.android.gms.semanticlocationhistory.deidentifieddata.golden;

import android.accounts.Account;
import com.google.android.gms.chimera.modules.semanticlocationhistory.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.android.gms.semanticlocationhistory.deidentifieddata.golden.ParcelRefreshTokensJob;
import defpackage.auid;
import defpackage.ausn;
import defpackage.cauf;
import defpackage.dbsv;
import defpackage.dbtc;
import defpackage.dbvg;
import defpackage.dbvl;
import defpackage.dcvg;
import defpackage.ddsf;
import defpackage.ekut;
import defpackage.eqdl;
import defpackage.eqdv;
import defpackage.eqex;
import defpackage.eqgb;
import defpackage.eqgc;
import defpackage.eqgl;
import defpackage.fupy;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class ParcelRefreshTokensJob extends GmsTaskBoundService {
    public static final String a = "com.google.android.gms.semanticlocationhistory.deidentifieddata.golden.ParcelRefreshTokensJob";
    public ddsf b;
    private final dcvg c = new dcvg();
    private dbvg d;
    private dbtc e;

    static {
        ausn.c("LocationHistory", auid.SEMANTIC_LOCATION_HISTORY, "ParcelRefreshTokenJob");
    }

    private final dbvg e() {
        if (this.d == null) {
            this.d = new dbvg(d());
        }
        return this.d;
    }

    public final dbtc d() {
        if (this.e == null) {
            this.e = new dbtc();
        }
        return this.e;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final eqgl iB(cauf caufVar) {
        if (!fupy.d()) {
            return eqgc.i(0);
        }
        ArrayList arrayList = new ArrayList();
        for (final Account account : dbsv.d(AppContextProvider.a())) {
            if (e().R(account)) {
                eqex eqexVar = eqex.a;
                String str = account.name;
                d().k("DeidentifiedGoldenData", 7);
                eqgl f = eqdl.f(eqgb.h(dbvl.h(e(), account, eqexVar)), new ekut() { // from class: dcto
                    @Override // defpackage.ekut
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
                }, eqexVar);
                final dcvg dcvgVar = this.c;
                Objects.requireNonNull(dcvgVar);
                arrayList.add(eqdl.f(eqdl.g(f, new eqdv() { // from class: dctp
                    @Override // defpackage.eqdv
                    public final eqgl a(Object obj) {
                        return dcvg.this.a((String) obj);
                    }
                }, eqexVar), new ekut() { // from class: dctq
                    @Override // defpackage.ekut
                    public final Object apply(Object obj) {
                        elgo elgoVar;
                        elgo elgoVar2 = (elgo) obj;
                        boolean isEmpty = elgoVar2.isEmpty();
                        Account account2 = account;
                        if (isEmpty) {
                            String str2 = account2.name;
                            elpp elppVar = elpp.a;
                            return new dcts(elppVar, elppVar);
                        }
                        ParcelRefreshTokensJob parcelRefreshTokensJob = ParcelRefreshTokensJob.this;
                        elgoVar2.size();
                        String str3 = account2.name;
                        if (parcelRefreshTokensJob.b == null) {
                            parcelRefreshTokensJob.b = new ddsf();
                        }
                        ddsf ddsfVar = parcelRefreshTokensJob.b;
                        ewfq ewfqVar = ewfq.a;
                        fgrc v = ewfqVar.v();
                        if (!v.b.L()) {
                            v.U();
                        }
                        ewfq ewfqVar2 = (ewfq) v.b;
                        fgsa fgsaVar = ewfqVar2.b;
                        if (!fgsaVar.c()) {
                            ewfqVar2.b = fgri.E(fgsaVar);
                        }
                        fgou.E(elgoVar2, ewfqVar2.b);
                        ewfq ewfqVar3 = (ewfq) v.Q();
                        try {
                            if (fupy.d()) {
                                try {
                                    ddsg ddsgVar = new ddsg(ddsfVar.d(), cbot.a, cagw.b);
                                    atwh a2 = ddsfVar.a(account2);
                                    long j = ddsg.a;
                                    if (ddsg.h == null) {
                                        fwtb fwtbVar = fwtb.UNARY;
                                        fgqp fgqpVar = fxnm.a;
                                        ddsg.h = new fwtc(fwtbVar, "google.internal.locationhistory.v1.LocationHistoryService/RefreshTokens", new fxnl(ewfqVar), new fxnl(ewfr.a), false);
                                    }
                                    ewfr ewfrVar = (ewfr) ddsgVar.j.f(ddsg.h, a2, ewfqVar3, j, TimeUnit.MILLISECONDS, ddsgVar.k);
                                    ddsfVar.g("LHServerRefreshTokens");
                                    elgoVar = elgo.i(ewfrVar.b);
                                } catch (fwuc | fwue | wjw e) {
                                    ddsfVar.f(e, "RefreshTokens");
                                    ddsfVar.h(e, "LHServerRefreshTokens");
                                    elgoVar = elpg.a;
                                }
                            } else {
                                elgoVar = elpg.a;
                            }
                            return new dcts(elhz.G(elgoVar2), elhz.G(elgoVar));
                        } finally {
                            ddsfVar.i();
                        }
                    }
                }, eqexVar));
            }
        }
        return eqdl.f(eqgc.e(arrayList), new ekut() { // from class: dctr
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                int i = 0;
                for (dcts dctsVar : (List) obj) {
                    ParcelRefreshTokensJob parcelRefreshTokensJob = ParcelRefreshTokensJob.this;
                    elhz elhzVar = dctsVar.a;
                    elhz elhzVar2 = dctsVar.b;
                    if (!elhzVar.equals(elhzVar2)) {
                        elhzVar.size();
                        elhzVar2.size();
                        parcelRefreshTokensJob.d().k("DeidentifiedGoldenData", 9);
                        i = 2;
                    } else if (elhzVar.isEmpty()) {
                        parcelRefreshTokensJob.d().k("DeidentifiedGoldenData", 15);
                    } else {
                        elhzVar.size();
                        parcelRefreshTokensJob.d().k("DeidentifiedGoldenData", 8);
                        parcelRefreshTokensJob.d().l("DeidentifiedGoldenData", 17, elhzVar.size());
                    }
                }
                return Integer.valueOf(i);
            }
        }, eqex.a);
    }
}
