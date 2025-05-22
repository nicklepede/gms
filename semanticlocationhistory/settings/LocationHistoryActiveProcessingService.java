package com.google.android.gms.semanticlocationhistory.settings;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.arwk;
import defpackage.arwq;
import defpackage.arwu;
import defpackage.auid;
import defpackage.ausn;
import defpackage.btha;
import defpackage.bthb;
import defpackage.btjg;
import defpackage.btji;
import defpackage.cahk;
import defpackage.cbot;
import defpackage.dbtc;
import defpackage.dbte;
import defpackage.dbvg;
import defpackage.dbvl;
import defpackage.dclz;
import defpackage.dcnm;
import defpackage.dcnp;
import defpackage.dcry;
import defpackage.ddsd;
import defpackage.ddsf;
import defpackage.ddsg;
import defpackage.ddxz;
import defpackage.ddya;
import defpackage.eluo;
import defpackage.eqcy;
import defpackage.etry;
import defpackage.etrz;
import defpackage.ewdz;
import defpackage.ewea;
import defpackage.eweb;
import defpackage.ewec;
import defpackage.ewed;
import defpackage.ewgn;
import defpackage.fbas;
import defpackage.fbat;
import defpackage.fbau;
import defpackage.fbhf;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fgvm;
import defpackage.fuph;
import defpackage.fush;
import defpackage.fusk;
import defpackage.fwty;
import defpackage.fwuc;
import defpackage.fwue;
import defpackage.wjw;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class LocationHistoryActiveProcessingService extends GmsTaskBoundService {
    private dcnm d;
    private dbvg e;
    private dbtc f;
    private ddsf g;
    private dclz h;
    private dbte j;
    private dcry k;
    private static final ausn b = ausn.c("LocationHistory", auid.SEMANTIC_LOCATION_HISTORY, "LHA");
    public static final String a = LocationHistoryActiveProcessingService.class.getName();
    private static final arwk c = new arwk(10);

    public static boolean d() {
        return fush.C() || fusk.h();
    }

    private final dbtc e() {
        if (this.f == null) {
            this.f = new dbtc();
        }
        return this.f;
    }

    private final dbte f() {
        if (this.j == null) {
            this.j = dbte.a();
        }
        return this.j;
    }

    private final dbvg g() {
        if (this.e == null) {
            this.e = new dbvg(e());
        }
        return this.e;
    }

    private final dcnm h(Context context) {
        if (this.d == null) {
            this.d = dcnp.w(context);
        }
        return this.d;
    }

    private final dcry j() {
        if (this.k == null) {
            this.k = new dcry();
        }
        return this.k;
    }

    private final ddsf k() {
        if (this.g == null) {
            this.g = new ddsf();
        }
        return this.g;
    }

    private final ddxz l(Account account, Context context) {
        ddxz a2 = ddya.a(account, TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) - TimeUnit.HOURS.toSeconds(fusk.c()), 7, h(context), "odlh-device-metadata-upload");
        if (!fusk.m()) {
            ddxz m = m(account, context);
            fbas fbasVar = (fbas) fbau.a.v();
            fgrc v = fbat.a.v();
            boolean o = o(a2);
            if (!v.b.L()) {
                v.U();
            }
            fbat fbatVar = (fbat) v.b;
            fbatVar.b |= 1;
            fbatVar.c = o;
            boolean o2 = o(m);
            if (!v.b.L()) {
                v.U();
            }
            fbat fbatVar2 = (fbat) v.b;
            fbatVar2.b |= 2;
            fbatVar2.d = o2;
            fbasVar.a((fbat) v.Q());
            f().d((fbau) fbasVar.Q());
        }
        e().k("LHAComputationSegmentsUsedHistogram", a2.c.intValue());
        arwk arwkVar = c;
        long f = fgvm.f(a2.b);
        if (!fuph.i()) {
            try {
                arwq m2 = dbtc.a().a.m("LHAComputationTotalVisitDurationHistogram", arwkVar);
                m2.a(m2.g.a(f), 1L, arwu.b);
                dbtc.a().a();
                return a2;
            } catch (IllegalArgumentException e) {
                ((eluo) ((eluo) dbtc.a.i()).s(e)).B("Failed to log aliased Long counter %s", "LHAComputationTotalVisitDurationHistogram");
                return a2;
            }
        }
        btji g = dbtc.a().b.g("LHAComputationTotalVisitDurationHistogram", dbtc.b);
        btjg btjgVar = g.f.f;
        fgrc v2 = bthb.a.v();
        String str = g.a;
        if (!v2.b.L()) {
            v2.U();
        }
        fgri fgriVar = v2.b;
        bthb bthbVar = (bthb) fgriVar;
        str.getClass();
        bthbVar.b |= 1;
        bthbVar.c = str;
        btha bthaVar = btha.COUNTERTYPE_LONG_HISTOGRAM;
        if (!fgriVar.L()) {
            v2.U();
        }
        bthb bthbVar2 = (bthb) v2.b;
        bthbVar2.d = bthaVar.g;
        bthbVar2.b |= 2;
        long a3 = g.b.a(f);
        if (!v2.b.L()) {
            v2.U();
        }
        fgri fgriVar2 = v2.b;
        bthb bthbVar3 = (bthb) fgriVar2;
        bthbVar3.b |= 16;
        bthbVar3.g = a3;
        if (!fgriVar2.L()) {
            v2.U();
        }
        bthb bthbVar4 = (bthb) v2.b;
        bthbVar4.b |= 32;
        bthbVar4.h = 1L;
        g.a(v2, btjgVar);
        return a2;
    }

    private final ddxz m(Account account, Context context) {
        return ddya.a(account, TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) - TimeUnit.HOURS.toSeconds(fusk.c()), 1, h(context), "odlh-device-metadata-upload");
    }

    private final ewed n(Account account) {
        try {
            ewed ewedVar = (ewed) new ddsd().jL((fbhf) ((eqcy) dbvl.d(this.e, account.name)).v(fush.n(), TimeUnit.MILLISECONDS));
            fgrc fgrcVar = (fgrc) ewedVar.iQ(5, null);
            fgrcVar.X(ewedVar);
            ewec ewecVar = (ewec) fgrcVar;
            if (!ewecVar.b.L()) {
                ewecVar.U();
            }
            ewed ewedVar2 = (ewed) ewecVar.b;
            ewed ewedVar3 = ewed.a;
            ewedVar2.b &= -2;
            ewedVar2.c = 0;
            if (!ewecVar.b.L()) {
                ewecVar.U();
            }
            ewed ewedVar4 = (ewed) ewecVar.b;
            ewedVar4.b &= -5;
            ewedVar4.f = 0;
            return (ewed) ewecVar.Q();
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            ((eluo) ((eluo) ((eluo) b.j()).s(e)).ai((char) 10725)).B("Failed to update experiment settings with exception: %s", new etrz(etry.NO_USER_DATA, e.getMessage()));
            return null;
        }
    }

    private static boolean o(ddxz ddxzVar) {
        return fusk.a.lK().P() ? ddxzVar.a() : ddxzVar.a;
    }

    private final boolean p(Account account, ewdz ewdzVar, ewea eweaVar) {
        try {
            ddsf k = k();
            eweb ewebVar = eweb.a;
            fgrc v = ewebVar.v();
            String z = fusk.g() ? k.c().d(account).g : k.c().z(account);
            if (!v.b.L()) {
                v.U();
            }
            fgri fgriVar = v.b;
            eweb ewebVar2 = (eweb) fgriVar;
            z.getClass();
            ewebVar2.b |= 1;
            ewebVar2.c = z;
            if (!fgriVar.L()) {
                v.U();
            }
            fgri fgriVar2 = v.b;
            eweb ewebVar3 = (eweb) fgriVar2;
            ewdzVar.getClass();
            ewebVar3.e = ewdzVar;
            ewebVar3.b |= 256;
            if (!fgriVar2.L()) {
                v.U();
            }
            eweb ewebVar4 = (eweb) v.b;
            eweaVar.getClass();
            ewebVar4.d = eweaVar;
            ewebVar4.b |= 128;
            eweb ewebVar5 = (eweb) v.Q();
            fgrc v2 = ewgn.a.v();
            if (!v2.b.L()) {
                v2.U();
            }
            ewgn ewgnVar = (ewgn) v2.b;
            ewebVar5.getClass();
            ewgnVar.c = ewebVar5;
            ewgnVar.b |= 1;
            ewgn ewgnVar2 = (ewgn) v2.Q();
            eweb ewebVar6 = ewgnVar2.c;
            if (ewebVar6 != null) {
                ewebVar = ewebVar6;
            }
            try {
                if (ewebVar.c.isEmpty()) {
                    k.b().k("LHServerUpdateMetadata", 5);
                    return false;
                }
                try {
                    new ddsg(k.d(), cbot.a, cahk.b).c(k.a(account), ewgnVar2);
                    k.g("LHServerUpdateMetadata");
                    return true;
                } catch (fwuc | fwue | wjw e) {
                    k.h(e, "LHServerUpdateMetadata");
                    throw e;
                }
            } finally {
                if (!fusk.i()) {
                    k.i();
                }
            }
        } catch (fwuc e2) {
            if (e2.a.t == fwty.NOT_FOUND) {
                return false;
            }
            throw e2;
        } catch (wjw unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0306 A[Catch: fwuc -> 0x030f, TRY_LEAVE, TryCatch #1 {fwuc -> 0x030f, blocks: (B:71:0x02f4, B:73:0x0306), top: B:70:0x02f4 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0350  */
    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.eqgl iB(defpackage.cauf r23) {
        /*
            Method dump skipped, instructions count: 1155
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.semanticlocationhistory.settings.LocationHistoryActiveProcessingService.iB(cauf):eqgl");
    }
}
