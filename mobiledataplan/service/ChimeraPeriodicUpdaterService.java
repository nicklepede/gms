package com.google.android.gms.mobiledataplan.service;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import com.google.android.gms.chimera.modules.mobiledataplan.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import com.google.android.gms.mobiledataplan.MdpCarrierPlanIdResponse;
import com.google.android.gms.mobiledataplan.carriersupport.CarrierSupportInfo;
import defpackage.aqxe;
import defpackage.aqxi;
import defpackage.asej;
import defpackage.asot;
import defpackage.asqx;
import defpackage.byjl;
import defpackage.byki;
import defpackage.bykj;
import defpackage.bykm;
import defpackage.bylf;
import defpackage.byln;
import defpackage.ceap;
import defpackage.ceau;
import defpackage.ceav;
import defpackage.cebd;
import defpackage.cebe;
import defpackage.cecb;
import defpackage.cecl;
import defpackage.cecv;
import defpackage.cecw;
import defpackage.cecx;
import defpackage.ceeh;
import defpackage.ceqf;
import defpackage.ceqi;
import defpackage.dfah;
import defpackage.dfak;
import defpackage.ejhf;
import defpackage.elfu;
import defpackage.elfx;
import defpackage.elfy;
import defpackage.elfz;
import defpackage.elga;
import defpackage.elgf;
import defpackage.elgg;
import defpackage.elgh;
import defpackage.elgj;
import defpackage.elgk;
import defpackage.elgl;
import defpackage.elgs;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fefi;
import defpackage.fegt;
import defpackage.fegx;
import defpackage.fegz;
import defpackage.fehe;
import defpackage.ffgu;
import defpackage.fnbr;
import defpackage.fnde;
import defpackage.fqfv;
import defpackage.fqgb;
import defpackage.fqgh;
import defpackage.fqhb;
import defpackage.fqhf;
import defpackage.fqhj;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class ChimeraPeriodicUpdaterService extends GmsTaskChimeraService implements dfak, dfah {
    private final LinkedBlockingQueue c;
    private final cecx d;
    private final AtomicInteger e;
    private final AtomicInteger f;
    private final Object h;
    private int i;
    private ceap j;
    private Context k;
    private final Object l;
    private long m;
    private final cecw n;
    private static final Set b = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(27021, 27001, 27005, 27007)));
    public static final asot a = asot.b("MobileDataPlan", asej.MOBILE_DATA_PLAN);

    public ChimeraPeriodicUpdaterService() {
        this.e = new AtomicInteger();
        this.f = new AtomicInteger();
        this.h = new Object();
        this.l = new Object();
        this.n = new cecw();
        if (fqhf.a.a().Y()) {
            LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
            this.c = linkedBlockingQueue;
            cecx cecxVar = new cecx(linkedBlockingQueue);
            this.d = cecxVar;
            cecxVar.start();
        } else {
            this.c = null;
            this.d = null;
        }
        this.i = 0;
    }

    public static void e(Context context, long j, long j2, elgk elgkVar) {
        f(context, j, j2, elgkVar, elfy.a);
    }

    public static void f(Context context, long j, long j2, elgk elgkVar, elfy elfyVar) {
        Long q;
        fehe d;
        fecj v;
        if (fqhf.J()) {
            if (ceqi.i(context)) {
                cecl.c().G(37, elgkVar, elfyVar);
                return;
            }
            if (u()) {
                cecl.c().G(21, elgkVar, elfyVar);
                return;
            }
            if (fqgb.a.a().m()) {
                String g = ceqf.g(context);
                if ((elgkVar == elgk.ACTIVE_SIM_SWITCH_EVENT || elgkVar == elgk.SIM_CHANGE_EVENT || elgkVar == elgk.MODULE_INIT_EVENT) && g != null && !"1234567890987654321".equals(g) && (q = ceau.c().q(g)) != null && q.longValue() >= TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) && q.longValue() - fqgh.a.a().c() >= TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())) {
                    cebe c = ceau.c().d.c(g);
                    Long valueOf = (c == null || (d = c.d()) == null) ? null : Long.valueOf(d.d);
                    if (valueOf != null && valueOf.longValue() >= TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) && valueOf.longValue() < q.longValue()) {
                        if (fqhb.g()) {
                            fecj fecjVar = (fecj) elfyVar.iB(5, null);
                            fecjVar.X(elfyVar);
                            if (!fecjVar.b.L()) {
                                fecjVar.U();
                            }
                            elfy elfyVar2 = (elfy) fecjVar.b;
                            elfy elfyVar3 = elfy.a;
                            elfyVar2.e = true;
                            cecl.c().G(10, elgkVar, (elfy) fecjVar.Q());
                            return;
                        }
                        return;
                    }
                }
                if (g != null) {
                    ceau c2 = ceau.c();
                    long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) + j;
                    Long valueOf2 = Long.valueOf(seconds);
                    ceav ceavVar = c2.d;
                    if (ceavVar.c(g) == null || ceavVar.c(g).d() == null) {
                        v = fehe.a.v();
                    } else {
                        fehe d2 = ceavVar.c(g).d();
                        v = (fecj) d2.iB(5, null);
                        v.X(d2);
                    }
                    cebd cebdVar = new cebd();
                    cebdVar.g(g);
                    valueOf2.getClass();
                    if (!v.b.L()) {
                        v.U();
                    }
                    fehe feheVar = (fehe) v.b;
                    fehe feheVar2 = fehe.a;
                    feheVar.d = seconds;
                    cebdVar.i((fehe) v.Q());
                    boolean i = ceavVar.i(cebdVar.a());
                    if (fqhb.h()) {
                        cecl c3 = cecl.c();
                        fecj v2 = elga.a.v();
                        if (!v2.b.L()) {
                            v2.U();
                        }
                        fecp fecpVar = v2.b;
                        ((elga) fecpVar).b = elfz.a(4);
                        if (!fecpVar.L()) {
                            v2.U();
                        }
                        ((elga) v2.b).c = i;
                        c3.j((elga) v2.Q(), "MDP_PeriodicService", 0);
                    }
                }
            }
            if (fqhb.g()) {
                cecl.c().G(3, elgkVar, elfyVar);
            }
            o(context, j, j2, elgkVar);
        }
    }

    public static void g(Context context) {
        a.f(ceqi.h()).U("%s: BgWorkflow: enabled %s interval %d flex %d.", "PeriodicService", Boolean.valueOf(fqfv.n()), Long.valueOf(fqfv.c()), Long.valueOf(fqfv.b()));
        if (fqfv.n()) {
            Bundle bundle = new Bundle();
            if (fqfv.f()) {
                bundle.putLong("task_interval_key", fqfv.c());
                bundle.putLong("task_flex_key", fqfv.b());
            }
            cecl c = cecl.c();
            long c2 = fqfv.c();
            long b2 = fqfv.b();
            elgs D = c.D(20, "GTAF_Server", "MDP_PeriodicService");
            fecj fecjVar = (fecj) D.iB(5, null);
            fecjVar.X(D);
            fecj v = elfx.a.v();
            if (!v.b.L()) {
                v.U();
            }
            ((elfx) v.b).c = fegz.b(3);
            fecj v2 = elfu.a.v();
            if (!v2.b.L()) {
                v2.U();
            }
            fecp fecpVar = v2.b;
            ((elfu) fecpVar).b = c2;
            if (!fecpVar.L()) {
                v2.U();
            }
            ((elfu) v2.b).c = b2;
            elfu elfuVar = (elfu) v2.Q();
            if (!v.b.L()) {
                v.U();
            }
            elfx elfxVar = (elfx) v.b;
            elfuVar.getClass();
            elfxVar.e = elfuVar;
            elfxVar.b |= 1;
            elfx elfxVar2 = (elfx) v.Q();
            if (!fecjVar.b.L()) {
                fecjVar.U();
            }
            elgs elgsVar = (elgs) fecjVar.b;
            elgs elgsVar2 = elgs.a;
            elfxVar2.getClass();
            elgsVar.v = elfxVar2;
            elgsVar.b |= 2048;
            c.d((elgs) fecjVar.Q(), ffgu.SCHEDULE_PERIODIC_WORKFLOW);
            bykm bykmVar = new bykm();
            bykmVar.j = "com.google.android.gms.mobiledataplan.service.PeriodicUpdaterService";
            bykmVar.t("mobiledataplan_bg_periodic_checker");
            bykmVar.y(0, 0);
            bykmVar.v(1);
            bykmVar.u = bundle;
            long c3 = fqfv.c();
            long b3 = fqfv.b();
            if (fnde.g()) {
                bykmVar.j(byki.a(c3));
            } else {
                bykmVar.a = c3;
                bykmVar.b = b3;
            }
            byjl.a(context).f(bykmVar.b());
        }
    }

    public static void h(Context context) {
        asot asotVar = a;
        asotVar.f(ceqi.h()).Q("%s: ConsentFetch: enabled %s", "PeriodicService", fqgh.f());
        if (fqgh.f()) {
            cecw m = m(context);
            asotVar.f(ceqi.h()).T("%s: ConsentFetch: interval %d flex %d.", "PeriodicService", Long.valueOf(m.a), Long.valueOf(m.b));
            bykm bykmVar = new bykm();
            bykmVar.j = "com.google.android.gms.mobiledataplan.service.PeriodicUpdaterService";
            bykmVar.t("mobiledataplan_consent_fetch");
            bykmVar.y(0, 1);
            bykmVar.v(1);
            if (fnde.g()) {
                bykmVar.j(byki.a(m.a));
            } else {
                bykmVar.e(m.a, m.b, bylf.a);
            }
            Bundle bundle = new Bundle();
            int a2 = cecl.a();
            bundle.putInt("event_flow_id", a2);
            bundle.putLong("task_interval_key", m.a);
            bundle.putLong("task_flex_key", m.b);
            bykmVar.u = bundle;
            byjl.a(context).f(bykmVar.b());
            new cecl(context).L(12, ffgu.BACKGROUND_CONSENT_SCHEDULE, Integer.valueOf(a2), null);
        }
    }

    public static void j(Context context) {
        Long o;
        asot asotVar = a;
        asotVar.f(ceqi.h()).W("%s: GcoreRegister: interval %d flex %d. schedule:%b update:%b disableLegacy:%b", "PeriodicService", Long.valueOf(fqgb.d()), Long.valueOf(fqgb.c()), Boolean.valueOf(fqgb.j()), Boolean.valueOf(fqgb.h()), Boolean.valueOf(fqfv.o()));
        if (!fqgb.j() || fqfv.o()) {
            asotVar.f(ceqi.h()).B("%s: GcoreRegister: not enabled, skip scheduling.", "PeriodicService");
            return;
        }
        bykm bykmVar = new bykm();
        bykmVar.j = "com.google.android.gms.mobiledataplan.service.PeriodicUpdaterService";
        bykmVar.t("mobiledataplan_register");
        bykmVar.y(0, 1);
        bykmVar.x(0, 1);
        bykmVar.v(1);
        long d = fqgb.d();
        long c = fqgb.c();
        if (fnde.g()) {
            bykmVar.j(byki.a(d));
        } else {
            bykmVar.a = d;
            bykmVar.b = c;
        }
        Bundle bundle = new Bundle();
        int a2 = cecl.a();
        bundle.putInt("event_flow_id", a2);
        bundle.putLong("task_interval_key", d);
        bundle.putLong("task_flex_key", c);
        bykmVar.u = bundle;
        byjl.a(context).f(bykmVar.b());
        String c2 = cecb.a().c(context);
        String g = ceqf.g(context);
        String s = ceau.c().s(g);
        if (s == null) {
            s = "dummy_cpid_before_retrieval";
            o = null;
        } else {
            o = ceau.c().o(s);
            if (!ceau.c().F(g)) {
                s = "dummy_cpid_before_consent";
            }
        }
        if (o == null) {
            o = ceeh.b;
        }
        cecl ceclVar = new cecl(context);
        String u = fqhf.u();
        int f = (int) fqhf.f();
        long longValue = o.longValue();
        Integer valueOf = Integer.valueOf(a2);
        elgf elgfVar = (elgf) elgh.a.v();
        String k = ceqi.k(asqx.c(c2));
        if (!elgfVar.b.L()) {
            elgfVar.U();
        }
        elgh elghVar = (elgh) elgfVar.b;
        k.getClass();
        elghVar.b = k;
        if (!elgfVar.b.L()) {
            elgfVar.U();
        }
        elgh elghVar2 = (elgh) elgfVar.b;
        u.getClass();
        elghVar2.c = u;
        if (!elgfVar.b.L()) {
            elgfVar.U();
        }
        ((elgh) elgfVar.b).d = f;
        if (!elgfVar.b.L()) {
            elgfVar.U();
        }
        ((elgh) elgfVar.b).e = longValue;
        if (!elgfVar.b.L()) {
            elgfVar.U();
        }
        ((elgh) elgfVar.b).f = s;
        if (!elgfVar.b.L()) {
            elgfVar.U();
        }
        ((elgh) elgfVar.b).g = elgg.a(5);
        elgh elghVar3 = (elgh) elgfVar.Q();
        fecj v = elgl.a.v();
        if (!v.b.L()) {
            v.U();
        }
        fecp fecpVar = v.b;
        ((elgl) fecpVar).c = elgj.a(9);
        if (!fecpVar.L()) {
            v.U();
        }
        elgl elglVar = (elgl) v.b;
        elghVar3.getClass();
        elglVar.i = elghVar3;
        elglVar.b |= 4;
        elgl elglVar2 = (elgl) v.Q();
        elgs D = ceclVar.D(17, "GTAF_Server", "MDP_PeriodicService");
        fecj fecjVar = (fecj) D.iB(5, null);
        fecjVar.X(D);
        if (!fecjVar.b.L()) {
            fecjVar.U();
        }
        elgs elgsVar = (elgs) fecjVar.b;
        elgs elgsVar2 = elgs.a;
        elgsVar.t = 0L;
        if (!fecjVar.b.L()) {
            fecjVar.U();
        }
        elgs elgsVar3 = (elgs) fecjVar.b;
        elglVar2.getClass();
        elgsVar3.r = elglVar2;
        elgsVar3.b |= 256;
        ceclVar.e((elgs) fecjVar.Q(), ffgu.CPID_REGISTER_ACTION, valueOf);
    }

    public static void k(Context context) {
        asot asotVar = a;
        asotVar.f(ceqi.h()).Q("%s: MeterednessUpdate: enabled %s", "PeriodicService", fqhj.i());
        if (fqhj.h() && fqhj.i() && Build.VERSION.SDK_INT >= 29) {
            cecw n = n();
            asotVar.f(ceqi.h()).T("%s: MeterednessUpdate: interval %d flex %d.", "PeriodicService", Long.valueOf(n.a), Long.valueOf(n.b));
            bykm bykmVar = new bykm();
            bykmVar.j = "com.google.android.gms.mobiledataplan.service.PeriodicUpdaterService";
            bykmVar.t("mobiledataplan_meteredness_update");
            bykmVar.y(0, 1);
            bykmVar.v(1);
            if (fnde.g()) {
                bykmVar.j(byki.a(n.a));
            } else {
                bykmVar.e(n.a, n.b, bylf.a);
            }
            Bundle bundle = new Bundle();
            int a2 = cecl.a();
            bundle.putInt("event_flow_id", a2);
            bundle.putLong("task_interval_key", n.a);
            bundle.putLong("task_flex_key", n.b);
            bykmVar.u = bundle;
            byjl.a(context).f(bykmVar.b());
            new cecl(context).L(22, ffgu.PERIODIC_SCHEDULE_METEREDNESS, Integer.valueOf(a2), null);
        }
    }

    public static void l(Context context, int i, int i2) {
        bykj bykjVar = new bykj();
        bykjVar.j = "com.google.android.gms.mobiledataplan.service.PeriodicUpdaterService";
        bykjVar.t("mobiledataplan_meteredness_update");
        bykjVar.e(fqhj.b(), fqhj.c());
        bykjVar.y(0, 1);
        bykjVar.v(1);
        Bundle bundle = new Bundle();
        bundle.putInt("event_flow_id", i2);
        bykjVar.u = bundle;
        fqhj.b();
        fqhj.c();
        new cecl(context).L(i, ffgu.PERIODIC_SCHEDULE_METEREDNESS, Integer.valueOf(i2), null);
        byjl.a(context).f(bykjVar.b());
    }

    private static cecw m(Context context) {
        long b2;
        long d;
        ceau c = ceau.c();
        Long p = c.p(ceqf.g(context));
        fefi i = c.i(p);
        if (i == null || fegt.b(fegx.e(i, fegx.h(System.currentTimeMillis())), fegt.o(fqgh.a.a().b())) > 0 || c.d(p) == null) {
            b2 = fqgh.b();
            d = fqgh.a.a().d();
        } else {
            fqgh fqghVar = fqgh.a;
            b2 = fqghVar.a().g();
            d = fqghVar.a().f();
        }
        cecw cecwVar = new cecw();
        cecwVar.a = b2;
        cecwVar.b = d;
        return cecwVar;
    }

    private static cecw n() {
        cecw cecwVar = new cecw();
        cecwVar.a = fqhj.a.a().e();
        cecwVar.b = fqhj.a.a().d();
        return cecwVar;
    }

    private static void o(Context context, long j, long j2, elgk elgkVar) {
        new cecv().start();
        p(context, j, j2, elgkVar, Integer.valueOf(cecl.a()));
    }

    private static void p(Context context, long j, long j2, elgk elgkVar, Integer num) {
        long j3;
        int intValue = num.intValue();
        cecl ceclVar = new cecl(context);
        elgs D = ceclVar.D(17, "GTAF_Server", "MDP_PeriodicService");
        fecj fecjVar = (fecj) D.iB(5, null);
        fecjVar.X(D);
        fecj v = elgl.a.v();
        if (!v.b.L()) {
            v.U();
        }
        fecp fecpVar = v.b;
        ((elgl) fecpVar).c = elgj.a(3);
        if (!fecpVar.L()) {
            v.U();
        }
        fecp fecpVar2 = v.b;
        ((elgl) fecpVar2).f = j;
        if (!fecpVar2.L()) {
            v.U();
        }
        ((elgl) v.b).d = elgkVar.a();
        elgl elglVar = (elgl) v.Q();
        if (!fecjVar.b.L()) {
            fecjVar.U();
        }
        elgs elgsVar = (elgs) fecjVar.b;
        elgs elgsVar2 = elgs.a;
        elglVar.getClass();
        elgsVar.r = elglVar;
        elgsVar.b |= 256;
        ceclVar.e((elgs) fecjVar.Q(), ffgu.BACKGROUND_CPID_SCHEDULE, num);
        Bundle bundle = new Bundle();
        bundle.putInt("cpid_update_cause", elgkVar.a());
        bundle.putInt("event_flow_id", intValue);
        bundle.putLong("task_interval_key", j);
        bundle.putLong("task_flex_key", j2);
        bykm bykmVar = new bykm();
        bykmVar.j = "com.google.android.gms.mobiledataplan.service.PeriodicUpdaterService";
        bykmVar.u = bundle;
        bykmVar.t("mobiledataplan_cpid_refresher");
        bykmVar.y(0, 0);
        bykmVar.v(1);
        if (fnde.g()) {
            j3 = j;
            bykmVar.e(j3, (long) (fnbr.b() * j), bylf.a);
        } else {
            j3 = j;
            bykmVar.a = j3;
            bykmVar.b = j2;
        }
        byjl.a(context).f(bykmVar.b());
        a.f(ceqi.h()).V("%s: CpidFetch: interval %d flex %d. Service %b Update %b.", "PeriodicService", Long.valueOf(j3), Long.valueOf(j2), Boolean.valueOf(fqhf.J()), Boolean.valueOf(fqhf.R()));
    }

    private static boolean q(Context context, byln bylnVar) {
        cecw m = m(context);
        return (v(bylnVar, "task_interval_key", m.a) && v(bylnVar, "task_flex_key", m.b)) ? false : true;
    }

    private final boolean r(long j, long j2) {
        cecw cecwVar = this.n;
        boolean z = true;
        if (cecwVar.a == j && cecwVar.b == j2) {
            z = false;
        }
        long j3 = cecwVar.b;
        return z;
    }

    private static boolean s(byln bylnVar) {
        boolean z = true;
        if (v(bylnVar, "task_interval_key", fqgb.d()) && v(bylnVar, "task_flex_key", fqgb.c())) {
            z = false;
        }
        fqgb.d();
        fqgb.c();
        return z;
    }

    private static boolean t(byln bylnVar) {
        cecw n = n();
        return (v(bylnVar, "task_interval_key", n.a) && v(bylnVar, "task_flex_key", n.b)) ? false : true;
    }

    private static boolean u() {
        return fqfv.p() && ceau.c().v();
    }

    private static boolean v(byln bylnVar, String str, long j) {
        Bundle bundle = bylnVar.b;
        return bundle != null && bundle.containsKey(str) && bundle.getLong(str) == j;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static final void w(String str, elgk elgkVar, elfy elfyVar) {
        char c;
        byjl.a(AppContextProvider.a()).d(str, "com.google.android.gms.mobiledataplan.service.PeriodicUpdaterService");
        switch (str.hashCode()) {
            case -1959874559:
                if (str.equals("mobiledataplan_bg_periodic_checker")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1754313517:
                if (str.equals("mobiledataplan_meteredness_update")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1712408421:
                if (str.equals("mobiledataplan_cpid_refresher")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 348189707:
                if (str.equals("mobiledataplan_consent_fetch")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 776613677:
                if (str.equals("mobiledataplan_register")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        int i = c != 0 ? c != 1 ? c != 2 ? c != 3 ? c != 4 ? 18 : 17 : 25 : 16 : 15 : 14;
        if (fqhb.a.a().o()) {
            cecl.c().G(i, elgkVar, elfyVar);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0345, code lost:
    
        if (r3 == defpackage.ffgs.NOT_REQUIRED) goto L162;
     */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03c6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03c7 A[RETURN] */
    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(defpackage.byln r15) {
        /*
            Method dump skipped, instructions count: 1848
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.mobiledataplan.service.ChimeraPeriodicUpdaterService.a(byln):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00b6 A[Catch: all -> 0x0188, TryCatch #3 {, blocks: (B:4:0x000d, B:9:0x0021, B:44:0x0035, B:17:0x0077, B:19:0x00b6, B:20:0x00b9, B:22:0x00c6, B:23:0x00c9, B:25:0x00d6, B:26:0x00d9, B:28:0x00e6, B:29:0x00e9, B:31:0x0103, B:32:0x0106, B:34:0x0118, B:35:0x011b, B:37:0x0137, B:38:0x013a, B:12:0x004b, B:15:0x0058, B:42:0x006b, B:50:0x0160, B:51:0x0162), top: B:3:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c6 A[Catch: all -> 0x0188, TryCatch #3 {, blocks: (B:4:0x000d, B:9:0x0021, B:44:0x0035, B:17:0x0077, B:19:0x00b6, B:20:0x00b9, B:22:0x00c6, B:23:0x00c9, B:25:0x00d6, B:26:0x00d9, B:28:0x00e6, B:29:0x00e9, B:31:0x0103, B:32:0x0106, B:34:0x0118, B:35:0x011b, B:37:0x0137, B:38:0x013a, B:12:0x004b, B:15:0x0058, B:42:0x006b, B:50:0x0160, B:51:0x0162), top: B:3:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d6 A[Catch: all -> 0x0188, TryCatch #3 {, blocks: (B:4:0x000d, B:9:0x0021, B:44:0x0035, B:17:0x0077, B:19:0x00b6, B:20:0x00b9, B:22:0x00c6, B:23:0x00c9, B:25:0x00d6, B:26:0x00d9, B:28:0x00e6, B:29:0x00e9, B:31:0x0103, B:32:0x0106, B:34:0x0118, B:35:0x011b, B:37:0x0137, B:38:0x013a, B:12:0x004b, B:15:0x0058, B:42:0x006b, B:50:0x0160, B:51:0x0162), top: B:3:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e6 A[Catch: all -> 0x0188, TryCatch #3 {, blocks: (B:4:0x000d, B:9:0x0021, B:44:0x0035, B:17:0x0077, B:19:0x00b6, B:20:0x00b9, B:22:0x00c6, B:23:0x00c9, B:25:0x00d6, B:26:0x00d9, B:28:0x00e6, B:29:0x00e9, B:31:0x0103, B:32:0x0106, B:34:0x0118, B:35:0x011b, B:37:0x0137, B:38:0x013a, B:12:0x004b, B:15:0x0058, B:42:0x006b, B:50:0x0160, B:51:0x0162), top: B:3:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0103 A[Catch: all -> 0x0188, TryCatch #3 {, blocks: (B:4:0x000d, B:9:0x0021, B:44:0x0035, B:17:0x0077, B:19:0x00b6, B:20:0x00b9, B:22:0x00c6, B:23:0x00c9, B:25:0x00d6, B:26:0x00d9, B:28:0x00e6, B:29:0x00e9, B:31:0x0103, B:32:0x0106, B:34:0x0118, B:35:0x011b, B:37:0x0137, B:38:0x013a, B:12:0x004b, B:15:0x0058, B:42:0x006b, B:50:0x0160, B:51:0x0162), top: B:3:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0118 A[Catch: all -> 0x0188, TryCatch #3 {, blocks: (B:4:0x000d, B:9:0x0021, B:44:0x0035, B:17:0x0077, B:19:0x00b6, B:20:0x00b9, B:22:0x00c6, B:23:0x00c9, B:25:0x00d6, B:26:0x00d9, B:28:0x00e6, B:29:0x00e9, B:31:0x0103, B:32:0x0106, B:34:0x0118, B:35:0x011b, B:37:0x0137, B:38:0x013a, B:12:0x004b, B:15:0x0058, B:42:0x006b, B:50:0x0160, B:51:0x0162), top: B:3:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0137 A[Catch: all -> 0x0188, TryCatch #3 {, blocks: (B:4:0x000d, B:9:0x0021, B:44:0x0035, B:17:0x0077, B:19:0x00b6, B:20:0x00b9, B:22:0x00c6, B:23:0x00c9, B:25:0x00d6, B:26:0x00d9, B:28:0x00e6, B:29:0x00e9, B:31:0x0103, B:32:0x0106, B:34:0x0118, B:35:0x011b, B:37:0x0137, B:38:0x013a, B:12:0x004b, B:15:0x0058, B:42:0x006b, B:50:0x0160, B:51:0x0162), top: B:3:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void d(com.google.android.gms.mobiledataplan.MdpCarrierPlanIdRequest r13, defpackage.ceap r14) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.mobiledataplan.service.ChimeraPeriodicUpdaterService.d(com.google.android.gms.mobiledataplan.MdpCarrierPlanIdRequest, ceap):void");
    }

    @Override // defpackage.dfah
    public final void gm(Exception exc) {
        long j;
        String str;
        synchronized (this.l) {
            j = this.m;
        }
        boolean z = exc instanceof aqxe;
        new cecl(AppContextProvider.a()).E(z ? ((aqxe) exc).a() : 13, j, this.i, 0L, 17);
        if (z) {
            aqxe aqxeVar = (aqxe) exc;
            asot asotVar = a;
            ejhf f = asotVar.f(ceqi.h());
            int a2 = aqxeVar.a();
            int a3 = aqxeVar.a();
            if (a3 == 27100) {
                str = "MDP_NOT_IMPLEMENTED";
            } else if (a3 == 27101) {
                str = "MDP_MODULE_DISABLED";
            } else if (a3 != 27150) {
                switch (a3) {
                    case 27000:
                        str = "MDP_INVALID_ARGUMENT";
                        break;
                    case 27001:
                        str = "MDP_UNSUPPORTED_CARRIER";
                        break;
                    case 27002:
                        str = "MDP_NOT_FOUND";
                        break;
                    case 27003:
                        str = "MDP_BAD_RESPONSE";
                        break;
                    case 27004:
                        str = "MDP_INVALID_API_KEY";
                        break;
                    case 27005:
                        str = "MDP_INVALID_CARRIER_PLAN_ID";
                        break;
                    case 27006:
                        str = "MDP_EMPTY_CARRIER_PLAN_ID_ENDPOINT";
                        break;
                    case 27007:
                        str = "MDP_SERVER_CARRIER_FAILURE";
                        break;
                    case 27008:
                        str = "MDP_SERVER_CARRIER_INVALID_RESPONSE";
                        break;
                    default:
                        switch (a3) {
                            case 27010:
                                str = "MDP_SERVER_GTAF_EMPTY_RESPONSE";
                                break;
                            case 27011:
                                str = "MDP_SERVER_GTAF_FAILURE";
                                break;
                            case 27012:
                                str = "MDP_SERVER_GTAF_RESOURCE_EXHAUSTED";
                                break;
                            case 27013:
                                str = "MDP_NOT_ENABLED";
                                break;
                            case 27014:
                                str = "MDP_EVENT_LISTENER_ALREADY_EXISTED";
                                break;
                            case 27015:
                                str = "MDP_EVENT_LISTENER_NOT_EXISTED";
                                break;
                            case 27016:
                                str = "MDP_INTERNAL_ERROR";
                                break;
                            case 27017:
                                str = "MDP_INCONSISTENT_CARRIER";
                                break;
                            case 27018:
                                str = "MDP_NO_NETWORK";
                                break;
                            case 27019:
                                str = "MDP_NOT_ON_CELLULAR";
                                break;
                            case 27020:
                                str = "MDP_BAD_CPID_END_POINT";
                                break;
                            case 27021:
                                str = "MDP_GET_MCC_MNC_FAILURE";
                                break;
                            case 27022:
                                str = "MDP_SERVER_GTAF_UNAVAILABLE";
                                break;
                            case 27023:
                                str = "MDP_REQUIRE_CONSENT";
                                break;
                            default:
                                switch (a3) {
                                    case 27030:
                                        str = "MDP_INSUFFICIENT_FUNDS";
                                        break;
                                    case 27031:
                                        str = "MDP_SERVER_GTAF_CANCELLED";
                                        break;
                                    case 27032:
                                        str = "MDP_SERVER_GTAF_UNKNOWN";
                                        break;
                                    case 27033:
                                        str = "MDP_SERVER_GTAF_INVALID_ARGUMENT";
                                        break;
                                    case 27034:
                                        str = "MDP_SERVER_GTAF_DEADLINE_EXCEEDED";
                                        break;
                                    default:
                                        switch (a3) {
                                            case 27036:
                                                str = "MDP_SERVER_GTAF_ALREADY_EXISTS";
                                                break;
                                            case 27037:
                                                str = "MDP_SERVER_GTAF_PERMISSION_DENIED";
                                                break;
                                            case 27038:
                                                str = "MDP_SERVER_GTAF_UNAUTHENTICATED";
                                                break;
                                            case 27039:
                                                str = "MDP_SERVER_GTAF_ABORTED";
                                                break;
                                            case 27040:
                                                str = "MDP_SERVER_GTAF_UNIMPLEMENTED";
                                                break;
                                            case 27041:
                                                str = "MDP_SERVER_GTAF_INTERNAL";
                                                break;
                                            case 27042:
                                                str = "MDP_SERVER_GTAF_DATA_LOSS";
                                                break;
                                            case 27043:
                                                str = "MDP_SERVER_UNHANDLED_GRPC_ERROR";
                                                break;
                                            case 27044:
                                                str = "MDP_NOT_ON_CELLULAR_PRECHECK";
                                                break;
                                            case 27045:
                                                str = "MDP_NOT_ON_CELLULAR_TIMEOUT";
                                                break;
                                            case 27046:
                                                str = "MDP_NOT_ON_CELLULAR_UNAVAILABLE";
                                                break;
                                            case 27047:
                                                str = "MDP_NOT_ON_CELLULAR_PERMISSION_DENIED";
                                                break;
                                            case 27048:
                                                str = "MDP_INCONSISTENT_CARRIER_MISSING_ID";
                                                break;
                                            case 27049:
                                                str = "MDP_SYSTEM_SERVICE_UNAVAILABLE";
                                                break;
                                            case 27050:
                                                str = "MDP_CACHE_PUT_FAILURE";
                                                break;
                                            case 27051:
                                                str = "MDP_SERVER_CARRIER_FAILURE_AFTER_CONNECTING";
                                                break;
                                            case 27052:
                                                str = "MDP_SERVER_GTAF_FAILURE_ASYNC";
                                                break;
                                            case 27053:
                                                str = "MDP_SERVER_CARRIER_INVALID_TTL";
                                                break;
                                            case 27054:
                                                str = "MDP_MCC_MNC_UNSUPPORTED";
                                                break;
                                            case 27055:
                                                str = "MDP_MCC_MNC_UNSUPPORTED_BY_CLIENT";
                                                break;
                                            case 27056:
                                                str = "MDP_WRITE_TO_PLATFORM_FAILED";
                                                break;
                                            case 27057:
                                                str = "MDP_SERVER_CARRIER_HTTP_FAILURE";
                                                break;
                                            case 27058:
                                                str = "MDP_EAP_TRANSIENT_ERROR";
                                                break;
                                            case 27059:
                                                str = "MDP_EAP_TOKEN_EXPIRED_ERROR";
                                                break;
                                            case 27060:
                                                str = "MDP_SERVER_SUBGRAPH_AUTH_FAILURE";
                                                break;
                                            case 27061:
                                                str = "MDP_ESIM_LPA_ERROR";
                                                break;
                                            case 27062:
                                                str = "MDP_ESIM_EUICC_MANAGER_RESOLVABLE_ERROR";
                                                break;
                                            case 27063:
                                                str = "MDP_ESIM_EUICC_MANAGER_UNRESOLVABLE_ERROR";
                                                break;
                                            default:
                                                str = aqxi.d(a3);
                                                break;
                                        }
                                }
                        }
                }
            } else {
                str = "MDP_SDK_INVALID_PARAMETER";
            }
            f.G("Status code %d (%s)", a2, str);
            if (!b.contains(Integer.valueOf(aqxeVar.a()))) {
                if (j > 0) {
                    long max = Math.max(TimeUnit.MILLISECONDS.toSeconds(Math.min(j, fqhf.a.a().f())), fqhf.p());
                    p(this.k, max, max >> 2, elgk.FAILED_UPDATE, Integer.valueOf(this.i));
                    ((ejhf) asotVar.f(ceqi.h()).s(exc)).A("Recoverable error, retry scheduled in %d seconds", max);
                    return;
                } else {
                    ((ejhf) asotVar.f(ceqi.h()).s(exc)).x("Error, no (further) retry scheduled");
                    if (r(fqhf.n(), fqhf.l())) {
                        e(this.k, fqhf.n(), fqhf.l(), elgk.FAILED_UPDATE);
                        return;
                    }
                    return;
                }
            }
        }
        ((ejhf) a.f(ceqi.h()).s(exc)).x("Terminal error, cancelling further retries");
        this.f.incrementAndGet();
        LinkedBlockingQueue linkedBlockingQueue = this.c;
        if (linkedBlockingQueue != null) {
            linkedBlockingQueue.offer(new Pair("failure-count", 1L));
        }
        if (r(fqhf.n(), fqhf.l())) {
            e(this.k, fqhf.n(), fqhf.l(), elgk.FAILED_UPDATE);
        }
    }

    @Override // defpackage.dfak
    public final /* synthetic */ void gn(Object obj) {
        MdpCarrierPlanIdResponse mdpCarrierPlanIdResponse;
        long j;
        long j2;
        MdpCarrierPlanIdResponse mdpCarrierPlanIdResponse2 = (MdpCarrierPlanIdResponse) obj;
        asot asotVar = a;
        ejhf f = asotVar.f(ceqi.h());
        long j3 = mdpCarrierPlanIdResponse2.b;
        f.O("%s: CpidFetch: success with ttl of %d.", "PeriodicService", j3);
        this.e.incrementAndGet();
        LinkedBlockingQueue linkedBlockingQueue = this.c;
        if (linkedBlockingQueue != null) {
            linkedBlockingQueue.offer(new Pair("success-count", 1L));
        }
        long j4 = j3 >> 1;
        long l = fqhf.l();
        if (j4 > fqhf.n()) {
            j4 = fqhf.n();
        } else if (j4 < fqhf.p()) {
            j4 = fqhf.p();
            l = fqhf.a.a().r();
        }
        long j5 = j4;
        long j6 = l;
        Integer num = mdpCarrierPlanIdResponse2.i;
        if (num == null || num.intValue() == 0) {
            String str = mdpCarrierPlanIdResponse2.a;
            String str2 = mdpCarrierPlanIdResponse2.c;
            String str3 = mdpCarrierPlanIdResponse2.d;
            long j7 = mdpCarrierPlanIdResponse2.e;
            String str4 = mdpCarrierPlanIdResponse2.f;
            int i = mdpCarrierPlanIdResponse2.g;
            CarrierSupportInfo carrierSupportInfo = mdpCarrierPlanIdResponse2.h;
            Integer num2 = mdpCarrierPlanIdResponse2.i;
            Long l2 = mdpCarrierPlanIdResponse2.j;
            j = j6;
            j2 = j5;
            mdpCarrierPlanIdResponse = new MdpCarrierPlanIdResponse(str, j3, str2, str3, j7, str4, i, carrierSupportInfo, Integer.valueOf(this.i), l2);
        } else {
            int intValue = mdpCarrierPlanIdResponse2.i.intValue();
            int i2 = this.i;
            if (intValue != i2) {
                ((ejhf) asotVar.j()).G("Received MdpCarrierPlanIdResponse in periodic updater service w/ different cpidRefreshEventFlowId than was sent (request ID: %d, response ID: %d", i2, mdpCarrierPlanIdResponse2.i);
            }
            mdpCarrierPlanIdResponse = mdpCarrierPlanIdResponse2;
            j2 = j5;
            j = j6;
        }
        new cecl(AppContextProvider.a()).F(mdpCarrierPlanIdResponse, j2, 17);
        long j8 = j;
        if (r(j2, j8)) {
            o(this.k, j2, j8, elgk.SUCCESSFUL_UPDATE);
        }
    }

    public ChimeraPeriodicUpdaterService(ceap ceapVar, Context context) {
        this();
        this.j = ceapVar;
        this.k = context;
    }
}
