package com.google.android.gms.semanticlocationhistory.db;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.auid;
import defpackage.ausn;
import defpackage.dbtc;
import defpackage.dbte;
import defpackage.dbvg;
import defpackage.dcer;
import defpackage.dcnm;
import defpackage.dcnp;
import defpackage.dcqi;
import defpackage.dcry;
import defpackage.dctn;
import defpackage.ddoj;
import defpackage.ddor;
import defpackage.ddsf;
import defpackage.ddxc;
import defpackage.ddxd;
import defpackage.ddxx;
import defpackage.elgx;
import defpackage.eluo;
import defpackage.eqcy;
import defpackage.etry;
import defpackage.etrz;
import defpackage.fbav;
import defpackage.fbax;
import defpackage.fbay;
import defpackage.fbaz;
import defpackage.fbcp;
import defpackage.fbcq;
import defpackage.fgrc;
import defpackage.fusk;
import defpackage.futj;
import j$.time.Duration;
import j$.util.DesugarCollections;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class OdlhDatabaseCleanupJob extends GmsTaskBoundService {
    public static final ausn a = ausn.c("LocationHistory", auid.SEMANTIC_LOCATION_HISTORY, "OdlhDatabaseCleanup");
    public static final String b = OdlhDatabaseCleanupJob.class.getName();
    private dbvg c;
    private final dbte d = dbte.a();
    private dcnm e;
    private ddoj f;
    private dcqi g;
    private dcry h;
    private ddxd j;
    private dbtc k;
    private dbte l;
    private ddsf m;
    private dctn n;

    private final fbcq m(Context context, Account account, long j) {
        try {
            int b2 = e().b(account);
            if (b2 == Integer.MAX_VALUE) {
                return fbcq.a;
            }
            fbcq o = f(context).o(account, 0L, j - TimeUnit.DAYS.toSeconds(b2));
            if (o.d != -1) {
                d().p("CleanupJobNumSegmentsDeletedAutodelete", ddxx.b(o.d, 262144L));
                fbax fbaxVar = (fbax) fbay.a.v();
                if (!fbaxVar.b.L()) {
                    fbaxVar.U();
                }
                fbay fbayVar = (fbay) fbaxVar.b;
                fbayVar.b = 134217728 | fbayVar.b;
                fbayVar.E = false;
                p((fbay) fbaxVar.Q());
            } else {
                d().e("CleanupJobAutodeleteDeleteFail");
                fbax fbaxVar2 = (fbax) fbay.a.v();
                if (!fbaxVar2.b.L()) {
                    fbaxVar2.U();
                }
                fbay fbayVar2 = (fbay) fbaxVar2.b;
                fbayVar2.b = 134217728 | fbayVar2.b;
                fbayVar2.E = true;
                p((fbay) fbaxVar2.Q());
            }
            fgrc fgrcVar = (fgrc) o.iQ(5, null);
            fgrcVar.X(o);
            fbcp fbcpVar = (fbcp) fgrcVar;
            if (!fbcpVar.b.L()) {
                fbcpVar.U();
            }
            fbcq fbcqVar = (fbcq) fbcpVar.b;
            fbcqVar.c = 1;
            fbcqVar.b |= 1;
            return (fbcq) fbcpVar.Q();
        } catch (IllegalStateException e) {
            ((eluo) ((eluo) ((eluo) a.j()).s(e)).ai((char) 10115)).B("Failed to read user retention window with error: %s.\nSkipping sqlite cleanup.", new etrz(etry.NO_USER_DATA, e.getMessage()));
            fbcp fbcpVar2 = (fbcp) fbcq.a.v();
            if (!fbcpVar2.b.L()) {
                fbcpVar2.U();
            }
            fbcq fbcqVar2 = (fbcq) fbcpVar2.b;
            fbcqVar2.b |= 2;
            fbcqVar2.d = -1;
            if (!fbcpVar2.b.L()) {
                fbcpVar2.U();
            }
            fbcq fbcqVar3 = (fbcq) fbcpVar2.b;
            fbcqVar3.c = 1;
            fbcqVar3.b |= 1;
            return (fbcq) fbcpVar2.Q();
        }
    }

    private final fbcq n(Context context, Account account, long j) {
        long longValue;
        if (!r(account)) {
            return fbcq.a;
        }
        try {
            if (fusk.g()) {
                longValue = e().d(account).o;
            } else {
                longValue = ((Long) ((eqcy) e().l(account)).v(10L, TimeUnit.MILLISECONDS)).longValue();
            }
            fbcq o = f(context).o(account, Duration.ofMillis(longValue).toSeconds(), j);
            if (o.d != -1) {
                d().p("CleanupJobNumSegmentsDeletedLhOff", ddxx.b(o.d, 262144L));
            } else {
                d().e("CleanupJobLhOffDeleteFail");
            }
            fgrc fgrcVar = (fgrc) o.iQ(5, null);
            fgrcVar.X(o);
            fbcp fbcpVar = (fbcp) fgrcVar;
            if (!fbcpVar.b.L()) {
                fbcpVar.U();
            }
            fbcq fbcqVar = (fbcq) fbcpVar.b;
            fbcqVar.c = 2;
            fbcqVar.b |= 1;
            return (fbcq) fbcpVar.Q();
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            ((eluo) ((eluo) a.j()).ai((char) 10119)).x("Failed to get last location history update time");
            fbcp fbcpVar2 = (fbcp) fbcq.a.v();
            if (!fbcpVar2.b.L()) {
                fbcpVar2.U();
            }
            fbcq fbcqVar2 = (fbcq) fbcpVar2.b;
            fbcqVar2.b |= 2;
            fbcqVar2.d = -1;
            if (!fbcpVar2.b.L()) {
                fbcpVar2.U();
            }
            fbcq fbcqVar3 = (fbcq) fbcpVar2.b;
            fbcqVar3.c = 2;
            fbcqVar3.b |= 1;
            return (fbcq) fbcpVar2.Q();
        }
    }

    private final fbcq o(Context context, Account account, long j) {
        long longValue;
        if (!s(account)) {
            return fbcq.a;
        }
        try {
            if (fusk.g()) {
                longValue = e().d(account).k;
            } else {
                longValue = ((Long) ((eqcy) e().m(account)).v(10L, TimeUnit.MILLISECONDS)).longValue();
            }
            fbcq o = f(context).o(account, Duration.ofMillis(longValue).toSeconds(), j);
            fgrc fgrcVar = (fgrc) o.iQ(5, null);
            fgrcVar.X(o);
            fbcp fbcpVar = (fbcp) fgrcVar;
            if (!fbcpVar.b.L()) {
                fbcpVar.U();
            }
            fbcq fbcqVar = (fbcq) fbcpVar.b;
            fbcq fbcqVar2 = fbcq.a;
            fbcqVar.c = 3;
            fbcqVar.b |= 1;
            return (fbcq) fbcpVar.Q();
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            ((eluo) ((eluo) a.j()).ai((char) 10129)).x("Failed to get last location history update time");
            fbcp fbcpVar2 = (fbcp) fbcq.a.v();
            if (!fbcpVar2.b.L()) {
                fbcpVar2.U();
            }
            fbcq fbcqVar3 = (fbcq) fbcpVar2.b;
            fbcqVar3.b |= 2;
            fbcqVar3.d = -1;
            if (!fbcpVar2.b.L()) {
                fbcpVar2.U();
            }
            fbcq fbcqVar4 = (fbcq) fbcpVar2.b;
            fbcqVar4.c = 3;
            fbcqVar4.b |= 1;
            return (fbcq) fbcpVar2.Q();
        }
    }

    private final void p(fbay fbayVar) {
        fbav fbavVar = (fbav) fbaz.a.v();
        fbavVar.a(fbayVar);
        this.d.e((fbaz) fbavVar.Q());
    }

    private final boolean q(Context context, Account account, String str) {
        int a2 = f(context).a(account, str);
        if (a2 != -1) {
            d().f("CleanupJobPppSegmentsDeleted", a2);
            fbax fbaxVar = (fbax) fbay.a.v();
            if (!fbaxVar.b.L()) {
                fbaxVar.U();
            }
            fbay fbayVar = (fbay) fbaxVar.b;
            fbayVar.c |= 16;
            fbayVar.N = false;
            p((fbay) fbaxVar.Q());
            return true;
        }
        d().e("CleanupJobPppSegmentDeleteFail");
        fbax fbaxVar2 = (fbax) fbay.a.v();
        if (!fbaxVar2.b.L()) {
            fbaxVar2.U();
        }
        fbay fbayVar2 = (fbay) fbaxVar2.b;
        fbayVar2.c |= 16;
        fbayVar2.N = true;
        p((fbay) fbaxVar2.Q());
        return false;
    }

    private final boolean r(Account account) {
        elgx k = fusk.g() ? elgx.k(DesugarCollections.unmodifiableMap(e().g().c)) : e().h();
        if (fusk.a.lK().A()) {
            return k.containsKey(account.name) && !e().N((dcer) k.get(account.name));
        }
        if (k.isEmpty()) {
            return false;
        }
        return (k.containsKey(account.name) && e().N((dcer) k.get(account.name))) ? false : true;
    }

    private final boolean s(Account account) {
        dbvg e = e();
        if (!fusk.a.lK().z() || DesugarCollections.unmodifiableMap(e.g().c).containsKey(account.name)) {
            return e.O(account);
        }
        ((eluo) ((eluo) a.j()).ai((char) 10120)).x("Missing settings for account; not doing hard pause cleanup.");
        return false;
    }

    public final dbtc d() {
        if (this.k == null) {
            this.k = new dbtc();
        }
        return this.k;
    }

    public final dbvg e() {
        if (this.c == null) {
            this.c = new dbvg(d());
        }
        return this.c;
    }

    public final dcnm f(Context context) {
        if (this.e == null) {
            this.e = dcnp.w(context);
        }
        return this.e;
    }

    public final dcqi g() {
        if (this.g == null) {
            this.g = new dcqi();
        }
        return this.g;
    }

    public final dcry h() {
        if (this.h == null) {
            this.h = new dcry();
        }
        return this.h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0644 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0758  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0797  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02d4  */
    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.eqgl iB(defpackage.cauf r36) {
        /*
            Method dump skipped, instructions count: 2736
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.semanticlocationhistory.db.OdlhDatabaseCleanupJob.iB(cauf):eqgl");
    }

    public final ddoj j() {
        if (this.f == null) {
            this.f = new ddor();
        }
        return this.f;
    }

    public final ddxd k() {
        if (this.j == null) {
            this.j = new ddxc(e());
        }
        return this.j;
    }

    public final void l(long j) {
        if (!futj.a.lK().r()) {
            d().k("TransientDataCacheAgeHours", (int) ddxx.a(-2L, 60L, 2L, j));
        } else if (e().S()) {
            d().k("TransientDataCacheAgeHours", (int) ddxx.a(-2L, 60L, 2L, j));
        }
    }
}
