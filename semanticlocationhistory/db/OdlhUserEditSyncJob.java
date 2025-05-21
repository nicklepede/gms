package com.google.android.gms.semanticlocationhistory.db;

import android.accounts.Account;
import android.content.Context;
import android.os.Process;
import com.google.android.gms.chimera.modules.semanticlocationhistory.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.arts;
import defpackage.asej;
import defpackage.asot;
import defpackage.bxyi;
import defpackage.byln;
import defpackage.bzgc;
import defpackage.czix;
import defpackage.czje;
import defpackage.czlk;
import defpackage.czuo;
import defpackage.czuq;
import defpackage.dade;
import defpackage.dadh;
import defpackage.daga;
import defpackage.dben;
import defpackage.dbeo;
import defpackage.ejhf;
import defpackage.ensj;
import defpackage.enss;
import defpackage.erdc;
import defpackage.erdd;
import defpackage.eyut;
import defpackage.eyuu;
import defpackage.febw;
import defpackage.fecj;
import defpackage.frxn;
import defpackage.frxq;
import defpackage.fryy;
import defpackage.ftxd;
import defpackage.ftxe;
import defpackage.ftye;
import defpackage.furn;
import defpackage.furo;
import defpackage.unx;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class OdlhUserEditSyncJob extends GmsTaskBoundService {
    private dade c;
    private daga d;
    private dben e;
    private czlk f;
    private czje g;
    private static final asot b = asot.c("LocationHistory", asej.SEMANTIC_LOCATION_HISTORY, "OdlhUserEditSync");
    public static final String a = OdlhUserEditSyncJob.class.getName();

    public static boolean d() {
        return frxn.Q() && fryy.a.a().a();
    }

    private final czlk e() {
        if (this.f == null) {
            if (this.g == null) {
                this.g = new czje();
            }
            this.f = new czlk(this.g);
        }
        return this.f;
    }

    private final dben f(Context context) {
        if (this.e == null) {
            this.e = new dben(context, context.getApplicationInfo().uid, 38404);
        }
        return this.e;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final enss im(byln bylnVar) {
        czuo c;
        if (!d()) {
            return ensj.i(0);
        }
        Context a2 = AppContextProvider.a();
        for (Account account : czix.d(a2)) {
            try {
                czuq czuqVar = czuq.a;
                if (frxq.h()) {
                    czuqVar = e().d(account);
                    if (czuqVar.equals(czuq.a)) {
                        throw new IOException("LocationHistorySetting is empty.");
                    }
                }
                if (frxq.h()) {
                    c = czuqVar.q;
                    if (c == null) {
                        c = czuo.a;
                    }
                } else {
                    c = e().c(account);
                }
                if (c.e) {
                    String str = account.name;
                } else {
                    dben f = f(a2);
                    eyut eyutVar = eyut.a;
                    fecj v = eyutVar.v();
                    if (!v.b.L()) {
                        v.U();
                    }
                    eyut eyutVar2 = (eyut) v.b;
                    eyutVar2.b |= 1;
                    eyutVar2.c = "SEMANTIC_LOCATION_DEVICE";
                    eyut eyutVar3 = (eyut) v.Q();
                    Context a3 = AppContextProvider.a();
                    arts artsVar = new arts();
                    artsVar.a = Process.myUid();
                    artsVar.d = a3.getPackageName();
                    artsVar.e = a3.getPackageName();
                    artsVar.c = account;
                    artsVar.b = account;
                    artsVar.m("https://www.googleapis.com/auth/semanticlocation.readonly");
                    dbeo dbeoVar = new dbeo(f.a, bzgc.a, bxyi.b);
                    long j = dbeo.a;
                    if (dbeo.b == null) {
                        ftxd ftxdVar = ftxd.UNARY;
                        febw febwVar = furo.a;
                        dbeo.b = new ftxe(ftxdVar, "userlocation.SemanticLocationService/GetUserEditInfo", new furn(eyutVar), new furn(eyuu.a), false);
                    }
                    long j2 = ((eyuu) dbeoVar.d.f(dbeo.b, artsVar, eyutVar3, j, TimeUnit.MILLISECONDS, dbeoVar.e)).b;
                    if (this.c == null) {
                        this.c = dadh.w(a2);
                    }
                    this.c.b(account, 0L, TimeUnit.MICROSECONDS.toSeconds(j2));
                    if (this.d == null) {
                        this.d = new daga();
                    }
                    this.d.a(0L, TimeUnit.MICROSECONDS.toMillis(j2));
                }
            } catch (ftye | IOException | unx e) {
                f(a2).a();
                ((ejhf) ((ejhf) ((ejhf) b.j()).s(e)).ah((char) 10149)).B("Fails to get user edit info with error %s", new erdd(erdc.NO_USER_DATA, e.getMessage()));
                return ensj.i(2);
            }
        }
        f(a2).a();
        return ensj.i(0);
    }
}
