package com.google.android.gms.findmydevice.spot.sync;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.findmydevice.spot.sync.SelfReportingRegistrationAndOwnerKeySyncService;
import com.google.android.gms.findmydevice.util.SafeGmsTaskBoundService;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bfad;
import defpackage.bfmx;
import defpackage.bgcx;
import defpackage.bguw;
import defpackage.bgux;
import defpackage.bgve;
import defpackage.bhds;
import defpackage.bhdx;
import defpackage.bhfh;
import defpackage.cauf;
import defpackage.dpvo;
import defpackage.dziv;
import defpackage.dzjy;
import defpackage.ejaa;
import defpackage.ekut;
import defpackage.ekvi;
import defpackage.ekvl;
import defpackage.eluo;
import defpackage.eqdv;
import defpackage.eqex;
import defpackage.eqgc;
import defpackage.eqgf;
import defpackage.eqgl;
import defpackage.eqgo;
import defpackage.fqsv;
import j$.time.Duration;
import java.io.IOException;
import java.util.Iterator;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class SelfReportingRegistrationAndOwnerKeySyncService extends SafeGmsTaskBoundService {
    public static final ausn a = ausn.b("SelfRptRegSyncSvc", auid.FIND_MY_DEVICE_SPOT);
    public final Context b;
    public final bhds c;
    public final eqgo d;
    public final dziv e;
    public final bgcx f;
    public final dpvo g;
    private final bgve j;
    private final bgux k;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r3v0, types: [bgpm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [bhds, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SelfReportingRegistrationAndOwnerKeySyncService() {
        /*
            r9 = this;
            defpackage.bgda.a()
            android.content.Context r1 = defpackage.bgcw.b()
            bgdb r0 = defpackage.bgda.a()
            bgda r0 = (defpackage.bgda) r0
            java.lang.Object r3 = r0.J()
            bgcn r4 = new bgcn
            bgda r2 = r0.ay
            r4.<init>(r2)
            bght r5 = r0.j()
            flnj r0 = r0.b
            java.lang.Object r0 = r0.a()
            r6 = r0
            java.util.concurrent.Executor r6 = (java.util.concurrent.Executor) r6
            android.content.Context r7 = defpackage.bgcw.b()
            bgvv r2 = new bgvv
            r2.<init>(r3, r4, r5, r6, r7)
            bgdb r0 = defpackage.bgda.a()
            bgda r0 = (defpackage.bgda) r0
            bgvc r3 = r0.u()
            bgdb r0 = defpackage.bgda.a()
            bgda r0 = (defpackage.bgda) r0
            java.lang.Object r4 = r0.I()
            bgdb r0 = defpackage.bgda.a()
            eqgo r5 = r0.G()
            bgdb r0 = defpackage.bgda.a()
            bgda r0 = (defpackage.bgda) r0
            bght r6 = r0.j()
            bgdb r0 = defpackage.bgda.a()
            bgcx r7 = r0.i()
            bgdb r0 = defpackage.bgda.a()
            dpvo r8 = r0.C()
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.findmydevice.spot.sync.SelfReportingRegistrationAndOwnerKeySyncService.<init>():void");
    }

    @Override // com.google.android.gms.findmydevice.util.SafeGmsTaskBoundService
    protected final eqgl d(cauf caufVar) {
        if (!bhfh.b()) {
            ((eluo) ((eluo) a.j()).ai((char) 4559)).x("Finder is disabled.");
            return eqgc.i(2);
        }
        Bundle bundle = caufVar.b;
        boolean z = true;
        if (bundle != null && !bundle.getBoolean("throttle", true)) {
            z = false;
        }
        ejaa g = ejaa.g(this.j.a(z));
        eqdv eqdvVar = new eqdv() { // from class: bhel
            @Override // defpackage.eqdv
            public final eqgl a(Object obj) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                SelfReportingRegistrationAndOwnerKeySyncService selfReportingRegistrationAndOwnerKeySyncService = SelfReportingRegistrationAndOwnerKeySyncService.this;
                if (!booleanValue) {
                    selfReportingRegistrationAndOwnerKeySyncService.c.b();
                }
                return fqsv.n() ? selfReportingRegistrationAndOwnerKeySyncService.e.d() : eqgf.a;
            }
        };
        eqex eqexVar = eqex.a;
        return g.i(eqdvVar, eqexVar).f(bfmx.class, new eqdv() { // from class: bhem
            @Override // defpackage.eqdv
            public final eqgl a(Object obj) {
                char c;
                final eqgl eqglVar;
                final boolean z2;
                final bfmx bfmxVar = (bfmx) obj;
                bfnn bfnnVar = bfmxVar.c;
                final boolean z3 = bfnnVar.h;
                final SelfReportingRegistrationAndOwnerKeySyncService selfReportingRegistrationAndOwnerKeySyncService = SelfReportingRegistrationAndOwnerKeySyncService.this;
                if (fqsv.p() && z3) {
                    ((eluo) ((eluo) SelfReportingRegistrationAndOwnerKeySyncService.a.h()).ai((char) 4553)).x("Not asking user to initialize Keychain for LKL auto-enrollment, which should eventually succeed without user input.");
                    return fqsv.n() ? selfReportingRegistrationAndOwnerKeySyncService.e.d() : eqgf.a;
                }
                bgco b = selfReportingRegistrationAndOwnerKeySyncService.f.b(bfmxVar.b);
                final bgiy g2 = b.g();
                final boolean z4 = z3 || bfnnVar.equals(bfnn.SELF_PROVISIONED_MAINTENANCE);
                eqgl g3 = z4 ? selfReportingRegistrationAndOwnerKeySyncService.e.g() : ejaf.j(g2.c.a(), new ekut() { // from class: bgik
                    @Override // defpackage.ekut
                    public final Object apply(Object obj2) {
                        dzjh dzjhVar = ((dzlg) obj2).g;
                        if (dzjhVar == null) {
                            dzjhVar = dzjh.a;
                        }
                        return Boolean.valueOf(dzis.a(dzjhVar, fgvq.h(bgiy.this.b.d().toEpochMilli()), fgvm.o(fqtl.r())));
                    }
                }, eqex.a);
                final eqgl o = z4 ? selfReportingRegistrationAndOwnerKeySyncService.e.o() : g2.i();
                dziv dzivVar = selfReportingRegistrationAndOwnerKeySyncService.e;
                final eqgl f = dzivVar.f();
                eqgl h = dzivVar.h();
                ekvi ekviVar = bfmxVar.d;
                if (ekviVar.h() && bgia.h((ewwz) ekviVar.c())) {
                    c = 1;
                    eqglVar = h;
                    z2 = true;
                } else {
                    c = 1;
                    eqglVar = h;
                    z2 = false;
                }
                eqgl g4 = z2 ? b.d().a(bflm.LOCK_SCREEN).g() : eqgc.i(bfjn.CANNOT_GENERATE_MISSING_LSKF);
                eqgl[] eqglVarArr = new eqgl[5];
                eqglVarArr[0] = g3;
                eqglVarArr[c] = o;
                eqglVarArr[2] = f;
                eqglVarArr[3] = eqglVar;
                eqglVarArr[4] = g4;
                final eqgl eqglVar2 = g4;
                final eqgl eqglVar3 = g3;
                return ejad.h(eqglVarArr).b(new eqdu() { // from class: bheq
                    @Override // defpackage.eqdu
                    public final eqgl a() {
                        ekvi ekviVar2;
                        eqgl d;
                        ekvi ekviVar3;
                        dzkw dzkwVar = (dzkw) eqgc.r(f);
                        boolean z5 = dzkwVar.e;
                        final SelfReportingRegistrationAndOwnerKeySyncService selfReportingRegistrationAndOwnerKeySyncService2 = SelfReportingRegistrationAndOwnerKeySyncService.this;
                        if (!z5) {
                            ((eluo) ((eluo) SelfReportingRegistrationAndOwnerKeySyncService.a.h()).ai((char) 4556)).x("FMD is disabled, so not asking user to initialize Keychain");
                        } else if (((Boolean) eqgc.r(eqglVar3)).booleanValue()) {
                            long epochMilli = selfReportingRegistrationAndOwnerKeySyncService2.g.d().toEpochMilli() - fgvq.b((fgub) eqgc.r(eqglVar));
                            long millis = Duration.ofMinutes(fqtl.k()).toMillis();
                            if (epochMilli >= millis) {
                                boolean z6 = z2;
                                boolean booleanValue = ((Boolean) eqgc.r(o)).booleanValue();
                                if (z6) {
                                    int i = ((bfjn) eqgc.r(eqglVar2)).l;
                                    boolean z7 = i == 2;
                                    if (i == 0) {
                                        throw null;
                                    }
                                    ekviVar2 = ekvi.j(Boolean.valueOf(!z7));
                                } else {
                                    ekviVar2 = ektg.a;
                                }
                                ekvi ekviVar4 = ekviVar2;
                                boolean z8 = fqsv.n() && (dzkwVar.b & 2) != 0;
                                bfmx bfmxVar2 = bfmxVar;
                                final bhdx a2 = bhdx.a(bfmxVar2.a());
                                ekvi ekviVar5 = a2.d;
                                if (!ekviVar5.h()) {
                                    throw new IllegalStateException("Non-notifiable status code " + bfmxVar2.a());
                                }
                                final boolean z9 = z4;
                                final boolean z10 = z3;
                                bhds bhdsVar = selfReportingRegistrationAndOwnerKeySyncService2.c;
                                Object c2 = ekviVar5.c();
                                PendingIntent b2 = bfmxVar2.b();
                                Account account = bfmxVar2.b;
                                final int c3 = bhdsVar.c((bhdr) c2, b2, account, bfmxVar2.c, bfmxVar2.d, bfmxVar2.e, ekviVar4, !booleanValue, z8);
                                if (!fqsv.n()) {
                                    return selfReportingRegistrationAndOwnerKeySyncService2.e(z10, z9, a2, c3);
                                }
                                if (z10 || c3 != 1) {
                                    d = selfReportingRegistrationAndOwnerKeySyncService2.e.d();
                                } else {
                                    dziv dzivVar2 = selfReportingRegistrationAndOwnerKeySyncService2.e;
                                    fgrc v = dzka.b.v();
                                    String name = a2.name();
                                    if (!v.b.L()) {
                                        v.U();
                                    }
                                    dzka dzkaVar = (dzka) v.b;
                                    name.getClass();
                                    dzkaVar.c |= 4;
                                    dzkaVar.f = name;
                                    Context context = selfReportingRegistrationAndOwnerKeySyncService2.b;
                                    ausn ausnVar = bhfg.a;
                                    try {
                                        String str = account.name;
                                        String str2 = wjx.a;
                                        ekviVar3 = ekvi.j(wkg.e(context, str));
                                    } catch (IOException | wjw unused) {
                                        ((eluo) ((eluo) bhfg.a.j()).ai((char) 4576)).x("Failed getting the OID of an account.");
                                        ekviVar3 = ektg.a;
                                    }
                                    String str3 = (String) ekviVar3.e("");
                                    if (!v.b.L()) {
                                        v.U();
                                    }
                                    dzka dzkaVar2 = (dzka) v.b;
                                    dzkaVar2.c |= 2;
                                    dzkaVar2.e = str3;
                                    String name2 = bfmxVar2.c.name();
                                    if (!v.b.L()) {
                                        v.U();
                                    }
                                    dzka dzkaVar3 = (dzka) v.b;
                                    name2.getClass();
                                    dzkaVar3.c |= 8;
                                    dzkaVar3.g = name2;
                                    Iterable iterable = (Iterable) bfmxVar2.e.e(elpp.a);
                                    if (!v.b.L()) {
                                        v.U();
                                    }
                                    dzka dzkaVar4 = (dzka) v.b;
                                    fgrr fgrrVar = dzkaVar4.h;
                                    if (!fgrrVar.c()) {
                                        dzkaVar4.h = fgri.C(fgrrVar);
                                    }
                                    Iterator it = iterable.iterator();
                                    while (it.hasNext()) {
                                        dzkaVar4.h.i(((ewwc) it.next()).a());
                                    }
                                    d = dzivVar2.y(v);
                                }
                                return ejaa.g(d).e(Throwable.class, new ekut() { // from class: bhej
                                    @Override // defpackage.ekut
                                    public final Object apply(Object obj2) {
                                        ((eluo) ((eluo) ((eluo) SelfReportingRegistrationAndOwnerKeySyncService.a.j()).s((Throwable) obj2)).ai((char) 4552)).x("Failed to update Keychain maintenance required notification data.");
                                        return null;
                                    }
                                }, eqex.a).i(new eqdv() { // from class: bhek
                                    @Override // defpackage.eqdv
                                    public final eqgl a(Object obj2) {
                                        return SelfReportingRegistrationAndOwnerKeySyncService.this.e(z10, z9, a2, c3);
                                    }
                                }, selfReportingRegistrationAndOwnerKeySyncService2.d);
                            }
                            bhei.n(casd.a(selfReportingRegistrationAndOwnerKeySyncService2.b), false, Duration.ofMillis(millis - epochMilli).toSeconds());
                            ((eluo) ((eluo) SelfReportingRegistrationAndOwnerKeySyncService.a.h()).ai((char) 4554)).x("Minimal time from installation not passed, so not asking the user to initialize Keychain, but re-scheduling sync.");
                        } else {
                            ((eluo) ((eluo) SelfReportingRegistrationAndOwnerKeySyncService.a.h()).ai((char) 4555)).x("User has asked not to be reminded to initialize Keychain");
                        }
                        return fqsv.n() ? selfReportingRegistrationAndOwnerKeySyncService2.e.d() : eqgf.a;
                    }
                }, fqsv.n() ? selfReportingRegistrationAndOwnerKeySyncService.d : eqex.a);
            }
        }, this.d).h(new ekut() { // from class: bhen
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                ausn ausnVar = SelfReportingRegistrationAndOwnerKeySyncService.a;
                return 0;
            }
        }, eqexVar).e(bfad.class, new ekut() { // from class: bheo
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                bfad bfadVar = (bfad) obj;
                ((eluo) ((eluo) ((eluo) SelfReportingRegistrationAndOwnerKeySyncService.a.i()).s(bfadVar)).ai((char) 4557)).x("Failed validating the state of SPOT registration of this Android device.");
                return Integer.valueOf(true != bfadVar.d() ? 2 : 1);
            }
        }, eqexVar).e(Throwable.class, new ekut() { // from class: bhep
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                ((eluo) ((eluo) ((eluo) SelfReportingRegistrationAndOwnerKeySyncService.a.i()).s((Throwable) obj)).ai((char) 4558)).x("Failed validating the state of SPOT registration of this Android device.");
                return 2;
            }
        }, eqexVar);
    }

    public final eqgl e(boolean z, boolean z2, bhdx bhdxVar, int i) {
        if (!z) {
            return (fqsv.p() && z2) ? this.k.a((dzjy) bhdxVar.f.c()) : eqgf.a;
        }
        ekvl.q(!fqsv.p());
        ekvi a2 = bguw.a(i, ekvi.j(bhdxVar.g.c()));
        ekvl.q(a2.h());
        return this.k.a((dzjy) a2.c());
    }

    public SelfReportingRegistrationAndOwnerKeySyncService(Context context, bgve bgveVar, bgux bguxVar, bhds bhdsVar, eqgo eqgoVar, dziv dzivVar, bgcx bgcxVar, dpvo dpvoVar) {
        this.b = context;
        this.j = bgveVar;
        this.k = bguxVar;
        this.c = bhdsVar;
        this.d = eqgoVar;
        this.e = dzivVar;
        this.f = bgcxVar;
        this.g = dpvoVar;
    }
}
