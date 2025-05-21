package com.google.android.gms.semanticlocationhistory.deidentifieddata.golden;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.chimera.modules.semanticlocationhistory.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.android.gms.semanticlocationhistory.deidentifieddata.golden.ParcelSynchronizePersonalizationJob;
import defpackage.asej;
import defpackage.asot;
import defpackage.byln;
import defpackage.czix;
import defpackage.czje;
import defpackage.czlk;
import defpackage.czlp;
import defpackage.dade;
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

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class ParcelSynchronizePersonalizationJob extends GmsTaskBoundService {
    public static final String a = "com.google.android.gms.semanticlocationhistory.deidentifieddata.golden.ParcelSynchronizePersonalizationJob";
    public dbhz b;
    public dade c;
    private final daky d = new daky();
    private czlk e;
    private czje f;

    static {
        asot.c("LocationHistory", asej.SEMANTIC_LOCATION_HISTORY, "ParcelSynchronizePersonalizationJob");
    }

    private final czlk e() {
        if (this.e == null) {
            this.e = new czlk(d());
        }
        return this.e;
    }

    public final czje d() {
        if (this.f == null) {
            this.f = new czje();
        }
        return this.f;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final enss im(byln bylnVar) {
        if (!frve.d()) {
            return ensj.i(0);
        }
        ArrayList arrayList = new ArrayList();
        for (final Account account : czix.d(AppContextProvider.a())) {
            if (e().R(account)) {
                final Instant ofEpochMilli = Instant.ofEpochMilli(System.currentTimeMillis());
                enre enreVar = enre.a;
                String str = account.name;
                d().k("DeidentifiedGoldenData", 18);
                enss f = enps.f(ensi.h(czlp.h(e(), account, enreVar)), new eiho() { // from class: dajv
                    @Override // defpackage.eiho
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
                }, enreVar);
                final daky dakyVar = this.d;
                Objects.requireNonNull(dakyVar);
                arrayList.add(enps.f(enps.f(enps.g(f, new enqc() { // from class: dajw
                    @Override // defpackage.enqc
                    public final enss a(Object obj) {
                        return daky.this.a((String) obj);
                    }
                }, enreVar), new eiho() { // from class: dajx
                    @Override // defpackage.eiho
                    public final Object apply(Object obj) {
                        eitj eitjVar = (eitj) obj;
                        AppContextProvider.a();
                        ParcelSynchronizePersonalizationJob parcelSynchronizePersonalizationJob = ParcelSynchronizePersonalizationJob.this;
                        Context a2 = AppContextProvider.a();
                        if (parcelSynchronizePersonalizationJob.c == null) {
                            parcelSynchronizePersonalizationJob.c = dadh.w(a2);
                        }
                        Instant instant = ofEpochMilli;
                        Account account2 = account;
                        Stream filter = Collection.EL.stream(parcelSynchronizePersonalizationJob.c.r(account2, fegx.d(fegu.b(instant.minus(Duration.ofDays(365L)))), fegx.d(fegu.b(instant)))).filter(new Predicate() { // from class: dald
                            public final /* synthetic */ Predicate and(Predicate predicate) {
                                return Predicate$CC.$default$and(this, predicate);
                            }

                            @Override // java.util.function.Predicate
                            /* renamed from: negate */
                            public final /* synthetic */ Predicate mo463negate() {
                                return Predicate$CC.$default$negate(this);
                            }

                            @Override // java.util.function.Predicate
                            public final /* synthetic */ Predicate or(Predicate predicate) {
                                return Predicate$CC.$default$or(this, predicate);
                            }

                            @Override // java.util.function.Predicate
                            public final boolean test(Object obj2) {
                                eyul eyulVar = (eyul) obj2;
                                eyui eyuiVar = eyulVar.g;
                                if (eyuiVar == null) {
                                    eyuiVar = eyui.a;
                                }
                                if (((eyuiVar.b == 1 ? (ffbb) eyuiVar.c : ffbb.a).b & 4) == 0) {
                                    return false;
                                }
                                eyui eyuiVar2 = eyulVar.g;
                                if (eyuiVar2 == null) {
                                    eyuiVar2 = eyui.a;
                                }
                                ffas ffasVar = (eyuiVar2.b == 1 ? (ffbb) eyuiVar2.c : ffbb.a).e;
                                if (ffasVar == null) {
                                    ffasVar = ffas.a;
                                }
                                return (ffasVar.b & 1) != 0;
                            }
                        });
                        Function function = new Function() { // from class: dale
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo464andThen(Function function2) {
                                return Function$CC.$default$andThen(this, function2);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                eyul eyulVar = (eyul) obj2;
                                eyui eyuiVar = eyulVar.g;
                                if (eyuiVar == null) {
                                    eyuiVar = eyui.a;
                                }
                                ffas ffasVar = (eyuiVar.b == 1 ? (ffbb) eyuiVar.c : ffbb.a).e;
                                if (ffasVar == null) {
                                    ffasVar = ffas.a;
                                }
                                ffal ffalVar = ffasVar.c;
                                if (ffalVar == null) {
                                    ffalVar = ffal.a;
                                }
                                Long valueOf = Long.valueOf(ffalVar.c);
                                eyui eyuiVar2 = eyulVar.g;
                                if (eyuiVar2 == null) {
                                    eyuiVar2 = eyui.a;
                                }
                                ffas ffasVar2 = (eyuiVar2.b == 1 ? (ffbb) eyuiVar2.c : ffbb.a).e;
                                if (ffasVar2 == null) {
                                    ffasVar2 = ffas.a;
                                }
                                ffal ffalVar2 = ffasVar2.c;
                                if (ffalVar2 == null) {
                                    ffalVar2 = ffal.a;
                                }
                                return new eiie(valueOf, Long.valueOf(ffalVar2.d));
                            }

                            public final /* synthetic */ Function compose(Function function2) {
                                return Function$CC.$default$compose(this, function2);
                            }
                        };
                        int i = eitj.d;
                        Collector collector = eipl.a;
                        eitj eitjVar2 = (eitj) Collection.EL.stream((eitj) Collection.EL.stream(((Map) filter.collect(Collectors.groupingBy(function, collector))).entrySet()).map(new Function() { // from class: dalf
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo464andThen(Function function2) {
                                return Function$CC.$default$andThen(this, function2);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                Map.Entry entry = (Map.Entry) obj2;
                                long longValue = ((Long) ((eiie) entry.getKey()).a).longValue();
                                long longValue2 = ((Long) ((eiie) entry.getKey()).b).longValue();
                                List list = (List) entry.getValue();
                                fecj v = etop.a.v();
                                if (!v.b.L()) {
                                    v.U();
                                }
                                fecp fecpVar = v.b;
                                etop etopVar = (etop) fecpVar;
                                etopVar.b |= 2;
                                etopVar.d = longValue;
                                if (!fecpVar.L()) {
                                    v.U();
                                }
                                fecp fecpVar2 = v.b;
                                etop etopVar2 = (etop) fecpVar2;
                                etopVar2.b |= 4;
                                etopVar2.e = longValue2;
                                if (!fecpVar2.L()) {
                                    v.U();
                                }
                                etop etopVar3 = (etop) v.b;
                                etopVar3.c = 196;
                                etopVar3.b |= 1;
                                eyui eyuiVar = ((eyul) list.get(0)).g;
                                if (eyuiVar == null) {
                                    eyuiVar = eyui.a;
                                }
                                ffas ffasVar = (eyuiVar.b == 1 ? (ffbb) eyuiVar.c : ffbb.a).e;
                                if (ffasVar == null) {
                                    ffasVar = ffas.a;
                                }
                                ffat ffatVar = ffasVar.g;
                                if (ffatVar == null) {
                                    ffatVar = ffat.a;
                                }
                                int i2 = ffatVar.c;
                                if (!v.b.L()) {
                                    v.U();
                                }
                                etop etopVar4 = (etop) v.b;
                                etopVar4.b |= 8;
                                etopVar4.f = i2;
                                eyui eyuiVar2 = ((eyul) list.get(0)).g;
                                if (eyuiVar2 == null) {
                                    eyuiVar2 = eyui.a;
                                }
                                ffas ffasVar2 = (eyuiVar2.b == 1 ? (ffbb) eyuiVar2.c : ffbb.a).e;
                                if (ffasVar2 == null) {
                                    ffasVar2 = ffas.a;
                                }
                                ffat ffatVar2 = ffasVar2.g;
                                if (ffatVar2 == null) {
                                    ffatVar2 = ffat.a;
                                }
                                int i3 = ffatVar2.d;
                                if (!v.b.L()) {
                                    v.U();
                                }
                                etop etopVar5 = (etop) v.b;
                                etopVar5.b |= 16;
                                etopVar5.g = i3;
                                int size = list.size();
                                if (!v.b.L()) {
                                    v.U();
                                }
                                etop etopVar6 = (etop) v.b;
                                etopVar6.b |= 64;
                                etopVar6.h = size;
                                Stream map = Collection.EL.stream(list).map(new Function() { // from class: dalg
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo464andThen(Function function2) {
                                        return Function$CC.$default$andThen(this, function2);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj3) {
                                        fefi fefiVar = ((eyul) obj3).d;
                                        return fefiVar == null ? fefi.a : fefiVar;
                                    }

                                    public final /* synthetic */ Function compose(Function function2) {
                                        return Function$CC.$default$compose(this, function2);
                                    }
                                });
                                fefi fefiVar = fegx.a;
                                Stream sorted = map.sorted(Comparator.EL.reversed(fegw.a));
                                int i4 = eitj.d;
                                Iterable iterable = (Iterable) sorted.collect(eipl.a);
                                if (!v.b.L()) {
                                    v.U();
                                }
                                etop etopVar7 = (etop) v.b;
                                fedh fedhVar = etopVar7.i;
                                if (!fedhVar.c()) {
                                    etopVar7.i = fecp.E(fedhVar);
                                }
                                feab.E(iterable, etopVar7.i);
                                return (etop) v.Q();
                            }

                            public final /* synthetic */ Function compose(Function function2) {
                                return Function$CC.$default$compose(this, function2);
                            }
                        }).collect(collector)).collect(collector);
                        fecj v = etpc.a.v();
                        if (!v.b.L()) {
                            v.U();
                        }
                        etpc etpcVar = (etpc) v.b;
                        fedh fedhVar = etpcVar.b;
                        if (!fedhVar.c()) {
                            etpcVar.b = fecp.E(fedhVar);
                        }
                        feab.E(eitjVar2, etpcVar.b);
                        return new dakw(eitjVar, (etpc) v.Q());
                    }
                }, enreVar), new eiho() { // from class: dajy
                    @Override // defpackage.eiho
                    public final Object apply(Object obj) {
                        eitj eitjVar;
                        dakw dakwVar = (dakw) obj;
                        eitj eitjVar2 = dakwVar.a;
                        boolean isEmpty = eitjVar2.isEmpty();
                        Account account2 = account;
                        if (isEmpty) {
                            String str2 = account2.name;
                            ejck ejckVar = ejck.a;
                            return new dajz(ejckVar, ejckVar);
                        }
                        ParcelSynchronizePersonalizationJob parcelSynchronizePersonalizationJob = ParcelSynchronizePersonalizationJob.this;
                        eitjVar2.size();
                        String str3 = account2.name;
                        if (parcelSynchronizePersonalizationJob.b == null) {
                            parcelSynchronizePersonalizationJob.b = new dbhz();
                        }
                        dbhz dbhzVar = parcelSynchronizePersonalizationJob.b;
                        etqq etqqVar = etqq.a;
                        fecj v = etqqVar.v();
                        if (!v.b.L()) {
                            v.U();
                        }
                        etqq etqqVar2 = (etqq) v.b;
                        fedh fedhVar = etqqVar2.c;
                        if (!fedhVar.c()) {
                            etqqVar2.c = fecp.E(fedhVar);
                        }
                        feab.E(eitjVar2, etqqVar2.c);
                        etpc etpcVar = dakwVar.b;
                        if (!v.b.L()) {
                            v.U();
                        }
                        etqq etqqVar3 = (etqq) v.b;
                        etqqVar3.d = etpcVar;
                        etqqVar3.b |= 1;
                        etqq etqqVar4 = (etqq) v.Q();
                        try {
                            if (frve.d()) {
                                try {
                                    dbia dbiaVar = new dbia(dbhzVar.d(), bzgc.a, bxyf.b);
                                    arts a2 = dbhzVar.a(account2);
                                    long j = dbia.a;
                                    if (dbia.i == null) {
                                        ftxd ftxdVar = ftxd.UNARY;
                                        febw febwVar = furo.a;
                                        dbia.i = new ftxe(ftxdVar, "google.internal.locationhistory.v1.LocationHistoryService/SynchronizePersonalization", new furn(etqqVar), new furn(etqr.a), false);
                                    }
                                    etqr etqrVar = (etqr) dbiaVar.j.f(dbia.i, a2, etqqVar4, j, TimeUnit.MILLISECONDS, dbiaVar.k);
                                    dbhzVar.g("LHServerSynchronizePersonalization");
                                    eitjVar = eitj.i(etqrVar.b);
                                } catch (ftye | ftyg | unx e) {
                                    dbhzVar.f(e, "SynchronizePersonalization");
                                    dbhzVar.h(e, "LHServerSynchronizePersonalization");
                                    eitjVar = ejcb.a;
                                }
                            } else {
                                eitjVar = ejcb.a;
                            }
                            return new dajz(eiuu.G(eitjVar2), eiuu.G(eitjVar));
                        } finally {
                            dbhzVar.i();
                        }
                    }
                }, enreVar));
            }
        }
        return enps.f(ensj.e(arrayList), new eiho() { // from class: daju
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                int i = 0;
                for (dajz dajzVar : (List) obj) {
                    ParcelSynchronizePersonalizationJob parcelSynchronizePersonalizationJob = ParcelSynchronizePersonalizationJob.this;
                    eiuu eiuuVar = dajzVar.a;
                    eiuu eiuuVar2 = dajzVar.b;
                    if (!eiuuVar.equals(eiuuVar2)) {
                        eiuuVar.size();
                        eiuuVar2.size();
                        parcelSynchronizePersonalizationJob.d().k("DeidentifiedGoldenData", 23);
                        i = 2;
                    } else if (eiuuVar.isEmpty()) {
                        parcelSynchronizePersonalizationJob.d().k("DeidentifiedGoldenData", 20);
                    } else {
                        eiuuVar.size();
                        parcelSynchronizePersonalizationJob.d().k("DeidentifiedGoldenData", 21);
                        parcelSynchronizePersonalizationJob.d().l("DeidentifiedGoldenData", 22, eiuuVar.size());
                    }
                }
                return Integer.valueOf(i);
            }
        }, enre.a);
    }
}
