package com.google.android.gms.semanticlocationhistory.pulp;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import com.google.android.gms.chimera.modules.semanticlocationhistory.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.android.gms.semanticlocationhistory.isolation.OdlhJniLoader;
import com.google.android.gms.semanticlocationhistory.pulp.PulpInferenceService;
import com.google.android.libraries.geller.portable.Geller;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bzbx;
import defpackage.cauf;
import defpackage.dbsn;
import defpackage.dbsv;
import defpackage.dbtc;
import defpackage.dbvg;
import defpackage.dbyq;
import defpackage.dbyr;
import defpackage.dbyz;
import defpackage.dbzk;
import defpackage.dbzt;
import defpackage.dcdb;
import defpackage.dcdd;
import defpackage.dcnm;
import defpackage.dcnp;
import defpackage.dcry;
import defpackage.ddoh;
import defpackage.ddoj;
import defpackage.ddor;
import defpackage.ddxd;
import defpackage.ddyg;
import defpackage.dqfb;
import defpackage.drty;
import defpackage.drtz;
import defpackage.drvx;
import defpackage.ekut;
import defpackage.ekvi;
import defpackage.elgo;
import defpackage.elgx;
import defpackage.eluo;
import defpackage.eqcq;
import defpackage.eqdl;
import defpackage.eqdu;
import defpackage.eqdv;
import defpackage.eqex;
import defpackage.eqgb;
import defpackage.eqgc;
import defpackage.eqgl;
import defpackage.eqhb;
import defpackage.etry;
import defpackage.etrz;
import defpackage.fazd;
import defpackage.fazf;
import defpackage.fazj;
import defpackage.fgou;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fgsa;
import defpackage.fgub;
import defpackage.fgvq;
import defpackage.fhcy;
import defpackage.fuqy;
import defpackage.furt;
import defpackage.fush;
import defpackage.fusk;
import defpackage.fytx;
import defpackage.fytz;
import defpackage.fyua;
import defpackage.fyub;
import defpackage.fyuc;
import defpackage.fyud;
import defpackage.fyvf;
import defpackage.fyvg;
import defpackage.fyvh;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class PulpInferenceService extends GmsTaskBoundService {
    public ddyg c;
    public dqfb d;
    public ddxd e;
    private dbyr g;
    private ddoh h;
    private dcnm j;
    private dbtc k;
    private dbvg l;
    private ddoj m;
    private dcry n;
    public static final ausn a = ausn.c("LocationHistory", auid.SEMANTIC_LOCATION_HISTORY, "PULP");
    private static final elgx f = elgx.n(fazf.HOME, fytz.HOME, fazf.WORK, fytz.WORK, fazf.ALIASED_LOCATION, fytz.NICKNAME);
    public static final String b = PulpInferenceService.class.getName();

    public static native byte[] calculatePulp(byte[] bArr, boolean z, boolean z2);

    public static boolean j() {
        return fush.Q() && furt.e();
    }

    private final elgo k(Account account, long j, long j2) {
        if (this.j == null) {
            this.j = dcnp.w(AppContextProvider.a());
        }
        return this.j.k(account, "odlh-pulp-computation", j, j2, null);
    }

    public final dbtc d() {
        if (this.k == null) {
            this.k = new dbtc();
        }
        return this.k;
    }

    public final dbvg e() {
        if (this.l == null) {
            this.l = new dbvg(d());
        }
        return this.l;
    }

    public final dcry f() {
        if (this.n == null) {
            this.n = new dcry();
        }
        return this.n;
    }

    public final ddoj g() {
        if (this.m == null) {
            this.m = new ddor();
        }
        return this.m;
    }

    public final List h(Context context, elgx elgxVar) {
        Account account;
        int i;
        Account account2;
        long j;
        Account[] accountArr;
        int i2;
        int i3;
        elgo i4;
        int i5;
        dcdb dcdbVar;
        int i6;
        ArrayList arrayList = new ArrayList();
        if (elgxVar.isEmpty()) {
            d().e("PulpGellerDataEmpty");
        }
        Account[] d = dbsv.d(context);
        int length = d.length;
        int i7 = 0;
        while (i7 < length) {
            Account account3 = d[i7];
            if (e().R(account3)) {
                d().e("PulpAccountWithLhEnabled");
                eqhb eqhbVar = new eqhb(eqex.a);
                d().e("PulpCalculateForAccount");
                dbyq dbyqVar = (dbyq) elgxVar.get(account3);
                final fgrc v = fyvh.a.v();
                long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
                long seconds2 = seconds - TimeUnit.DAYS.toSeconds(1L);
                TimeUnit timeUnit = TimeUnit.DAYS;
                try {
                    i = e().b(account3) > 30 ? 90 : 30;
                    account = account3;
                } catch (IllegalStateException e) {
                    account = account3;
                    ((eluo) ((eluo) ((eluo) a.j()).s(e)).ai((char) 10549)).B("Failed to read user retention window with error: %s", new etrz(etry.NO_USER_DATA, e.getMessage()));
                    i = 30;
                }
                long seconds3 = seconds2 - timeUnit.toSeconds(i - 1);
                fgub j2 = fgvq.j(seconds);
                if (!v.b.L()) {
                    v.U();
                }
                fyvh fyvhVar = (fyvh) v.b;
                j2.getClass();
                fyvhVar.g = j2;
                fyvhVar.b |= 256;
                fyvg fyvgVar = fyvg.a;
                fgrc v2 = fyvgVar.v();
                fgub j3 = fgvq.j(seconds3);
                if (!v2.b.L()) {
                    v2.U();
                }
                fyvg fyvgVar2 = (fyvg) v2.b;
                j3.getClass();
                fyvgVar2.c = j3;
                fyvgVar2.b |= 1;
                fgub j4 = fgvq.j(seconds2);
                if (!v2.b.L()) {
                    v2.U();
                }
                fyvg fyvgVar3 = (fyvg) v2.b;
                j4.getClass();
                fyvgVar3.d = j4;
                fyvgVar3.b |= 2;
                fyvg fyvgVar4 = (fyvg) v2.Q();
                if (!v.b.L()) {
                    v.U();
                }
                fyvh fyvhVar2 = (fyvh) v.b;
                fyvgVar4.getClass();
                fyvhVar2.d = fyvgVar4;
                fyvhVar2.b |= 2;
                if (furt.d()) {
                    fgrc v3 = fyvgVar.v();
                    fgub j5 = fgvq.j(seconds2);
                    if (!v3.b.L()) {
                        v3.U();
                    }
                    fyvg fyvgVar5 = (fyvg) v3.b;
                    j5.getClass();
                    fyvgVar5.c = j5;
                    fyvgVar5.b |= 1;
                    fgub j6 = fgvq.j(seconds);
                    if (!v3.b.L()) {
                        v3.U();
                    }
                    fyvg fyvgVar6 = (fyvg) v3.b;
                    j6.getClass();
                    fyvgVar6.d = j6;
                    fyvgVar6.b |= 2;
                    fyvg fyvgVar7 = (fyvg) v3.Q();
                    if (!v.b.L()) {
                        v.U();
                    }
                    fyvh fyvhVar3 = (fyvh) v.b;
                    fyvgVar7.getClass();
                    fyvhVar3.e = fyvgVar7;
                    fyvhVar3.b |= 64;
                }
                fgrc v4 = fyvf.a.v();
                Account account4 = account;
                elgo k = k(account4, seconds3, seconds2);
                long j7 = seconds2;
                if (!v4.b.L()) {
                    v4.U();
                }
                fyvf fyvfVar = (fyvf) v4.b;
                fgsa fgsaVar = fyvfVar.b;
                if (!fgsaVar.c()) {
                    fyvfVar.b = fgri.E(fgsaVar);
                }
                fgou.E(k, fyvfVar.b);
                d().e(((fyvf) v4.b).b.size() == 0 ? "PulpAccountLhSegmentsEmpty" : "PulpAccountLhSegmentsPresent");
                ArrayList arrayList2 = new ArrayList();
                if (dbyqVar == null) {
                    i4 = elgo.i(arrayList2);
                    account2 = account4;
                    j = j7;
                    accountArr = d;
                    i2 = length;
                    i3 = i7;
                } else {
                    elgo elgoVar = dbyqVar.a;
                    int size = elgoVar.size();
                    int i8 = 0;
                    while (i8 < size) {
                        elgo elgoVar2 = elgoVar;
                        dcdd dcddVar = (dcdd) elgoVar.get(i8);
                        Account account5 = account4;
                        Iterator it = dcddVar.e.iterator();
                        while (true) {
                            i5 = i8 + 1;
                            if (it.hasNext()) {
                                Iterator it2 = it;
                                fazj fazjVar = (fazj) it.next();
                                long j8 = j7;
                                fazf b2 = fazf.b(fazjVar.c);
                                if (b2 == null) {
                                    b2 = fazf.UNKNOWN_TYPE;
                                }
                                fazf fazfVar = fazf.UNKNOWN_TYPE;
                                if (b2 != fazfVar) {
                                    long j9 = dcddVar.c;
                                    dcdd dcddVar2 = dcddVar;
                                    elgo elgoVar3 = dbyqVar.b;
                                    int size2 = elgoVar3.size();
                                    int i9 = 0;
                                    while (true) {
                                        if (i9 >= size2) {
                                            dcdbVar = null;
                                            break;
                                        }
                                        elgo elgoVar4 = elgoVar3;
                                        dcdbVar = (dcdb) elgoVar3.get(i9);
                                        int i10 = size2;
                                        int i11 = i9 + 1;
                                        if (dcdbVar.c == j9) {
                                            break;
                                        }
                                        size2 = i10;
                                        elgoVar3 = elgoVar4;
                                        i9 = i11;
                                    }
                                    elgx elgxVar2 = f;
                                    fazf b3 = fazf.b(fazjVar.c);
                                    if (b3 == null) {
                                        b3 = fazfVar;
                                    }
                                    fytz fytzVar = (fytz) elgxVar2.get(b3);
                                    if ((fazjVar.b & 16) != 0) {
                                        i6 = size;
                                        d().e("PulpAccountPersonalPlaceLastUpdatedTimePresent");
                                    } else {
                                        i6 = size;
                                        d().e("PulpAccountPersonalPlaceLastUpdatedTimeMissing");
                                    }
                                    if (dcdbVar == null || fytzVar == null) {
                                        it = it2;
                                        size = i6;
                                        j7 = j8;
                                        dcddVar = dcddVar2;
                                    } else {
                                        fazd fazdVar = fazjVar.g;
                                        if (fazdVar == null) {
                                            fazdVar = fazd.a;
                                        }
                                        fgrc v5 = fyud.a.v();
                                        fgrc v6 = fyua.a.v();
                                        Account[] accountArr2 = d;
                                        int i12 = length;
                                        long j10 = dcdbVar.c;
                                        int i13 = i8;
                                        if (!v6.b.L()) {
                                            v6.U();
                                        }
                                        fgri fgriVar = v6.b;
                                        fyua fyuaVar = (fyua) fgriVar;
                                        int i14 = i7;
                                        fyuaVar.b |= 2;
                                        fyuaVar.d = j10;
                                        long j11 = dcdbVar.d;
                                        if (!fgriVar.L()) {
                                            v6.U();
                                        }
                                        fyua fyuaVar2 = (fyua) v6.b;
                                        fyuaVar2.b |= 1;
                                        fyuaVar2.c = j11;
                                        fgrc v7 = fyub.a.v();
                                        fyua fyuaVar3 = (fyua) v6.Q();
                                        if (!v7.b.L()) {
                                            v7.U();
                                        }
                                        fgri fgriVar2 = v7.b;
                                        fyub fyubVar = (fyub) fgriVar2;
                                        fyuaVar3.getClass();
                                        fyubVar.e = fyuaVar3;
                                        fyubVar.b |= 4;
                                        int i15 = dcdbVar.e;
                                        if (!fgriVar2.L()) {
                                            v7.U();
                                        }
                                        fgri fgriVar3 = v7.b;
                                        fyub fyubVar2 = (fyub) fgriVar3;
                                        fyubVar2.b |= 1;
                                        fyubVar2.c = i15;
                                        int i16 = dcdbVar.f;
                                        if (!fgriVar3.L()) {
                                            v7.U();
                                        }
                                        fyub fyubVar3 = (fyub) v7.b;
                                        fyubVar3.b |= 2;
                                        fyubVar3.d = i16;
                                        fgrc v8 = fytx.a.v();
                                        if (!v8.b.L()) {
                                            v8.U();
                                        }
                                        fytx fytxVar = (fytx) v8.b;
                                        fytxVar.c = fytzVar.d;
                                        fytxVar.b |= 1;
                                        if (furt.a.lK().j() && fazdVar != null) {
                                            fgrc v9 = fyuc.a.v();
                                            long j12 = fazdVar.b;
                                            if (!v9.b.L()) {
                                                v9.U();
                                            }
                                            fyuc fyucVar = (fyuc) v9.b;
                                            fyucVar.b |= 1;
                                            fyucVar.c = j12;
                                            if (!v5.b.L()) {
                                                v5.U();
                                            }
                                            fyud fyudVar = (fyud) v5.b;
                                            fyuc fyucVar2 = (fyuc) v9.Q();
                                            fyucVar2.getClass();
                                            fyudVar.e = fyucVar2;
                                            fyudVar.b |= 8;
                                        }
                                        fytx fytxVar2 = (fytx) v8.Q();
                                        if (!v5.b.L()) {
                                            v5.U();
                                        }
                                        fyud fyudVar2 = (fyud) v5.b;
                                        fytxVar2.getClass();
                                        fyudVar2.c = fytxVar2;
                                        fyudVar2.b |= 1;
                                        fyub fyubVar4 = (fyub) v7.Q();
                                        if (!v5.b.L()) {
                                            v5.U();
                                        }
                                        fyud fyudVar3 = (fyud) v5.b;
                                        fyubVar4.getClass();
                                        fyudVar3.d = fyubVar4;
                                        fyudVar3.b |= 2;
                                        arrayList2.add((fyud) v5.Q());
                                        it = it2;
                                        size = i6;
                                        j7 = j8;
                                        dcddVar = dcddVar2;
                                        d = accountArr2;
                                        length = i12;
                                        i8 = i13;
                                        i7 = i14;
                                    }
                                } else {
                                    it = it2;
                                    j7 = j8;
                                }
                            }
                        }
                        account4 = account5;
                        elgoVar = elgoVar2;
                        i8 = i5;
                    }
                    account2 = account4;
                    j = j7;
                    accountArr = d;
                    i2 = length;
                    i3 = i7;
                    i4 = elgo.i(arrayList2);
                }
                if (!v4.b.L()) {
                    v4.U();
                }
                fyvf fyvfVar2 = (fyvf) v4.b;
                fgsa fgsaVar2 = fyvfVar2.d;
                if (!fgsaVar2.c()) {
                    fyvfVar2.d = fgri.E(fgsaVar2);
                }
                fgou.E(i4, fyvfVar2.d);
                final Account account6 = account2;
                elgo k2 = k(account6, j, seconds);
                if (!v4.b.L()) {
                    v4.U();
                }
                fyvf fyvfVar3 = (fyvf) v4.b;
                fgsa fgsaVar3 = fyvfVar3.c;
                if (!fgsaVar3.c()) {
                    fyvfVar3.c = fgri.E(fgsaVar3);
                }
                fgou.E(k2, fyvfVar3.c);
                d().e(((fyvf) v4.b).c.size() == 0 ? "PulpAccountEvalWeekLhSegmentsEmpty" : "PulpAccountEvalWeekLhSegments");
                d().e(dbyqVar == null ? "PulpAccountPersonalPlaceNull" : "PulpAccountPersonalPlacesPresent");
                fyvf fyvfVar4 = (fyvf) v4.Q();
                if (!v.b.L()) {
                    v.U();
                }
                fyvh fyvhVar4 = (fyvh) v.b;
                fyvfVar4.getClass();
                fyvhVar4.c = fyvfVar4;
                fyvhVar4.b |= 1;
                if (this.h == null) {
                    this.h = ddoh.a(AppContextProvider.a());
                }
                final ddoh ddohVar = this.h;
                drvx drvxVar = ddohVar.c;
                drty a2 = drtz.a();
                a2.a = "pulp-home-work-model-configs";
                eqgb h = eqgb.h(drvxVar.c(a2.a()));
                ekut ekutVar = new ekut() { // from class: ddoe
                    @Override // defpackage.ekut
                    public final Object apply(Object obj) {
                        ekvi ekviVar;
                        ddoh ddohVar2 = ddoh.this;
                        drrn drrnVar = (drrn) obj;
                        if (drrnVar == null) {
                            ((eluo) ((eluo) ddoh.a.h()).ai((char) 10570)).x("Downloaded mdd model is not available yet.");
                            ddohVar2.b(2);
                            return fyve.a;
                        }
                        for (drrj drrjVar : drrnVar.h) {
                            if (drrjVar.c.equals("pulp-config.pb")) {
                                try {
                                    dzng dzngVar = ddohVar2.b;
                                    Uri parse = Uri.parse(drrjVar.d);
                                    dzqv dzqvVar = new dzqv((fgtg) fyve.a.iQ(7, null));
                                    dzqvVar.a = fgqp.a();
                                    fyve fyveVar = (fyve) dzngVar.d(parse, dzqvVar);
                                    ((eluo) ((eluo) ddoh.a.h()).ai(10568)).B("Got PulpConfig for fileId: %s", drrjVar.c);
                                    ekviVar = ekvi.j(fyveVar);
                                } catch (IOException e2) {
                                    ((eluo) ((eluo) ((eluo) ddoh.a.i()).s(e2)).ai(10569)).B("Parsing PulpConfig from MDD file: %s failed", drrjVar.c);
                                    ekviVar = ektg.a;
                                }
                                if (ekviVar.h()) {
                                    ddohVar2.b(5);
                                    return ekviVar.c();
                                }
                                ddohVar2.b(4);
                                return fyve.a;
                            }
                        }
                        ddohVar2.b(3);
                        return fyve.a;
                    }
                };
                eqex eqexVar = eqex.a;
                eqgl g = eqdl.g(eqgb.h(eqcq.f(eqdl.f(eqgb.h(eqcq.g(eqdl.f(h, ekutVar, eqexVar), Exception.class, new eqdv() { // from class: ddof
                    @Override // defpackage.eqdv
                    public final eqgl a(Object obj) {
                        ((eluo) ((eluo) ((eluo) ddoh.a.j()).s((Exception) obj)).ai(10571)).x("Failed to read data from MDD.");
                        ddoh.this.b(1);
                        return eqgc.i(fyve.a);
                    }
                }, eqexVar)), new ekut() { // from class: ddnv
                    @Override // defpackage.ekut
                    public final Object apply(Object obj) {
                        fyve fyveVar = (fyve) obj;
                        ausn ausnVar = PulpInferenceService.a;
                        fgrc fgrcVar = (fgrc) fyveVar.iQ(5, null);
                        fgrcVar.X(fyveVar);
                        fyvd fyvdVar = fyveVar.d;
                        if (fyvdVar == null) {
                            fyvdVar = fyvd.a;
                        }
                        fgrc fgrcVar2 = (fgrc) fyvdVar.iQ(5, null);
                        fgrcVar2.X(fyvdVar);
                        fyvd fyvdVar2 = fyveVar.d;
                        if (fyvdVar2 == null) {
                            fyvdVar2 = fyvd.a;
                        }
                        fyvc fyvcVar = fyvdVar2.c;
                        if (fyvcVar == null) {
                            fyvcVar = fyvc.a;
                        }
                        fgrc fgrcVar3 = (fgrc) fyvcVar.iQ(5, null);
                        fgrcVar3.X(fyvcVar);
                        boolean g2 = furt.g();
                        if (!fgrcVar3.b.L()) {
                            fgrcVar3.U();
                        }
                        fyvc fyvcVar2 = (fyvc) fgrcVar3.b;
                        fyvcVar2.b |= 2;
                        fyvcVar2.d = g2;
                        boolean f2 = furt.f();
                        if (!fgrcVar3.b.L()) {
                            fgrcVar3.U();
                        }
                        fyvc fyvcVar3 = (fyvc) fgrcVar3.b;
                        fyvcVar3.b |= 1;
                        fyvcVar3.c = f2;
                        if (!fgrcVar2.b.L()) {
                            fgrcVar2.U();
                        }
                        fyvd fyvdVar3 = (fyvd) fgrcVar2.b;
                        fyvc fyvcVar4 = (fyvc) fgrcVar3.Q();
                        fyvcVar4.getClass();
                        fyvdVar3.c = fyvcVar4;
                        fyvdVar3.b |= 4;
                        if (!fgrcVar.b.L()) {
                            fgrcVar.U();
                        }
                        fyve fyveVar2 = (fyve) fgrcVar.b;
                        fyvd fyvdVar4 = (fyvd) fgrcVar2.Q();
                        fyvdVar4.getClass();
                        fyveVar2.d = fyvdVar4;
                        fyveVar2.b |= 8;
                        fyva fyvaVar = fyveVar.c;
                        if (fyvaVar == null) {
                            fyvaVar = fyva.a;
                        }
                        fgrc fgrcVar4 = (fgrc) fyvaVar.iQ(5, null);
                        fgrcVar4.X(fyvaVar);
                        boolean d2 = furt.d();
                        if (!fgrcVar4.b.L()) {
                            fgrcVar4.U();
                        }
                        fyva fyvaVar2 = (fyva) fgrcVar4.b;
                        fyvaVar2.b |= 32;
                        fyvaVar2.c = d2;
                        if (!fgrcVar.b.L()) {
                            fgrcVar.U();
                        }
                        fgrc fgrcVar5 = fgrc.this;
                        fyve fyveVar3 = (fyve) fgrcVar.b;
                        fyva fyvaVar3 = (fyva) fgrcVar4.Q();
                        fyvaVar3.getClass();
                        fyveVar3.c = fyvaVar3;
                        fyveVar3.b |= 4;
                        if (!fgrcVar5.b.L()) {
                            fgrcVar5.U();
                        }
                        fyvh fyvhVar5 = (fyvh) fgrcVar5.b;
                        fyve fyveVar4 = (fyve) fgrcVar.Q();
                        fyvh fyvhVar6 = fyvh.a;
                        fyveVar4.getClass();
                        fyvhVar5.f = fyveVar4;
                        fyvhVar5.b |= 128;
                        return (fyvh) fgrcVar5.Q();
                    }
                }, eqexVar), Throwable.class, new ekut() { // from class: ddnw
                    @Override // defpackage.ekut
                    public final Object apply(Object obj) {
                        ((eluo) ((eluo) ((eluo) PulpInferenceService.a.j()).s((Throwable) obj)).ai((char) 10550)).x("Error fetching PulpConfig data from PulpMddHelper");
                        fgrc fgrcVar = fgrc.this;
                        if (!fgrcVar.b.L()) {
                            fgrcVar.U();
                        }
                        fyvh fyvhVar5 = (fyvh) fgrcVar.b;
                        fyvh fyvhVar6 = fyvh.a;
                        fyvhVar5.f = null;
                        fyvhVar5.b &= -129;
                        return (fyvh) fgrcVar.Q();
                    }
                }, eqexVar)), new eqdv() { // from class: ddnz
                    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a3, code lost:
                    
                        if (((java.lang.Boolean) r0.c.a(r1, "odlh-pulp-output").get()).booleanValue() != false) goto L61;
                     */
                    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
                    /* JADX WARN: Removed duplicated region for block: B:26:0x0086 A[Catch: IOException -> 0x00a6, ExecutionException -> 0x00a8, IOException | InterruptedException | ExecutionException -> 0x00aa, TryCatch #8 {IOException | InterruptedException | ExecutionException -> 0x00aa, blocks: (B:24:0x0082, B:26:0x0086, B:27:0x0091), top: B:23:0x0082 }] */
                    @Override // defpackage.eqdv
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final defpackage.eqgl a(java.lang.Object r14) {
                        /*
                            Method dump skipped, instructions count: 632
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.ddnz.a(java.lang.Object):eqgl");
                    }
                }, eqhbVar);
                eqdl.g(eqgb.h(g().d(account6, furt.a.lK().a())), new eqdv() { // from class: ddoa
                    @Override // defpackage.eqdv
                    public final eqgl a(Object obj) {
                        if (!((Boolean) obj).booleanValue()) {
                            return eqgf.a;
                        }
                        return PulpInferenceService.this.g().a(account6.name);
                    }
                }, eqhbVar);
                arrayList.add(g);
            } else {
                ((eluo) ((eluo) a.h()).ai((char) 10563)).x("Pulp computation skipped due to Account settings.");
                accountArr = d;
                i2 = length;
                i3 = i7;
            }
            i7 = i3 + 1;
            d = accountArr;
            length = i2;
        }
        return arrayList;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final eqgl iB(cauf caufVar) {
        if (!j()) {
            return eqgc.i(0);
        }
        if (!fusk.g() ? !e().J() : !e().g().e) {
            return eqgc.i(0);
        }
        d().e("PulpStartInferenceForDevice");
        this.k.k("PulpStartInferenceTimeOfDay", (int) (((System.currentTimeMillis() / 60000) % 1440) / 30));
        final Context a2 = AppContextProvider.a();
        if (!bzbx.q(a2)) {
            d().e("PulpDeviceLocationDisabled");
            return eqgc.i(0);
        }
        d().e("PulpDeviceLocationEnabled");
        final OdlhJniLoader odlhJniLoader = OdlhJniLoader.a;
        if (!odlhJniLoader.d(a2)) {
            ((eluo) ((eluo) a.i()).ai((char) 10558)).x("loadLibrary failed");
            d().e("PulpLoadJniLibraryFail");
            return fuqy.d() ? eqdl.f(f().g("PulpInference", fgvq.h(System.currentTimeMillis())), new ekut() { // from class: ddnq
                @Override // defpackage.ekut
                public final Object apply(Object obj) {
                    ausn ausnVar = PulpInferenceService.a;
                    return 2;
                }
            }, eqex.a) : eqgc.i(2);
        }
        if (!odlhJniLoader.c()) {
            ((eluo) ((eluo) a.i()).ai((char) 10557)).x("connect to remote process failed");
            d().e("PulpConnectToRemoteServiceFail");
            return fuqy.d() ? eqdl.f(f().g("PulpInference", fgvq.h(System.currentTimeMillis())), new ekut() { // from class: ddnr
                @Override // defpackage.ekut
                public final Object apply(Object obj) {
                    ausn ausnVar = PulpInferenceService.a;
                    return 2;
                }
            }, eqex.a) : eqgc.i(2);
        }
        if (this.g == null) {
            final Context a3 = AppContextProvider.a();
            this.g = new dbzk(new dbyz() { // from class: ddob
                @Override // defpackage.dbyz
                public final Geller a() {
                    PulpInferenceService pulpInferenceService = PulpInferenceService.this;
                    if (pulpInferenceService.d == null) {
                        Context context = a3;
                        System.loadLibrary("geller_jni_lite_lib");
                        pulpInferenceService.d = dbsl.a(context);
                    }
                    return new Geller(pulpInferenceService.d);
                }
            }, new dbzt(fhcy.HULK_ONDEVICE_PERSONALIZATION, d(), furt.a.lK().f(), ekvi.j(38401), ekvi.j(Integer.valueOf(dbsn.a(a3)))), a3, d(), null);
        }
        eqgb h = eqgb.h(this.g.a());
        eqdv eqdvVar = new eqdv() { // from class: ddns
            @Override // defpackage.eqdv
            public final eqgl a(Object obj) {
                elgx elgxVar = (elgx) obj;
                boolean c = furt.a.lK().c();
                PulpInferenceService pulpInferenceService = PulpInferenceService.this;
                Context context = a2;
                return c ? eqgc.o(pulpInferenceService.h(context, elgxVar)) : eqgc.e(pulpInferenceService.h(context, elgxVar));
            }
        };
        eqex eqexVar = eqex.a;
        final eqgl g = eqdl.g(h, eqdvVar, eqexVar);
        return eqgc.b(g).b(new eqdu() { // from class: ddnt
            @Override // defpackage.eqdu
            public final eqgl a() {
                odlhJniLoader.b();
                PulpInferenceService pulpInferenceService = PulpInferenceService.this;
                eqgl eqglVar = g;
                if (!fuqy.d()) {
                    return eqgc.i(0);
                }
                try {
                    eqgc.r(eqglVar);
                    return eqdl.f(pulpInferenceService.f().e("PulpInference", false), new ekut() { // from class: ddny
                        @Override // defpackage.ekut
                        public final Object apply(Object obj) {
                            ausn ausnVar = PulpInferenceService.a;
                            return 0;
                        }
                    }, eqex.a);
                } catch (ExecutionException unused) {
                    return eqdl.f(pulpInferenceService.f().g("PulpInference", fgvq.h(System.currentTimeMillis())), new ekut() { // from class: ddnx
                        @Override // defpackage.ekut
                        public final Object apply(Object obj) {
                            ausn ausnVar = PulpInferenceService.a;
                            return 2;
                        }
                    }, eqex.a);
                }
            }
        }, eqexVar);
    }
}
