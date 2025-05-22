package com.google.android.gms.mobiledataplan.service;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import com.google.android.gms.chimera.modules.mobiledataplan.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import com.google.android.gms.mobiledataplan.MdpCarrierPlanIdResponse;
import com.google.android.gms.mobiledataplan.carriersupport.CarrierSupportInfo;
import defpackage.aszt;
import defpackage.aszx;
import defpackage.auid;
import defpackage.ausn;
import defpackage.auur;
import defpackage.casd;
import defpackage.cata;
import defpackage.catb;
import defpackage.cate;
import defpackage.catx;
import defpackage.cauf;
import defpackage.cgjw;
import defpackage.cgkb;
import defpackage.cgkc;
import defpackage.cgkk;
import defpackage.cgkl;
import defpackage.cgli;
import defpackage.cgls;
import defpackage.cgmc;
import defpackage.cgmd;
import defpackage.cgme;
import defpackage.cgno;
import defpackage.cgzm;
import defpackage.cgzp;
import defpackage.dhln;
import defpackage.dhlq;
import defpackage.eluo;
import defpackage.enth;
import defpackage.entk;
import defpackage.entl;
import defpackage.entm;
import defpackage.entn;
import defpackage.ents;
import defpackage.entt;
import defpackage.entu;
import defpackage.entw;
import defpackage.entx;
import defpackage.enty;
import defpackage.enuf;
import defpackage.fgqi;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fgub;
import defpackage.fgvm;
import defpackage.fgvq;
import defpackage.fgvs;
import defpackage.fgvx;
import defpackage.fhvs;
import defpackage.fptq;
import defpackage.fpvd;
import defpackage.fszn;
import defpackage.fszt;
import defpackage.fszz;
import defpackage.ftat;
import defpackage.ftax;
import defpackage.ftbb;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class ChimeraPeriodicUpdaterService extends GmsTaskChimeraService implements dhlq, dhln {
    private final LinkedBlockingQueue c;
    private final cgme d;
    private final AtomicInteger e;
    private final AtomicInteger f;
    private final Object h;
    private int i;
    private cgjw j;
    private Context k;
    private final Object l;
    private long m;
    private final cgmd n;
    private static final Set b = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(27021, 27001, 27005, 27007)));
    public static final ausn a = ausn.b("MobileDataPlan", auid.MOBILE_DATA_PLAN);

    public ChimeraPeriodicUpdaterService() {
        this.e = new AtomicInteger();
        this.f = new AtomicInteger();
        this.h = new Object();
        this.l = new Object();
        this.n = new cgmd();
        if (ftax.a.lK().X()) {
            LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
            this.c = linkedBlockingQueue;
            cgme cgmeVar = new cgme(linkedBlockingQueue);
            this.d = cgmeVar;
            cgmeVar.start();
        } else {
            this.c = null;
            this.d = null;
        }
        this.i = 0;
    }

    public static void e(Context context, long j, long j2, entx entxVar) {
        f(context, j, j2, entxVar, entl.a);
    }

    public static void f(Context context, long j, long j2, entx entxVar, entl entlVar) {
        Long q;
        fgvx d;
        fgrc v;
        if (ftax.J()) {
            if (cgzp.i(context)) {
                cgls.c().G(37, entxVar, entlVar);
                return;
            }
            if (u()) {
                cgls.c().G(21, entxVar, entlVar);
                return;
            }
            if (fszt.a.lK().m()) {
                String g = cgzm.g(context);
                if ((entxVar == entx.ACTIVE_SIM_SWITCH_EVENT || entxVar == entx.SIM_CHANGE_EVENT || entxVar == entx.MODULE_INIT_EVENT) && g != null && !"1234567890987654321".equals(g) && (q = cgkb.c().q(g)) != null && q.longValue() >= TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) && q.longValue() - fszz.a.lK().c() >= TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())) {
                    cgkl c = cgkb.c().d.c(g);
                    Long valueOf = (c == null || (d = c.d()) == null) ? null : Long.valueOf(d.d);
                    if (valueOf != null && valueOf.longValue() >= TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) && valueOf.longValue() < q.longValue()) {
                        if (ftat.g()) {
                            fgrc fgrcVar = (fgrc) entlVar.iQ(5, null);
                            fgrcVar.X(entlVar);
                            if (!fgrcVar.b.L()) {
                                fgrcVar.U();
                            }
                            entl entlVar2 = (entl) fgrcVar.b;
                            entl entlVar3 = entl.a;
                            entlVar2.e = true;
                            cgls.c().G(10, entxVar, (entl) fgrcVar.Q());
                            return;
                        }
                        return;
                    }
                }
                if (g != null) {
                    cgkb c2 = cgkb.c();
                    long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) + j;
                    Long valueOf2 = Long.valueOf(seconds);
                    cgkc cgkcVar = c2.d;
                    if (cgkcVar.c(g) == null || cgkcVar.c(g).d() == null) {
                        v = fgvx.a.v();
                    } else {
                        fgvx d2 = cgkcVar.c(g).d();
                        v = (fgrc) d2.iQ(5, null);
                        v.X(d2);
                    }
                    cgkk cgkkVar = new cgkk();
                    cgkkVar.g(g);
                    valueOf2.getClass();
                    if (!v.b.L()) {
                        v.U();
                    }
                    fgvx fgvxVar = (fgvx) v.b;
                    fgvx fgvxVar2 = fgvx.a;
                    fgvxVar.d = seconds;
                    cgkkVar.i((fgvx) v.Q());
                    boolean i = cgkcVar.i(cgkkVar.a());
                    if (ftat.h()) {
                        cgls c3 = cgls.c();
                        fgrc v2 = entn.a.v();
                        if (!v2.b.L()) {
                            v2.U();
                        }
                        fgri fgriVar = v2.b;
                        ((entn) fgriVar).b = entm.a(4);
                        if (!fgriVar.L()) {
                            v2.U();
                        }
                        ((entn) v2.b).c = i;
                        c3.j((entn) v2.Q(), "MDP_PeriodicService", 0);
                    }
                }
            }
            if (ftat.g()) {
                cgls.c().G(3, entxVar, entlVar);
            }
            o(context, j, j2, entxVar);
        }
    }

    public static void g(Context context) {
        a.f(cgzp.h()).U("%s: BgWorkflow: enabled %s interval %d flex %d.", "PeriodicService", Boolean.valueOf(fszn.n()), Long.valueOf(fszn.c()), Long.valueOf(fszn.b()));
        if (fszn.n()) {
            Bundle bundle = new Bundle();
            if (fszn.f()) {
                bundle.putLong("task_interval_key", fszn.c());
                bundle.putLong("task_flex_key", fszn.b());
            }
            cgls c = cgls.c();
            long c2 = fszn.c();
            long b2 = fszn.b();
            enuf D = c.D(20, "GTAF_Server", "MDP_PeriodicService");
            fgrc fgrcVar = (fgrc) D.iQ(5, null);
            fgrcVar.X(D);
            fgrc v = entk.a.v();
            if (!v.b.L()) {
                v.U();
            }
            ((entk) v.b).c = fgvs.b(3);
            fgrc v2 = enth.a.v();
            if (!v2.b.L()) {
                v2.U();
            }
            fgri fgriVar = v2.b;
            ((enth) fgriVar).b = c2;
            if (!fgriVar.L()) {
                v2.U();
            }
            ((enth) v2.b).c = b2;
            enth enthVar = (enth) v2.Q();
            if (!v.b.L()) {
                v.U();
            }
            entk entkVar = (entk) v.b;
            enthVar.getClass();
            entkVar.e = enthVar;
            entkVar.b |= 1;
            entk entkVar2 = (entk) v.Q();
            if (!fgrcVar.b.L()) {
                fgrcVar.U();
            }
            enuf enufVar = (enuf) fgrcVar.b;
            enuf enufVar2 = enuf.a;
            entkVar2.getClass();
            enufVar.v = entkVar2;
            enufVar.b |= 2048;
            c.d((enuf) fgrcVar.Q(), fhvs.SCHEDULE_PERIODIC_WORKFLOW);
            cate cateVar = new cate();
            cateVar.j = "com.google.android.gms.mobiledataplan.service.PeriodicUpdaterService";
            cateVar.t("mobiledataplan_bg_periodic_checker");
            cateVar.y(0, 0);
            cateVar.v(1);
            cateVar.u = bundle;
            long c3 = fszn.c();
            long b3 = fszn.b();
            if (fpvd.g()) {
                cateVar.j(cata.a(c3));
            } else {
                cateVar.a = c3;
                cateVar.b = b3;
            }
            casd.a(context).f(cateVar.b());
        }
    }

    public static void h(Context context) {
        ausn ausnVar = a;
        ausnVar.f(cgzp.h()).Q("%s: ConsentFetch: enabled %s", "PeriodicService", fszz.f());
        if (fszz.f()) {
            cgmd m = m(context);
            ausnVar.f(cgzp.h()).T("%s: ConsentFetch: interval %d flex %d.", "PeriodicService", Long.valueOf(m.a), Long.valueOf(m.b));
            cate cateVar = new cate();
            cateVar.j = "com.google.android.gms.mobiledataplan.service.PeriodicUpdaterService";
            cateVar.t("mobiledataplan_consent_fetch");
            cateVar.y(0, 1);
            cateVar.v(1);
            if (fpvd.g()) {
                cateVar.j(cata.a(m.a));
            } else {
                cateVar.e(m.a, m.b, catx.a);
            }
            Bundle bundle = new Bundle();
            int a2 = cgls.a();
            bundle.putInt("event_flow_id", a2);
            bundle.putLong("task_interval_key", m.a);
            bundle.putLong("task_flex_key", m.b);
            cateVar.u = bundle;
            casd.a(context).f(cateVar.b());
            new cgls(context).L(12, fhvs.BACKGROUND_CONSENT_SCHEDULE, Integer.valueOf(a2), null);
        }
    }

    public static void j(Context context) {
        Long o;
        ausn ausnVar = a;
        ausnVar.f(cgzp.h()).W("%s: GcoreRegister: interval %d flex %d. schedule:%b update:%b disableLegacy:%b", "PeriodicService", Long.valueOf(fszt.d()), Long.valueOf(fszt.c()), Boolean.valueOf(fszt.j()), Boolean.valueOf(fszt.h()), Boolean.valueOf(fszn.o()));
        if (!fszt.j() || fszn.o()) {
            ausnVar.f(cgzp.h()).B("%s: GcoreRegister: not enabled, skip scheduling.", "PeriodicService");
            return;
        }
        cate cateVar = new cate();
        cateVar.j = "com.google.android.gms.mobiledataplan.service.PeriodicUpdaterService";
        cateVar.t("mobiledataplan_register");
        cateVar.y(0, 1);
        cateVar.x(0, 1);
        cateVar.v(1);
        long d = fszt.d();
        long c = fszt.c();
        if (fpvd.g()) {
            cateVar.j(cata.a(d));
        } else {
            cateVar.a = d;
            cateVar.b = c;
        }
        Bundle bundle = new Bundle();
        int a2 = cgls.a();
        bundle.putInt("event_flow_id", a2);
        bundle.putLong("task_interval_key", d);
        bundle.putLong("task_flex_key", c);
        cateVar.u = bundle;
        casd.a(context).f(cateVar.b());
        String c2 = cgli.a().c(context);
        String g = cgzm.g(context);
        String s = cgkb.c().s(g);
        if (s == null) {
            s = "dummy_cpid_before_retrieval";
            o = null;
        } else {
            o = cgkb.c().o(s);
            if (!cgkb.c().F(g)) {
                s = "dummy_cpid_before_consent";
            }
        }
        if (o == null) {
            o = cgno.b;
        }
        cgls cglsVar = new cgls(context);
        String u = ftax.u();
        int f = (int) ftax.f();
        long longValue = o.longValue();
        Integer valueOf = Integer.valueOf(a2);
        ents entsVar = (ents) entu.a.v();
        String k = cgzp.k(auur.c(c2));
        if (!entsVar.b.L()) {
            entsVar.U();
        }
        entu entuVar = (entu) entsVar.b;
        k.getClass();
        entuVar.b = k;
        if (!entsVar.b.L()) {
            entsVar.U();
        }
        entu entuVar2 = (entu) entsVar.b;
        u.getClass();
        entuVar2.c = u;
        if (!entsVar.b.L()) {
            entsVar.U();
        }
        ((entu) entsVar.b).d = f;
        if (!entsVar.b.L()) {
            entsVar.U();
        }
        ((entu) entsVar.b).e = longValue;
        if (!entsVar.b.L()) {
            entsVar.U();
        }
        ((entu) entsVar.b).f = s;
        if (!entsVar.b.L()) {
            entsVar.U();
        }
        ((entu) entsVar.b).g = entt.a(5);
        entu entuVar3 = (entu) entsVar.Q();
        fgrc v = enty.a.v();
        if (!v.b.L()) {
            v.U();
        }
        fgri fgriVar = v.b;
        ((enty) fgriVar).c = entw.a(9);
        if (!fgriVar.L()) {
            v.U();
        }
        enty entyVar = (enty) v.b;
        entuVar3.getClass();
        entyVar.i = entuVar3;
        entyVar.b |= 4;
        enty entyVar2 = (enty) v.Q();
        enuf D = cglsVar.D(17, "GTAF_Server", "MDP_PeriodicService");
        fgrc fgrcVar = (fgrc) D.iQ(5, null);
        fgrcVar.X(D);
        if (!fgrcVar.b.L()) {
            fgrcVar.U();
        }
        enuf enufVar = (enuf) fgrcVar.b;
        enuf enufVar2 = enuf.a;
        enufVar.t = 0L;
        if (!fgrcVar.b.L()) {
            fgrcVar.U();
        }
        enuf enufVar3 = (enuf) fgrcVar.b;
        entyVar2.getClass();
        enufVar3.r = entyVar2;
        enufVar3.b |= 256;
        cglsVar.e((enuf) fgrcVar.Q(), fhvs.CPID_REGISTER_ACTION, valueOf);
    }

    public static void k(Context context) {
        ausn ausnVar = a;
        ausnVar.f(cgzp.h()).Q("%s: MeterednessUpdate: enabled %s", "PeriodicService", ftbb.i());
        if (ftbb.h() && ftbb.i() && Build.VERSION.SDK_INT >= 29) {
            cgmd n = n();
            ausnVar.f(cgzp.h()).T("%s: MeterednessUpdate: interval %d flex %d.", "PeriodicService", Long.valueOf(n.a), Long.valueOf(n.b));
            cate cateVar = new cate();
            cateVar.j = "com.google.android.gms.mobiledataplan.service.PeriodicUpdaterService";
            cateVar.t("mobiledataplan_meteredness_update");
            cateVar.y(0, 1);
            cateVar.v(1);
            if (fpvd.g()) {
                cateVar.j(cata.a(n.a));
            } else {
                cateVar.e(n.a, n.b, catx.a);
            }
            Bundle bundle = new Bundle();
            int a2 = cgls.a();
            bundle.putInt("event_flow_id", a2);
            bundle.putLong("task_interval_key", n.a);
            bundle.putLong("task_flex_key", n.b);
            cateVar.u = bundle;
            casd.a(context).f(cateVar.b());
            new cgls(context).L(22, fhvs.PERIODIC_SCHEDULE_METEREDNESS, Integer.valueOf(a2), null);
        }
    }

    public static void l(Context context, int i, int i2) {
        catb catbVar = new catb();
        catbVar.j = "com.google.android.gms.mobiledataplan.service.PeriodicUpdaterService";
        catbVar.t("mobiledataplan_meteredness_update");
        catbVar.e(ftbb.b(), ftbb.c());
        catbVar.y(0, 1);
        catbVar.v(1);
        Bundle bundle = new Bundle();
        bundle.putInt("event_flow_id", i2);
        catbVar.u = bundle;
        ftbb.b();
        ftbb.c();
        new cgls(context).L(i, fhvs.PERIODIC_SCHEDULE_METEREDNESS, Integer.valueOf(i2), null);
        casd.a(context).f(catbVar.b());
    }

    private static cgmd m(Context context) {
        long b2;
        long d;
        cgkb c = cgkb.c();
        Long p = c.p(cgzm.g(context));
        fgub i = c.i(p);
        if (i != null) {
            fgqi e = fgvq.e(i, fgvq.h(System.currentTimeMillis()));
            fszz fszzVar = fszz.a;
            if (fgvm.b(e, fgvm.o(fszzVar.lK().b())) <= 0 && c.d(p) != null) {
                b2 = fszzVar.lK().g();
                d = fszzVar.lK().f();
                cgmd cgmdVar = new cgmd();
                cgmdVar.a = b2;
                cgmdVar.b = d;
                return cgmdVar;
            }
        }
        b2 = fszz.b();
        d = fszz.a.lK().d();
        cgmd cgmdVar2 = new cgmd();
        cgmdVar2.a = b2;
        cgmdVar2.b = d;
        return cgmdVar2;
    }

    private static cgmd n() {
        cgmd cgmdVar = new cgmd();
        ftbb ftbbVar = ftbb.a;
        cgmdVar.a = ftbbVar.lK().e();
        cgmdVar.b = ftbbVar.lK().d();
        return cgmdVar;
    }

    private static void o(Context context, long j, long j2, entx entxVar) {
        new cgmc().start();
        p(context, j, j2, entxVar, Integer.valueOf(cgls.a()));
    }

    private static void p(Context context, long j, long j2, entx entxVar, Integer num) {
        long j3;
        int intValue = num.intValue();
        cgls cglsVar = new cgls(context);
        enuf D = cglsVar.D(17, "GTAF_Server", "MDP_PeriodicService");
        fgrc fgrcVar = (fgrc) D.iQ(5, null);
        fgrcVar.X(D);
        fgrc v = enty.a.v();
        if (!v.b.L()) {
            v.U();
        }
        fgri fgriVar = v.b;
        ((enty) fgriVar).c = entw.a(3);
        if (!fgriVar.L()) {
            v.U();
        }
        fgri fgriVar2 = v.b;
        ((enty) fgriVar2).f = j;
        if (!fgriVar2.L()) {
            v.U();
        }
        ((enty) v.b).d = entxVar.a();
        enty entyVar = (enty) v.Q();
        if (!fgrcVar.b.L()) {
            fgrcVar.U();
        }
        enuf enufVar = (enuf) fgrcVar.b;
        enuf enufVar2 = enuf.a;
        entyVar.getClass();
        enufVar.r = entyVar;
        enufVar.b |= 256;
        cglsVar.e((enuf) fgrcVar.Q(), fhvs.BACKGROUND_CPID_SCHEDULE, num);
        Bundle bundle = new Bundle();
        bundle.putInt("cpid_update_cause", entxVar.a());
        bundle.putInt("event_flow_id", intValue);
        bundle.putLong("task_interval_key", j);
        bundle.putLong("task_flex_key", j2);
        cate cateVar = new cate();
        cateVar.j = "com.google.android.gms.mobiledataplan.service.PeriodicUpdaterService";
        cateVar.u = bundle;
        cateVar.t("mobiledataplan_cpid_refresher");
        cateVar.y(0, 0);
        cateVar.v(1);
        if (fpvd.g()) {
            j3 = j;
            cateVar.e(j3, (long) (fptq.b() * j), catx.a);
        } else {
            j3 = j;
            cateVar.a = j3;
            cateVar.b = j2;
        }
        casd.a(context).f(cateVar.b());
        a.f(cgzp.h()).V("%s: CpidFetch: interval %d flex %d. Service %b Update %b.", "PeriodicService", Long.valueOf(j3), Long.valueOf(j2), Boolean.valueOf(ftax.J()), Boolean.valueOf(ftax.P()));
    }

    private static boolean q(Context context, cauf caufVar) {
        cgmd m = m(context);
        return (v(caufVar, "task_interval_key", m.a) && v(caufVar, "task_flex_key", m.b)) ? false : true;
    }

    private final boolean r(long j, long j2) {
        cgmd cgmdVar = this.n;
        boolean z = true;
        if (cgmdVar.a == j && cgmdVar.b == j2) {
            z = false;
        }
        long j3 = cgmdVar.b;
        return z;
    }

    private static boolean s(cauf caufVar) {
        boolean z = true;
        if (v(caufVar, "task_interval_key", fszt.d()) && v(caufVar, "task_flex_key", fszt.c())) {
            z = false;
        }
        fszt.d();
        fszt.c();
        return z;
    }

    private static boolean t(cauf caufVar) {
        cgmd n = n();
        return (v(caufVar, "task_interval_key", n.a) && v(caufVar, "task_flex_key", n.b)) ? false : true;
    }

    private static boolean u() {
        return fszn.p() && cgkb.c().v();
    }

    private static boolean v(cauf caufVar, String str, long j) {
        Bundle bundle = caufVar.b;
        return bundle != null && bundle.containsKey(str) && bundle.getLong(str) == j;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static final void w(String str, entx entxVar, entl entlVar) {
        char c;
        casd.a(AppContextProvider.a()).d(str, "com.google.android.gms.mobiledataplan.service.PeriodicUpdaterService");
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
        if (ftat.a.lK().n()) {
            cgls.c().G(i, entxVar, entlVar);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0345, code lost:
    
        if (r3 == defpackage.fhvq.NOT_REQUIRED) goto L162;
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
    public final int a(defpackage.cauf r15) {
        /*
            Method dump skipped, instructions count: 1848
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.mobiledataplan.service.ChimeraPeriodicUpdaterService.a(cauf):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00b6 A[Catch: all -> 0x0186, TryCatch #2 {, blocks: (B:4:0x000d, B:9:0x0021, B:44:0x0035, B:17:0x0077, B:19:0x00b6, B:20:0x00b9, B:22:0x00c6, B:23:0x00c9, B:25:0x00d6, B:26:0x00d9, B:28:0x00e6, B:29:0x00e9, B:31:0x0103, B:32:0x0106, B:34:0x0118, B:35:0x011b, B:37:0x0137, B:38:0x013a, B:12:0x004b, B:15:0x0058, B:42:0x006b, B:50:0x0160, B:51:0x0162), top: B:3:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c6 A[Catch: all -> 0x0186, TryCatch #2 {, blocks: (B:4:0x000d, B:9:0x0021, B:44:0x0035, B:17:0x0077, B:19:0x00b6, B:20:0x00b9, B:22:0x00c6, B:23:0x00c9, B:25:0x00d6, B:26:0x00d9, B:28:0x00e6, B:29:0x00e9, B:31:0x0103, B:32:0x0106, B:34:0x0118, B:35:0x011b, B:37:0x0137, B:38:0x013a, B:12:0x004b, B:15:0x0058, B:42:0x006b, B:50:0x0160, B:51:0x0162), top: B:3:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d6 A[Catch: all -> 0x0186, TryCatch #2 {, blocks: (B:4:0x000d, B:9:0x0021, B:44:0x0035, B:17:0x0077, B:19:0x00b6, B:20:0x00b9, B:22:0x00c6, B:23:0x00c9, B:25:0x00d6, B:26:0x00d9, B:28:0x00e6, B:29:0x00e9, B:31:0x0103, B:32:0x0106, B:34:0x0118, B:35:0x011b, B:37:0x0137, B:38:0x013a, B:12:0x004b, B:15:0x0058, B:42:0x006b, B:50:0x0160, B:51:0x0162), top: B:3:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e6 A[Catch: all -> 0x0186, TryCatch #2 {, blocks: (B:4:0x000d, B:9:0x0021, B:44:0x0035, B:17:0x0077, B:19:0x00b6, B:20:0x00b9, B:22:0x00c6, B:23:0x00c9, B:25:0x00d6, B:26:0x00d9, B:28:0x00e6, B:29:0x00e9, B:31:0x0103, B:32:0x0106, B:34:0x0118, B:35:0x011b, B:37:0x0137, B:38:0x013a, B:12:0x004b, B:15:0x0058, B:42:0x006b, B:50:0x0160, B:51:0x0162), top: B:3:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0103 A[Catch: all -> 0x0186, TryCatch #2 {, blocks: (B:4:0x000d, B:9:0x0021, B:44:0x0035, B:17:0x0077, B:19:0x00b6, B:20:0x00b9, B:22:0x00c6, B:23:0x00c9, B:25:0x00d6, B:26:0x00d9, B:28:0x00e6, B:29:0x00e9, B:31:0x0103, B:32:0x0106, B:34:0x0118, B:35:0x011b, B:37:0x0137, B:38:0x013a, B:12:0x004b, B:15:0x0058, B:42:0x006b, B:50:0x0160, B:51:0x0162), top: B:3:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0118 A[Catch: all -> 0x0186, TryCatch #2 {, blocks: (B:4:0x000d, B:9:0x0021, B:44:0x0035, B:17:0x0077, B:19:0x00b6, B:20:0x00b9, B:22:0x00c6, B:23:0x00c9, B:25:0x00d6, B:26:0x00d9, B:28:0x00e6, B:29:0x00e9, B:31:0x0103, B:32:0x0106, B:34:0x0118, B:35:0x011b, B:37:0x0137, B:38:0x013a, B:12:0x004b, B:15:0x0058, B:42:0x006b, B:50:0x0160, B:51:0x0162), top: B:3:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0137 A[Catch: all -> 0x0186, TryCatch #2 {, blocks: (B:4:0x000d, B:9:0x0021, B:44:0x0035, B:17:0x0077, B:19:0x00b6, B:20:0x00b9, B:22:0x00c6, B:23:0x00c9, B:25:0x00d6, B:26:0x00d9, B:28:0x00e6, B:29:0x00e9, B:31:0x0103, B:32:0x0106, B:34:0x0118, B:35:0x011b, B:37:0x0137, B:38:0x013a, B:12:0x004b, B:15:0x0058, B:42:0x006b, B:50:0x0160, B:51:0x0162), top: B:3:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void d(com.google.android.gms.mobiledataplan.MdpCarrierPlanIdRequest r13, defpackage.cgjw r14) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.mobiledataplan.service.ChimeraPeriodicUpdaterService.d(com.google.android.gms.mobiledataplan.MdpCarrierPlanIdRequest, cgjw):void");
    }

    @Override // defpackage.dhln
    public final void gB(Exception exc) {
        long j;
        String str;
        synchronized (this.l) {
            j = this.m;
        }
        boolean z = exc instanceof aszt;
        new cgls(AppContextProvider.a()).E(z ? ((aszt) exc).a() : 13, j, this.i, 0L, 17);
        if (z) {
            aszt asztVar = (aszt) exc;
            ausn ausnVar = a;
            eluo f = ausnVar.f(cgzp.h());
            int a2 = asztVar.a();
            int a3 = asztVar.a();
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
                                                str = aszx.d(a3);
                                                break;
                                        }
                                }
                        }
                }
            } else {
                str = "MDP_SDK_INVALID_PARAMETER";
            }
            f.G("Status code %d (%s)", a2, str);
            if (!b.contains(Integer.valueOf(asztVar.a()))) {
                if (j > 0) {
                    long max = Math.max(TimeUnit.MILLISECONDS.toSeconds(Math.min(j, ftax.a.lK().f())), ftax.p());
                    p(this.k, max, max >> 2, entx.FAILED_UPDATE, Integer.valueOf(this.i));
                    ((eluo) ausnVar.f(cgzp.h()).s(exc)).A("Recoverable error, retry scheduled in %d seconds", max);
                    return;
                } else {
                    ((eluo) ausnVar.f(cgzp.h()).s(exc)).x("Error, no (further) retry scheduled");
                    if (r(ftax.n(), ftax.l())) {
                        e(this.k, ftax.n(), ftax.l(), entx.FAILED_UPDATE);
                        return;
                    }
                    return;
                }
            }
        }
        ((eluo) a.f(cgzp.h()).s(exc)).x("Terminal error, cancelling further retries");
        this.f.incrementAndGet();
        LinkedBlockingQueue linkedBlockingQueue = this.c;
        if (linkedBlockingQueue != null) {
            linkedBlockingQueue.offer(new Pair("failure-count", 1L));
        }
        if (r(ftax.n(), ftax.l())) {
            e(this.k, ftax.n(), ftax.l(), entx.FAILED_UPDATE);
        }
    }

    @Override // defpackage.dhlq
    public final /* synthetic */ void gC(Object obj) {
        MdpCarrierPlanIdResponse mdpCarrierPlanIdResponse;
        long j;
        long j2;
        MdpCarrierPlanIdResponse mdpCarrierPlanIdResponse2 = (MdpCarrierPlanIdResponse) obj;
        ausn ausnVar = a;
        eluo f = ausnVar.f(cgzp.h());
        long j3 = mdpCarrierPlanIdResponse2.b;
        f.O("%s: CpidFetch: success with ttl of %d.", "PeriodicService", j3);
        this.e.incrementAndGet();
        LinkedBlockingQueue linkedBlockingQueue = this.c;
        if (linkedBlockingQueue != null) {
            linkedBlockingQueue.offer(new Pair("success-count", 1L));
        }
        long j4 = j3 >> 1;
        long l = ftax.l();
        if (j4 > ftax.n()) {
            j4 = ftax.n();
        } else if (j4 < ftax.p()) {
            j4 = ftax.p();
            l = ftax.a.lK().r();
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
                ((eluo) ausnVar.j()).G("Received MdpCarrierPlanIdResponse in periodic updater service w/ different cpidRefreshEventFlowId than was sent (request ID: %d, response ID: %d", i2, mdpCarrierPlanIdResponse2.i);
            }
            mdpCarrierPlanIdResponse = mdpCarrierPlanIdResponse2;
            j2 = j5;
            j = j6;
        }
        new cgls(AppContextProvider.a()).F(mdpCarrierPlanIdResponse, j2, 17);
        long j8 = j;
        if (r(j2, j8)) {
            o(this.k, j2, j8, entx.SUCCESSFUL_UPDATE);
        }
    }

    public ChimeraPeriodicUpdaterService(cgjw cgjwVar, Context context) {
        this();
        this.j = cgjwVar;
        this.k = context;
    }
}
