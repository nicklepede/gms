package com.google.android.gms.semanticlocationhistory.migration;

import android.accounts.Account;
import com.google.android.gms.chimera.modules.semanticlocationhistory.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.atwh;
import defpackage.auid;
import defpackage.ausn;
import defpackage.cahl;
import defpackage.cauf;
import defpackage.cbot;
import defpackage.dbsv;
import defpackage.dbtc;
import defpackage.dbvg;
import defpackage.dcep;
import defpackage.ddjl;
import defpackage.ddjx;
import defpackage.ddsf;
import defpackage.ddsg;
import defpackage.eluo;
import defpackage.etry;
import defpackage.etrz;
import defpackage.eweq;
import defpackage.ewer;
import defpackage.ewgh;
import defpackage.ewgp;
import defpackage.fgqp;
import defpackage.fgrc;
import defpackage.fgre;
import defpackage.fusk;
import defpackage.futm;
import defpackage.fwtb;
import defpackage.fwtc;
import defpackage.fwuc;
import defpackage.fwue;
import defpackage.fxnl;
import defpackage.fxnm;
import defpackage.wjw;
import java.io.IOException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class RevisedUserMigrationService extends GmsTaskBoundService {
    private dbvg c;
    private ddjl d;
    private ddsf e;
    private final dbtc f = new dbtc();
    private static final ausn b = ausn.c("LocationHistory", auid.SEMANTIC_LOCATION_HISTORY, "RevisedUserMigration");
    public static final String a = RevisedUserMigrationService.class.getName();

    private final void h(Account account) {
        d().W(account);
        g(12);
    }

    private final boolean j(Account account) {
        g(3);
        ddjl e = e();
        e.a(account);
        boolean z = false;
        for (int i = 0; i < futm.a.lK().a(); i++) {
            ddjx ddjxVar = e.b;
            ddjxVar.j(e.c, account);
            if (ddjx.h(ddjxVar.b(account))) {
                z = true;
            } else {
                ((eluo) ((eluo) ddjl.a.j()).ai((char) 10471)).x("Data transfer failed for account");
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
                this.e = new ddsf();
            }
            ddsf ddsfVar = this.e;
            try {
                try {
                    ewgp ewgpVar = ewgp.a;
                    fgre fgreVar = (fgre) ewgpVar.v();
                    ewgh ewghVar = ewgh.a;
                    fgrc v = ewghVar.v();
                    fgrc v2 = ewer.a.v();
                    if (!v2.b.L()) {
                        v2.U();
                    }
                    ewer ewerVar = (ewer) v2.b;
                    ewerVar.c = 3;
                    ewerVar.b |= 1;
                    ewer ewerVar2 = (ewer) v2.Q();
                    if (!v.b.L()) {
                        v.U();
                    }
                    ewgh ewghVar2 = (ewgh) v.b;
                    ewerVar2.getClass();
                    ewghVar2.g = ewerVar2;
                    ewghVar2.b |= 128;
                    ewgh ewghVar3 = (ewgh) v.Q();
                    if (!fgreVar.b.L()) {
                        fgreVar.U();
                    }
                    ewgp ewgpVar2 = (ewgp) fgreVar.b;
                    ewghVar3.getClass();
                    ewgpVar2.c = ewghVar3;
                    ewgpVar2.b |= 1;
                    ewgp ewgpVar3 = (ewgp) fgreVar.Q();
                    ddsg ddsgVar = new ddsg(ddsfVar.d(), cbot.a, cahl.b);
                    atwh a2 = ddsfVar.a(account);
                    long j = ddsg.a;
                    if (ddsg.b == null) {
                        fwtb fwtbVar = fwtb.UNARY;
                        fgqp fgqpVar = fxnm.a;
                        ddsg.b = new fwtc(fwtbVar, "google.internal.locationhistory.v1.LocationHistoryService/UpdateSettings", new fxnl(ewgpVar), new fxnl(ewghVar), false);
                    }
                    ddsfVar.g("LHServerUpdateMigrationState");
                    ddsfVar.i();
                    g(16);
                    h(account);
                    return true;
                } catch (fwuc | fwue | wjw e2) {
                    ddsfVar.f(e2, "UpdateSettings");
                    ddsfVar.h(e2, "LHServerUpdateMigrationState");
                    ddsfVar.i();
                    ((eluo) ((eluo) b.j()).ai((char) 10476)).x("Marking migration complete failed on server");
                }
            } catch (Throwable th) {
                ddsfVar.i();
                throw th;
            }
        } else {
            ((eluo) ((eluo) b.j()).ai((char) 10496)).x("Data transfer failed");
        }
        g(13);
        return false;
    }

    private final boolean k(Account account, dcep dcepVar) {
        return dcepVar.f.equals(fusk.g() ? d().d(account).g : d().z(account));
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        dcep c;
        g(2);
        for (Account account : dbsv.d(AppContextProvider.a())) {
            try {
                if (fusk.g()) {
                    c = d().d(account).q;
                    if (c == null) {
                        c = dcep.a;
                    }
                } else {
                    c = d().c(account);
                }
                int i = 1;
                if (!c.e) {
                    int a2 = eweq.a(c.c);
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
                                    ((eluo) ((eluo) b.j()).ai(10485)).x("Data transfer failed on primary device.");
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
                            ddjl e = e();
                            e.a(account);
                            ddjx ddjxVar = e.b;
                            ddjxVar.i(e.c, account);
                            if (ddjx.h(ddjxVar.b(account))) {
                                g(17);
                                h(account);
                                break;
                            } else {
                                g(10);
                                ausn ausnVar = b;
                                ((eluo) ((eluo) ausnVar.j()).ai((char) 10473)).x("Alpha data deletion failed");
                                ((eluo) ((eluo) ausnVar.j()).ai(10492)).x("Starting ODLH from scratch failed on account with terminal migration state but migration state on device not complete.");
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
                                    ((eluo) ((eluo) b.j()).ai(10490)).x("Data transfer failed on account which declined transfer on primary device.");
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
                                ((eluo) ((eluo) b.j()).ai(10487)).x("Data transfer failed on account which took no action.");
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
                ((eluo) ((eluo) ((eluo) b.j()).s(e2)).ai((char) 10480)).B("Exception in user migration: %s", new etrz(etry.NO_USER_DATA, e2.getMessage()));
            }
        }
        return 0;
    }

    final dbvg d() {
        if (this.c == null) {
            this.c = new dbvg(new dbtc());
        }
        return this.c;
    }

    final ddjl e() {
        if (this.d == null) {
            this.d = new ddjl();
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
