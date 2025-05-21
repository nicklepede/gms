package com.google.android.gms.semanticlocationhistory.settings;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.aptt;
import defpackage.aptz;
import defpackage.apud;
import defpackage.asej;
import defpackage.asot;
import defpackage.bqzj;
import defpackage.bqzk;
import defpackage.brbp;
import defpackage.brbr;
import defpackage.czje;
import defpackage.czjg;
import defpackage.czlk;
import defpackage.czlp;
import defpackage.dabr;
import defpackage.dade;
import defpackage.dadh;
import defpackage.dahq;
import defpackage.dbhx;
import defpackage.dbhz;
import defpackage.dbnt;
import defpackage.dbnu;
import defpackage.ejhf;
import defpackage.enpf;
import defpackage.erdc;
import defpackage.erdd;
import defpackage.etoh;
import defpackage.etok;
import defpackage.etol;
import defpackage.eylw;
import defpackage.eymg;
import defpackage.eymh;
import defpackage.eymi;
import defpackage.eynb;
import defpackage.eyod;
import defpackage.eysr;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fegt;
import defpackage.frun;
import defpackage.frxn;
import defpackage.frxq;
import defpackage.ftya;
import defpackage.ftye;
import defpackage.unx;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class LocationHistoryActiveProcessingService extends GmsTaskBoundService {
    private dade d;
    private czlk e;
    private czje f;
    private dbhz g;
    private dabr h;
    private czjg j;
    private dahq k;
    private static final asot b = asot.c("LocationHistory", asej.SEMANTIC_LOCATION_HISTORY, "LHA");
    public static final String a = LocationHistoryActiveProcessingService.class.getName();
    private static final aptt c = new aptt(10);

    public static boolean d() {
        return frxn.C() || frxq.i();
    }

    private final czje e() {
        if (this.f == null) {
            this.f = new czje();
        }
        return this.f;
    }

    private final czjg f() {
        if (this.j == null) {
            this.j = czjg.a();
        }
        return this.j;
    }

    private final czlk g() {
        if (this.e == null) {
            this.e = new czlk(e());
        }
        return this.e;
    }

    private final dade h(Context context) {
        if (this.d == null) {
            this.d = dadh.w(context);
        }
        return this.d;
    }

    private final dahq j() {
        if (this.k == null) {
            this.k = new dahq();
        }
        return this.k;
    }

    private final dbhz k() {
        if (this.g == null) {
            this.g = new dbhz();
        }
        return this.g;
    }

    private final dbnt l(Account account, Context context) {
        dbnt a2 = dbnu.a(account, TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) - TimeUnit.HOURS.toSeconds(frxq.d()), 7, h(context), "odlh-device-metadata-upload");
        if (!frxq.o()) {
            dbnt m = m(account, context);
            eymg eymgVar = (eymg) eymi.a.v();
            fecj v = eymh.a.v();
            boolean p = p(a2);
            if (!v.b.L()) {
                v.U();
            }
            eymh eymhVar = (eymh) v.b;
            eymhVar.b |= 1;
            eymhVar.c = p;
            boolean p2 = p(m);
            if (!v.b.L()) {
                v.U();
            }
            eymh eymhVar2 = (eymh) v.b;
            eymhVar2.b |= 2;
            eymhVar2.d = p2;
            eymgVar.a((eymh) v.Q());
            f().d((eymi) eymgVar.Q());
        }
        e().k("LHAComputationSegmentsUsedHistogram", a2.c.intValue());
        aptt apttVar = c;
        long f = fegt.f(a2.b);
        if (!frun.j()) {
            try {
                aptz m2 = czje.a().a.m("LHAComputationTotalVisitDurationHistogram", apttVar);
                m2.a(m2.g.a(f), 1L, apud.b);
                czje.a().a();
                return a2;
            } catch (IllegalArgumentException e) {
                ((ejhf) ((ejhf) czje.a.i()).s(e)).B("Failed to log aliased Long counter %s", "LHAComputationTotalVisitDurationHistogram");
                return a2;
            }
        }
        brbr g = czje.a().b.g("LHAComputationTotalVisitDurationHistogram", czje.b);
        brbp brbpVar = g.f.f;
        fecj v2 = bqzk.a.v();
        String str = g.a;
        if (!v2.b.L()) {
            v2.U();
        }
        fecp fecpVar = v2.b;
        bqzk bqzkVar = (bqzk) fecpVar;
        str.getClass();
        bqzkVar.b |= 1;
        bqzkVar.c = str;
        bqzj bqzjVar = bqzj.COUNTERTYPE_LONG_HISTOGRAM;
        if (!fecpVar.L()) {
            v2.U();
        }
        bqzk bqzkVar2 = (bqzk) v2.b;
        bqzkVar2.d = bqzjVar.g;
        bqzkVar2.b |= 2;
        long a3 = g.b.a(f);
        if (!v2.b.L()) {
            v2.U();
        }
        fecp fecpVar2 = v2.b;
        bqzk bqzkVar3 = (bqzk) fecpVar2;
        bqzkVar3.b |= 16;
        bqzkVar3.g = a3;
        if (!fecpVar2.L()) {
            v2.U();
        }
        bqzk bqzkVar4 = (bqzk) v2.b;
        bqzkVar4.b |= 32;
        bqzkVar4.h = 1L;
        g.a(v2, brbpVar);
        return a2;
    }

    private final dbnt m(Account account, Context context) {
        return dbnu.a(account, TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) - TimeUnit.HOURS.toSeconds(frxq.d()), 1, h(context), "odlh-device-metadata-upload");
    }

    private final etol n(Account account) {
        try {
            etol etolVar = (etol) new dbhx().jv((eysr) ((enpf) czlp.d(this.e, account.name)).v(frxn.n(), TimeUnit.MILLISECONDS));
            fecj fecjVar = (fecj) etolVar.iB(5, null);
            fecjVar.X(etolVar);
            etok etokVar = (etok) fecjVar;
            if (!etokVar.b.L()) {
                etokVar.U();
            }
            etol etolVar2 = (etol) etokVar.b;
            etol etolVar3 = etol.a;
            etolVar2.b &= -2;
            etolVar2.c = 0;
            if (!etokVar.b.L()) {
                etokVar.U();
            }
            etol etolVar4 = (etol) etokVar.b;
            etolVar4.b &= -5;
            etolVar4.f = 0;
            return (etol) etokVar.Q();
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            ((ejhf) ((ejhf) ((ejhf) b.j()).s(e)).ah((char) 10719)).B("Failed to update experiment settings with exception: %s", new erdd(erdc.NO_USER_DATA, e.getMessage()));
            return null;
        }
    }

    private final void o(etoh etohVar, boolean z) {
        fecj v = eynb.a.v();
        if (!v.b.L()) {
            v.U();
        }
        int i = true != z ? 3 : 2;
        fecp fecpVar = v.b;
        eynb eynbVar = (eynb) fecpVar;
        eynbVar.c = i - 1;
        eynbVar.b |= 1;
        boolean z2 = (etohVar.b & 2) != 0;
        if (!fecpVar.L()) {
            v.U();
        }
        fecp fecpVar2 = v.b;
        eynb eynbVar2 = (eynb) fecpVar2;
        eynbVar2.b |= 2;
        eynbVar2.d = z2;
        int i2 = etohVar.b & 1;
        if (!fecpVar2.L()) {
            v.U();
        }
        boolean z3 = 1 == i2;
        eynb eynbVar3 = (eynb) v.b;
        eynbVar3.b |= 4;
        eynbVar3.e = z3;
        eynb eynbVar4 = (eynb) v.Q();
        czjg f = f();
        fecj v2 = eyod.a.v();
        fecj v3 = eylw.a.v();
        if (!v3.b.L()) {
            v3.U();
        }
        eylw eylwVar = (eylw) v3.b;
        eynbVar4.getClass();
        eylwVar.c = eynbVar4;
        eylwVar.b = 2;
        if (!v2.b.L()) {
            v2.U();
        }
        eyod eyodVar = (eyod) v2.b;
        eylw eylwVar2 = (eylw) v3.Q();
        eylwVar2.getClass();
        eyodVar.c = eylwVar2;
        eyodVar.b = 13;
        f.j(v2);
    }

    private static boolean p(dbnt dbntVar) {
        return frxq.a.a().Q() ? dbntVar.a() : dbntVar.a;
    }

    private final boolean q(Account account, etoh etohVar, etol etolVar, Boolean bool) {
        try {
            return k().k(account, etohVar, etolVar, bool);
        } catch (ftye e) {
            if (e.a.t == ftya.NOT_FOUND) {
                return false;
            }
            throw e;
        } catch (unx unused) {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x02b5, code lost:
    
        if (r3.d.isEmpty() == false) goto L116;
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02c9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x031c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0381 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x035e  */
    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.enss im(defpackage.byln r22) {
        /*
            Method dump skipped, instructions count: 1127
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.semanticlocationhistory.settings.LocationHistoryActiveProcessingService.im(byln):enss");
    }
}
