package com.google.android.gms.semanticlocationhistory.settings;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.chimera.modules.semanticlocationhistory.AppContextProvider;
import com.google.android.gms.leveldb.LevelDbException;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.android.gms.semanticlocationhistory.settings.OdlhTombstonesCleanupJob;
import defpackage.auid;
import defpackage.ausn;
import defpackage.cauf;
import defpackage.dbsv;
import defpackage.dbtc;
import defpackage.dbte;
import defpackage.dbvg;
import defpackage.dceq;
import defpackage.dcnm;
import defpackage.dcnp;
import defpackage.dcqi;
import defpackage.dcry;
import defpackage.dctn;
import defpackage.dcvg;
import defpackage.dcze;
import defpackage.ddoj;
import defpackage.ddsf;
import defpackage.ekut;
import defpackage.elcq;
import defpackage.elgo;
import defpackage.eluo;
import defpackage.eqcq;
import defpackage.eqcy;
import defpackage.eqdl;
import defpackage.eqdv;
import defpackage.eqex;
import defpackage.eqgb;
import defpackage.eqgc;
import defpackage.eqgl;
import defpackage.eqhb;
import defpackage.etry;
import defpackage.etrz;
import defpackage.fbag;
import defpackage.fbah;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fgub;
import defpackage.fgvq;
import defpackage.fjyl;
import defpackage.fupy;
import defpackage.fusk;
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

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class OdlhTombstonesCleanupJob extends GmsTaskBoundService {
    public static final ausn a = ausn.c("LocationHistory", auid.SEMANTIC_LOCATION_HISTORY, "OdlhTombstonesCleanupJob");
    public static final String b = OdlhTombstonesCleanupJob.class.getName();
    public dbte c;
    public dcze d;
    public ddoj e;
    private dbtc f;
    private dbvg g;
    private dcnm h;
    private dcqi j;
    private dcry k;
    private ddsf l;
    private dctn m;

    public static final etrz k(Exception exc) {
        return new etrz(etry.NO_USER_DATA, exc.getMessage());
    }

    public static final boolean l(eqgl eqglVar, String str) {
        try {
            ((eqcy) eqglVar).v(fusk.a.lK().s(), TimeUnit.MILLISECONDS);
            return true;
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            ((eluo) ((eluo) ((eluo) a.j()).s(e)).ai((char) 10763)).B("Failed to clear data for deidentified use case: %s", new etrz(etry.NO_USER_DATA, str));
            return false;
        }
    }

    public static final boolean m(dceq dceqVar, long j) {
        long currentTimeMillis = System.currentTimeMillis();
        fjyl fjylVar = dceqVar.d;
        if (fjylVar == null) {
            fjylVar = fjyl.a;
        }
        fgub fgubVar = fjylVar.d;
        if (fgubVar == null) {
            fgubVar = fgub.a;
        }
        return fgvq.b(fgubVar) > currentTimeMillis - TimeUnit.DAYS.toMillis(j);
    }

    public static final boolean n(elgo elgoVar, long j) {
        int size = elgoVar.size();
        int i = 0;
        while (i < size) {
            boolean m = m((dceq) elgoVar.get(i), j);
            i++;
            if (m) {
                return true;
            }
        }
        return false;
    }

    public final dbtc d() {
        if (this.f == null) {
            this.f = new dbtc();
        }
        return this.f;
    }

    public final dbvg e() {
        if (this.g == null) {
            this.g = new dbvg(d());
        }
        return this.g;
    }

    public final dcnm f(Context context) {
        if (this.h == null) {
            this.h = dcnp.w(context);
        }
        return this.h;
    }

    public final dcqi g() {
        if (this.j == null) {
            this.j = new dcqi();
        }
        return this.j;
    }

    public final dcry h() {
        if (this.k == null) {
            this.k = new dcry();
        }
        return this.k;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final eqgl iB(cauf caufVar) {
        String str = caufVar.a;
        if (!Objects.equals(str, "OdlhTombstonesCleanupJob")) {
            ((eluo) ((eluo) a.i()).ai((char) 10770)).B("Unexpected tag: %s.", str);
            return eqgc.i(2);
        }
        final Context a2 = AppContextProvider.a();
        ArrayList arrayList = new ArrayList();
        for (final Account account : dbsv.d(AppContextProvider.a())) {
            eqex eqexVar = eqex.a;
            eqhb eqhbVar = new eqhb(eqexVar);
            final fgrc v = fbah.a.v();
            arrayList.add(eqcq.f(eqdl.f(eqdl.g(eqdl.f(eqdl.g(eqgb.h(fusk.g() ? eqdl.f(e().j(account), new ekut() { // from class: ddsn
                @Override // defpackage.ekut
                public final Object apply(Object obj) {
                    ausn ausnVar = OdlhTombstonesCleanupJob.a;
                    return elgo.i(((dcer) obj).j);
                }
            }, eqexVar) : e().r(account)), new eqdv() { // from class: ddso
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.eqdv
                public final eqgl a(Object obj) {
                    final elgo elgoVar = (elgo) obj;
                    Account account2 = account;
                    OdlhTombstonesCleanupJob odlhTombstonesCleanupJob = OdlhTombstonesCleanupJob.this;
                    try {
                        int b2 = odlhTombstonesCleanupJob.e().b(account2);
                        elso it = elgoVar.iterator();
                        while (it.hasNext()) {
                            if (OdlhTombstonesCleanupJob.m((dceq) it.next(), b2)) {
                                if (odlhTombstonesCleanupJob.e == null) {
                                    odlhTombstonesCleanupJob.e = new ddor();
                                }
                                return eqdl.f(eqgb.h(odlhTombstonesCleanupJob.e.a(account2.name)), new ekut() { // from class: ddsk
                                    @Override // defpackage.ekut
                                    public final Object apply(Object obj2) {
                                        ausn ausnVar = OdlhTombstonesCleanupJob.a;
                                        return elgo.this;
                                    }
                                }, eqex.a);
                            }
                        }
                    } catch (IllegalStateException e) {
                        ((eluo) ((eluo) ((eluo) OdlhTombstonesCleanupJob.a.j()).s(e)).ai((char) 10768)).B("Failed to read user retention window with error: %s", OdlhTombstonesCleanupJob.k(e));
                    }
                    return eqgc.i(elgoVar);
                }
            }, eqhbVar), new ekut() { // from class: ddsp
                @Override // defpackage.ekut
                public final Object apply(Object obj) {
                    final Account account2;
                    Context context;
                    OdlhTombstonesCleanupJob odlhTombstonesCleanupJob;
                    fbag fbagVar;
                    boolean z;
                    fbag fbagVar2;
                    fbag fbagVar3;
                    fbag fbagVar4;
                    boolean z2;
                    fbag fbagVar5;
                    eqgl b2;
                    eqgl b3;
                    eqgl b4;
                    eqgl b5;
                    elgo elgoVar = (elgo) obj;
                    int size = elgoVar.size();
                    fgrc fgrcVar = v;
                    if (!fgrcVar.b.L()) {
                        fgrcVar.U();
                    }
                    fbah fbahVar = (fbah) fgrcVar.b;
                    fbah fbahVar2 = fbah.a;
                    fbahVar.b |= 2;
                    fbahVar.d = size;
                    boolean z3 = true;
                    if (elgoVar.isEmpty()) {
                        if (!fgrcVar.b.L()) {
                            fgrcVar.U();
                        }
                        fbah fbahVar3 = (fbah) fgrcVar.b;
                        fbahVar3.b |= 1;
                        fbahVar3.c = true;
                        return elpg.a;
                    }
                    if (!fgrcVar.b.L()) {
                        fgrcVar.U();
                    }
                    fbah fbahVar4 = (fbah) fgrcVar.b;
                    fbahVar4.b |= 128;
                    fbahVar4.l = false;
                    ArrayList arrayList2 = new ArrayList(elgoVar);
                    int size2 = elgoVar.size();
                    int i = 0;
                    while (true) {
                        account2 = account;
                        context = a2;
                        odlhTombstonesCleanupJob = OdlhTombstonesCleanupJob.this;
                        if (i >= size2) {
                            break;
                        }
                        dceq dceqVar = (dceq) elgoVar.get(i);
                        fjyl fjylVar = dceqVar.d;
                        if (fjylVar == null) {
                            fjylVar = fjyl.a;
                        }
                        fgub fgubVar = fjylVar.c;
                        if (fgubVar == null) {
                            fgubVar = fgub.a;
                        }
                        long d = fgvq.d(fgubVar);
                        fjyl fjylVar2 = dceqVar.d;
                        if (fjylVar2 == null) {
                            fjylVar2 = fjyl.a;
                        }
                        fgub fgubVar2 = fjylVar2.d;
                        if (fgubVar2 == null) {
                            fgubVar2 = fgub.a;
                        }
                        long d2 = fgvq.d(fgubVar2);
                        fbcq o = odlhTombstonesCleanupJob.f(context).o(account2, d, d2);
                        boolean z4 = z3;
                        if (o.d == -1) {
                            ((eluo) ((eluo) OdlhTombstonesCleanupJob.a.j()).ai(10761)).T("Failed to apply tombstone interval: [%s, %s] (in seconds) to semantic segments data for account: %s", account2.name, Long.valueOf(d), Long.valueOf(d2));
                        }
                        fgrc fgrcVar2 = (fgrc) o.iQ(5, null);
                        fgrcVar2.X(o);
                        fbcp fbcpVar = (fbcp) fgrcVar2;
                        if (!fbcpVar.b.L()) {
                            fbcpVar.U();
                        }
                        fbcq fbcqVar = (fbcq) fbcpVar.b;
                        fbcqVar.c = 5;
                        fbcqVar.b |= 1;
                        fbcq fbcqVar2 = (fbcq) fbcpVar.Q();
                        fjyl fjylVar3 = dceqVar.d;
                        if (fjylVar3 == null) {
                            fjylVar3 = fjyl.a;
                        }
                        fgub fgubVar3 = fjylVar3.c;
                        if (fgubVar3 == null) {
                            fgubVar3 = fgub.a;
                        }
                        long b6 = fgvq.b(fgubVar3);
                        fjyl fjylVar4 = dceqVar.d;
                        if (fjylVar4 == null) {
                            fjylVar4 = fjyl.a;
                        }
                        fgub fgubVar4 = fjylVar4.d;
                        if (fgubVar4 == null) {
                            fgubVar4 = fgub.a;
                        }
                        long b7 = fgvq.b(fgubVar4);
                        int a3 = odlhTombstonesCleanupJob.g().a(b6, b7);
                        if (a3 == -1) {
                            ((eluo) ((eluo) OdlhTombstonesCleanupJob.a.j()).ai(10759)).J("Failed to apply tombstone interval: [%s, %s] (in millis) to raw signals storage", b6, b7);
                            a3 = -1;
                        }
                        if (fuqy.c()) {
                            if (!fgrcVar.b.L()) {
                                fgrcVar.U();
                            }
                            fbah fbahVar5 = (fbah) fgrcVar.b;
                            fbcqVar2.getClass();
                            fgsa fgsaVar = fbahVar5.o;
                            if (!fgsaVar.c()) {
                                fbahVar5.o = fgri.E(fgsaVar);
                            }
                            fbahVar5.o.add(fbcqVar2);
                        } else {
                            int i2 = fbcqVar2.d;
                            if (!fgrcVar.b.L()) {
                                fgrcVar.U();
                            }
                            fbah fbahVar6 = (fbah) fgrcVar.b;
                            fgrr fgrrVar = fbahVar6.f;
                            if (!fgrrVar.c()) {
                                fbahVar6.f = fgri.C(fgrrVar);
                            }
                            fbahVar6.f.i(i2);
                        }
                        if (!fgrcVar.b.L()) {
                            fgrcVar.U();
                        }
                        fbah fbahVar7 = (fbah) fgrcVar.b;
                        fgrr fgrrVar2 = fbahVar7.g;
                        if (!fgrrVar2.c()) {
                            fbahVar7.g = fgri.C(fgrrVar2);
                        }
                        fbahVar7.g.i(a3);
                        if (fbcqVar2.d == -1 || a3 == -1) {
                            arrayList2.remove(dceqVar);
                        }
                        i++;
                        z3 = z4;
                    }
                    boolean z5 = z3;
                    if (OdlhTombstonesCleanupJob.n(elgoVar, (int) fusu.d())) {
                        fgrc v2 = fbag.a.v();
                        if (!v2.b.L()) {
                            v2.U();
                        }
                        fbag fbagVar6 = (fbag) v2.b;
                        fbagVar6.b |= 1;
                        fbagVar6.c = z5;
                        try {
                            if (odlhTombstonesCleanupJob.d == null) {
                                odlhTombstonesCleanupJob.d = dcze.b();
                            }
                            int a4 = odlhTombstonesCleanupJob.d.a(account2);
                            if (!v2.b.L()) {
                                v2.U();
                            }
                            fgri fgriVar = v2.b;
                            fbag fbagVar7 = (fbag) fgriVar;
                            fbagVar7.b |= 2;
                            fbagVar7.d = true;
                            if (!fgriVar.L()) {
                                v2.U();
                            }
                            fbag fbagVar8 = (fbag) v2.b;
                            fbagVar8.b |= 4;
                            fbagVar8.e = a4;
                            fbagVar = (fbag) v2.Q();
                        } catch (LevelDbException e) {
                            ((eluo) ((eluo) ((eluo) OdlhTombstonesCleanupJob.a.j()).s(e)).ai((char) 10757)).B("Clearing Deidentified upload cache failed with error: %s", OdlhTombstonesCleanupJob.k(e));
                            if (!v2.b.L()) {
                                v2.U();
                            }
                            fgri fgriVar2 = v2.b;
                            fbag fbagVar9 = (fbag) fgriVar2;
                            fbagVar9.b |= 2;
                            fbagVar9.d = false;
                            if (!fgriVar2.L()) {
                                v2.U();
                            }
                            fbag fbagVar10 = (fbag) v2.b;
                            fbagVar10.b |= 4;
                            fbagVar10.e = -1;
                            fbagVar = (fbag) v2.Q();
                        }
                    } else {
                        fgrc v3 = fbag.a.v();
                        if (!v3.b.L()) {
                            v3.U();
                        }
                        fbag fbagVar11 = (fbag) v3.b;
                        fbagVar11.b |= 1;
                        fbagVar11.c = false;
                        fbagVar = (fbag) v3.Q();
                    }
                    fbag fbagVar12 = fbagVar;
                    int i3 = 85;
                    if (fusk.g()) {
                        dcep dcepVar = odlhTombstonesCleanupJob.e().d(account2).q;
                        if (dcepVar == null) {
                            dcepVar = dcep.a;
                        }
                        z = dcepVar.e;
                    } else {
                        try {
                            z = odlhTombstonesCleanupJob.e().c(account2).e;
                        } catch (IOException e2) {
                            ((eluo) ((eluo) ((eluo) OdlhTombstonesCleanupJob.a.j()).s(e2)).ai((char) 10764)).x("Failed to read migration info.");
                        }
                    }
                    if (z) {
                        try {
                            i3 = Math.min(85, odlhTombstonesCleanupJob.e().b(account2));
                        } catch (IllegalStateException e3) {
                            ((eluo) ((eluo) ((eluo) OdlhTombstonesCleanupJob.a.j()).s(e3)).ai((char) 10762)).B("Failed to read user retention window with error: %s", new etrz(etry.NO_USER_DATA, e3.getMessage()));
                        }
                    }
                    if (OdlhTombstonesCleanupJob.n(elgoVar, i3)) {
                        fgrc v4 = fbag.a.v();
                        if (!v4.b.L()) {
                            v4.U();
                        }
                        fbag fbagVar13 = (fbag) v4.b;
                        fbagVar13.b |= 1;
                        fbagVar13.c = true;
                        dzwm dzwmVar = odlhTombstonesCleanupJob.h().b;
                        synchronized (dzwmVar) {
                            String str2 = account2.name;
                            b5 = dzwmVar.b(new ekut() { // from class: dcqy
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // defpackage.ekut
                                public final Object apply(Object obj2) {
                                    ddla ddlaVar = (ddla) obj2;
                                    ausn ausnVar = dcry.a;
                                    Account account3 = account2;
                                    if (!ddlaVar.d(account3.name)) {
                                        return ddlaVar;
                                    }
                                    String str3 = account3.name;
                                    str3.getClass();
                                    fgst fgstVar = ddlaVar.c;
                                    if (!fgstVar.containsKey(str3)) {
                                        throw new IllegalArgumentException();
                                    }
                                    ddli ddliVar = (ddli) fgstVar.get(str3);
                                    fgrc fgrcVar3 = (fgrc) ddlaVar.iQ(5, null);
                                    fgrcVar3.X(ddlaVar);
                                    ddkw ddkwVar = (ddkw) fgrcVar3;
                                    String str4 = account3.name;
                                    fgrc fgrcVar4 = (fgrc) ddliVar.iQ(5, null);
                                    fgrcVar4.X(ddliVar);
                                    ddlb ddlbVar = (ddlb) fgrcVar4;
                                    if (!ddlbVar.b.L()) {
                                        ddlbVar.U();
                                    }
                                    ddli ddliVar2 = (ddli) ddlbVar.b;
                                    ddli ddliVar3 = ddli.a;
                                    ddliVar2.b().clear();
                                    ddkwVar.a(str4, (ddli) ddlbVar.Q());
                                    return (ddla) ddkwVar.Q();
                                }
                            }, eqex.a);
                        }
                        boolean l = OdlhTombstonesCleanupJob.l(b5, "HistoricalBusyness");
                        if (!v4.b.L()) {
                            v4.U();
                        }
                        fbag fbagVar14 = (fbag) v4.b;
                        fbagVar14.b |= 2;
                        fbagVar14.d = l;
                        fbagVar2 = (fbag) v4.Q();
                    } else {
                        fgrc v5 = fbag.a.v();
                        if (!v5.b.L()) {
                            v5.U();
                        }
                        fbag fbagVar15 = (fbag) v5.b;
                        fbagVar15.b |= 1;
                        fbagVar15.c = false;
                        fbagVar2 = (fbag) v5.Q();
                    }
                    if (OdlhTombstonesCleanupJob.n(elgoVar, 7L)) {
                        fgrc v6 = fbag.a.v();
                        if (!v6.b.L()) {
                            v6.U();
                        }
                        fbag fbagVar16 = (fbag) v6.b;
                        fbagVar16.b |= 1;
                        fbagVar16.c = true;
                        dzwm dzwmVar2 = odlhTombstonesCleanupJob.h().b;
                        synchronized (dzwmVar2) {
                            String str3 = account2.name;
                            b4 = dzwmVar2.b(new ekut() { // from class: dcqn
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // defpackage.ekut
                                public final Object apply(Object obj2) {
                                    ddla ddlaVar = (ddla) obj2;
                                    ausn ausnVar = dcry.a;
                                    Account account3 = account2;
                                    String str4 = account3.name;
                                    str4.getClass();
                                    if (!ddlaVar.d.containsKey(str4)) {
                                        return ddlaVar;
                                    }
                                    String str5 = account3.name;
                                    str5.getClass();
                                    fgst fgstVar = ddlaVar.d;
                                    if (!fgstVar.containsKey(str5)) {
                                        throw new IllegalArgumentException();
                                    }
                                    ddly ddlyVar = (ddly) fgstVar.get(str5);
                                    fgrc fgrcVar3 = (fgrc) ddlaVar.iQ(5, null);
                                    fgrcVar3.X(ddlaVar);
                                    ddkw ddkwVar = (ddkw) fgrcVar3;
                                    String str6 = account3.name;
                                    fgrc fgrcVar4 = (fgrc) ddlyVar.iQ(5, null);
                                    fgrcVar4.X(ddlyVar);
                                    if (!fgrcVar4.b.L()) {
                                        fgrcVar4.U();
                                    }
                                    ddly ddlyVar2 = (ddly) fgrcVar4.b;
                                    ddly ddlyVar3 = ddly.a;
                                    ddlyVar2.b = fgtj.a;
                                    ddly ddlyVar4 = (ddly) fgrcVar4.Q();
                                    str6.getClass();
                                    ddlyVar4.getClass();
                                    if (!ddkwVar.b.L()) {
                                        ddkwVar.U();
                                    }
                                    ((ddla) ddkwVar.b).c().put(str6, ddlyVar4);
                                    return (ddla) ddkwVar.Q();
                                }
                            }, eqex.a);
                        }
                        boolean l2 = OdlhTombstonesCleanupJob.l(b4, "WifiPlaceVisits");
                        if (!v6.b.L()) {
                            v6.U();
                        }
                        fbag fbagVar17 = (fbag) v6.b;
                        fbagVar17.b |= 2;
                        fbagVar17.d = l2;
                        fbagVar3 = (fbag) v6.Q();
                    } else {
                        fgrc v7 = fbag.a.v();
                        if (!v7.b.L()) {
                            v7.U();
                        }
                        fbag fbagVar18 = (fbag) v7.b;
                        fbagVar18.b |= 1;
                        fbagVar18.c = false;
                        fbagVar3 = (fbag) v7.Q();
                    }
                    if (OdlhTombstonesCleanupJob.n(elgoVar, 1L)) {
                        fgrc v8 = fbag.a.v();
                        if (!v8.b.L()) {
                            v8.U();
                        }
                        fbag fbagVar19 = (fbag) v8.b;
                        fbagVar19.b |= 1;
                        fbagVar19.c = true;
                        dzwm dzwmVar3 = odlhTombstonesCleanupJob.h().b;
                        synchronized (dzwmVar3) {
                            b3 = dzwmVar3.b(new ekut() { // from class: dcqw
                                @Override // defpackage.ekut
                                public final Object apply(Object obj2) {
                                    ddla ddlaVar = (ddla) obj2;
                                    ausn ausnVar = dcry.a;
                                    if ((ddlaVar.b & 1) == 0) {
                                        return ddlaVar;
                                    }
                                    ddlm ddlmVar = ddlaVar.e;
                                    if (ddlmVar == null) {
                                        ddlmVar = ddlm.a;
                                    }
                                    fgrc fgrcVar3 = (fgrc) ddlaVar.iQ(5, null);
                                    fgrcVar3.X(ddlaVar);
                                    ddkw ddkwVar = (ddkw) fgrcVar3;
                                    fgrc fgrcVar4 = (fgrc) ddlmVar.iQ(5, null);
                                    fgrcVar4.X(ddlmVar);
                                    ddlj ddljVar = (ddlj) fgrcVar4;
                                    if (!ddljVar.b.L()) {
                                        ddljVar.U();
                                    }
                                    ((ddlm) ddljVar.b).b().clear();
                                    ddlm ddlmVar2 = (ddlm) ddljVar.Q();
                                    if (!ddkwVar.b.L()) {
                                        ddkwVar.U();
                                    }
                                    ddla ddlaVar2 = (ddla) ddkwVar.b;
                                    ddlmVar2.getClass();
                                    ddlaVar2.e = ddlmVar2;
                                    ddlaVar2.b |= 1;
                                    return (ddla) ddkwVar.Q();
                                }
                            }, eqex.a);
                        }
                        boolean l3 = OdlhTombstonesCleanupJob.l(b3, "LiveBusyness");
                        if (!v8.b.L()) {
                            v8.U();
                        }
                        fbag fbagVar20 = (fbag) v8.b;
                        fbagVar20.b |= 2;
                        fbagVar20.d = l3;
                        fbagVar4 = (fbag) v8.Q();
                    } else {
                        fgrc v9 = fbag.a.v();
                        if (!v9.b.L()) {
                            v9.U();
                        }
                        fbag fbagVar21 = (fbag) v9.b;
                        fbagVar21.b |= 1;
                        fbagVar21.c = false;
                        fbagVar4 = (fbag) v9.Q();
                    }
                    if (OdlhTombstonesCleanupJob.n(elgoVar, 1L)) {
                        fgrc v10 = fbag.a.v();
                        if (!v10.b.L()) {
                            v10.U();
                        }
                        fbag fbagVar22 = (fbag) v10.b;
                        fbagVar22.b |= 1;
                        fbagVar22.c = true;
                        dzwm dzwmVar4 = odlhTombstonesCleanupJob.h().b;
                        synchronized (dzwmVar4) {
                            b2 = dzwmVar4.b(new ekut() { // from class: dcqo
                                @Override // defpackage.ekut
                                public final Object apply(Object obj2) {
                                    ddla ddlaVar = (ddla) obj2;
                                    ausn ausnVar = dcry.a;
                                    ddls ddlsVar = ddlaVar.f;
                                    if (ddlsVar == null) {
                                        ddlsVar = ddls.a;
                                    }
                                    fgrc fgrcVar3 = (fgrc) ddlsVar.iQ(5, null);
                                    fgrcVar3.X(ddlsVar);
                                    if (!fgrcVar3.b.L()) {
                                        fgrcVar3.U();
                                    }
                                    ((ddls) fgrcVar3.b).d = fgtj.a;
                                    ddls ddlsVar2 = (ddls) fgrcVar3.Q();
                                    fgrc fgrcVar4 = (fgrc) ddlaVar.iQ(5, null);
                                    fgrcVar4.X(ddlaVar);
                                    ddkw ddkwVar = (ddkw) fgrcVar4;
                                    if (!ddkwVar.b.L()) {
                                        ddkwVar.U();
                                    }
                                    ddla ddlaVar2 = (ddla) ddkwVar.b;
                                    ddlsVar2.getClass();
                                    ddlaVar2.f = ddlsVar2;
                                    ddlaVar2.b |= 2;
                                    return (ddla) ddkwVar.Q();
                                }
                            }, eqex.a);
                        }
                        boolean l4 = OdlhTombstonesCleanupJob.l(b2, "RealTimeActivityUploads");
                        if (!v10.b.L()) {
                            v10.U();
                        }
                        fbag fbagVar23 = (fbag) v10.b;
                        fbagVar23.b |= 2;
                        fbagVar23.d = l4;
                        fbagVar5 = (fbag) v10.Q();
                        z2 = false;
                    } else {
                        fgrc v11 = fbag.a.v();
                        if (!v11.b.L()) {
                            v11.U();
                        }
                        fbag fbagVar24 = (fbag) v11.b;
                        fbagVar24.b |= 1;
                        z2 = false;
                        fbagVar24.c = false;
                        fbagVar5 = (fbag) v11.Q();
                    }
                    fbag j = odlhTombstonesCleanupJob.j(context, account2, elgoVar);
                    if (!fgrcVar.b.L()) {
                        fgrcVar.U();
                    }
                    fgri fgriVar3 = fgrcVar.b;
                    fbah fbahVar8 = (fbah) fgriVar3;
                    fbagVar12.getClass();
                    fbahVar8.m = fbagVar12;
                    fbahVar8.b |= 256;
                    if (!fgriVar3.L()) {
                        fgrcVar.U();
                    }
                    fgri fgriVar4 = fgrcVar.b;
                    fbah fbahVar9 = (fbah) fgriVar4;
                    fbagVar2.getClass();
                    fbahVar9.h = fbagVar2;
                    fbahVar9.b |= 8;
                    if (!fgriVar4.L()) {
                        fgrcVar.U();
                    }
                    fgri fgriVar5 = fgrcVar.b;
                    fbah fbahVar10 = (fbah) fgriVar5;
                    fbagVar3.getClass();
                    fbahVar10.j = fbagVar3;
                    fbahVar10.b |= 32;
                    if (!fgriVar5.L()) {
                        fgrcVar.U();
                    }
                    fgri fgriVar6 = fgrcVar.b;
                    fbah fbahVar11 = (fbah) fgriVar6;
                    fbagVar4.getClass();
                    fbahVar11.i = fbagVar4;
                    fbahVar11.b |= 16;
                    if (!fgriVar6.L()) {
                        fgrcVar.U();
                    }
                    fgri fgriVar7 = fgrcVar.b;
                    fbah fbahVar12 = (fbah) fgriVar7;
                    fbagVar5.getClass();
                    fbahVar12.k = fbagVar5;
                    fbahVar12.b |= 64;
                    if (!fgriVar7.L()) {
                        fgrcVar.U();
                    }
                    fbah fbahVar13 = (fbah) fgrcVar.b;
                    j.getClass();
                    fbahVar13.n = j;
                    fbahVar13.b |= 512;
                    if ((fbagVar12.c && !fbagVar12.d) || ((fbagVar2.c && !fbagVar2.d) || ((fbagVar4.c && !fbagVar4.d) || ((fbagVar5.c && !fbagVar5.d) || ((fbagVar3.c && !fbagVar3.d) || (j.c && !j.d)))))) {
                        arrayList2.removeAll(elgoVar);
                    }
                    arrayList2.size();
                    String str4 = account2.name;
                    int size3 = elgoVar.size() - arrayList2.size();
                    if (!fgrcVar.b.L()) {
                        fgrcVar.U();
                    }
                    fbah fbahVar14 = (fbah) fgrcVar.b;
                    fbahVar14.b |= 4;
                    fbahVar14.e = size3;
                    boolean z6 = arrayList2.size() == elgoVar.size() ? true : z2;
                    if (!fgrcVar.b.L()) {
                        fgrcVar.U();
                    }
                    fbah fbahVar15 = (fbah) fgrcVar.b;
                    fbahVar15.b |= 1;
                    fbahVar15.c = z6;
                    return elgo.i(arrayList2);
                }
            }, eqhbVar), new eqdv() { // from class: ddsq
                @Override // defpackage.eqdv
                public final eqgl a(Object obj) {
                    final elgo g;
                    eqgl b2;
                    elgo elgoVar = (elgo) obj;
                    int i = elgo.d;
                    elgo elgoVar2 = elpg.a;
                    final Account account2 = account;
                    OdlhTombstonesCleanupJob odlhTombstonesCleanupJob = OdlhTombstonesCleanupJob.this;
                    int i2 = 0;
                    if (fusk.e()) {
                        elgj elgjVar = new elgj();
                        int size = elgoVar.size();
                        while (i2 < size) {
                            dceq dceqVar = (dceq) elgoVar.get(i2);
                            if (dceqVar.c < System.currentTimeMillis() - TimeUnit.DAYS.toMillis(fush.j())) {
                                elgjVar.i(dceqVar);
                                odlhTombstonesCleanupJob.d().e("TombstoneCleanupExpiredTombstoneCount");
                            }
                            i2++;
                        }
                        g = elgjVar.g();
                    } else {
                        elgj elgjVar2 = new elgj();
                        int size2 = elgoVar.size();
                        while (i2 < size2) {
                            dceq dceqVar2 = (dceq) elgoVar.get(i2);
                            if (dceqVar2.c < System.currentTimeMillis() - TimeUnit.DAYS.toMillis(5L)) {
                                elgjVar2.i(dceqVar2);
                            }
                            i2++;
                        }
                        g = elgjVar2.g();
                        int i3 = ((elpg) g).c;
                        String str2 = account2.name;
                    }
                    if (g.isEmpty()) {
                        return eqgf.a;
                    }
                    dzwm dzwmVar = odlhTombstonesCleanupJob.e().f;
                    synchronized (dzwmVar) {
                        b2 = dzwmVar.b(new ekut() { // from class: dbva
                            @Override // defpackage.ekut
                            public final Object apply(Object obj2) {
                                dcex dcexVar = (dcex) obj2;
                                ausn ausnVar = dbvg.a;
                                Map unmodifiableMap = DesugarCollections.unmodifiableMap(dcexVar.c);
                                Account account3 = account2;
                                if (!unmodifiableMap.containsKey(account3.name)) {
                                    ((eluo) dbvg.a.j()).x("Unable to find location history settings for account");
                                    return dcexVar;
                                }
                                elgo elgoVar3 = g;
                                dcer dcerVar = (dcer) unmodifiableMap.get(account3.name);
                                ArrayList arrayList2 = new ArrayList(dcerVar.j);
                                arrayList2.removeAll(elgoVar3);
                                fgrc fgrcVar = (fgrc) dcexVar.iQ(5, null);
                                fgrcVar.X(dcexVar);
                                dcek dcekVar = (dcek) fgrcVar;
                                String str3 = account3.name;
                                fgrc fgrcVar2 = (fgrc) dcerVar.iQ(5, null);
                                fgrcVar2.X(dcerVar);
                                dceo dceoVar = (dceo) fgrcVar2;
                                if (!dceoVar.b.L()) {
                                    dceoVar.U();
                                }
                                ((dcer) dceoVar.b).j = fgtj.a;
                                dceoVar.a(arrayList2);
                                dcekVar.a(str3, (dcer) dceoVar.Q());
                                return (dcex) dcekVar.Q();
                            }
                        }, eqex.a);
                    }
                    return b2;
                }
            }, eqhbVar), new ekut() { // from class: ddsr
                @Override // defpackage.ekut
                public final Object apply(Object obj) {
                    ausn ausnVar = OdlhTombstonesCleanupJob.a;
                    return (fbah) fgrc.this.Q();
                }
            }, eqhbVar), Exception.class, new ekut() { // from class: ddss
                @Override // defpackage.ekut
                public final Object apply(Object obj) {
                    Exception exc = (Exception) obj;
                    ((eluo) ((eluo) ((eluo) OdlhTombstonesCleanupJob.a.j()).s(exc)).ai((char) 10767)).B("Tombstone cleanup failed for account with error: %s", OdlhTombstonesCleanupJob.k(exc));
                    fgrc fgrcVar = fgrc.this;
                    if (!fgrcVar.b.L()) {
                        fgrcVar.U();
                    }
                    fbah fbahVar = (fbah) fgrcVar.b;
                    fbah fbahVar2 = fbah.a;
                    fbahVar.b |= 1;
                    fbahVar.c = false;
                    return (fbah) fgrcVar.Q();
                }
            }, eqhbVar));
        }
        return eqdl.g(eqgb.h(eqgc.e(arrayList)), new eqdv() { // from class: ddsh
            @Override // defpackage.eqdv
            public final eqgl a(Object obj) {
                OdlhTombstonesCleanupJob odlhTombstonesCleanupJob = OdlhTombstonesCleanupJob.this;
                List list = (List) obj;
                if (odlhTombstonesCleanupJob.c == null) {
                    odlhTombstonesCleanupJob.c = dbte.a();
                }
                dbte dbteVar = odlhTombstonesCleanupJob.c;
                fgrc v2 = fbcs.a.v();
                if (!v2.b.L()) {
                    v2.U();
                }
                fbcs fbcsVar = (fbcs) v2.b;
                fgsa fgsaVar = fbcsVar.b;
                if (!fgsaVar.c()) {
                    fbcsVar.b = fgri.E(fgsaVar);
                }
                fgou.E(list, fbcsVar.b);
                fbcs fbcsVar2 = (fbcs) v2.Q();
                fgrc v3 = fbcr.a.v();
                if (!v3.b.L()) {
                    v3.U();
                }
                fbcr fbcrVar = (fbcr) v3.b;
                fbcsVar2.getClass();
                fbcrVar.c = fbcsVar2;
                fbcrVar.b = 11;
                dbteVar.j(v3);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!((fbah) it.next()).c) {
                        ((eluo) ((eluo) OdlhTombstonesCleanupJob.a.j()).ai((char) 10766)).x("Tombstone cleanup failed for account");
                        return fuqy.d() ? eqdl.f(odlhTombstonesCleanupJob.h().g("OdlhTombstonesCleanupJob", fgvq.h(System.currentTimeMillis())), new ekut() { // from class: ddsl
                            @Override // defpackage.ekut
                            public final Object apply(Object obj2) {
                                ausn ausnVar = OdlhTombstonesCleanupJob.a;
                                return 2;
                            }
                        }, eqex.a) : eqgc.i(2);
                    }
                }
                return fuqy.d() ? eqdl.f(odlhTombstonesCleanupJob.h().e("OdlhTombstonesCleanupJob", false), new ekut() { // from class: ddsm
                    @Override // defpackage.ekut
                    public final Object apply(Object obj2) {
                        ausn ausnVar = OdlhTombstonesCleanupJob.a;
                        return 0;
                    }
                }, eqex.a) : eqgc.i(0);
            }
        }, eqex.a);
    }

    public final fbag j(Context context, Account account, elgo elgoVar) {
        if (!fupy.d()) {
            return fbag.a;
        }
        String str = account.name;
        elgoVar.size();
        d().k("DeidentifiedGoldenData", 24);
        if (elgoVar.isEmpty()) {
            d().k("DeidentifiedGoldenData", 25);
            fgrc v = fbag.a.v();
            if (!v.b.L()) {
                v.U();
            }
            fgri fgriVar = v.b;
            fbag fbagVar = (fbag) fgriVar;
            fbagVar.b |= 1;
            fbagVar.c = true;
            if (!fgriVar.L()) {
                v.U();
            }
            fbag fbagVar2 = (fbag) v.b;
            fbagVar2.b |= 2;
            fbagVar2.d = true;
            return (fbag) v.Q();
        }
        elgo elgoVar2 = (elgo) Collection.EL.stream(elgoVar).filter(new Predicate() { // from class: ddsi
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
            public final boolean test(Object obj) {
                dceq dceqVar = (dceq) obj;
                ausn ausnVar = OdlhTombstonesCleanupJob.a;
                fjyl fjylVar = dceqVar.d;
                if (fjylVar == null) {
                    fjylVar = fjyl.a;
                }
                fgub fgubVar = fjylVar.c;
                if (fgubVar == null) {
                    fgubVar = fgub.a;
                }
                fjyl fjylVar2 = dceqVar.d;
                if (fjylVar2 == null) {
                    fjylVar2 = fjyl.a;
                }
                fgub fgubVar2 = fjylVar2.d;
                if (fgubVar2 == null) {
                    fgubVar2 = fgub.a;
                }
                fgub fgubVar3 = fgvq.a;
                return fgvp.a(fgubVar, fgubVar2) <= 0;
            }
        }).map(new Function() { // from class: ddsj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo479andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                dceq dceqVar = (dceq) obj;
                ausn ausnVar = OdlhTombstonesCleanupJob.a;
                fjyl fjylVar = dceqVar.d;
                if (fjylVar == null) {
                    fjylVar = fjyl.a;
                }
                fgub fgubVar = fjylVar.c;
                if (fgubVar == null) {
                    fgubVar = fgub.a;
                }
                Instant d = fgvn.d(fgubVar);
                fjyl fjylVar2 = dceqVar.d;
                if (fjylVar2 == null) {
                    fjylVar2 = fjyl.a;
                }
                fgub fgubVar2 = fjylVar2.d;
                if (fgubVar2 == null) {
                    fgubVar2 = fgub.a;
                }
                return elow.g(d, fgvn.d(fgubVar2));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(elcq.a);
        if (this.m == null) {
            dbvg e = e();
            if (this.l == null) {
                this.l = new ddsf();
            }
            this.m = dctn.a(e, this.l, f(context), g(), new dcvg(), d());
        }
        try {
            ((eqcy) this.m.c(account, elgoVar2, eqex.a)).v(fupy.a.lK().a(), TimeUnit.MILLISECONDS);
            d().k("DeidentifiedGoldenData", 25);
            d().l("DeidentifiedGoldenData", 26, elgoVar.size());
            fgrc v2 = fbag.a.v();
            if (!v2.b.L()) {
                v2.U();
            }
            fgri fgriVar2 = v2.b;
            fbag fbagVar3 = (fbag) fgriVar2;
            fbagVar3.b |= 1;
            fbagVar3.c = true;
            if (!fgriVar2.L()) {
                v2.U();
            }
            fbag fbagVar4 = (fbag) v2.b;
            fbagVar4.b |= 2;
            fbagVar4.d = true;
            return (fbag) v2.Q();
        } catch (InterruptedException unused) {
            d().k("DeidentifiedGoldenData", 28);
            fgrc v3 = fbag.a.v();
            if (!v3.b.L()) {
                v3.U();
            }
            fgri fgriVar3 = v3.b;
            fbag fbagVar5 = (fbag) fgriVar3;
            fbagVar5.b |= 1;
            fbagVar5.c = true;
            if (!fgriVar3.L()) {
                v3.U();
            }
            fbag fbagVar6 = (fbag) v3.b;
            fbagVar6.b |= 2;
            fbagVar6.d = false;
            return (fbag) v3.Q();
        } catch (ExecutionException unused2) {
            d().k("DeidentifiedGoldenData", 29);
            fgrc v4 = fbag.a.v();
            if (!v4.b.L()) {
                v4.U();
            }
            fgri fgriVar4 = v4.b;
            fbag fbagVar7 = (fbag) fgriVar4;
            fbagVar7.b |= 1;
            fbagVar7.c = true;
            if (!fgriVar4.L()) {
                v4.U();
            }
            fbag fbagVar8 = (fbag) v4.b;
            fbagVar8.b |= 2;
            fbagVar8.d = false;
            return (fbag) v4.Q();
        } catch (TimeoutException unused3) {
            d().k("DeidentifiedGoldenData", 27);
            fgrc v5 = fbag.a.v();
            if (!v5.b.L()) {
                v5.U();
            }
            fgri fgriVar5 = v5.b;
            fbag fbagVar9 = (fbag) fgriVar5;
            fbagVar9.b |= 1;
            fbagVar9.c = true;
            if (!fgriVar5.L()) {
                v5.U();
            }
            fbag fbagVar10 = (fbag) v5.b;
            fbagVar10.b |= 2;
            fbagVar10.d = false;
            return (fbag) v5.Q();
        }
    }
}
