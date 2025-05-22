package com.google.android.gms.semanticlocationhistory.db;

import android.accounts.Account;
import android.content.Context;
import android.os.Process;
import com.google.android.gms.chimera.modules.semanticlocationhistory.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.atwh;
import defpackage.auid;
import defpackage.ausn;
import defpackage.caha;
import defpackage.cauf;
import defpackage.cbot;
import defpackage.dbsv;
import defpackage.dbtc;
import defpackage.dbvg;
import defpackage.dcep;
import defpackage.dcer;
import defpackage.dcnm;
import defpackage.dcnp;
import defpackage.dcqi;
import defpackage.ddov;
import defpackage.ddow;
import defpackage.eluo;
import defpackage.eqgc;
import defpackage.eqgl;
import defpackage.etry;
import defpackage.etrz;
import defpackage.fbjh;
import defpackage.fbji;
import defpackage.fgqp;
import defpackage.fgrc;
import defpackage.fush;
import defpackage.fusk;
import defpackage.futs;
import defpackage.fwtb;
import defpackage.fwtc;
import defpackage.fwuc;
import defpackage.fxnl;
import defpackage.fxnm;
import defpackage.wjw;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class OdlhUserEditSyncJob extends GmsTaskBoundService {
    private dcnm c;
    private dcqi d;
    private ddov e;
    private dbvg f;
    private dbtc g;
    private static final ausn b = ausn.c("LocationHistory", auid.SEMANTIC_LOCATION_HISTORY, "OdlhUserEditSync");
    public static final String a = OdlhUserEditSyncJob.class.getName();

    public static boolean d() {
        return fush.Q() && futs.a.lK().a();
    }

    private final dbvg e() {
        if (this.f == null) {
            if (this.g == null) {
                this.g = new dbtc();
            }
            this.f = new dbvg(this.g);
        }
        return this.f;
    }

    private final ddov f(Context context) {
        if (this.e == null) {
            this.e = new ddov(context, context.getApplicationInfo().uid, 38404);
        }
        return this.e;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final eqgl iB(cauf caufVar) {
        dcep c;
        if (!d()) {
            return eqgc.i(0);
        }
        Context a2 = AppContextProvider.a();
        for (Account account : dbsv.d(a2)) {
            try {
                dcer dcerVar = dcer.a;
                if (fusk.g()) {
                    dcer d = e().d(account);
                    if (d.equals(dcerVar)) {
                        throw new IOException("LocationHistorySetting is empty.");
                    }
                    dcerVar = d;
                }
                if (fusk.g()) {
                    c = dcerVar.q;
                    if (c == null) {
                        c = dcep.a;
                    }
                } else {
                    c = e().c(account);
                }
                if (c.e) {
                    String str = account.name;
                } else {
                    ddov f = f(a2);
                    fbjh fbjhVar = fbjh.a;
                    fgrc v = fbjhVar.v();
                    if (!v.b.L()) {
                        v.U();
                    }
                    fbjh fbjhVar2 = (fbjh) v.b;
                    fbjhVar2.b |= 1;
                    fbjhVar2.c = "SEMANTIC_LOCATION_DEVICE";
                    fbjh fbjhVar3 = (fbjh) v.Q();
                    Context a3 = AppContextProvider.a();
                    atwh atwhVar = new atwh();
                    atwhVar.a = Process.myUid();
                    atwhVar.d = a3.getPackageName();
                    atwhVar.e = a3.getPackageName();
                    atwhVar.c = account;
                    atwhVar.b = account;
                    atwhVar.m("https://www.googleapis.com/auth/semanticlocation.readonly");
                    ddow ddowVar = new ddow(f.a, cbot.a, caha.b);
                    long j = ddow.a;
                    if (ddow.b == null) {
                        fwtb fwtbVar = fwtb.UNARY;
                        fgqp fgqpVar = fxnm.a;
                        ddow.b = new fwtc(fwtbVar, "userlocation.SemanticLocationService/GetUserEditInfo", new fxnl(fbjhVar), new fxnl(fbji.a), false);
                    }
                    long j2 = ((fbji) ddowVar.d.f(ddow.b, atwhVar, fbjhVar3, j, TimeUnit.MILLISECONDS, ddowVar.e)).b;
                    if (this.c == null) {
                        this.c = dcnp.w(a2);
                    }
                    this.c.b(account, 0L, TimeUnit.MICROSECONDS.toSeconds(j2));
                    if (this.d == null) {
                        this.d = new dcqi();
                    }
                    this.d.a(0L, TimeUnit.MICROSECONDS.toMillis(j2));
                }
            } catch (fwuc | IOException | wjw e) {
                f(a2).a();
                ((eluo) ((eluo) ((eluo) b.j()).s(e)).ai((char) 10155)).B("Fails to get user edit info with error %s", new etrz(etry.NO_USER_DATA, e.getMessage()));
                return eqgc.i(2);
            }
        }
        f(a2).a();
        return eqgc.i(0);
    }
}
