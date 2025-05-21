package com.google.android.gms.semanticlocationhistory.db;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.asej;
import defpackage.asot;
import defpackage.czje;
import defpackage.czjg;
import defpackage.czlk;
import defpackage.czuq;
import defpackage.dade;
import defpackage.dadh;
import defpackage.daga;
import defpackage.dahq;
import defpackage.dajf;
import defpackage.dbeb;
import defpackage.dbej;
import defpackage.dbhz;
import defpackage.dbmw;
import defpackage.dbmx;
import defpackage.dbnr;
import defpackage.eits;
import defpackage.ejhf;
import defpackage.enpf;
import defpackage.erdc;
import defpackage.erdd;
import defpackage.eymj;
import defpackage.eymk;
import defpackage.eyml;
import defpackage.eyob;
import defpackage.eyoc;
import defpackage.fecj;
import defpackage.frxq;
import defpackage.fryp;
import j$.time.Duration;
import j$.util.DesugarCollections;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class OdlhDatabaseCleanupJob extends GmsTaskBoundService {
    public static final asot a = asot.c("LocationHistory", asej.SEMANTIC_LOCATION_HISTORY, "OdlhDatabaseCleanup");
    public static final String b = OdlhDatabaseCleanupJob.class.getName();
    private czlk c;
    private final czjg d = czjg.a();
    private dade e;
    private dbeb f;
    private daga g;
    private dahq h;
    private dbmx j;
    private czje k;
    private czjg l;
    private dbhz m;
    private dajf n;

    private final eyoc m(Context context, Account account, long j) {
        try {
            int b2 = e().b(account);
            if (b2 == Integer.MAX_VALUE) {
                return eyoc.a;
            }
            eyoc o = f(context).o(account, 0L, j - TimeUnit.DAYS.toSeconds(b2));
            if (o.d != -1) {
                d().p("CleanupJobNumSegmentsDeletedAutodelete", dbnr.b(o.d, 262144L));
                fecj v = eymk.a.v();
                if (!v.b.L()) {
                    v.U();
                }
                eymk eymkVar = (eymk) v.b;
                eymkVar.b = 134217728 | eymkVar.b;
                eymkVar.E = false;
                p((eymk) v.Q());
            } else {
                d().e("CleanupJobAutodeleteDeleteFail");
                fecj v2 = eymk.a.v();
                if (!v2.b.L()) {
                    v2.U();
                }
                eymk eymkVar2 = (eymk) v2.b;
                eymkVar2.b = 134217728 | eymkVar2.b;
                eymkVar2.E = true;
                p((eymk) v2.Q());
            }
            fecj fecjVar = (fecj) o.iB(5, null);
            fecjVar.X(o);
            eyob eyobVar = (eyob) fecjVar;
            if (!eyobVar.b.L()) {
                eyobVar.U();
            }
            eyoc eyocVar = (eyoc) eyobVar.b;
            eyocVar.c = 1;
            eyocVar.b |= 1;
            return (eyoc) eyobVar.Q();
        } catch (IllegalStateException e) {
            ((ejhf) ((ejhf) ((ejhf) a.j()).s(e)).ah((char) 10110)).B("Failed to read user retention window with error: %s.\nSkipping sqlite cleanup.", new erdd(erdc.NO_USER_DATA, e.getMessage()));
            eyob eyobVar2 = (eyob) eyoc.a.v();
            if (!eyobVar2.b.L()) {
                eyobVar2.U();
            }
            eyoc eyocVar2 = (eyoc) eyobVar2.b;
            eyocVar2.b |= 2;
            eyocVar2.d = -1;
            if (!eyobVar2.b.L()) {
                eyobVar2.U();
            }
            eyoc eyocVar3 = (eyoc) eyobVar2.b;
            eyocVar3.c = 1;
            eyocVar3.b |= 1;
            return (eyoc) eyobVar2.Q();
        }
    }

    private final eyoc n(Context context, Account account, long j) {
        long longValue;
        if (!r(account)) {
            return eyoc.a;
        }
        try {
            if (frxq.h()) {
                longValue = e().d(account).o;
            } else {
                longValue = ((Long) ((enpf) e().l(account)).v(10L, TimeUnit.MILLISECONDS)).longValue();
            }
            eyoc o = f(context).o(account, Duration.ofMillis(longValue).toSeconds(), j);
            if (o.d != -1) {
                d().p("CleanupJobNumSegmentsDeletedLhOff", dbnr.b(o.d, 262144L));
            } else {
                d().e("CleanupJobLhOffDeleteFail");
            }
            fecj fecjVar = (fecj) o.iB(5, null);
            fecjVar.X(o);
            eyob eyobVar = (eyob) fecjVar;
            if (!eyobVar.b.L()) {
                eyobVar.U();
            }
            eyoc eyocVar = (eyoc) eyobVar.b;
            eyocVar.c = 2;
            eyocVar.b |= 1;
            return (eyoc) eyobVar.Q();
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            ((ejhf) ((ejhf) a.j()).ah((char) 10114)).x("Failed to get last location history update time");
            eyob eyobVar2 = (eyob) eyoc.a.v();
            if (!eyobVar2.b.L()) {
                eyobVar2.U();
            }
            eyoc eyocVar2 = (eyoc) eyobVar2.b;
            eyocVar2.b |= 2;
            eyocVar2.d = -1;
            if (!eyobVar2.b.L()) {
                eyobVar2.U();
            }
            eyoc eyocVar3 = (eyoc) eyobVar2.b;
            eyocVar3.c = 2;
            eyocVar3.b |= 1;
            return (eyoc) eyobVar2.Q();
        }
    }

    private final eyoc o(Context context, Account account, long j) {
        long longValue;
        if (!e().O(account)) {
            return eyoc.a;
        }
        try {
            if (frxq.h()) {
                longValue = e().d(account).k;
            } else {
                longValue = ((Long) ((enpf) e().m(account)).v(10L, TimeUnit.MILLISECONDS)).longValue();
            }
            eyoc o = f(context).o(account, Duration.ofMillis(longValue).toSeconds(), j);
            fecj fecjVar = (fecj) o.iB(5, null);
            fecjVar.X(o);
            eyob eyobVar = (eyob) fecjVar;
            if (!eyobVar.b.L()) {
                eyobVar.U();
            }
            eyoc eyocVar = (eyoc) eyobVar.b;
            eyoc eyocVar2 = eyoc.a;
            eyocVar.c = 3;
            eyocVar.b |= 1;
            return (eyoc) eyobVar.Q();
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            ((ejhf) ((ejhf) a.j()).ah((char) 10123)).x("Failed to get last location history update time");
            eyob eyobVar2 = (eyob) eyoc.a.v();
            if (!eyobVar2.b.L()) {
                eyobVar2.U();
            }
            eyoc eyocVar3 = (eyoc) eyobVar2.b;
            eyocVar3.b |= 2;
            eyocVar3.d = -1;
            if (!eyobVar2.b.L()) {
                eyobVar2.U();
            }
            eyoc eyocVar4 = (eyoc) eyobVar2.b;
            eyocVar4.c = 3;
            eyocVar4.b |= 1;
            return (eyoc) eyobVar2.Q();
        }
    }

    private final void p(eymk eymkVar) {
        eymj eymjVar = (eymj) eyml.a.v();
        eymjVar.a(eymkVar);
        this.d.e((eyml) eymjVar.Q());
    }

    private final boolean q(Context context, Account account, String str) {
        int a2 = f(context).a(account, str);
        if (a2 != -1) {
            d().f("CleanupJobPppSegmentsDeleted", a2);
            fecj v = eymk.a.v();
            if (!v.b.L()) {
                v.U();
            }
            eymk eymkVar = (eymk) v.b;
            eymkVar.c |= 16;
            eymkVar.N = false;
            p((eymk) v.Q());
            return true;
        }
        d().e("CleanupJobPppSegmentDeleteFail");
        fecj v2 = eymk.a.v();
        if (!v2.b.L()) {
            v2.U();
        }
        eymk eymkVar2 = (eymk) v2.b;
        eymkVar2.c |= 16;
        eymkVar2.N = true;
        p((eymk) v2.Q());
        return false;
    }

    private final boolean r(Account account) {
        eits k = frxq.h() ? eits.k(DesugarCollections.unmodifiableMap(e().g().c)) : e().h();
        if (k.isEmpty()) {
            return false;
        }
        return (k.containsKey(account.name) && e().N((czuq) k.get(account.name))) ? false : true;
    }

    public final czje d() {
        if (this.k == null) {
            this.k = new czje();
        }
        return this.k;
    }

    public final czlk e() {
        if (this.c == null) {
            this.c = new czlk(d());
        }
        return this.c;
    }

    public final dade f(Context context) {
        if (this.e == null) {
            this.e = dadh.w(context);
        }
        return this.e;
    }

    public final daga g() {
        if (this.g == null) {
            this.g = new daga();
        }
        return this.g;
    }

    public final dahq h() {
        if (this.h == null) {
            this.h = new dahq();
        }
        return this.h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:171:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0640 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02d0  */
    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.enss im(defpackage.byln r36) {
        /*
            Method dump skipped, instructions count: 2640
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.semanticlocationhistory.db.OdlhDatabaseCleanupJob.im(byln):enss");
    }

    public final dbeb j() {
        if (this.f == null) {
            this.f = new dbej();
        }
        return this.f;
    }

    public final dbmx k() {
        if (this.j == null) {
            this.j = new dbmw(e());
        }
        return this.j;
    }

    public final void l(long j) {
        if (!fryp.a.a().r()) {
            d().k("TransientDataCacheAgeHours", (int) dbnr.a(-2L, 60L, 2L, j));
        } else if (e().S()) {
            d().k("TransientDataCacheAgeHours", (int) dbnr.a(-2L, 60L, 2L, j));
        }
    }
}
