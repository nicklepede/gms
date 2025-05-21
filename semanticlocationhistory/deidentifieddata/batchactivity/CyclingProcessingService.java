package com.google.android.gms.semanticlocationhistory.deidentifieddata.batchactivity;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.chimera.modules.semanticlocationhistory.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.android.gms.semanticlocationhistory.deidentifieddata.batchactivity.CyclingProcessingService;
import defpackage.asej;
import defpackage.asot;
import defpackage.byln;
import defpackage.czje;
import defpackage.czlk;
import defpackage.dade;
import defpackage.dahq;
import defpackage.dann;
import defpackage.enps;
import defpackage.enqc;
import defpackage.enre;
import defpackage.ensi;
import defpackage.ensj;
import defpackage.enss;
import defpackage.fruy;
import defpackage.frxn;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class CyclingProcessingService extends GmsTaskBoundService {
    public static final String a;
    public dade b;
    public final dahq c = new dahq();
    private dann d;
    private czlk e;
    private czje f;

    static {
        asot.c("LocationHistory", asej.SEMANTIC_LOCATION_HISTORY, "CyclingActivity");
        a = CyclingProcessingService.class.getName();
    }

    public static boolean g() {
        return fruy.a.a().a() && fruy.a.a().b() && frxn.Q();
    }

    public final czje d() {
        if (this.f == null) {
            this.f = new czje();
        }
        return this.f;
    }

    public final czlk e() {
        if (this.e == null) {
            this.e = new czlk(d());
        }
        return this.e;
    }

    public final dann f() {
        if (this.d == null) {
            this.d = new dann(e(), d());
        }
        return this.d;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final enss im(byln bylnVar) {
        if (!g()) {
            return ensj.i(0);
        }
        d().e("CyclingActivityJobCount");
        return enps.g(ensi.h(this.c.b()), new enqc() { // from class: dahx
            @Override // defpackage.enqc
            public final enss a(Object obj) {
                enss g;
                String str = (String) obj;
                boolean isEmpty = str.isEmpty();
                final CyclingProcessingService cyclingProcessingService = CyclingProcessingService.this;
                if (isEmpty) {
                    cyclingProcessingService.d().e("CyclingActivityJobEmptyAccount");
                    return ensj.i(0);
                }
                final Account account = new Account(str, "com.google");
                Context a2 = AppContextProvider.a();
                if (cyclingProcessingService.b == null) {
                    cyclingProcessingService.b = dadh.w(a2);
                }
                final daie daieVar = new daie(cyclingProcessingService.b, cyclingProcessingService.e(), cyclingProcessingService.d());
                if (czlp.e(daieVar.d, account)) {
                    daieVar.a().e("CyclingActivityBeginProcessing");
                    g = enps.g(ensi.h(daieVar.g.a()), new enqc() { // from class: daic
                        @Override // defpackage.enqc
                        public final enss a(Object obj2) {
                            boolean z;
                            long j;
                            enss b;
                            czwr b2;
                            czwr b3;
                            final fefi fefiVar = (fefi) obj2;
                            long d = fegx.d(fefiVar);
                            long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) - TimeUnit.HOURS.toSeconds(12L);
                            long j2 = seconds - d;
                            if (j2 > TimeUnit.HOURS.toSeconds(48L)) {
                                d = seconds - TimeUnit.HOURS.toSeconds(24L);
                                z = true;
                            } else {
                                z = false;
                            }
                            final daie daieVar2 = daie.this;
                            if (z) {
                                daieVar2.a().p("CyclingActivityHoursFailedSinceLastProcessedEndTime", TimeUnit.SECONDS.toHours(j2 - TimeUnit.HOURS.toSeconds(24L)));
                            } else {
                                daieVar2.a().p("CyclingActivityDurationSinceLastProcessedEndTime", TimeUnit.SECONDS.toHours(j2));
                            }
                            Account account2 = account;
                            if (frwz.f()) {
                                try {
                                    if (daieVar2.h == null) {
                                        daieVar2.h = new dbej();
                                    }
                                    eyuv eyuvVar = (eyuv) ((enpf) daieVar2.h.b(account2)).u();
                                    if (!eyuvVar.equals(eyuv.a)) {
                                        for (int i = 0; i < eyuvVar.c.size(); i++) {
                                            int b4 = eysv.b(((eysw) eyuvVar.c.get(i)).e);
                                            if (b4 != 0 && b4 == 2) {
                                                daieVar2.i = (eysw) eyuvVar.c.get(i);
                                            }
                                            int b5 = eysv.b(((eysw) eyuvVar.c.get(i)).e);
                                            if (b5 != 0 && b5 == 3) {
                                                daieVar2.j = (eysw) eyuvVar.c.get(i);
                                            }
                                        }
                                    }
                                } catch (InterruptedException | ExecutionException e) {
                                    e.getMessage();
                                    daieVar2.a().e("CyclingActivityPulpStorageExecutionNotComplete");
                                    daieVar2.i = null;
                                    daieVar2.j = null;
                                }
                            }
                            dade dadeVar = daieVar2.e;
                            asot asotVar = daig.a;
                            long seconds2 = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
                            int i2 = 2;
                            if (TimeUnit.SECONDS.toDays(seconds2) - TimeUnit.SECONDS.toDays(d) > 90) {
                                long seconds3 = seconds2 - TimeUnit.DAYS.toSeconds(90L);
                                ((ejhf) ((ejhf) daig.a.h()).ah(10225)).J("Location history from %d requested, exceeding max location history range. Truncating the start time to %d.", d, seconds3);
                                j = seconds3;
                            } else {
                                j = d;
                            }
                            eitj l = dadeVar.l(account2, "deidentified-cycling-activity", j, seconds, eyue.STABILIZED, new int[]{2});
                            final ArrayList arrayList = new ArrayList();
                            int i3 = ((ejcb) l).c;
                            for (int i4 = 0; i4 < i3; i4++) {
                                eyul eyulVar = (eyul) l.get(i4);
                                eyui eyuiVar = eyulVar.g;
                                if (eyuiVar == null) {
                                    eyuiVar = eyui.a;
                                }
                                if (eyuiVar.b == i2) {
                                    eyui eyuiVar2 = eyulVar.g;
                                    if (eyuiVar2 == null) {
                                        eyuiVar2 = eyui.a;
                                    }
                                    ffaj ffajVar = (eyuiVar2.b == i2 ? (ffak) eyuiVar2.c : ffak.a).g;
                                    if (ffajVar == null) {
                                        ffajVar = ffaj.a;
                                    }
                                    if (ffajVar.c != ffai.CYCLING.p) {
                                        i2 = 2;
                                    } else {
                                        fefi fefiVar2 = eyulVar.c;
                                        if (fefiVar2 == null) {
                                            fefiVar2 = fefi.a;
                                        }
                                        fefi fefiVar3 = eyulVar.d;
                                        if (fefiVar3 == null) {
                                            fefiVar3 = fefi.a;
                                        }
                                        if (fegt.b(fegx.e(fefiVar2, fefiVar3), daie.a) > 0) {
                                            daieVar2.a().e("CyclingActivityIneligibleExceedMaxSegmentDuration");
                                            daieVar2.a().e("CyclingActivityTotalIneligibleUploads");
                                            i2 = 2;
                                        } else {
                                            daieVar2.a().e("CyclingActivityTotalEligibleUploads");
                                            eyui eyuiVar3 = eyulVar.g;
                                            if (eyuiVar3 == null) {
                                                eyuiVar3 = eyui.a;
                                            }
                                            ffak ffakVar = eyuiVar3.b == 2 ? (ffak) eyuiVar3.c : ffak.a;
                                            fecj v = czvj.a.v();
                                            fefi fefiVar4 = eyulVar.c;
                                            if (fefiVar4 == null) {
                                                fefiVar4 = fefi.a;
                                            }
                                            if (!v.b.L()) {
                                                v.U();
                                            }
                                            fecp fecpVar = v.b;
                                            czvj czvjVar = (czvj) fecpVar;
                                            fefiVar4.getClass();
                                            czvjVar.e = fefiVar4;
                                            czvjVar.b |= 4;
                                            fefi fefiVar5 = eyulVar.d;
                                            if (fefiVar5 == null) {
                                                fefiVar5 = fefi.a;
                                            }
                                            if (!fecpVar.L()) {
                                                v.U();
                                            }
                                            czvj czvjVar2 = (czvj) v.b;
                                            fefiVar5.getClass();
                                            czvjVar2.f = fefiVar5;
                                            czvjVar2.b |= 8;
                                            ffat ffatVar = ffakVar.c;
                                            if (ffatVar == null) {
                                                ffatVar = ffat.a;
                                            }
                                            czwr b6 = daig.b(ffatVar);
                                            if (!v.b.L()) {
                                                v.U();
                                            }
                                            czvj czvjVar3 = (czvj) v.b;
                                            b6.getClass();
                                            czvjVar3.c = b6;
                                            czvjVar3.b |= 1;
                                            ffat ffatVar2 = ffakVar.d;
                                            if (ffatVar2 == null) {
                                                ffatVar2 = ffat.a;
                                            }
                                            czwr b7 = daig.b(ffatVar2);
                                            if (!v.b.L()) {
                                                v.U();
                                            }
                                            fecp fecpVar2 = v.b;
                                            czvj czvjVar4 = (czvj) fecpVar2;
                                            b7.getClass();
                                            czvjVar4.d = b7;
                                            i2 = 2;
                                            czvjVar4.b |= 2;
                                            float f = ffakVar.e;
                                            if (!fecpVar2.L()) {
                                                v.U();
                                            }
                                            fecp fecpVar3 = v.b;
                                            czvj czvjVar5 = (czvj) fecpVar3;
                                            czvjVar5.b |= 64;
                                            czvjVar5.i = f;
                                            ffaj ffajVar2 = ffakVar.g;
                                            if (ffajVar2 == null) {
                                                ffajVar2 = ffaj.a;
                                            }
                                            int f2 = daig.f(ffajVar2.c);
                                            if (!fecpVar3.L()) {
                                                v.U();
                                            }
                                            fecp fecpVar4 = v.b;
                                            czvj czvjVar6 = (czvj) fecpVar4;
                                            czvjVar6.g = f2 - 1;
                                            czvjVar6.b |= 16;
                                            ffaj ffajVar3 = ffakVar.g;
                                            if (ffajVar3 == null) {
                                                ffajVar3 = ffaj.a;
                                            }
                                            float f3 = ffajVar3.d;
                                            if (!fecpVar4.L()) {
                                                v.U();
                                            }
                                            czvj czvjVar7 = (czvj) v.b;
                                            czvjVar7.b |= 32;
                                            czvjVar7.h = f3;
                                            czvj czvjVar8 = (czvj) v.Q();
                                            daga dagaVar = daieVar2.c;
                                            eysw eyswVar = daieVar2.i;
                                            if (eyswVar == null) {
                                                b2 = null;
                                            } else {
                                                ffat ffatVar3 = eyswVar.d;
                                                if (ffatVar3 == null) {
                                                    ffatVar3 = ffat.a;
                                                }
                                                b2 = daig.b(ffatVar3);
                                            }
                                            eysw eyswVar2 = daieVar2.j;
                                            if (eyswVar2 == null) {
                                                b3 = null;
                                            } else {
                                                ffat ffatVar4 = eyswVar2.d;
                                                if (ffatVar4 == null) {
                                                    ffatVar4 = ffat.a;
                                                }
                                                b3 = daig.b(ffatVar4);
                                            }
                                            czvj a3 = daig.a(dagaVar, czvjVar8, b2, b3);
                                            if (!czvj.a.equals(a3)) {
                                                czvk czvkVar = (czvk) czvm.a.v();
                                                czvkVar.a(a3);
                                                arrayList.add((czvm) czvkVar.Q());
                                            }
                                            fefi fefiVar6 = eyulVar.d;
                                            if (fefiVar6 == null) {
                                                fefiVar6 = fefi.a;
                                            }
                                            if (fegw.a(fefiVar6, fefiVar) > 0) {
                                                fefiVar = fefiVar6;
                                            }
                                        }
                                    }
                                }
                                daieVar2.a().e("CyclingActivityIneligibleDueToType");
                                daieVar2.a().e("CyclingActivityTotalIneligibleUploads");
                            }
                            dxkm dxkmVar = daieVar2.g.b;
                            synchronized (dxkmVar) {
                                b = dxkmVar.b(new eiho() { // from class: dahh
                                    @Override // defpackage.eiho
                                    public final Object apply(Object obj3) {
                                        dbas dbasVar = (dbas) obj3;
                                        asot asotVar2 = dahq.a;
                                        dban dbanVar = dbasVar.g;
                                        if (dbanVar == null) {
                                            dbanVar = dban.a;
                                        }
                                        fecj fecjVar = (fecj) dbasVar.iB(5, null);
                                        fecjVar.X(dbasVar);
                                        dbao dbaoVar = (dbao) fecjVar;
                                        fecj fecjVar2 = (fecj) dbanVar.iB(5, null);
                                        fecjVar2.X(dbanVar);
                                        if (!fecjVar2.b.L()) {
                                            fecjVar2.U();
                                        }
                                        fefi fefiVar7 = fefi.this;
                                        dban dbanVar2 = (dban) fecjVar2.b;
                                        fefiVar7.getClass();
                                        dbanVar2.c = fefiVar7;
                                        dbanVar2.b |= 1;
                                        dban dbanVar3 = (dban) fecjVar2.Q();
                                        if (!dbaoVar.b.L()) {
                                            dbaoVar.U();
                                        }
                                        dbas dbasVar2 = (dbas) dbaoVar.b;
                                        dbanVar3.getClass();
                                        dbasVar2.g = dbanVar3;
                                        dbasVar2.b |= 4;
                                        return (dbas) dbaoVar.Q();
                                    }
                                }, enre.a);
                            }
                            return enps.f(b, new eiho() { // from class: daid
                                @Override // defpackage.eiho
                                public final Object apply(Object obj3) {
                                    daie daieVar3;
                                    List list = arrayList;
                                    Collections.sort(list, daig.b);
                                    int i5 = eitj.d;
                                    eite eiteVar = new eite();
                                    febp febpVar = fegt.b;
                                    Iterator it = list.iterator();
                                    int i6 = 0;
                                    int i7 = 0;
                                    int i8 = 0;
                                    while (true) {
                                        daieVar3 = daie.this;
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        czvm czvmVar = (czvm) it.next();
                                        if (fegt.b(fegt.h(febpVar, daig.c(czvmVar)), daie.b) <= 0) {
                                            i7++;
                                            i8 += ((czvj) czvmVar.e.get(0)).j.size();
                                            fecj fecjVar = (fecj) czvmVar.iB(5, null);
                                            fecjVar.X(czvmVar);
                                            czvk czvkVar2 = (czvk) fecjVar;
                                            if (!czvkVar2.b.L()) {
                                                czvkVar2.U();
                                            }
                                            czvm czvmVar2 = (czvm) czvkVar2.b;
                                            czvmVar2.b |= 2;
                                            czvmVar2.d = i7;
                                            czvm czvmVar3 = (czvm) czvkVar2.Q();
                                            eiteVar.i(czvmVar3);
                                            febpVar = fegt.h(febpVar, daig.c(czvmVar3));
                                            if (i7 == 4) {
                                                int size = (list.size() - 4) - i6;
                                                daieVar3.a().k("CyclingActivityIneligibleDueToDailyCap", size);
                                                daieVar3.a().f("CyclingActivityTotalIneligibleUploads", size);
                                                break;
                                            }
                                        } else {
                                            daieVar3.a().e("CyclingActivityIneligibleExceedMaxDailyDuration");
                                            daieVar3.a().e("CyclingActivityTotalIneligibleUploads");
                                            i6++;
                                        }
                                    }
                                    daieVar3.a().k("CyclingActivityTotalSegmentToUpload", i7);
                                    if (i7 > 0) {
                                        daieVar3.f.p("CyclingActivityTotalPointToUpload", daig.e(i8, 256L));
                                        daieVar3.f.k("CyclingActivityTotalDurationToUpload", (((int) (fegt.f(febpVar) / 30)) + 1) * 30);
                                    }
                                    return eiteVar.g();
                                }
                            }, enre.a);
                        }
                    }, enre.a);
                } else {
                    int i = eitj.d;
                    g = ensj.i(ejcb.a);
                }
                return enps.g(ensi.h(g), new enqc() { // from class: dahy
                    @Override // defpackage.enqc
                    public final enss a(Object obj2) {
                        eitj eitjVar = (eitj) obj2;
                        boolean isEmpty2 = eitjVar.isEmpty();
                        CyclingProcessingService cyclingProcessingService2 = CyclingProcessingService.this;
                        if (isEmpty2) {
                            cyclingProcessingService2.d().e("CyclingActivityJobEmptyOutput");
                            return frwe.d() ? enps.f(cyclingProcessingService2.c.e("CyclingActivity", false), new eiho() { // from class: daib
                                @Override // defpackage.eiho
                                public final Object apply(Object obj3) {
                                    String str2 = CyclingProcessingService.a;
                                    return 0;
                                }
                            }, enre.a) : ensj.i(0);
                        }
                        if (cyclingProcessingService2.f().d(account, eitjVar)) {
                            cyclingProcessingService2.d().e("CyclingActivityJobSuccess");
                            return frwe.d() ? enps.f(cyclingProcessingService2.c.e("CyclingActivity", false), new eiho() { // from class: dahz
                                @Override // defpackage.eiho
                                public final Object apply(Object obj3) {
                                    String str2 = CyclingProcessingService.a;
                                    return 0;
                                }
                            }, enre.a) : ensj.i(0);
                        }
                        cyclingProcessingService2.d().e("CyclingActivityJobFailure");
                        return frwe.d() ? enps.f(cyclingProcessingService2.c.g("CyclingActivity", fegx.h(System.currentTimeMillis())), new eiho() { // from class: daia
                            @Override // defpackage.eiho
                            public final Object apply(Object obj3) {
                                String str2 = CyclingProcessingService.a;
                                return 1;
                            }
                        }, enre.a) : ensj.i(1);
                    }
                }, enre.a);
            }
        }, enre.a);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.chimera.BoundService, defpackage.qan
    public final void onDestroy() {
        if (this.d != null) {
            f().a();
        }
        super.onDestroy();
    }
}
