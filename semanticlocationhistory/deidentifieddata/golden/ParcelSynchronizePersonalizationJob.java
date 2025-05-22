package com.google.android.gms.semanticlocationhistory.deidentifieddata.golden;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.chimera.modules.semanticlocationhistory.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.android.gms.semanticlocationhistory.deidentifieddata.golden.ParcelSynchronizePersonalizationJob;
import defpackage.auid;
import defpackage.ausn;
import defpackage.cauf;
import defpackage.dbsv;
import defpackage.dbtc;
import defpackage.dbvg;
import defpackage.dbvl;
import defpackage.dcnm;
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
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Comparator;
import j$.util.Objects;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collector;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class ParcelSynchronizePersonalizationJob extends GmsTaskBoundService {
    public static final String a = "com.google.android.gms.semanticlocationhistory.deidentifieddata.golden.ParcelSynchronizePersonalizationJob";
    public ddsf b;
    public dcnm c;
    private final dcvg d = new dcvg();
    private dbvg e;
    private dbtc f;

    static {
        ausn.c("LocationHistory", auid.SEMANTIC_LOCATION_HISTORY, "ParcelSynchronizePersonalizationJob");
    }

    private final dbvg e() {
        if (this.e == null) {
            this.e = new dbvg(d());
        }
        return this.e;
    }

    public final dbtc d() {
        if (this.f == null) {
            this.f = new dbtc();
        }
        return this.f;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final eqgl iB(cauf caufVar) {
        if (!fupy.d()) {
            return eqgc.i(0);
        }
        ArrayList arrayList = new ArrayList();
        for (final Account account : dbsv.d(AppContextProvider.a())) {
            if (e().R(account)) {
                final Instant ofEpochMilli = Instant.ofEpochMilli(System.currentTimeMillis());
                eqex eqexVar = eqex.a;
                String str = account.name;
                d().k("DeidentifiedGoldenData", 18);
                eqgl f = eqdl.f(eqgb.h(dbvl.h(e(), account, eqexVar)), new ekut() { // from class: dcud
                    @Override // defpackage.ekut
                    public final Object apply(Object obj) {
                        String str2 = (String) obj;
                        if (str2.isEmpty()) {
                            Account account2 = account;
                            ParcelSynchronizePersonalizationJob parcelSynchronizePersonalizationJob = ParcelSynchronizePersonalizationJob.this;
                            String str3 = account2.name;
                            parcelSynchronizePersonalizationJob.d().k("DeidentifiedGoldenData", 19);
                        }
                        return str2;
                    }
                }, eqexVar);
                final dcvg dcvgVar = this.d;
                Objects.requireNonNull(dcvgVar);
                arrayList.add(eqdl.f(eqdl.f(eqdl.g(f, new eqdv() { // from class: dcue
                    @Override // defpackage.eqdv
                    public final eqgl a(Object obj) {
                        return dcvg.this.a((String) obj);
                    }
                }, eqexVar), new ekut() { // from class: dcuf
                    @Override // defpackage.ekut
                    public final Object apply(Object obj) {
                        elgo elgoVar = (elgo) obj;
                        AppContextProvider.a();
                        ParcelSynchronizePersonalizationJob parcelSynchronizePersonalizationJob = ParcelSynchronizePersonalizationJob.this;
                        Context a2 = AppContextProvider.a();
                        if (parcelSynchronizePersonalizationJob.c == null) {
                            parcelSynchronizePersonalizationJob.c = dcnp.w(a2);
                        }
                        Instant instant = ofEpochMilli;
                        Account account2 = account;
                        Stream filter = Collection.EL.stream(parcelSynchronizePersonalizationJob.c.r(account2, fgvq.d(fgvn.b(instant.minus(Duration.ofDays(365L)))), fgvq.d(fgvn.b(instant)))).filter(new Predicate() { // from class: dcvl
                            public final /* synthetic */ Predicate and(Predicate predicate) {
                                return Predicate$CC.$default$and(this, predicate);
                            }

                            @Override // java.util.function.Predicate
                            /* renamed from: negate */
                            public final /* synthetic */ Predicate mo478negate() {
                                return Predicate$CC.$default$negate(this);
                            }

                            @Override // java.util.function.Predicate
                            public final /* synthetic */ Predicate or(Predicate predicate) {
                                return Predicate$CC.$default$or(this, predicate);
                            }

                            @Override // java.util.function.Predicate
                            public final boolean test(Object obj2) {
                                fbiz fbizVar = (fbiz) obj2;
                                fbiw fbiwVar = fbizVar.g;
                                if (fbiwVar == null) {
                                    fbiwVar = fbiw.a;
                                }
                                if (((fbiwVar.b == 1 ? (fhpz) fbiwVar.c : fhpz.a).b & 4) == 0) {
                                    return false;
                                }
                                fbiw fbiwVar2 = fbizVar.g;
                                if (fbiwVar2 == null) {
                                    fbiwVar2 = fbiw.a;
                                }
                                fhpq fhpqVar = (fbiwVar2.b == 1 ? (fhpz) fbiwVar2.c : fhpz.a).e;
                                if (fhpqVar == null) {
                                    fhpqVar = fhpq.a;
                                }
                                return (fhpqVar.b & 1) != 0;
                            }
                        });
                        Function function = new Function() { // from class: dcvm
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo479andThen(Function function2) {
                                return Function$CC.$default$andThen(this, function2);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                fbiz fbizVar = (fbiz) obj2;
                                fbiw fbiwVar = fbizVar.g;
                                if (fbiwVar == null) {
                                    fbiwVar = fbiw.a;
                                }
                                fhpq fhpqVar = (fbiwVar.b == 1 ? (fhpz) fbiwVar.c : fhpz.a).e;
                                if (fhpqVar == null) {
                                    fhpqVar = fhpq.a;
                                }
                                fhpj fhpjVar = fhpqVar.c;
                                if (fhpjVar == null) {
                                    fhpjVar = fhpj.a;
                                }
                                Long valueOf = Long.valueOf(fhpjVar.c);
                                fbiw fbiwVar2 = fbizVar.g;
                                if (fbiwVar2 == null) {
                                    fbiwVar2 = fbiw.a;
                                }
                                fhpq fhpqVar2 = (fbiwVar2.b == 1 ? (fhpz) fbiwVar2.c : fhpz.a).e;
                                if (fhpqVar2 == null) {
                                    fhpqVar2 = fhpq.a;
                                }
                                fhpj fhpjVar2 = fhpqVar2.c;
                                if (fhpjVar2 == null) {
                                    fhpjVar2 = fhpj.a;
                                }
                                return new ekvj(valueOf, Long.valueOf(fhpjVar2.d));
                            }

                            public final /* synthetic */ Function compose(Function function2) {
                                return Function$CC.$default$compose(this, function2);
                            }
                        };
                        int i = elgo.d;
                        Collector collector = elcq.a;
                        elgo elgoVar2 = (elgo) Collection.EL.stream((elgo) Collection.EL.stream(((Map) filter.collect(Collectors.groupingBy(function, collector))).entrySet()).map(new Function() { // from class: dcvn
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo479andThen(Function function2) {
                                return Function$CC.$default$andThen(this, function2);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                Map.Entry entry = (Map.Entry) obj2;
                                long longValue = ((Long) ((ekvj) entry.getKey()).a).longValue();
                                long longValue2 = ((Long) ((ekvj) entry.getKey()).b).longValue();
                                List list = (List) entry.getValue();
                                fgrc v = eweh.a.v();
                                if (!v.b.L()) {
                                    v.U();
                                }
                                fgri fgriVar = v.b;
                                eweh ewehVar = (eweh) fgriVar;
                                ewehVar.b |= 2;
                                ewehVar.d = longValue;
                                if (!fgriVar.L()) {
                                    v.U();
                                }
                                fgri fgriVar2 = v.b;
                                eweh ewehVar2 = (eweh) fgriVar2;
                                ewehVar2.b |= 4;
                                ewehVar2.e = longValue2;
                                if (!fgriVar2.L()) {
                                    v.U();
                                }
                                eweh ewehVar3 = (eweh) v.b;
                                ewehVar3.c = 196;
                                ewehVar3.b |= 1;
                                fbiw fbiwVar = ((fbiz) list.get(0)).g;
                                if (fbiwVar == null) {
                                    fbiwVar = fbiw.a;
                                }
                                fhpq fhpqVar = (fbiwVar.b == 1 ? (fhpz) fbiwVar.c : fhpz.a).e;
                                if (fhpqVar == null) {
                                    fhpqVar = fhpq.a;
                                }
                                fhpr fhprVar = fhpqVar.g;
                                if (fhprVar == null) {
                                    fhprVar = fhpr.a;
                                }
                                int i2 = fhprVar.c;
                                if (!v.b.L()) {
                                    v.U();
                                }
                                eweh ewehVar4 = (eweh) v.b;
                                ewehVar4.b |= 8;
                                ewehVar4.f = i2;
                                fbiw fbiwVar2 = ((fbiz) list.get(0)).g;
                                if (fbiwVar2 == null) {
                                    fbiwVar2 = fbiw.a;
                                }
                                fhpq fhpqVar2 = (fbiwVar2.b == 1 ? (fhpz) fbiwVar2.c : fhpz.a).e;
                                if (fhpqVar2 == null) {
                                    fhpqVar2 = fhpq.a;
                                }
                                fhpr fhprVar2 = fhpqVar2.g;
                                if (fhprVar2 == null) {
                                    fhprVar2 = fhpr.a;
                                }
                                int i3 = fhprVar2.d;
                                if (!v.b.L()) {
                                    v.U();
                                }
                                eweh ewehVar5 = (eweh) v.b;
                                ewehVar5.b |= 16;
                                ewehVar5.g = i3;
                                int size = list.size();
                                if (!v.b.L()) {
                                    v.U();
                                }
                                eweh ewehVar6 = (eweh) v.b;
                                ewehVar6.b |= 64;
                                ewehVar6.h = size;
                                Stream map = Collection.EL.stream(list).map(new Function() { // from class: dcvo
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo479andThen(Function function2) {
                                        return Function$CC.$default$andThen(this, function2);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj3) {
                                        fgub fgubVar = ((fbiz) obj3).d;
                                        return fgubVar == null ? fgub.a : fgubVar;
                                    }

                                    public final /* synthetic */ Function compose(Function function2) {
                                        return Function$CC.$default$compose(this, function2);
                                    }
                                });
                                fgub fgubVar = fgvq.a;
                                Stream sorted = map.sorted(Comparator.EL.reversed(fgvp.a));
                                int i4 = elgo.d;
                                Iterable iterable = (Iterable) sorted.collect(elcq.a);
                                if (!v.b.L()) {
                                    v.U();
                                }
                                eweh ewehVar7 = (eweh) v.b;
                                fgsa fgsaVar = ewehVar7.i;
                                if (!fgsaVar.c()) {
                                    ewehVar7.i = fgri.E(fgsaVar);
                                }
                                fgou.E(iterable, ewehVar7.i);
                                return (eweh) v.Q();
                            }

                            public final /* synthetic */ Function compose(Function function2) {
                                return Function$CC.$default$compose(this, function2);
                            }
                        }).collect(collector)).collect(collector);
                        fgrc v = eweu.a.v();
                        if (!v.b.L()) {
                            v.U();
                        }
                        eweu eweuVar = (eweu) v.b;
                        fgsa fgsaVar = eweuVar.b;
                        if (!fgsaVar.c()) {
                            eweuVar.b = fgri.E(fgsaVar);
                        }
                        fgou.E(elgoVar2, eweuVar.b);
                        return new dcve(elgoVar, (eweu) v.Q());
                    }
                }, eqexVar), new ekut() { // from class: dcug
                    @Override // defpackage.ekut
                    public final Object apply(Object obj) {
                        elgo elgoVar;
                        dcve dcveVar = (dcve) obj;
                        elgo elgoVar2 = dcveVar.a;
                        boolean isEmpty = elgoVar2.isEmpty();
                        Account account2 = account;
                        if (isEmpty) {
                            String str2 = account2.name;
                            elpp elppVar = elpp.a;
                            return new dcuh(elppVar, elppVar);
                        }
                        ParcelSynchronizePersonalizationJob parcelSynchronizePersonalizationJob = ParcelSynchronizePersonalizationJob.this;
                        elgoVar2.size();
                        String str3 = account2.name;
                        if (parcelSynchronizePersonalizationJob.b == null) {
                            parcelSynchronizePersonalizationJob.b = new ddsf();
                        }
                        ddsf ddsfVar = parcelSynchronizePersonalizationJob.b;
                        ewgi ewgiVar = ewgi.a;
                        fgrc v = ewgiVar.v();
                        if (!v.b.L()) {
                            v.U();
                        }
                        ewgi ewgiVar2 = (ewgi) v.b;
                        fgsa fgsaVar = ewgiVar2.c;
                        if (!fgsaVar.c()) {
                            ewgiVar2.c = fgri.E(fgsaVar);
                        }
                        fgou.E(elgoVar2, ewgiVar2.c);
                        eweu eweuVar = dcveVar.b;
                        if (!v.b.L()) {
                            v.U();
                        }
                        ewgi ewgiVar3 = (ewgi) v.b;
                        ewgiVar3.d = eweuVar;
                        ewgiVar3.b |= 1;
                        ewgi ewgiVar4 = (ewgi) v.Q();
                        try {
                            if (fupy.d()) {
                                try {
                                    ddsg ddsgVar = new ddsg(ddsfVar.d(), cbot.a, cagx.b);
                                    atwh a2 = ddsfVar.a(account2);
                                    long j = ddsg.a;
                                    if (ddsg.i == null) {
                                        fwtb fwtbVar = fwtb.UNARY;
                                        fgqp fgqpVar = fxnm.a;
                                        ddsg.i = new fwtc(fwtbVar, "google.internal.locationhistory.v1.LocationHistoryService/SynchronizePersonalization", new fxnl(ewgiVar), new fxnl(ewgj.a), false);
                                    }
                                    ewgj ewgjVar = (ewgj) ddsgVar.j.f(ddsg.i, a2, ewgiVar4, j, TimeUnit.MILLISECONDS, ddsgVar.k);
                                    ddsfVar.g("LHServerSynchronizePersonalization");
                                    elgoVar = elgo.i(ewgjVar.b);
                                } catch (fwuc | fwue | wjw e) {
                                    ddsfVar.f(e, "SynchronizePersonalization");
                                    ddsfVar.h(e, "LHServerSynchronizePersonalization");
                                    elgoVar = elpg.a;
                                }
                            } else {
                                elgoVar = elpg.a;
                            }
                            return new dcuh(elhz.G(elgoVar2), elhz.G(elgoVar));
                        } finally {
                            ddsfVar.i();
                        }
                    }
                }, eqexVar));
            }
        }
        return eqdl.f(eqgc.e(arrayList), new ekut() { // from class: dcuc
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                int i = 0;
                for (dcuh dcuhVar : (List) obj) {
                    ParcelSynchronizePersonalizationJob parcelSynchronizePersonalizationJob = ParcelSynchronizePersonalizationJob.this;
                    elhz elhzVar = dcuhVar.a;
                    elhz elhzVar2 = dcuhVar.b;
                    if (!elhzVar.equals(elhzVar2)) {
                        elhzVar.size();
                        elhzVar2.size();
                        parcelSynchronizePersonalizationJob.d().k("DeidentifiedGoldenData", 23);
                        i = 2;
                    } else if (elhzVar.isEmpty()) {
                        parcelSynchronizePersonalizationJob.d().k("DeidentifiedGoldenData", 20);
                    } else {
                        elhzVar.size();
                        parcelSynchronizePersonalizationJob.d().k("DeidentifiedGoldenData", 21);
                        parcelSynchronizePersonalizationJob.d().l("DeidentifiedGoldenData", 22, elhzVar.size());
                    }
                }
                return Integer.valueOf(i);
            }
        }, eqex.a);
    }
}
