package com.google.android.gms.semanticlocationhistory.settings;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.chimera.modules.semanticlocationhistory.AppContextProvider;
import com.google.android.gms.leveldb.LevelDbException;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.android.gms.semanticlocationhistory.settings.OdlhTombstonesCleanupJob;
import defpackage.asej;
import defpackage.asot;
import defpackage.byln;
import defpackage.czix;
import defpackage.czje;
import defpackage.czjg;
import defpackage.czlk;
import defpackage.czup;
import defpackage.dade;
import defpackage.dadh;
import defpackage.daga;
import defpackage.dahq;
import defpackage.dajf;
import defpackage.daky;
import defpackage.daow;
import defpackage.dbeb;
import defpackage.dbhz;
import defpackage.eiho;
import defpackage.eipl;
import defpackage.eitj;
import defpackage.ejhf;
import defpackage.enox;
import defpackage.enpf;
import defpackage.enps;
import defpackage.enqc;
import defpackage.enre;
import defpackage.ensi;
import defpackage.ensj;
import defpackage.enss;
import defpackage.enti;
import defpackage.erdc;
import defpackage.erdd;
import defpackage.eylu;
import defpackage.eylv;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fefi;
import defpackage.fegx;
import defpackage.fhio;
import defpackage.frve;
import defpackage.frxq;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class OdlhTombstonesCleanupJob extends GmsTaskBoundService {
    public static final asot a = asot.c("LocationHistory", asej.SEMANTIC_LOCATION_HISTORY, "OdlhTombstonesCleanupJob");
    public static final String b = OdlhTombstonesCleanupJob.class.getName();
    public czjg c;
    public daow d;
    public dbeb e;
    private czje f;
    private czlk g;
    private dade h;
    private daga j;
    private dahq k;
    private dbhz l;
    private dajf m;

    public static final erdd k(Exception exc) {
        return new erdd(erdc.NO_USER_DATA, exc.getMessage());
    }

    public static final boolean l(enss enssVar, String str) {
        try {
            ((enpf) enssVar).v(frxq.a.a().t(), TimeUnit.MILLISECONDS);
            return true;
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            ((ejhf) ((ejhf) ((ejhf) a.j()).s(e)).ah((char) 10760)).B("Failed to clear data for deidentified use case: %s", new erdd(erdc.NO_USER_DATA, str));
            return false;
        }
    }

    public static final boolean m(czup czupVar, long j) {
        long currentTimeMillis = System.currentTimeMillis();
        fhio fhioVar = czupVar.d;
        if (fhioVar == null) {
            fhioVar = fhio.a;
        }
        fefi fefiVar = fhioVar.d;
        if (fefiVar == null) {
            fefiVar = fefi.a;
        }
        return fegx.b(fefiVar) > currentTimeMillis - TimeUnit.DAYS.toMillis(j);
    }

    public static final boolean n(eitj eitjVar, long j) {
        int size = eitjVar.size();
        int i = 0;
        while (i < size) {
            boolean m = m((czup) eitjVar.get(i), j);
            i++;
            if (m) {
                return true;
            }
        }
        return false;
    }

    public final czje d() {
        if (this.f == null) {
            this.f = new czje();
        }
        return this.f;
    }

    public final czlk e() {
        if (this.g == null) {
            this.g = new czlk(d());
        }
        return this.g;
    }

    public final dade f(Context context) {
        if (this.h == null) {
            this.h = dadh.w(context);
        }
        return this.h;
    }

    public final daga g() {
        if (this.j == null) {
            this.j = new daga();
        }
        return this.j;
    }

    public final dahq h() {
        if (this.k == null) {
            this.k = new dahq();
        }
        return this.k;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final enss im(byln bylnVar) {
        String str = bylnVar.a;
        if (!Objects.equals(str, "OdlhTombstonesCleanupJob")) {
            ((ejhf) ((ejhf) a.i()).ah((char) 10767)).B("Unexpected tag: %s.", str);
            return ensj.i(2);
        }
        final Context a2 = AppContextProvider.a();
        ArrayList arrayList = new ArrayList();
        for (final Account account : czix.d(AppContextProvider.a())) {
            enre enreVar = enre.a;
            enti entiVar = new enti(enreVar);
            final fecj v = eylv.a.v();
            arrayList.add(enox.f(enps.f(enps.g(enps.f(enps.g(ensi.h(frxq.h() ? enps.f(e().j(account), new eiho() { // from class: dbih
                @Override // defpackage.eiho
                public final Object apply(Object obj) {
                    asot asotVar = OdlhTombstonesCleanupJob.a;
                    return eitj.i(((czuq) obj).j);
                }
            }, enreVar) : e().r(account)), new enqc() { // from class: dbii
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.enqc
                public final enss a(Object obj) {
                    final eitj eitjVar = (eitj) obj;
                    Account account2 = account;
                    OdlhTombstonesCleanupJob odlhTombstonesCleanupJob = OdlhTombstonesCleanupJob.this;
                    try {
                        int b2 = odlhTombstonesCleanupJob.e().b(account2);
                        ejfh it = eitjVar.iterator();
                        while (it.hasNext()) {
                            if (OdlhTombstonesCleanupJob.m((czup) it.next(), b2)) {
                                if (odlhTombstonesCleanupJob.e == null) {
                                    odlhTombstonesCleanupJob.e = new dbej();
                                }
                                return enps.f(ensi.h(odlhTombstonesCleanupJob.e.a(account2.name)), new eiho() { // from class: dbie
                                    @Override // defpackage.eiho
                                    public final Object apply(Object obj2) {
                                        asot asotVar = OdlhTombstonesCleanupJob.a;
                                        return eitj.this;
                                    }
                                }, enre.a);
                            }
                        }
                    } catch (IllegalStateException e) {
                        ((ejhf) ((ejhf) ((ejhf) OdlhTombstonesCleanupJob.a.j()).s(e)).ah((char) 10765)).B("Failed to read user retention window with error: %s", OdlhTombstonesCleanupJob.k(e));
                    }
                    return ensj.i(eitjVar);
                }
            }, entiVar), new eiho() { // from class: dbij
                @Override // defpackage.eiho
                public final Object apply(Object obj) {
                    final Account account2;
                    Context context;
                    OdlhTombstonesCleanupJob odlhTombstonesCleanupJob;
                    eylu eyluVar;
                    boolean z;
                    eylu eyluVar2;
                    eylu eyluVar3;
                    eylu eyluVar4;
                    boolean z2;
                    eylu eyluVar5;
                    enss b2;
                    enss b3;
                    enss b4;
                    enss b5;
                    eitj eitjVar = (eitj) obj;
                    int size = eitjVar.size();
                    fecj fecjVar = v;
                    if (!fecjVar.b.L()) {
                        fecjVar.U();
                    }
                    eylv eylvVar = (eylv) fecjVar.b;
                    eylv eylvVar2 = eylv.a;
                    eylvVar.b |= 2;
                    eylvVar.d = size;
                    boolean z3 = true;
                    if (eitjVar.isEmpty()) {
                        if (!fecjVar.b.L()) {
                            fecjVar.U();
                        }
                        eylv eylvVar3 = (eylv) fecjVar.b;
                        eylvVar3.b |= 1;
                        eylvVar3.c = true;
                        return ejcb.a;
                    }
                    if (!fecjVar.b.L()) {
                        fecjVar.U();
                    }
                    eylv eylvVar4 = (eylv) fecjVar.b;
                    eylvVar4.b |= 128;
                    eylvVar4.l = false;
                    ArrayList arrayList2 = new ArrayList(eitjVar);
                    int size2 = eitjVar.size();
                    int i = 0;
                    while (true) {
                        account2 = account;
                        context = a2;
                        odlhTombstonesCleanupJob = OdlhTombstonesCleanupJob.this;
                        if (i >= size2) {
                            break;
                        }
                        czup czupVar = (czup) eitjVar.get(i);
                        fhio fhioVar = czupVar.d;
                        if (fhioVar == null) {
                            fhioVar = fhio.a;
                        }
                        fefi fefiVar = fhioVar.c;
                        if (fefiVar == null) {
                            fefiVar = fefi.a;
                        }
                        long d = fegx.d(fefiVar);
                        fhio fhioVar2 = czupVar.d;
                        if (fhioVar2 == null) {
                            fhioVar2 = fhio.a;
                        }
                        fefi fefiVar2 = fhioVar2.d;
                        if (fefiVar2 == null) {
                            fefiVar2 = fefi.a;
                        }
                        long d2 = fegx.d(fefiVar2);
                        eyoc o = odlhTombstonesCleanupJob.f(context).o(account2, d, d2);
                        boolean z4 = z3;
                        if (o.d == -1) {
                            ((ejhf) ((ejhf) OdlhTombstonesCleanupJob.a.j()).ah(10758)).T("Failed to apply tombstone interval: [%s, %s] (in seconds) to semantic segments data for account: %s", account2.name, Long.valueOf(d), Long.valueOf(d2));
                        }
                        fecj fecjVar2 = (fecj) o.iB(5, null);
                        fecjVar2.X(o);
                        eyob eyobVar = (eyob) fecjVar2;
                        if (!eyobVar.b.L()) {
                            eyobVar.U();
                        }
                        eyoc eyocVar = (eyoc) eyobVar.b;
                        eyocVar.c = 5;
                        eyocVar.b |= 1;
                        eyoc eyocVar2 = (eyoc) eyobVar.Q();
                        fhio fhioVar3 = czupVar.d;
                        if (fhioVar3 == null) {
                            fhioVar3 = fhio.a;
                        }
                        fefi fefiVar3 = fhioVar3.c;
                        if (fefiVar3 == null) {
                            fefiVar3 = fefi.a;
                        }
                        long b6 = fegx.b(fefiVar3);
                        fhio fhioVar4 = czupVar.d;
                        if (fhioVar4 == null) {
                            fhioVar4 = fhio.a;
                        }
                        fefi fefiVar4 = fhioVar4.d;
                        if (fefiVar4 == null) {
                            fefiVar4 = fefi.a;
                        }
                        long b7 = fegx.b(fefiVar4);
                        int a3 = odlhTombstonesCleanupJob.g().a(b6, b7);
                        if (a3 == -1) {
                            ((ejhf) ((ejhf) OdlhTombstonesCleanupJob.a.j()).ah(10756)).J("Failed to apply tombstone interval: [%s, %s] (in millis) to raw signals storage", b6, b7);
                            a3 = -1;
                        }
                        if (frwe.c()) {
                            if (!fecjVar.b.L()) {
                                fecjVar.U();
                            }
                            eylv eylvVar5 = (eylv) fecjVar.b;
                            eyocVar2.getClass();
                            fedh fedhVar = eylvVar5.o;
                            if (!fedhVar.c()) {
                                eylvVar5.o = fecp.E(fedhVar);
                            }
                            eylvVar5.o.add(eyocVar2);
                        } else {
                            int i2 = eyocVar2.d;
                            if (!fecjVar.b.L()) {
                                fecjVar.U();
                            }
                            eylv eylvVar6 = (eylv) fecjVar.b;
                            fecy fecyVar = eylvVar6.f;
                            if (!fecyVar.c()) {
                                eylvVar6.f = fecp.C(fecyVar);
                            }
                            eylvVar6.f.i(i2);
                        }
                        if (!fecjVar.b.L()) {
                            fecjVar.U();
                        }
                        eylv eylvVar7 = (eylv) fecjVar.b;
                        fecy fecyVar2 = eylvVar7.g;
                        if (!fecyVar2.c()) {
                            eylvVar7.g = fecp.C(fecyVar2);
                        }
                        eylvVar7.g.i(a3);
                        if (eyocVar2.d == -1 || a3 == -1) {
                            arrayList2.remove(czupVar);
                        }
                        i++;
                        z3 = z4;
                    }
                    boolean z5 = z3;
                    if (OdlhTombstonesCleanupJob.n(eitjVar, (int) frya.d())) {
                        fecj v2 = eylu.a.v();
                        if (!v2.b.L()) {
                            v2.U();
                        }
                        eylu eyluVar6 = (eylu) v2.b;
                        eyluVar6.b |= 1;
                        eyluVar6.c = z5;
                        try {
                            if (odlhTombstonesCleanupJob.d == null) {
                                odlhTombstonesCleanupJob.d = daow.b();
                            }
                            int a4 = odlhTombstonesCleanupJob.d.a(account2);
                            if (!v2.b.L()) {
                                v2.U();
                            }
                            fecp fecpVar = v2.b;
                            eylu eyluVar7 = (eylu) fecpVar;
                            eyluVar7.b |= 2;
                            eyluVar7.d = true;
                            if (!fecpVar.L()) {
                                v2.U();
                            }
                            eylu eyluVar8 = (eylu) v2.b;
                            eyluVar8.b |= 4;
                            eyluVar8.e = a4;
                            eyluVar = (eylu) v2.Q();
                        } catch (LevelDbException e) {
                            ((ejhf) ((ejhf) ((ejhf) OdlhTombstonesCleanupJob.a.j()).s(e)).ah((char) 10754)).B("Clearing Deidentified upload cache failed with error: %s", OdlhTombstonesCleanupJob.k(e));
                            if (!v2.b.L()) {
                                v2.U();
                            }
                            fecp fecpVar2 = v2.b;
                            eylu eyluVar9 = (eylu) fecpVar2;
                            eyluVar9.b |= 2;
                            eyluVar9.d = false;
                            if (!fecpVar2.L()) {
                                v2.U();
                            }
                            eylu eyluVar10 = (eylu) v2.b;
                            eyluVar10.b |= 4;
                            eyluVar10.e = -1;
                            eyluVar = (eylu) v2.Q();
                        }
                    } else {
                        fecj v3 = eylu.a.v();
                        if (!v3.b.L()) {
                            v3.U();
                        }
                        eylu eyluVar11 = (eylu) v3.b;
                        eyluVar11.b |= 1;
                        eyluVar11.c = false;
                        eyluVar = (eylu) v3.Q();
                    }
                    eylu eyluVar12 = eyluVar;
                    int i3 = 85;
                    if (frxq.h()) {
                        czuo czuoVar = odlhTombstonesCleanupJob.e().d(account2).q;
                        if (czuoVar == null) {
                            czuoVar = czuo.a;
                        }
                        z = czuoVar.e;
                    } else {
                        try {
                            z = odlhTombstonesCleanupJob.e().c(account2).e;
                        } catch (IOException e2) {
                            ((ejhf) ((ejhf) ((ejhf) OdlhTombstonesCleanupJob.a.j()).s(e2)).ah((char) 10761)).x("Failed to read migration info.");
                        }
                    }
                    if (z) {
                        try {
                            i3 = Math.min(85, odlhTombstonesCleanupJob.e().b(account2));
                        } catch (IllegalStateException e3) {
                            ((ejhf) ((ejhf) ((ejhf) OdlhTombstonesCleanupJob.a.j()).s(e3)).ah((char) 10759)).B("Failed to read user retention window with error: %s", new erdd(erdc.NO_USER_DATA, e3.getMessage()));
                        }
                    }
                    if (OdlhTombstonesCleanupJob.n(eitjVar, i3)) {
                        fecj v4 = eylu.a.v();
                        if (!v4.b.L()) {
                            v4.U();
                        }
                        eylu eyluVar13 = (eylu) v4.b;
                        eyluVar13.b |= 1;
                        eyluVar13.c = true;
                        dxkm dxkmVar = odlhTombstonesCleanupJob.h().b;
                        synchronized (dxkmVar) {
                            String str2 = account2.name;
                            b5 = dxkmVar.b(new eiho() { // from class: dagq
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // defpackage.eiho
                                public final Object apply(Object obj2) {
                                    dbas dbasVar = (dbas) obj2;
                                    asot asotVar = dahq.a;
                                    Account account3 = account2;
                                    if (!dbasVar.d(account3.name)) {
                                        return dbasVar;
                                    }
                                    String str3 = account3.name;
                                    str3.getClass();
                                    feea feeaVar = dbasVar.c;
                                    if (!feeaVar.containsKey(str3)) {
                                        throw new IllegalArgumentException();
                                    }
                                    dbba dbbaVar = (dbba) feeaVar.get(str3);
                                    fecj fecjVar3 = (fecj) dbasVar.iB(5, null);
                                    fecjVar3.X(dbasVar);
                                    dbao dbaoVar = (dbao) fecjVar3;
                                    String str4 = account3.name;
                                    fecj fecjVar4 = (fecj) dbbaVar.iB(5, null);
                                    fecjVar4.X(dbbaVar);
                                    dbat dbatVar = (dbat) fecjVar4;
                                    if (!dbatVar.b.L()) {
                                        dbatVar.U();
                                    }
                                    dbba dbbaVar2 = (dbba) dbatVar.b;
                                    dbba dbbaVar3 = dbba.a;
                                    dbbaVar2.b().clear();
                                    dbaoVar.a(str4, (dbba) dbatVar.Q());
                                    return (dbas) dbaoVar.Q();
                                }
                            }, enre.a);
                        }
                        boolean l = OdlhTombstonesCleanupJob.l(b5, "HistoricalBusyness");
                        if (!v4.b.L()) {
                            v4.U();
                        }
                        eylu eyluVar14 = (eylu) v4.b;
                        eyluVar14.b |= 2;
                        eyluVar14.d = l;
                        eyluVar2 = (eylu) v4.Q();
                    } else {
                        fecj v5 = eylu.a.v();
                        if (!v5.b.L()) {
                            v5.U();
                        }
                        eylu eyluVar15 = (eylu) v5.b;
                        eyluVar15.b |= 1;
                        eyluVar15.c = false;
                        eyluVar2 = (eylu) v5.Q();
                    }
                    if (OdlhTombstonesCleanupJob.n(eitjVar, 7L)) {
                        fecj v6 = eylu.a.v();
                        if (!v6.b.L()) {
                            v6.U();
                        }
                        eylu eyluVar16 = (eylu) v6.b;
                        eyluVar16.b |= 1;
                        eyluVar16.c = true;
                        dxkm dxkmVar2 = odlhTombstonesCleanupJob.h().b;
                        synchronized (dxkmVar2) {
                            String str3 = account2.name;
                            b4 = dxkmVar2.b(new eiho() { // from class: dagf
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // defpackage.eiho
                                public final Object apply(Object obj2) {
                                    dbas dbasVar = (dbas) obj2;
                                    asot asotVar = dahq.a;
                                    Account account3 = account2;
                                    String str4 = account3.name;
                                    str4.getClass();
                                    if (!dbasVar.d.containsKey(str4)) {
                                        return dbasVar;
                                    }
                                    String str5 = account3.name;
                                    str5.getClass();
                                    feea feeaVar = dbasVar.d;
                                    if (!feeaVar.containsKey(str5)) {
                                        throw new IllegalArgumentException();
                                    }
                                    dbbq dbbqVar = (dbbq) feeaVar.get(str5);
                                    fecj fecjVar3 = (fecj) dbasVar.iB(5, null);
                                    fecjVar3.X(dbasVar);
                                    dbao dbaoVar = (dbao) fecjVar3;
                                    String str6 = account3.name;
                                    fecj fecjVar4 = (fecj) dbbqVar.iB(5, null);
                                    fecjVar4.X(dbbqVar);
                                    if (!fecjVar4.b.L()) {
                                        fecjVar4.U();
                                    }
                                    dbbq dbbqVar2 = (dbbq) fecjVar4.b;
                                    dbbq dbbqVar3 = dbbq.a;
                                    dbbqVar2.b = feeq.a;
                                    dbbq dbbqVar4 = (dbbq) fecjVar4.Q();
                                    str6.getClass();
                                    dbbqVar4.getClass();
                                    if (!dbaoVar.b.L()) {
                                        dbaoVar.U();
                                    }
                                    ((dbas) dbaoVar.b).c().put(str6, dbbqVar4);
                                    return (dbas) dbaoVar.Q();
                                }
                            }, enre.a);
                        }
                        boolean l2 = OdlhTombstonesCleanupJob.l(b4, "WifiPlaceVisits");
                        if (!v6.b.L()) {
                            v6.U();
                        }
                        eylu eyluVar17 = (eylu) v6.b;
                        eyluVar17.b |= 2;
                        eyluVar17.d = l2;
                        eyluVar3 = (eylu) v6.Q();
                    } else {
                        fecj v7 = eylu.a.v();
                        if (!v7.b.L()) {
                            v7.U();
                        }
                        eylu eyluVar18 = (eylu) v7.b;
                        eyluVar18.b |= 1;
                        eyluVar18.c = false;
                        eyluVar3 = (eylu) v7.Q();
                    }
                    if (OdlhTombstonesCleanupJob.n(eitjVar, 1L)) {
                        fecj v8 = eylu.a.v();
                        if (!v8.b.L()) {
                            v8.U();
                        }
                        eylu eyluVar19 = (eylu) v8.b;
                        eyluVar19.b |= 1;
                        eyluVar19.c = true;
                        dxkm dxkmVar3 = odlhTombstonesCleanupJob.h().b;
                        synchronized (dxkmVar3) {
                            b3 = dxkmVar3.b(new eiho() { // from class: dago
                                @Override // defpackage.eiho
                                public final Object apply(Object obj2) {
                                    dbas dbasVar = (dbas) obj2;
                                    asot asotVar = dahq.a;
                                    if ((dbasVar.b & 1) == 0) {
                                        return dbasVar;
                                    }
                                    dbbe dbbeVar = dbasVar.e;
                                    if (dbbeVar == null) {
                                        dbbeVar = dbbe.a;
                                    }
                                    fecj fecjVar3 = (fecj) dbasVar.iB(5, null);
                                    fecjVar3.X(dbasVar);
                                    dbao dbaoVar = (dbao) fecjVar3;
                                    fecj fecjVar4 = (fecj) dbbeVar.iB(5, null);
                                    fecjVar4.X(dbbeVar);
                                    dbbb dbbbVar = (dbbb) fecjVar4;
                                    if (!dbbbVar.b.L()) {
                                        dbbbVar.U();
                                    }
                                    ((dbbe) dbbbVar.b).b().clear();
                                    dbbe dbbeVar2 = (dbbe) dbbbVar.Q();
                                    if (!dbaoVar.b.L()) {
                                        dbaoVar.U();
                                    }
                                    dbas dbasVar2 = (dbas) dbaoVar.b;
                                    dbbeVar2.getClass();
                                    dbasVar2.e = dbbeVar2;
                                    dbasVar2.b |= 1;
                                    return (dbas) dbaoVar.Q();
                                }
                            }, enre.a);
                        }
                        boolean l3 = OdlhTombstonesCleanupJob.l(b3, "LiveBusyness");
                        if (!v8.b.L()) {
                            v8.U();
                        }
                        eylu eyluVar20 = (eylu) v8.b;
                        eyluVar20.b |= 2;
                        eyluVar20.d = l3;
                        eyluVar4 = (eylu) v8.Q();
                    } else {
                        fecj v9 = eylu.a.v();
                        if (!v9.b.L()) {
                            v9.U();
                        }
                        eylu eyluVar21 = (eylu) v9.b;
                        eyluVar21.b |= 1;
                        eyluVar21.c = false;
                        eyluVar4 = (eylu) v9.Q();
                    }
                    if (OdlhTombstonesCleanupJob.n(eitjVar, 1L)) {
                        fecj v10 = eylu.a.v();
                        if (!v10.b.L()) {
                            v10.U();
                        }
                        eylu eyluVar22 = (eylu) v10.b;
                        eyluVar22.b |= 1;
                        eyluVar22.c = true;
                        dxkm dxkmVar4 = odlhTombstonesCleanupJob.h().b;
                        synchronized (dxkmVar4) {
                            b2 = dxkmVar4.b(new eiho() { // from class: dagg
                                @Override // defpackage.eiho
                                public final Object apply(Object obj2) {
                                    dbas dbasVar = (dbas) obj2;
                                    asot asotVar = dahq.a;
                                    dbbk dbbkVar = dbasVar.f;
                                    if (dbbkVar == null) {
                                        dbbkVar = dbbk.a;
                                    }
                                    fecj fecjVar3 = (fecj) dbbkVar.iB(5, null);
                                    fecjVar3.X(dbbkVar);
                                    if (!fecjVar3.b.L()) {
                                        fecjVar3.U();
                                    }
                                    ((dbbk) fecjVar3.b).d = feeq.a;
                                    dbbk dbbkVar2 = (dbbk) fecjVar3.Q();
                                    fecj fecjVar4 = (fecj) dbasVar.iB(5, null);
                                    fecjVar4.X(dbasVar);
                                    dbao dbaoVar = (dbao) fecjVar4;
                                    if (!dbaoVar.b.L()) {
                                        dbaoVar.U();
                                    }
                                    dbas dbasVar2 = (dbas) dbaoVar.b;
                                    dbbkVar2.getClass();
                                    dbasVar2.f = dbbkVar2;
                                    dbasVar2.b |= 2;
                                    return (dbas) dbaoVar.Q();
                                }
                            }, enre.a);
                        }
                        boolean l4 = OdlhTombstonesCleanupJob.l(b2, "RealTimeActivityUploads");
                        if (!v10.b.L()) {
                            v10.U();
                        }
                        eylu eyluVar23 = (eylu) v10.b;
                        eyluVar23.b |= 2;
                        eyluVar23.d = l4;
                        eyluVar5 = (eylu) v10.Q();
                        z2 = false;
                    } else {
                        fecj v11 = eylu.a.v();
                        if (!v11.b.L()) {
                            v11.U();
                        }
                        eylu eyluVar24 = (eylu) v11.b;
                        eyluVar24.b |= 1;
                        z2 = false;
                        eyluVar24.c = false;
                        eyluVar5 = (eylu) v11.Q();
                    }
                    eylu j = odlhTombstonesCleanupJob.j(context, account2, eitjVar);
                    if (!fecjVar.b.L()) {
                        fecjVar.U();
                    }
                    fecp fecpVar3 = fecjVar.b;
                    eylv eylvVar8 = (eylv) fecpVar3;
                    eyluVar12.getClass();
                    eylvVar8.m = eyluVar12;
                    eylvVar8.b |= 256;
                    if (!fecpVar3.L()) {
                        fecjVar.U();
                    }
                    fecp fecpVar4 = fecjVar.b;
                    eylv eylvVar9 = (eylv) fecpVar4;
                    eyluVar2.getClass();
                    eylvVar9.h = eyluVar2;
                    eylvVar9.b |= 8;
                    if (!fecpVar4.L()) {
                        fecjVar.U();
                    }
                    fecp fecpVar5 = fecjVar.b;
                    eylv eylvVar10 = (eylv) fecpVar5;
                    eyluVar3.getClass();
                    eylvVar10.j = eyluVar3;
                    eylvVar10.b |= 32;
                    if (!fecpVar5.L()) {
                        fecjVar.U();
                    }
                    fecp fecpVar6 = fecjVar.b;
                    eylv eylvVar11 = (eylv) fecpVar6;
                    eyluVar4.getClass();
                    eylvVar11.i = eyluVar4;
                    eylvVar11.b |= 16;
                    if (!fecpVar6.L()) {
                        fecjVar.U();
                    }
                    fecp fecpVar7 = fecjVar.b;
                    eylv eylvVar12 = (eylv) fecpVar7;
                    eyluVar5.getClass();
                    eylvVar12.k = eyluVar5;
                    eylvVar12.b |= 64;
                    if (!fecpVar7.L()) {
                        fecjVar.U();
                    }
                    eylv eylvVar13 = (eylv) fecjVar.b;
                    j.getClass();
                    eylvVar13.n = j;
                    eylvVar13.b |= 512;
                    if ((eyluVar12.c && !eyluVar12.d) || ((eyluVar2.c && !eyluVar2.d) || ((eyluVar4.c && !eyluVar4.d) || ((eyluVar5.c && !eyluVar5.d) || ((eyluVar3.c && !eyluVar3.d) || (j.c && !j.d)))))) {
                        arrayList2.removeAll(eitjVar);
                    }
                    arrayList2.size();
                    String str4 = account2.name;
                    int size3 = eitjVar.size() - arrayList2.size();
                    if (!fecjVar.b.L()) {
                        fecjVar.U();
                    }
                    eylv eylvVar14 = (eylv) fecjVar.b;
                    eylvVar14.b |= 4;
                    eylvVar14.e = size3;
                    boolean z6 = arrayList2.size() == eitjVar.size() ? true : z2;
                    if (!fecjVar.b.L()) {
                        fecjVar.U();
                    }
                    eylv eylvVar15 = (eylv) fecjVar.b;
                    eylvVar15.b |= 1;
                    eylvVar15.c = z6;
                    return eitj.i(arrayList2);
                }
            }, entiVar), new enqc() { // from class: dbik
                @Override // defpackage.enqc
                public final enss a(Object obj) {
                    final eitj g;
                    enss b2;
                    eitj eitjVar = (eitj) obj;
                    int i = eitj.d;
                    eitj eitjVar2 = ejcb.a;
                    final Account account2 = account;
                    OdlhTombstonesCleanupJob odlhTombstonesCleanupJob = OdlhTombstonesCleanupJob.this;
                    int i2 = 0;
                    if (frxq.f()) {
                        eite eiteVar = new eite();
                        int size = eitjVar.size();
                        while (i2 < size) {
                            czup czupVar = (czup) eitjVar.get(i2);
                            if (czupVar.c < System.currentTimeMillis() - TimeUnit.DAYS.toMillis(frxn.j())) {
                                eiteVar.i(czupVar);
                                odlhTombstonesCleanupJob.d().e("TombstoneCleanupExpiredTombstoneCount");
                            }
                            i2++;
                        }
                        g = eiteVar.g();
                    } else {
                        eite eiteVar2 = new eite();
                        int size2 = eitjVar.size();
                        while (i2 < size2) {
                            czup czupVar2 = (czup) eitjVar.get(i2);
                            if (czupVar2.c < System.currentTimeMillis() - TimeUnit.DAYS.toMillis(5L)) {
                                eiteVar2.i(czupVar2);
                            }
                            i2++;
                        }
                        g = eiteVar2.g();
                        int i3 = ((ejcb) g).c;
                        String str2 = account2.name;
                    }
                    if (g.isEmpty()) {
                        return ensm.a;
                    }
                    dxkm dxkmVar = odlhTombstonesCleanupJob.e().f;
                    synchronized (dxkmVar) {
                        b2 = dxkmVar.b(new eiho() { // from class: czld
                            @Override // defpackage.eiho
                            public final Object apply(Object obj2) {
                                czuw czuwVar = (czuw) obj2;
                                asot asotVar = czlk.a;
                                Map unmodifiableMap = DesugarCollections.unmodifiableMap(czuwVar.c);
                                Account account3 = account2;
                                if (!unmodifiableMap.containsKey(account3.name)) {
                                    ((ejhf) czlk.a.j()).x("Unable to find location history settings for account");
                                    return czuwVar;
                                }
                                eitj eitjVar3 = g;
                                czuq czuqVar = (czuq) unmodifiableMap.get(account3.name);
                                ArrayList arrayList2 = new ArrayList(czuqVar.j);
                                arrayList2.removeAll(eitjVar3);
                                fecj fecjVar = (fecj) czuwVar.iB(5, null);
                                fecjVar.X(czuwVar);
                                czuj czujVar = (czuj) fecjVar;
                                String str3 = account3.name;
                                fecj fecjVar2 = (fecj) czuqVar.iB(5, null);
                                fecjVar2.X(czuqVar);
                                czun czunVar = (czun) fecjVar2;
                                if (!czunVar.b.L()) {
                                    czunVar.U();
                                }
                                ((czuq) czunVar.b).j = feeq.a;
                                czunVar.a(arrayList2);
                                czujVar.a(str3, (czuq) czunVar.Q());
                                return (czuw) czujVar.Q();
                            }
                        }, enre.a);
                    }
                    return b2;
                }
            }, entiVar), new eiho() { // from class: dbil
                @Override // defpackage.eiho
                public final Object apply(Object obj) {
                    asot asotVar = OdlhTombstonesCleanupJob.a;
                    return (eylv) fecj.this.Q();
                }
            }, entiVar), Exception.class, new eiho() { // from class: dbim
                @Override // defpackage.eiho
                public final Object apply(Object obj) {
                    Exception exc = (Exception) obj;
                    ((ejhf) ((ejhf) ((ejhf) OdlhTombstonesCleanupJob.a.j()).s(exc)).ah((char) 10764)).B("Tombstone cleanup failed for account with error: %s", OdlhTombstonesCleanupJob.k(exc));
                    fecj fecjVar = fecj.this;
                    if (!fecjVar.b.L()) {
                        fecjVar.U();
                    }
                    eylv eylvVar = (eylv) fecjVar.b;
                    eylv eylvVar2 = eylv.a;
                    eylvVar.b |= 1;
                    eylvVar.c = false;
                    return (eylv) fecjVar.Q();
                }
            }, entiVar));
        }
        return enps.g(ensi.h(ensj.e(arrayList)), new enqc() { // from class: dbib
            @Override // defpackage.enqc
            public final enss a(Object obj) {
                OdlhTombstonesCleanupJob odlhTombstonesCleanupJob = OdlhTombstonesCleanupJob.this;
                List list = (List) obj;
                if (odlhTombstonesCleanupJob.c == null) {
                    odlhTombstonesCleanupJob.c = czjg.a();
                }
                czjg czjgVar = odlhTombstonesCleanupJob.c;
                fecj v2 = eyoe.a.v();
                if (!v2.b.L()) {
                    v2.U();
                }
                eyoe eyoeVar = (eyoe) v2.b;
                fedh fedhVar = eyoeVar.b;
                if (!fedhVar.c()) {
                    eyoeVar.b = fecp.E(fedhVar);
                }
                feab.E(list, eyoeVar.b);
                eyoe eyoeVar2 = (eyoe) v2.Q();
                fecj v3 = eyod.a.v();
                if (!v3.b.L()) {
                    v3.U();
                }
                eyod eyodVar = (eyod) v3.b;
                eyoeVar2.getClass();
                eyodVar.c = eyoeVar2;
                eyodVar.b = 11;
                czjgVar.j(v3);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!((eylv) it.next()).c) {
                        ((ejhf) ((ejhf) OdlhTombstonesCleanupJob.a.j()).ah((char) 10763)).x("Tombstone cleanup failed for account");
                        return frwe.d() ? enps.f(odlhTombstonesCleanupJob.h().g("OdlhTombstonesCleanupJob", fegx.h(System.currentTimeMillis())), new eiho() { // from class: dbif
                            @Override // defpackage.eiho
                            public final Object apply(Object obj2) {
                                asot asotVar = OdlhTombstonesCleanupJob.a;
                                return 2;
                            }
                        }, enre.a) : ensj.i(2);
                    }
                }
                return frwe.d() ? enps.f(odlhTombstonesCleanupJob.h().e("OdlhTombstonesCleanupJob", false), new eiho() { // from class: dbig
                    @Override // defpackage.eiho
                    public final Object apply(Object obj2) {
                        asot asotVar = OdlhTombstonesCleanupJob.a;
                        return 0;
                    }
                }, enre.a) : ensj.i(0);
            }
        }, enre.a);
    }

    public final eylu j(Context context, Account account, eitj eitjVar) {
        if (!frve.d()) {
            return eylu.a;
        }
        String str = account.name;
        eitjVar.size();
        d().k("DeidentifiedGoldenData", 24);
        if (eitjVar.isEmpty()) {
            d().k("DeidentifiedGoldenData", 25);
            fecj v = eylu.a.v();
            if (!v.b.L()) {
                v.U();
            }
            fecp fecpVar = v.b;
            eylu eyluVar = (eylu) fecpVar;
            eyluVar.b |= 1;
            eyluVar.c = true;
            if (!fecpVar.L()) {
                v.U();
            }
            eylu eyluVar2 = (eylu) v.b;
            eyluVar2.b |= 2;
            eyluVar2.d = true;
            return (eylu) v.Q();
        }
        eitj eitjVar2 = (eitj) Collection.EL.stream(eitjVar).filter(new Predicate() { // from class: dbic
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
            public final boolean test(Object obj) {
                czup czupVar = (czup) obj;
                asot asotVar = OdlhTombstonesCleanupJob.a;
                fhio fhioVar = czupVar.d;
                if (fhioVar == null) {
                    fhioVar = fhio.a;
                }
                fefi fefiVar = fhioVar.c;
                if (fefiVar == null) {
                    fefiVar = fefi.a;
                }
                fhio fhioVar2 = czupVar.d;
                if (fhioVar2 == null) {
                    fhioVar2 = fhio.a;
                }
                fefi fefiVar2 = fhioVar2.d;
                if (fefiVar2 == null) {
                    fefiVar2 = fefi.a;
                }
                fefi fefiVar3 = fegx.a;
                return fegw.a(fefiVar, fefiVar2) <= 0;
            }
        }).map(new Function() { // from class: dbid
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo464andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                czup czupVar = (czup) obj;
                asot asotVar = OdlhTombstonesCleanupJob.a;
                fhio fhioVar = czupVar.d;
                if (fhioVar == null) {
                    fhioVar = fhio.a;
                }
                fefi fefiVar = fhioVar.c;
                if (fefiVar == null) {
                    fefiVar = fefi.a;
                }
                Instant d = fegu.d(fefiVar);
                fhio fhioVar2 = czupVar.d;
                if (fhioVar2 == null) {
                    fhioVar2 = fhio.a;
                }
                fefi fefiVar2 = fhioVar2.d;
                if (fefiVar2 == null) {
                    fefiVar2 = fefi.a;
                }
                return ejbr.g(d, fegu.d(fefiVar2));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(eipl.a);
        if (this.m == null) {
            czlk e = e();
            if (this.l == null) {
                this.l = new dbhz();
            }
            this.m = dajf.a(e, this.l, f(context), g(), new daky(), d());
        }
        try {
            ((enpf) this.m.c(account, eitjVar2, enre.a)).v(frve.a.a().a(), TimeUnit.MILLISECONDS);
            d().k("DeidentifiedGoldenData", 25);
            d().l("DeidentifiedGoldenData", 26, eitjVar.size());
            fecj v2 = eylu.a.v();
            if (!v2.b.L()) {
                v2.U();
            }
            fecp fecpVar2 = v2.b;
            eylu eyluVar3 = (eylu) fecpVar2;
            eyluVar3.b |= 1;
            eyluVar3.c = true;
            if (!fecpVar2.L()) {
                v2.U();
            }
            eylu eyluVar4 = (eylu) v2.b;
            eyluVar4.b |= 2;
            eyluVar4.d = true;
            return (eylu) v2.Q();
        } catch (InterruptedException unused) {
            d().k("DeidentifiedGoldenData", 28);
            fecj v3 = eylu.a.v();
            if (!v3.b.L()) {
                v3.U();
            }
            fecp fecpVar3 = v3.b;
            eylu eyluVar5 = (eylu) fecpVar3;
            eyluVar5.b |= 1;
            eyluVar5.c = true;
            if (!fecpVar3.L()) {
                v3.U();
            }
            eylu eyluVar6 = (eylu) v3.b;
            eyluVar6.b |= 2;
            eyluVar6.d = false;
            return (eylu) v3.Q();
        } catch (ExecutionException unused2) {
            d().k("DeidentifiedGoldenData", 29);
            fecj v4 = eylu.a.v();
            if (!v4.b.L()) {
                v4.U();
            }
            fecp fecpVar4 = v4.b;
            eylu eyluVar7 = (eylu) fecpVar4;
            eyluVar7.b |= 1;
            eyluVar7.c = true;
            if (!fecpVar4.L()) {
                v4.U();
            }
            eylu eyluVar8 = (eylu) v4.b;
            eyluVar8.b |= 2;
            eyluVar8.d = false;
            return (eylu) v4.Q();
        } catch (TimeoutException unused3) {
            d().k("DeidentifiedGoldenData", 27);
            fecj v5 = eylu.a.v();
            if (!v5.b.L()) {
                v5.U();
            }
            fecp fecpVar5 = v5.b;
            eylu eyluVar9 = (eylu) fecpVar5;
            eyluVar9.b |= 1;
            eyluVar9.c = true;
            if (!fecpVar5.L()) {
                v5.U();
            }
            eylu eyluVar10 = (eylu) v5.b;
            eyluVar10.b |= 2;
            eyluVar10.d = false;
            return (eylu) v5.Q();
        }
    }
}
