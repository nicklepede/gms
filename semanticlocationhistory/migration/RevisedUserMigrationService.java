package com.google.android.gms.semanticlocationhistory.migration;

import android.accounts.Account;
import com.google.android.gms.chimera.modules.semanticlocationhistory.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.arts;
import defpackage.asej;
import defpackage.asot;
import defpackage.bxyt;
import defpackage.byln;
import defpackage.bzgc;
import defpackage.czix;
import defpackage.czje;
import defpackage.czlk;
import defpackage.czuo;
import defpackage.dazd;
import defpackage.dazp;
import defpackage.dbhz;
import defpackage.dbia;
import defpackage.ejhf;
import defpackage.erdc;
import defpackage.erdd;
import defpackage.etoy;
import defpackage.etoz;
import defpackage.etqp;
import defpackage.etqx;
import defpackage.febw;
import defpackage.fecj;
import defpackage.fecl;
import defpackage.frxq;
import defpackage.frys;
import defpackage.ftxd;
import defpackage.ftxe;
import defpackage.ftye;
import defpackage.ftyg;
import defpackage.furn;
import defpackage.furo;
import defpackage.unx;
import java.io.IOException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class RevisedUserMigrationService extends GmsTaskBoundService {
    private czlk c;
    private dazd d;
    private dbhz e;
    private final czje f = new czje();
    private static final asot b = asot.c("LocationHistory", asej.SEMANTIC_LOCATION_HISTORY, "RevisedUserMigration");
    public static final String a = RevisedUserMigrationService.class.getName();

    private final void h(Account account) {
        d().W(account);
        g(12);
    }

    private final boolean j(Account account) {
        g(3);
        dazd e = e();
        e.a(account);
        boolean z = false;
        for (int i = 0; i < frys.a.a().a(); i++) {
            dazp dazpVar = e.b;
            dazpVar.i(e.c, account);
            if (dazp.g(dazpVar.b(account))) {
                z = true;
            } else {
                ((ejhf) ((ejhf) dazd.a.j()).ah((char) 10465)).x("Data transfer failed for account");
                z = false;
            }
            if (z) {
                break;
            }
        }
        if (!z) {
            e.b.d(account);
        }
        e.b.c(e.c, account);
        if (z) {
            g(7);
            if (this.e == null) {
                this.e = new dbhz();
            }
            dbhz dbhzVar = this.e;
            try {
                try {
                    etqx etqxVar = etqx.a;
                    fecl feclVar = (fecl) etqxVar.v();
                    etqp etqpVar = etqp.a;
                    fecj v = etqpVar.v();
                    fecj v2 = etoz.a.v();
                    if (!v2.b.L()) {
                        v2.U();
                    }
                    etoz etozVar = (etoz) v2.b;
                    etozVar.c = 3;
                    etozVar.b |= 1;
                    etoz etozVar2 = (etoz) v2.Q();
                    if (!v.b.L()) {
                        v.U();
                    }
                    etqp etqpVar2 = (etqp) v.b;
                    etozVar2.getClass();
                    etqpVar2.g = etozVar2;
                    etqpVar2.b |= 128;
                    etqp etqpVar3 = (etqp) v.Q();
                    if (!feclVar.b.L()) {
                        feclVar.U();
                    }
                    etqx etqxVar2 = (etqx) feclVar.b;
                    etqpVar3.getClass();
                    etqxVar2.c = etqpVar3;
                    etqxVar2.b |= 1;
                    etqx etqxVar3 = (etqx) feclVar.Q();
                    dbia dbiaVar = new dbia(dbhzVar.d(), bzgc.a, bxyt.b);
                    arts a2 = dbhzVar.a(account);
                    long j = dbia.a;
                    if (dbia.b == null) {
                        ftxd ftxdVar = ftxd.UNARY;
                        febw febwVar = furo.a;
                        dbia.b = new ftxe(ftxdVar, "google.internal.locationhistory.v1.LocationHistoryService/UpdateSettings", new furn(etqxVar), new furn(etqpVar), false);
                    }
                    dbhzVar.g("LHServerUpdateMigrationState");
                    dbhzVar.i();
                    g(16);
                    h(account);
                    return true;
                } catch (ftye | ftyg | unx e2) {
                    dbhzVar.f(e2, "UpdateSettings");
                    dbhzVar.h(e2, "LHServerUpdateMigrationState");
                    dbhzVar.i();
                    ((ejhf) ((ejhf) b.j()).ah((char) 10470)).x("Marking migration complete failed on server");
                }
            } catch (Throwable th) {
                dbhzVar.i();
                throw th;
            }
        } else {
            ((ejhf) ((ejhf) b.j()).ah((char) 10490)).x("Data transfer failed");
        }
        g(13);
        return false;
    }

    private final boolean k(Account account, czuo czuoVar) {
        return czuoVar.f.equals(frxq.h() ? d().d(account).g : d().z(account));
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        czuo c;
        g(2);
        for (Account account : czix.d(AppContextProvider.a())) {
            try {
                if (frxq.h()) {
                    c = d().d(account).q;
                    if (c == null) {
                        c = czuo.a;
                    }
                } else {
                    c = d().c(account);
                }
                int i = 1;
                if (!c.e) {
                    int a2 = etoy.a(c.c);
                    if (a2 != 0) {
                        i = a2;
                    }
                    switch (i - 1) {
                        case 0:
                            f(2);
                            break;
                        case 1:
                            f(3);
                            break;
                        case 2:
                        case 7:
                            if (k(account, c)) {
                                f(4);
                                if (j(account)) {
                                    break;
                                } else {
                                    ((ejhf) ((ejhf) b.j()).ah(10479)).x("Data transfer failed on primary device.");
                                    break;
                                }
                            } else {
                                f(5);
                                break;
                            }
                        case 3:
                        case 6:
                        case 8:
                            f(9);
                            g(9);
                            dazd e = e();
                            e.a(account);
                            dazp dazpVar = e.b;
                            dazpVar.h(e.c, account);
                            if (dazp.g(dazpVar.b(account))) {
                                g(17);
                                h(account);
                                break;
                            } else {
                                g(10);
                                asot asotVar = b;
                                ((ejhf) ((ejhf) asotVar.j()).ah((char) 10467)).x("Alpha data deletion failed");
                                ((ejhf) ((ejhf) asotVar.j()).ah(10486)).x("Starting ODLH from scratch failed on account with terminal migration state but migration state on device not complete.");
                                break;
                            }
                        case 4:
                        default:
                            f(10);
                            h(account);
                            break;
                        case 5:
                            if (k(account, c)) {
                                f(7);
                                if (j(account)) {
                                    break;
                                } else {
                                    ((ejhf) ((ejhf) b.j()).ah(10484)).x("Data transfer failed on account which declined transfer on primary device.");
                                    break;
                                }
                            } else {
                                f(8);
                                break;
                            }
                        case 9:
                            f(6);
                            if (j(account)) {
                                break;
                            } else {
                                ((ejhf) ((ejhf) b.j()).ah(10481)).x("Data transfer failed on account which took no action.");
                                break;
                            }
                        case 10:
                            f(11);
                            break;
                    }
                } else {
                    f(1);
                    String str = account.name;
                }
            } catch (IOException e2) {
                g(15);
                ((ejhf) ((ejhf) ((ejhf) b.j()).s(e2)).ah((char) 10474)).B("Exception in user migration: %s", new erdd(erdc.NO_USER_DATA, e2.getMessage()));
            }
        }
        return 0;
    }

    final czlk d() {
        if (this.c == null) {
            this.c = new czlk(new czje());
        }
        return this.c;
    }

    final dazd e() {
        if (this.d == null) {
            this.d = new dazd();
        }
        return this.d;
    }

    final void f(int i) {
        this.f.k("OdlhMigrationAccountStatus", i);
    }

    final void g(int i) {
        this.f.k("OdlhMigration", i);
    }
}
