package com.google.android.gms.findmydevice.spot.sync;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.findmydevice.spot.sync.SelfReportingRegistrationAndOwnerKeySyncService;
import com.google.android.gms.findmydevice.util.SafeGmsTaskBoundService;
import defpackage.asej;
import defpackage.asot;
import defpackage.bcyr;
import defpackage.bdll;
import defpackage.bebl;
import defpackage.betj;
import defpackage.betk;
import defpackage.betr;
import defpackage.bfcc;
import defpackage.bfch;
import defpackage.bfdr;
import defpackage.byln;
import defpackage.dnlf;
import defpackage.dwwv;
import defpackage.dwxy;
import defpackage.egmx;
import defpackage.eiho;
import defpackage.eiid;
import defpackage.eiig;
import defpackage.ejhf;
import defpackage.enqc;
import defpackage.enre;
import defpackage.ensj;
import defpackage.ensm;
import defpackage.enss;
import defpackage.ensv;
import defpackage.fobb;
import j$.time.Duration;
import java.io.IOException;
import java.util.Iterator;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class SelfReportingRegistrationAndOwnerKeySyncService extends SafeGmsTaskBoundService {
    public static final asot a = asot.b("SelfRptRegSyncSvc", asej.FIND_MY_DEVICE_SPOT);
    public final Context b;
    public final bfcc c;
    public final ensv d;
    public final dwwv e;
    public final bebl f;
    public final dnlf g;
    private final betr j;
    private final betk k;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r3v0, types: [beoa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [bfcc, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SelfReportingRegistrationAndOwnerKeySyncService() {
        /*
            r9 = this;
            defpackage.bebo.a()
            android.content.Context r1 = defpackage.bebk.b()
            bebp r0 = defpackage.bebo.a()
            bebo r0 = (defpackage.bebo) r0
            java.lang.Object r3 = r0.J()
            bebb r4 = new bebb
            bebo r2 = r0.ay
            r4.<init>(r2)
            begh r5 = r0.j()
            fixm r0 = r0.b
            java.lang.Object r0 = r0.a()
            r6 = r0
            java.util.concurrent.Executor r6 = (java.util.concurrent.Executor) r6
            android.content.Context r7 = defpackage.bebk.b()
            beui r2 = new beui
            r2.<init>(r3, r4, r5, r6, r7)
            bebp r0 = defpackage.bebo.a()
            bebo r0 = (defpackage.bebo) r0
            betp r3 = r0.u()
            bebp r0 = defpackage.bebo.a()
            bebo r0 = (defpackage.bebo) r0
            java.lang.Object r4 = r0.I()
            bebp r0 = defpackage.bebo.a()
            ensv r5 = r0.G()
            bebp r0 = defpackage.bebo.a()
            bebo r0 = (defpackage.bebo) r0
            begh r6 = r0.j()
            bebp r0 = defpackage.bebo.a()
            bebl r7 = r0.i()
            bebp r0 = defpackage.bebo.a()
            dnlf r8 = r0.C()
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.findmydevice.spot.sync.SelfReportingRegistrationAndOwnerKeySyncService.<init>():void");
    }

    @Override // com.google.android.gms.findmydevice.util.SafeGmsTaskBoundService
    protected final enss d(byln bylnVar) {
        if (!bfdr.b()) {
            ((ejhf) ((ejhf) a.j()).ah((char) 4549)).x("Finder is disabled.");
            return ensj.i(2);
        }
        Bundle bundle = bylnVar.b;
        boolean z = true;
        if (bundle != null && !bundle.getBoolean("throttle", true)) {
            z = false;
        }
        egmx f = egmx.f(this.j.a(z));
        enqc enqcVar = new enqc() { // from class: bfcv
            @Override // defpackage.enqc
            public final enss a(Object obj) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                SelfReportingRegistrationAndOwnerKeySyncService selfReportingRegistrationAndOwnerKeySyncService = SelfReportingRegistrationAndOwnerKeySyncService.this;
                if (!booleanValue) {
                    selfReportingRegistrationAndOwnerKeySyncService.c.b();
                }
                return fobb.n() ? selfReportingRegistrationAndOwnerKeySyncService.e.d() : ensm.a;
            }
        };
        enre enreVar = enre.a;
        return f.i(enqcVar, enreVar).e(bdll.class, new enqc() { // from class: bfcw
            @Override // defpackage.enqc
            public final enss a(Object obj) {
                char c;
                final enss enssVar;
                final boolean z2;
                final bdll bdllVar = (bdll) obj;
                bdmb bdmbVar = bdllVar.c;
                final boolean z3 = bdmbVar.h;
                final SelfReportingRegistrationAndOwnerKeySyncService selfReportingRegistrationAndOwnerKeySyncService = SelfReportingRegistrationAndOwnerKeySyncService.this;
                if (fobb.p() && z3) {
                    ((ejhf) ((ejhf) SelfReportingRegistrationAndOwnerKeySyncService.a.h()).ah((char) 4543)).x("Not asking user to initialize Keychain for LKL auto-enrollment, which should eventually succeed without user input.");
                    return fobb.n() ? selfReportingRegistrationAndOwnerKeySyncService.e.d() : ensm.a;
                }
                bebc b = selfReportingRegistrationAndOwnerKeySyncService.f.b(bdllVar.b);
                final behm g = b.g();
                final boolean z4 = z3 || bdmbVar.equals(bdmb.SELF_PROVISIONED_MAINTENANCE);
                enss g2 = z4 ? selfReportingRegistrationAndOwnerKeySyncService.e.g() : egnc.j(g.c.a(), new eiho() { // from class: begy
                    @Override // defpackage.eiho
                    public final Object apply(Object obj2) {
                        dwxh dwxhVar = ((dwzg) obj2).g;
                        if (dwxhVar == null) {
                            dwxhVar = dwxh.a;
                        }
                        return Boolean.valueOf(dwws.a(dwxhVar, fegx.h(behm.this.b.d().toEpochMilli()), fegt.o(fobr.r())));
                    }
                }, enre.a);
                final enss o = z4 ? selfReportingRegistrationAndOwnerKeySyncService.e.o() : g.i();
                dwwv dwwvVar = selfReportingRegistrationAndOwnerKeySyncService.e;
                final enss f2 = dwwvVar.f();
                enss h = dwwvVar.h();
                eiid eiidVar = bdllVar.d;
                if (eiidVar.h() && bego.h((euhg) eiidVar.c())) {
                    c = 1;
                    enssVar = h;
                    z2 = true;
                } else {
                    c = 1;
                    enssVar = h;
                    z2 = false;
                }
                enss g3 = z2 ? b.d().a(bdka.LOCK_SCREEN).g() : ensj.i(bdib.CANNOT_GENERATE_MISSING_LSKF);
                enss[] enssVarArr = new enss[5];
                enssVarArr[0] = g2;
                enssVarArr[c] = o;
                enssVarArr[2] = f2;
                enssVarArr[3] = enssVar;
                enssVarArr[4] = g3;
                final enss enssVar2 = g3;
                final enss enssVar3 = g2;
                return egna.h(enssVarArr).b(new enqb() { // from class: bfda
                    @Override // defpackage.enqb
                    public final enss a() {
                        eiid eiidVar2;
                        enss d;
                        eiid eiidVar3;
                        dwyw dwywVar = (dwyw) ensj.r(f2);
                        boolean z5 = dwywVar.e;
                        final SelfReportingRegistrationAndOwnerKeySyncService selfReportingRegistrationAndOwnerKeySyncService2 = SelfReportingRegistrationAndOwnerKeySyncService.this;
                        if (!z5) {
                            ((ejhf) ((ejhf) SelfReportingRegistrationAndOwnerKeySyncService.a.h()).ah((char) 4546)).x("FMD is disabled, so not asking user to initialize Keychain");
                        } else if (((Boolean) ensj.r(enssVar3)).booleanValue()) {
                            long epochMilli = selfReportingRegistrationAndOwnerKeySyncService2.g.d().toEpochMilli() - fegx.b((fefi) ensj.r(enssVar));
                            long millis = Duration.ofMinutes(fobr.k()).toMillis();
                            if (epochMilli >= millis) {
                                boolean z6 = z2;
                                boolean booleanValue = ((Boolean) ensj.r(o)).booleanValue();
                                if (z6) {
                                    int i = ((bdib) ensj.r(enssVar2)).l;
                                    boolean z7 = i == 2;
                                    if (i == 0) {
                                        throw null;
                                    }
                                    eiidVar2 = eiid.j(Boolean.valueOf(!z7));
                                } else {
                                    eiidVar2 = eigb.a;
                                }
                                eiid eiidVar4 = eiidVar2;
                                boolean z8 = fobb.n() && (dwywVar.b & 2) != 0;
                                bdll bdllVar2 = bdllVar;
                                final bfch a2 = bfch.a(bdllVar2.a());
                                eiid eiidVar5 = a2.d;
                                if (!eiidVar5.h()) {
                                    throw new IllegalStateException("Non-notifiable status code " + bdllVar2.a());
                                }
                                final boolean z9 = z4;
                                final boolean z10 = z3;
                                bfcc bfccVar = selfReportingRegistrationAndOwnerKeySyncService2.c;
                                Object c2 = eiidVar5.c();
                                PendingIntent b2 = bdllVar2.b();
                                Account account = bdllVar2.b;
                                final int c3 = bfccVar.c((bfcb) c2, b2, account, bdllVar2.c, bdllVar2.d, bdllVar2.e, eiidVar4, !booleanValue, z8);
                                if (!fobb.n()) {
                                    return selfReportingRegistrationAndOwnerKeySyncService2.e(z10, z9, a2, c3);
                                }
                                if (z10 || c3 != 1) {
                                    d = selfReportingRegistrationAndOwnerKeySyncService2.e.d();
                                } else {
                                    dwwv dwwvVar2 = selfReportingRegistrationAndOwnerKeySyncService2.e;
                                    fecj v = dwya.b.v();
                                    String name = a2.name();
                                    if (!v.b.L()) {
                                        v.U();
                                    }
                                    dwya dwyaVar = (dwya) v.b;
                                    name.getClass();
                                    dwyaVar.c |= 4;
                                    dwyaVar.f = name;
                                    Context context = selfReportingRegistrationAndOwnerKeySyncService2.b;
                                    asot asotVar = bfdq.a;
                                    try {
                                        String str = account.name;
                                        String str2 = uny.a;
                                        eiidVar3 = eiid.j(uoh.e(context, str));
                                    } catch (IOException | unx unused) {
                                        ((ejhf) ((ejhf) bfdq.a.j()).ah((char) 4566)).x("Failed getting the OID of an account.");
                                        eiidVar3 = eigb.a;
                                    }
                                    String str3 = (String) eiidVar3.e("");
                                    if (!v.b.L()) {
                                        v.U();
                                    }
                                    dwya dwyaVar2 = (dwya) v.b;
                                    dwyaVar2.c |= 2;
                                    dwyaVar2.e = str3;
                                    String name2 = bdllVar2.c.name();
                                    if (!v.b.L()) {
                                        v.U();
                                    }
                                    dwya dwyaVar3 = (dwya) v.b;
                                    name2.getClass();
                                    dwyaVar3.c |= 8;
                                    dwyaVar3.g = name2;
                                    Iterable iterable = (Iterable) bdllVar2.e.e(ejck.a);
                                    if (!v.b.L()) {
                                        v.U();
                                    }
                                    dwya dwyaVar4 = (dwya) v.b;
                                    fecy fecyVar = dwyaVar4.h;
                                    if (!fecyVar.c()) {
                                        dwyaVar4.h = fecp.C(fecyVar);
                                    }
                                    Iterator it = iterable.iterator();
                                    while (it.hasNext()) {
                                        dwyaVar4.h.i(((eugj) it.next()).a());
                                    }
                                    d = dwwvVar2.x(v);
                                }
                                return egmx.f(d).d(Throwable.class, new eiho() { // from class: bfct
                                    @Override // defpackage.eiho
                                    public final Object apply(Object obj2) {
                                        ((ejhf) ((ejhf) ((ejhf) SelfReportingRegistrationAndOwnerKeySyncService.a.j()).s((Throwable) obj2)).ah((char) 4542)).x("Failed to update Keychain maintenance required notification data.");
                                        return null;
                                    }
                                }, enre.a).i(new enqc() { // from class: bfcu
                                    @Override // defpackage.enqc
                                    public final enss a(Object obj2) {
                                        return SelfReportingRegistrationAndOwnerKeySyncService.this.e(z10, z9, a2, c3);
                                    }
                                }, selfReportingRegistrationAndOwnerKeySyncService2.d);
                            }
                            bfcs.n(byjl.a(selfReportingRegistrationAndOwnerKeySyncService2.b), false, Duration.ofMillis(millis - epochMilli).toSeconds());
                            ((ejhf) ((ejhf) SelfReportingRegistrationAndOwnerKeySyncService.a.h()).ah((char) 4544)).x("Minimal time from installation not passed, so not asking the user to initialize Keychain, but re-scheduling sync.");
                        } else {
                            ((ejhf) ((ejhf) SelfReportingRegistrationAndOwnerKeySyncService.a.h()).ah((char) 4545)).x("User has asked not to be reminded to initialize Keychain");
                        }
                        return fobb.n() ? selfReportingRegistrationAndOwnerKeySyncService2.e.d() : ensm.a;
                    }
                }, fobb.n() ? selfReportingRegistrationAndOwnerKeySyncService.d : enre.a);
            }
        }, this.d).h(new eiho() { // from class: bfcx
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                asot asotVar = SelfReportingRegistrationAndOwnerKeySyncService.a;
                return 0;
            }
        }, enreVar).d(bcyr.class, new eiho() { // from class: bfcy
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                bcyr bcyrVar = (bcyr) obj;
                ((ejhf) ((ejhf) ((ejhf) SelfReportingRegistrationAndOwnerKeySyncService.a.i()).s(bcyrVar)).ah((char) 4547)).x("Failed validating the state of SPOT registration of this Android device.");
                return Integer.valueOf(true != bcyrVar.d() ? 2 : 1);
            }
        }, enreVar).d(Throwable.class, new eiho() { // from class: bfcz
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                ((ejhf) ((ejhf) ((ejhf) SelfReportingRegistrationAndOwnerKeySyncService.a.i()).s((Throwable) obj)).ah((char) 4548)).x("Failed validating the state of SPOT registration of this Android device.");
                return 2;
            }
        }, enreVar);
    }

    public final enss e(boolean z, boolean z2, bfch bfchVar, int i) {
        if (!z) {
            return (fobb.p() && z2) ? this.k.a((dwxy) bfchVar.f.c()) : ensm.a;
        }
        eiig.p(!fobb.p());
        eiid a2 = betj.a(i, eiid.j(bfchVar.g.c()));
        eiig.p(a2.h());
        return this.k.a((dwxy) a2.c());
    }

    public SelfReportingRegistrationAndOwnerKeySyncService(Context context, betr betrVar, betk betkVar, bfcc bfccVar, ensv ensvVar, dwwv dwwvVar, bebl beblVar, dnlf dnlfVar) {
        this.b = context;
        this.j = betrVar;
        this.k = betkVar;
        this.c = bfccVar;
        this.d = ensvVar;
        this.e = dwwvVar;
        this.f = beblVar;
        this.g = dnlfVar;
    }
}
