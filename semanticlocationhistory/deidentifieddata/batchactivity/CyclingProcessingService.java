package com.google.android.gms.semanticlocationhistory.deidentifieddata.batchactivity;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.chimera.modules.semanticlocationhistory.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.android.gms.semanticlocationhistory.deidentifieddata.batchactivity.CyclingProcessingService;
import defpackage.auid;
import defpackage.ausn;
import defpackage.cauf;
import defpackage.dbtc;
import defpackage.dbvg;
import defpackage.dcnm;
import defpackage.dcry;
import defpackage.dcxv;
import defpackage.eqdl;
import defpackage.eqdv;
import defpackage.eqex;
import defpackage.eqgb;
import defpackage.eqgc;
import defpackage.eqgl;
import defpackage.fups;
import defpackage.fush;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class CyclingProcessingService extends GmsTaskBoundService {
    public static final String a;
    public dcnm b;
    public final dcry c = new dcry();
    private dcxv d;
    private dbvg e;
    private dbtc f;

    static {
        ausn.c("LocationHistory", auid.SEMANTIC_LOCATION_HISTORY, "CyclingActivity");
        a = CyclingProcessingService.class.getName();
    }

    public static boolean g() {
        fups fupsVar = fups.a;
        return fupsVar.lK().a() && fupsVar.lK().b() && fush.Q();
    }

    public final dbtc d() {
        if (this.f == null) {
            this.f = new dbtc();
        }
        return this.f;
    }

    public final dbvg e() {
        if (this.e == null) {
            this.e = new dbvg(d());
        }
        return this.e;
    }

    public final dcxv f() {
        if (this.d == null) {
            this.d = new dcxv(e(), d());
        }
        return this.d;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final eqgl iB(cauf caufVar) {
        if (!g()) {
            return eqgc.i(0);
        }
        d().e("CyclingActivityJobCount");
        return eqdl.g(eqgb.h(this.c.b()), new eqdv() { // from class: dcsf
            @Override // defpackage.eqdv
            public final eqgl a(Object obj) {
                eqgl g;
                String str = (String) obj;
                boolean isEmpty = str.isEmpty();
                final CyclingProcessingService cyclingProcessingService = CyclingProcessingService.this;
                if (isEmpty) {
                    cyclingProcessingService.d().e("CyclingActivityJobEmptyAccount");
                    return eqgc.i(0);
                }
                final Account account = new Account(str, "com.google");
                Context a2 = AppContextProvider.a();
                if (cyclingProcessingService.b == null) {
                    cyclingProcessingService.b = dcnp.w(a2);
                }
                final dcsm dcsmVar = new dcsm(cyclingProcessingService.b, cyclingProcessingService.e(), cyclingProcessingService.d());
                if (dbvl.e(dcsmVar.d, account)) {
                    dcsmVar.a().e("CyclingActivityBeginProcessing");
                    g = eqdl.g(eqgb.h(dcsmVar.g.a()), new eqdv() { // from class: dcsk
                        @Override // defpackage.eqdv
                        public final eqgl a(Object obj2) {
                            boolean z;
                            long j;
                            eqgl b;
                            dcgs b2;
                            dcgs b3;
                            final fgub fgubVar = (fgub) obj2;
                            long d = fgvq.d(fgubVar);
                            long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) - TimeUnit.HOURS.toSeconds(12L);
                            long j2 = seconds - d;
                            if (j2 > TimeUnit.HOURS.toSeconds(48L)) {
                                d = seconds - TimeUnit.HOURS.toSeconds(24L);
                                z = true;
                            } else {
                                z = false;
                            }
                            final dcsm dcsmVar2 = dcsm.this;
                            if (z) {
                                dcsmVar2.a().p("CyclingActivityHoursFailedSinceLastProcessedEndTime", TimeUnit.SECONDS.toHours(j2 - TimeUnit.HOURS.toSeconds(24L)));
                            } else {
                                dcsmVar2.a().p("CyclingActivityDurationSinceLastProcessedEndTime", TimeUnit.SECONDS.toHours(j2));
                            }
                            Account account2 = account;
                            if (furt.e()) {
                                try {
                                    if (dcsmVar2.h == null) {
                                        dcsmVar2.h = new ddor();
                                    }
                                    fbjj fbjjVar = (fbjj) ((eqcy) dcsmVar2.h.b(account2)).u();
                                    if (!fbjjVar.equals(fbjj.a)) {
                                        for (int i = 0; i < fbjjVar.c.size(); i++) {
                                            int b4 = fbhj.b(((fbhk) fbjjVar.c.get(i)).e);
                                            if (b4 != 0 && b4 == 2) {
                                                dcsmVar2.i = (fbhk) fbjjVar.c.get(i);
                                            }
                                            int b5 = fbhj.b(((fbhk) fbjjVar.c.get(i)).e);
                                            if (b5 != 0 && b5 == 3) {
                                                dcsmVar2.j = (fbhk) fbjjVar.c.get(i);
                                            }
                                        }
                                    }
                                } catch (InterruptedException | ExecutionException e) {
                                    e.getMessage();
                                    dcsmVar2.a().e("CyclingActivityPulpStorageExecutionNotComplete");
                                    dcsmVar2.i = null;
                                    dcsmVar2.j = null;
                                }
                            }
                            dcnm dcnmVar = dcsmVar2.e;
                            ausn ausnVar = dcso.a;
                            long seconds2 = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
                            int i2 = 2;
                            if (TimeUnit.SECONDS.toDays(seconds2) - TimeUnit.SECONDS.toDays(d) > 90) {
                                long seconds3 = seconds2 - TimeUnit.DAYS.toSeconds(90L);
                                ((eluo) ((eluo) dcso.a.h()).ai(10231)).J("Location history from %d requested, exceeding max location history range. Truncating the start time to %d.", d, seconds3);
                                j = seconds3;
                            } else {
                                j = d;
                            }
                            elgo l = dcnmVar.l(account2, "deidentified-cycling-activity", j, seconds, fbis.STABILIZED, new int[]{2});
                            final ArrayList arrayList = new ArrayList();
                            int i3 = ((elpg) l).c;
                            for (int i4 = 0; i4 < i3; i4++) {
                                fbiz fbizVar = (fbiz) l.get(i4);
                                fbiw fbiwVar = fbizVar.g;
                                if (fbiwVar == null) {
                                    fbiwVar = fbiw.a;
                                }
                                if (fbiwVar.b == i2) {
                                    fbiw fbiwVar2 = fbizVar.g;
                                    if (fbiwVar2 == null) {
                                        fbiwVar2 = fbiw.a;
                                    }
                                    fhph fhphVar = (fbiwVar2.b == i2 ? (fhpi) fbiwVar2.c : fhpi.a).g;
                                    if (fhphVar == null) {
                                        fhphVar = fhph.a;
                                    }
                                    if (fhphVar.c != fhpg.CYCLING.p) {
                                        i2 = 2;
                                    } else {
                                        fgub fgubVar2 = fbizVar.c;
                                        if (fgubVar2 == null) {
                                            fgubVar2 = fgub.a;
                                        }
                                        fgub fgubVar3 = fbizVar.d;
                                        if (fgubVar3 == null) {
                                            fgubVar3 = fgub.a;
                                        }
                                        if (fgvm.b(fgvq.e(fgubVar2, fgubVar3), dcsm.a) > 0) {
                                            dcsmVar2.a().e("CyclingActivityIneligibleExceedMaxSegmentDuration");
                                            dcsmVar2.a().e("CyclingActivityTotalIneligibleUploads");
                                            i2 = 2;
                                        } else {
                                            dcsmVar2.a().e("CyclingActivityTotalEligibleUploads");
                                            fbiw fbiwVar3 = fbizVar.g;
                                            if (fbiwVar3 == null) {
                                                fbiwVar3 = fbiw.a;
                                            }
                                            fhpi fhpiVar = fbiwVar3.b == 2 ? (fhpi) fbiwVar3.c : fhpi.a;
                                            dcfk dcfkVar = dcfk.a;
                                            fgrc v = dcfkVar.v();
                                            fgub fgubVar4 = fbizVar.c;
                                            if (fgubVar4 == null) {
                                                fgubVar4 = fgub.a;
                                            }
                                            if (!v.b.L()) {
                                                v.U();
                                            }
                                            fgri fgriVar = v.b;
                                            dcfk dcfkVar2 = (dcfk) fgriVar;
                                            fgubVar4.getClass();
                                            dcfkVar2.e = fgubVar4;
                                            dcfkVar2.b |= 4;
                                            fgub fgubVar5 = fbizVar.d;
                                            if (fgubVar5 == null) {
                                                fgubVar5 = fgub.a;
                                            }
                                            if (!fgriVar.L()) {
                                                v.U();
                                            }
                                            dcfk dcfkVar3 = (dcfk) v.b;
                                            fgubVar5.getClass();
                                            dcfkVar3.f = fgubVar5;
                                            dcfkVar3.b |= 8;
                                            fhpr fhprVar = fhpiVar.c;
                                            if (fhprVar == null) {
                                                fhprVar = fhpr.a;
                                            }
                                            dcgs b6 = dcso.b(fhprVar);
                                            if (!v.b.L()) {
                                                v.U();
                                            }
                                            dcfk dcfkVar4 = (dcfk) v.b;
                                            b6.getClass();
                                            dcfkVar4.c = b6;
                                            dcfkVar4.b |= 1;
                                            fhpr fhprVar2 = fhpiVar.d;
                                            if (fhprVar2 == null) {
                                                fhprVar2 = fhpr.a;
                                            }
                                            dcgs b7 = dcso.b(fhprVar2);
                                            if (!v.b.L()) {
                                                v.U();
                                            }
                                            fgri fgriVar2 = v.b;
                                            dcfk dcfkVar5 = (dcfk) fgriVar2;
                                            b7.getClass();
                                            dcfkVar5.d = b7;
                                            i2 = 2;
                                            dcfkVar5.b |= 2;
                                            float f = fhpiVar.e;
                                            if (!fgriVar2.L()) {
                                                v.U();
                                            }
                                            fgri fgriVar3 = v.b;
                                            dcfk dcfkVar6 = (dcfk) fgriVar3;
                                            dcfkVar6.b |= 64;
                                            dcfkVar6.i = f;
                                            fhph fhphVar2 = fhpiVar.g;
                                            if (fhphVar2 == null) {
                                                fhphVar2 = fhph.a;
                                            }
                                            int f2 = dcso.f(fhphVar2.c);
                                            if (!fgriVar3.L()) {
                                                v.U();
                                            }
                                            fgri fgriVar4 = v.b;
                                            dcfk dcfkVar7 = (dcfk) fgriVar4;
                                            dcfkVar7.g = f2 - 1;
                                            dcfkVar7.b |= 16;
                                            fhph fhphVar3 = fhpiVar.g;
                                            if (fhphVar3 == null) {
                                                fhphVar3 = fhph.a;
                                            }
                                            float f3 = fhphVar3.d;
                                            if (!fgriVar4.L()) {
                                                v.U();
                                            }
                                            dcfk dcfkVar8 = (dcfk) v.b;
                                            dcfkVar8.b |= 32;
                                            dcfkVar8.h = f3;
                                            dcfk dcfkVar9 = (dcfk) v.Q();
                                            dcqi dcqiVar = dcsmVar2.c;
                                            fbhk fbhkVar = dcsmVar2.i;
                                            if (fbhkVar == null) {
                                                b2 = null;
                                            } else {
                                                fhpr fhprVar3 = fbhkVar.d;
                                                if (fhprVar3 == null) {
                                                    fhprVar3 = fhpr.a;
                                                }
                                                b2 = dcso.b(fhprVar3);
                                            }
                                            fbhk fbhkVar2 = dcsmVar2.j;
                                            if (fbhkVar2 == null) {
                                                b3 = null;
                                            } else {
                                                fhpr fhprVar4 = fbhkVar2.d;
                                                if (fhprVar4 == null) {
                                                    fhprVar4 = fhpr.a;
                                                }
                                                b3 = dcso.b(fhprVar4);
                                            }
                                            dcfk a3 = dcso.a(dcqiVar, dcfkVar9, b2, b3);
                                            if (!dcfkVar.equals(a3)) {
                                                dcfl dcflVar = (dcfl) dcfn.a.v();
                                                dcflVar.a(a3);
                                                arrayList.add((dcfn) dcflVar.Q());
                                            }
                                            fgub fgubVar6 = fbizVar.d;
                                            if (fgubVar6 == null) {
                                                fgubVar6 = fgub.a;
                                            }
                                            if (fgvp.a(fgubVar6, fgubVar) > 0) {
                                                fgubVar = fgubVar6;
                                            }
                                        }
                                    }
                                }
                                dcsmVar2.a().e("CyclingActivityIneligibleDueToType");
                                dcsmVar2.a().e("CyclingActivityTotalIneligibleUploads");
                            }
                            dzwm dzwmVar = dcsmVar2.g.b;
                            synchronized (dzwmVar) {
                                b = dzwmVar.b(new ekut() { // from class: dcrp
                                    @Override // defpackage.ekut
                                    public final Object apply(Object obj3) {
                                        ddla ddlaVar = (ddla) obj3;
                                        ausn ausnVar2 = dcry.a;
                                        ddkv ddkvVar = ddlaVar.g;
                                        if (ddkvVar == null) {
                                            ddkvVar = ddkv.a;
                                        }
                                        fgrc fgrcVar = (fgrc) ddlaVar.iQ(5, null);
                                        fgrcVar.X(ddlaVar);
                                        ddkw ddkwVar = (ddkw) fgrcVar;
                                        fgrc fgrcVar2 = (fgrc) ddkvVar.iQ(5, null);
                                        fgrcVar2.X(ddkvVar);
                                        if (!fgrcVar2.b.L()) {
                                            fgrcVar2.U();
                                        }
                                        fgub fgubVar7 = fgub.this;
                                        ddkv ddkvVar2 = (ddkv) fgrcVar2.b;
                                        fgubVar7.getClass();
                                        ddkvVar2.c = fgubVar7;
                                        ddkvVar2.b |= 1;
                                        ddkv ddkvVar3 = (ddkv) fgrcVar2.Q();
                                        if (!ddkwVar.b.L()) {
                                            ddkwVar.U();
                                        }
                                        ddla ddlaVar2 = (ddla) ddkwVar.b;
                                        ddkvVar3.getClass();
                                        ddlaVar2.g = ddkvVar3;
                                        ddlaVar2.b |= 4;
                                        return (ddla) ddkwVar.Q();
                                    }
                                }, eqex.a);
                            }
                            return eqdl.f(b, new ekut() { // from class: dcsl
                                @Override // defpackage.ekut
                                public final Object apply(Object obj3) {
                                    dcsm dcsmVar3;
                                    List list = arrayList;
                                    Collections.sort(list, dcso.b);
                                    int i5 = elgo.d;
                                    elgj elgjVar = new elgj();
                                    fgqi fgqiVar = fgvm.b;
                                    Iterator it = list.iterator();
                                    int i6 = 0;
                                    int i7 = 0;
                                    int i8 = 0;
                                    while (true) {
                                        dcsmVar3 = dcsm.this;
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        dcfn dcfnVar = (dcfn) it.next();
                                        if (fgvm.b(fgvm.h(fgqiVar, dcso.c(dcfnVar)), dcsm.b) <= 0) {
                                            i7++;
                                            i8 += ((dcfk) dcfnVar.e.get(0)).j.size();
                                            fgrc fgrcVar = (fgrc) dcfnVar.iQ(5, null);
                                            fgrcVar.X(dcfnVar);
                                            dcfl dcflVar2 = (dcfl) fgrcVar;
                                            if (!dcflVar2.b.L()) {
                                                dcflVar2.U();
                                            }
                                            dcfn dcfnVar2 = (dcfn) dcflVar2.b;
                                            dcfnVar2.b |= 2;
                                            dcfnVar2.d = i7;
                                            dcfn dcfnVar3 = (dcfn) dcflVar2.Q();
                                            elgjVar.i(dcfnVar3);
                                            fgqiVar = fgvm.h(fgqiVar, dcso.c(dcfnVar3));
                                            if (i7 == 4) {
                                                int size = (list.size() - 4) - i6;
                                                dcsmVar3.a().k("CyclingActivityIneligibleDueToDailyCap", size);
                                                dcsmVar3.a().f("CyclingActivityTotalIneligibleUploads", size);
                                                break;
                                            }
                                        } else {
                                            dcsmVar3.a().e("CyclingActivityIneligibleExceedMaxDailyDuration");
                                            dcsmVar3.a().e("CyclingActivityTotalIneligibleUploads");
                                            i6++;
                                        }
                                    }
                                    dcsmVar3.a().k("CyclingActivityTotalSegmentToUpload", i7);
                                    if (i7 > 0) {
                                        dcsmVar3.f.p("CyclingActivityTotalPointToUpload", dcso.e(i8, 256L));
                                        dcsmVar3.f.k("CyclingActivityTotalDurationToUpload", (((int) (fgvm.f(fgqiVar) / 30)) + 1) * 30);
                                    }
                                    return elgjVar.g();
                                }
                            }, eqex.a);
                        }
                    }, eqex.a);
                } else {
                    int i = elgo.d;
                    g = eqgc.i(elpg.a);
                }
                return eqdl.g(eqgb.h(g), new eqdv() { // from class: dcsg
                    @Override // defpackage.eqdv
                    public final eqgl a(Object obj2) {
                        elgo elgoVar = (elgo) obj2;
                        boolean isEmpty2 = elgoVar.isEmpty();
                        CyclingProcessingService cyclingProcessingService2 = CyclingProcessingService.this;
                        if (isEmpty2) {
                            cyclingProcessingService2.d().e("CyclingActivityJobEmptyOutput");
                            return fuqy.d() ? eqdl.f(cyclingProcessingService2.c.e("CyclingActivity", false), new ekut() { // from class: dcsj
                                @Override // defpackage.ekut
                                public final Object apply(Object obj3) {
                                    String str2 = CyclingProcessingService.a;
                                    return 0;
                                }
                            }, eqex.a) : eqgc.i(0);
                        }
                        if (cyclingProcessingService2.f().d(account, elgoVar)) {
                            cyclingProcessingService2.d().e("CyclingActivityJobSuccess");
                            return fuqy.d() ? eqdl.f(cyclingProcessingService2.c.e("CyclingActivity", false), new ekut() { // from class: dcsh
                                @Override // defpackage.ekut
                                public final Object apply(Object obj3) {
                                    String str2 = CyclingProcessingService.a;
                                    return 0;
                                }
                            }, eqex.a) : eqgc.i(0);
                        }
                        cyclingProcessingService2.d().e("CyclingActivityJobFailure");
                        return fuqy.d() ? eqdl.f(cyclingProcessingService2.c.g("CyclingActivity", fgvq.h(System.currentTimeMillis())), new ekut() { // from class: dcsi
                            @Override // defpackage.ekut
                            public final Object apply(Object obj3) {
                                String str2 = CyclingProcessingService.a;
                                return 1;
                            }
                        }, eqex.a) : eqgc.i(1);
                    }
                }, eqex.a);
            }
        }, eqex.a);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.chimera.BoundService, defpackage.rtr
    public final void onDestroy() {
        if (this.d != null) {
            f().a();
        }
        super.onDestroy();
    }
}
