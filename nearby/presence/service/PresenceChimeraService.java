package com.google.android.gms.nearby.presence.service;

import android.accounts.OnAccountsUpdateListener;
import android.content.Context;
import android.content.Intent;
import android.database.ContentObserver;
import android.net.ConnectivityManager;
import android.os.Binder;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.libs.identity.ClientIdentity;
import com.google.android.gms.nearby.internal.connection.RegisterDeviceProviderParams;
import com.google.android.gms.nearby.internal.connection.UnregisterDeviceProviderParams;
import com.google.android.gms.nearby.presence.PresenceIdentity;
import com.google.android.gms.nearby.presence.service.PresenceChimeraService;
import com.google.android.gms.nearby.presence.service.PresenceSyncBoundService;
import defpackage.atad;
import defpackage.atai;
import defpackage.ateq;
import defpackage.atfb;
import defpackage.atfd;
import defpackage.aura;
import defpackage.auti;
import defpackage.auto;
import defpackage.btjq;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.bzpe;
import defpackage.bzpt;
import defpackage.chdv;
import defpackage.chdw;
import defpackage.chjt;
import defpackage.chjy;
import defpackage.chjz;
import defpackage.chks;
import defpackage.chkv;
import defpackage.chlz;
import defpackage.chmf;
import defpackage.chmg;
import defpackage.chmr;
import defpackage.clcy;
import defpackage.clhr;
import defpackage.clix;
import defpackage.cmug;
import defpackage.cmuk;
import defpackage.cmwm;
import defpackage.cmxd;
import defpackage.cmyo;
import defpackage.cmyp;
import defpackage.cmzc;
import defpackage.cnai;
import defpackage.cnms;
import defpackage.cnnb;
import defpackage.cnnk;
import defpackage.cnoh;
import defpackage.cnqa;
import defpackage.cnqn;
import defpackage.cnrl;
import defpackage.cnru;
import defpackage.dpvo;
import defpackage.dpvs;
import defpackage.ekww;
import defpackage.ekxd;
import defpackage.elhz;
import defpackage.elpp;
import defpackage.eluo;
import defpackage.ftdz;
import defpackage.ftfv;
import defpackage.ftfz;
import defpackage.kar;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class PresenceChimeraService extends bzot implements chjz {
    public final ekww A;
    public final cnqn B;
    public volatile cmyo C;
    private volatile Future D;
    private volatile Future E;
    public final ScheduledExecutorService a;
    public final dpvo b;
    public volatile cmxd c;
    public volatile chlz d;
    public volatile cnqa m;
    public volatile cnnb n;
    public volatile cnnk o;
    public volatile chmr p;
    public volatile cnoh q;
    public ScheduledFuture r;
    public btjq s;
    public final CountDownLatch t;
    public auto u;
    public cnru v;
    public chjy w;
    public cmzc x;
    public cmyp y;
    public cnms z;

    public PresenceChimeraService() {
        super(317, "com.google.android.gms.nearby.presence.service.START", elpp.a, 0, 10, elhz.G(ftfv.a.lK().H().b));
        this.B = new cnqn(this);
        this.t = new CountDownLatch(0);
        this.A = ekxd.a(new ekww() { // from class: cnqh
            @Override // defpackage.ekww
            public final Object lK() {
                return Boolean.valueOf(ftfv.G());
            }
        });
        this.a = chkv.f();
        this.b = new dpvs();
        if (ftfv.J()) {
            this.v = new cnru(ftfv.V(), ftfv.D());
        }
    }

    public static final void g(boolean z, PresenceIdentity presenceIdentity, String str) {
        ftfv ftfvVar = ftfv.a;
        if (ftfvVar.lK().aq() && !z && presenceIdentity.e == 2) {
            if (!ftfvVar.lK().aN() || !ftfvVar.lK().I().b.contains(str)) {
                throw new bzpt(13, "public identity is not supported for the package ".concat(String.valueOf(str)));
            }
        }
    }

    public static final void h() {
        if (!ftfv.a.lK().V()) {
            throw new bzpt(13, "Discover Api disabled");
        }
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        Context applicationContext = getApplicationContext();
        bzozVar.c(new cnai(this, applicationContext, new cmwm(ClientIdentity.e(bzozVar.b, getServiceRequest, Binder.getCallingUid(), Binder.getCallingPid())), new bzpe(applicationContext, this.e, this.a), getServiceRequest.f));
    }

    @Override // defpackage.chjz
    public final chjy b() {
        return this.w;
    }

    public final Future c(Runnable runnable) {
        return ((chks) this.a).submit(runnable);
    }

    public final void d() {
        if (this.o != null) {
            this.o.a();
            this.o = null;
            ((cnrl) this.p).a = null;
            ((eluo) cmug.a.f(cmug.a()).ai(8171)).x("Nearby Presence destructed DiscoveryManager");
        }
    }

    @Override // defpackage.bzot, com.google.android.chimera.BoundService
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        auti autiVar = new auti(printWriter, "  ");
        printWriter.println();
        printWriter.println("Nearby Presence Service");
        printWriter.println();
        ftfv ftfvVar = ftfv.a;
        if (ftfvVar.lK().ae()) {
            chjt.b(autiVar, ftfz.class, ftdz.class);
        }
        if (this.n != null) {
            this.n.z(fileDescriptor, printWriter, strArr);
        }
        if (this.o != null) {
            this.o.z(fileDescriptor, printWriter, strArr);
        }
        if (ftfvVar.lK().ab() && this.C != null) {
            this.C.n(printWriter);
        }
        printWriter.println();
        printWriter.flush();
    }

    public final void e() {
        if (this.o != null) {
            return;
        }
        if (this.z == null) {
            cnms cnmsVar = new cnms(this);
            this.z = cnmsVar;
            cnmsVar.a();
        }
        cmyo cmyoVar = this.C;
        ScheduledExecutorService scheduledExecutorService = this.a;
        dpvo dpvoVar = this.b;
        cmuk cmukVar = new cmuk(this, cmyoVar, scheduledExecutorService, dpvoVar, this.z, this.v);
        this.o = new cnnk(this, cmukVar, dpvoVar);
        this.o.b();
        ((cnrl) this.p).a = cmukVar;
        ((eluo) cmug.a.f(cmug.a()).ai(8173)).x("Nearby Presence initialized DiscoveryManager");
    }

    public final void f() {
        if (this.d == null) {
            chmf chmfVar = new chmf();
            chmfVar.a = "nearby.presence";
            this.d = chdw.a(this, new chmg(chmfVar));
        }
        atai ataiVar = this.d;
        clhr clhrVar = (clhr) ataiVar;
        atad atadVar = (atad) ataiVar;
        ateq a = clhrVar.a.a(atadVar, this.p, "device_provider");
        final clix clixVar = new clix(a);
        clcy clcyVar = clhrVar.a;
        atfb atfbVar = new atfb();
        atfbVar.a = new atfd() { // from class: clgj
            @Override // defpackage.atfd
            public final void d(Object obj, Object obj2) {
                int i = clhr.b;
                cljo cljoVar = (cljo) ((clfc) obj).H();
                RegisterDeviceProviderParams registerDeviceProviderParams = new RegisterDeviceProviderParams();
                registerDeviceProviderParams.a = clix.this;
                cljoVar.l(registerDeviceProviderParams);
            }
        };
        atfbVar.b = new atfd() { // from class: clgk
            @Override // defpackage.atfd
            public final void d(Object obj, Object obj2) {
                int i = clhr.b;
                cljo cljoVar = (cljo) ((clfc) obj).H();
                UnregisterDeviceProviderParams unregisterDeviceProviderParams = new UnregisterDeviceProviderParams();
                unregisterDeviceProviderParams.a = clix.this;
                cljoVar.H(unregisterDeviceProviderParams);
                ((dhma) obj2).b(true);
            }
        };
        atfbVar.c = a;
        atfbVar.d = new Feature[]{chdv.A};
        atfbVar.e = 1229;
        clcyVar.c(atadVar, atfbVar.a());
        if (!ftfv.N()) {
            kar.a(this).e(aura.k(new Intent("com.google.android.nearby.presence.internal.PRESENCE_REGISTER_DEVICE_PROVIDER_STARTED")));
        }
        ((eluo) cmug.a.f(cmug.a()).ai(8177)).x("Nearby Presence registered Device Provider");
    }

    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final void onCreate() {
        this.D = c(new Runnable() { // from class: cnqg
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v5, types: [auun, cmub, cmum] */
            @Override // java.lang.Runnable
            public final void run() {
                dpvo dpvoVar;
                PresenceChimeraService presenceChimeraService = PresenceChimeraService.this;
                try {
                    presenceChimeraService.t.await();
                } catch (InterruptedException e) {
                    ((eluo) ((eluo) ((eluo) cmug.a.j()).s(e)).ai((char) 8175)).x("PresenceChimeraService.onCreate Interrupted waiting for test latch to open");
                }
                if (!ftfv.J()) {
                    presenceChimeraService.v = new cnru(ftfv.V(), ftfv.D());
                }
                presenceChimeraService.s = bxiz.v();
                presenceChimeraService.w = new chjy(presenceChimeraService);
                presenceChimeraService.w.h(new cnqf());
                cmua cmuaVar = (cmua) presenceChimeraService.w.b(cmua.class);
                btjq btjqVar = presenceChimeraService.s;
                dpvo dpvoVar2 = presenceChimeraService.b;
                cmuaVar.a = new cmtz(btjqVar, "com.google.android.gms.nearby.presence", presenceChimeraService);
                presenceChimeraService.m = new cnqa(presenceChimeraService);
                if (presenceChimeraService.v.a && presenceChimeraService.c == null) {
                    presenceChimeraService.c = new cmxd(presenceChimeraService);
                }
                presenceChimeraService.y = new cmyp(presenceChimeraService, presenceChimeraService.v);
                if (presenceChimeraService.C == null) {
                    cmxd cmxdVar = presenceChimeraService.c;
                    cnqa cnqaVar = presenceChimeraService.m;
                    cnru cnruVar = presenceChimeraService.v;
                    cmyp cmypVar = presenceChimeraService.y;
                    chen.m(presenceChimeraService);
                    presenceChimeraService.C = new cmyo(presenceChimeraService, cmxdVar, true != chen.k(presenceChimeraService) ? 1 : 2, aurt.a, cnqaVar, cmypVar, cnruVar);
                }
                if (((Boolean) presenceChimeraService.A.lK()).booleanValue()) {
                    final cmyo cmyoVar = presenceChimeraService.C;
                    if (cmyoVar.b.isShutdown()) {
                        cmyoVar.b = chkv.b();
                    }
                    if (cmyoVar.g.a) {
                        final cmyn cmynVar = new cmyn(cmyoVar);
                        cmyoVar.b.execute(new Runnable() { // from class: cmyl
                            @Override // java.lang.Runnable
                            public final void run() {
                                cmxd cmxdVar2 = cmyo.this.d;
                                if (cmxdVar2 == null || cmxdVar2.d(cmynVar)) {
                                    return;
                                }
                                ((eluo) cmug.a.j()).B("%s: Failed to start monitoring TidepoolManager setting changes.", "IdentityManager");
                            }
                        });
                    }
                }
                if (ftfv.D() && presenceChimeraService.x == null) {
                    cmxd cmxdVar2 = presenceChimeraService.c;
                    cnqa cnqaVar2 = presenceChimeraService.m;
                    cnru cnruVar2 = presenceChimeraService.v;
                    cmyp cmypVar2 = presenceChimeraService.y;
                    chen.m(presenceChimeraService);
                    presenceChimeraService.x = new cmzc(presenceChimeraService, cmxdVar2, true != chen.k(presenceChimeraService) ? 1 : 2, aurt.a, cnqaVar2, cmypVar2, cnruVar2);
                    final cmzc cmzcVar = presenceChimeraService.x;
                    if (cmzcVar.b.isShutdown()) {
                        cmzcVar.b = chkv.b();
                    }
                    if (cmzcVar.h.a) {
                        final cmzb cmzbVar = new cmzb(cmzcVar);
                        cmzcVar.b.execute(new Runnable() { // from class: cmyz
                            @Override // java.lang.Runnable
                            public final void run() {
                                cmxd cmxdVar3 = cmzc.this.i;
                                if (cmxdVar3 == null || cmxdVar3.d(cmzbVar)) {
                                    return;
                                }
                                ((eluo) ((eluo) cmug.a.j()).ai((char) 7905)).B("%s: Failed to start monitoring TidepoolManager setting changes.", "TidepoolIdentityProvider");
                            }
                        });
                    }
                }
                presenceChimeraService.z = new cnms(presenceChimeraService);
                presenceChimeraService.z.a();
                if (ftfv.a.lK().aw()) {
                    dpvoVar = dpvoVar2;
                    presenceChimeraService.p = new cnrl(presenceChimeraService, presenceChimeraService.C, presenceChimeraService.v);
                } else {
                    dpvoVar = dpvoVar2;
                    cmuk cmukVar = new cmuk(presenceChimeraService, presenceChimeraService.C, presenceChimeraService.a, dpvoVar, presenceChimeraService.z, presenceChimeraService.v);
                    presenceChimeraService.o = new cnnk(presenceChimeraService, cmukVar, dpvoVar);
                    presenceChimeraService.o.b();
                    presenceChimeraService.p = new cnrl(presenceChimeraService, cmukVar, presenceChimeraService.C, presenceChimeraService.v);
                }
                presenceChimeraService.n = new cnnb(presenceChimeraService, new cmux(presenceChimeraService, presenceChimeraService.C, presenceChimeraService.a, presenceChimeraService.v), presenceChimeraService.C, dpvoVar);
                cnnb cnnbVar = presenceChimeraService.n;
                synchronized (cnnbVar.a) {
                    cnnbVar.h = true;
                    ?? r3 = cnnbVar.g;
                    if (!((cmux) r3).f) {
                        ((eluo) cmug.a.h()).B("%s: Enabling engine.", "BroadcastEngineImplV1");
                        ((cmux) r3).f = true;
                        auuo auuoVar = ((cmux) r3).a;
                        ((cmux) r3).g = auuoVar.d();
                        ((cmux) r3).o = cnnbVar;
                        bjno e2 = chen.e(((cmux) r3).i, "BroadcastEngineImplV1");
                        ((cmux) r3).h = e2 != null && e2.r();
                        auuoVar.b(r3);
                        ((cmux) r3).b.b(r3);
                        ((cmux) r3).i();
                    }
                }
                if (presenceChimeraService.v.b) {
                    presenceChimeraService.C.o(new cnqp(presenceChimeraService));
                }
                ConnectivityManager connectivityManager = (ConnectivityManager) presenceChimeraService.getSystemService("connectivity");
                presenceChimeraService.q = connectivityManager == null ? null : new cnoh(connectivityManager);
                cnoh cnohVar = presenceChimeraService.q;
                if (cnohVar != null) {
                    cnqn cnqnVar = presenceChimeraService.B;
                    if (cnohVar.i != null) {
                        ((eluo) cmug.a.j()).x("NetworkMonitorImpl there is already an active callback.");
                    } else {
                        cnohVar.i = cnqnVar;
                    }
                    if (!cnohVar.c) {
                        cnohVar.c = true;
                        cnohVar.a.registerNetworkCallback(cnohVar.d, cnohVar.f);
                        ((eluo) cmug.a.h()).x("NetworkMonitorImpl started.");
                    }
                }
                presenceChimeraService.f();
                if (((Boolean) presenceChimeraService.A.lK()).booleanValue()) {
                    int i = PresenceSyncBoundService.a;
                    casd a = casd.a(presenceChimeraService);
                    if (fpuj.e()) {
                        catg catgVar = new catg();
                        catgVar.w(PresenceSyncBoundService.class.getName());
                        catgVar.q("PresenceServerSync");
                        catgVar.v(1);
                        catgVar.l(true);
                        catgVar.a = catn.j;
                        cato b = catgVar.b();
                        try {
                            a.f(b);
                            ((eluo) ((eluo) cmug.a.h()).ai(8200)).B("Scheduled Presence server sync recurring task with cadence %s.", ((casw) b).a);
                        } catch (IllegalArgumentException e3) {
                            ((eluo) ((eluo) ((eluo) cmug.a.j()).s(e3)).ai((char) 8201)).x("Failed to schedule server sync task.");
                        }
                    } else {
                        cate cateVar = new cate();
                        cateVar.w(PresenceSyncBoundService.class.getName());
                        cateVar.x(0, 1);
                        cateVar.y(0, 1);
                        cateVar.q("PresenceServerSync");
                        cateVar.v(1);
                        cateVar.j(cata.a(ftfv.a.lK().A()));
                        catf b2 = cateVar.b();
                        try {
                            a.f(b2);
                            ((eluo) ((eluo) cmug.a.h()).ai(8198)).A("Scheduled Presence server sync periodic task with period %s seconds.", b2.a);
                        } catch (IllegalArgumentException e4) {
                            ((eluo) ((eluo) ((eluo) cmug.a.j()).s(e4)).ai((char) 8199)).x("Failed to schedule server sync task.");
                        }
                    }
                }
                ((eluo) cmug.a.f(cmug.a()).ai(8174)).x("Nearby Presence service is created!");
            }
        });
    }

    @Override // defpackage.bzot, com.google.android.chimera.BoundService, defpackage.rtr
    public final void onDestroy() {
        this.E = c(new Runnable() { // from class: cnqi
            @Override // java.lang.Runnable
            public final void run() {
                Object b;
                Object b2;
                Object b3;
                Object b4;
                Object b5;
                PresenceChimeraService presenceChimeraService = PresenceChimeraService.this;
                cnms cnmsVar = presenceChimeraService.z;
                if (cnmsVar != null) {
                    fyeb.e(cnmsVar.e, null);
                    cnmsVar.a.c();
                    cnmsVar.b.c();
                    cnmn cnmnVar = cnmsVar.g;
                    if (cnmnVar != null) {
                        cnmsVar.m.a.k(cnmnVar);
                    }
                    if (!cnmsVar.c.d(3)) {
                        ((eluo) cmug.a.j()).x("Failed to unregister DedupHintManager.");
                    }
                    ctyi ctyiVar = cnmsVar.d;
                    if (ctyiVar != null) {
                        ctyiVar.e();
                    }
                    fynx fynxVar = cnmsVar.o;
                    do {
                        b = fynxVar.b();
                        ((Boolean) b).booleanValue();
                    } while (!fynxVar.g(b, false));
                    fynx fynxVar2 = cnmsVar.n;
                    do {
                        b2 = fynxVar2.b();
                        ((Boolean) b2).booleanValue();
                    } while (!fynxVar2.g(b2, false));
                    fynx fynxVar3 = cnmsVar.p;
                    do {
                        b3 = fynxVar3.b();
                    } while (!fynxVar3.g(b3, new cnmh(fxsk.C(new byte[8]))));
                    fynx fynxVar4 = cnmsVar.q;
                    do {
                        b4 = fynxVar4.b();
                    } while (!fynxVar4.g(b4, new cnhx(fxsv.a)));
                    fynx fynxVar5 = cnmsVar.r;
                    do {
                        b5 = fynxVar5.b();
                        ((Boolean) b5).booleanValue();
                    } while (!fynxVar5.g(b5, false));
                }
                int i = PresenceSyncBoundService.a;
                casd.a(presenceChimeraService).d("PresenceServerSync", PresenceSyncBoundService.class.getName());
                cnoh cnohVar = presenceChimeraService.q;
                if (cnohVar != null) {
                    if (cnohVar.c) {
                        cnohVar.c = false;
                        cnohVar.b.clear();
                        cnohVar.a.unregisterNetworkCallback(cnohVar.f);
                        ((eluo) cmug.a.h()).x("NetworkMonitorImpl stopped.");
                    }
                    cnohVar.i = null;
                }
                if (presenceChimeraService.v.b) {
                    presenceChimeraService.C.r("com.google.gms.tidepool");
                }
                if (presenceChimeraService.n != null) {
                    cnnb cnnbVar = presenceChimeraService.n;
                    synchronized (cnnbVar.a) {
                        cnnbVar.m(new ekvm() { // from class: cnmz
                            @Override // defpackage.ekvm
                            public final boolean a(Object obj) {
                                int i2 = cnnb.l;
                                return true;
                            }
                        });
                        cmum cmumVar = cnnbVar.g;
                        if (((cmux) cmumVar).f) {
                            ((eluo) cmug.a.h()).B("%s: Disabling engine.", "BroadcastEngineImplV1");
                            ((cmux) cmumVar).a.c();
                            ((cmux) cmumVar).b.c();
                            ((cmux) cmumVar).f = false;
                            ((cmux) cmumVar).i();
                        }
                        cnnbVar.h = false;
                    }
                }
                if (presenceChimeraService.o != null) {
                    presenceChimeraService.o.a();
                }
                if (presenceChimeraService.c != null) {
                    cmxd cmxdVar = presenceChimeraService.c;
                    OnAccountsUpdateListener onAccountsUpdateListener = cmxdVar.d;
                    if (onAccountsUpdateListener != null) {
                        cmxdVar.a.i(onAccountsUpdateListener);
                        cmxdVar.d = null;
                    }
                    ContentObserver contentObserver = cmxdVar.e;
                    if (contentObserver != null) {
                        cmxdVar.b.unregisterContentObserver(contentObserver);
                        cmxdVar.e = null;
                    }
                    cmxdVar.c = null;
                    ((eluo) cmug.a.f(cmug.a()).ai(7867)).x("stopMonitorSettingChange!");
                }
                if (presenceChimeraService.d == null) {
                    chmf chmfVar = new chmf();
                    chmfVar.a = "nearby.presence";
                    presenceChimeraService.d = chdw.a(presenceChimeraService, new chmg(chmfVar));
                }
                atai ataiVar = presenceChimeraService.d;
                ((clhr) ataiVar).a.d((atad) ataiVar, "device_provider");
                ausn ausnVar = cmug.a;
                ((eluo) ausnVar.f(cmug.a()).ai(8178)).x("Nearby Presence unregistered Device Provider");
                presenceChimeraService.w.g();
                ((eluo) ausnVar.f(cmug.a()).ai(8176)).x("Nearby Presence service is destroyed!");
                presenceChimeraService.a.shutdown();
            }
        });
        super.onDestroy();
    }
}
