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
import defpackage.aqxo;
import defpackage.aqxt;
import defpackage.arcb;
import defpackage.arcm;
import defpackage.arco;
import defpackage.asng;
import defpackage.aspo;
import defpackage.aspu;
import defpackage.brbz;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.bxgo;
import defpackage.bxhd;
import defpackage.cewk;
import defpackage.cewl;
import defpackage.cfch;
import defpackage.cfcm;
import defpackage.cfcn;
import defpackage.cfdg;
import defpackage.cfdj;
import defpackage.cfen;
import defpackage.cfet;
import defpackage.cfeu;
import defpackage.cfff;
import defpackage.ciut;
import defpackage.cizm;
import defpackage.cjas;
import defpackage.ckmb;
import defpackage.ckmf;
import defpackage.ckoh;
import defpackage.ckoy;
import defpackage.ckqj;
import defpackage.ckqk;
import defpackage.ckqx;
import defpackage.cksd;
import defpackage.clen;
import defpackage.clew;
import defpackage.clfe;
import defpackage.clgb;
import defpackage.clhs;
import defpackage.clif;
import defpackage.cljd;
import defpackage.cljm;
import defpackage.dnlf;
import defpackage.dnlj;
import defpackage.eijr;
import defpackage.eijy;
import defpackage.eiuu;
import defpackage.ejck;
import defpackage.ejhf;
import defpackage.fqkh;
import defpackage.fqma;
import defpackage.fqme;
import defpackage.juc;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class PresenceChimeraService extends bxgd implements cfcn {
    public final eijr A;
    public final clif B;
    public volatile ckqj C;
    private volatile Future D;
    private volatile Future E;
    public final ScheduledExecutorService a;
    public final dnlf b;
    public volatile ckoy c;
    public volatile cfen d;
    public volatile clhs m;
    public volatile clew n;
    public volatile clfe o;
    public volatile cfff p;
    public volatile clgb q;
    public ScheduledFuture r;
    public brbz s;
    public final CountDownLatch t;
    public aspu u;
    public cljm v;
    public cfcm w;
    public ckqx x;
    public ckqk y;
    public clen z;

    public PresenceChimeraService() {
        super(317, "com.google.android.gms.nearby.presence.service.START", ejck.a, 0, 10, eiuu.G(fqma.a.a().H().b));
        this.B = new clif(this);
        this.t = new CountDownLatch(0);
        this.A = eijy.a(new eijr() { // from class: clhz
            @Override // defpackage.eijr
            public final Object a() {
                return Boolean.valueOf(fqma.E());
            }
        });
        this.a = cfdj.f();
        this.b = new dnlj();
        if (fqma.I()) {
            this.v = new cljm(fqma.S(), fqma.B());
        }
    }

    public static final void g(boolean z, PresenceIdentity presenceIdentity, String str) {
        if (fqma.a.a().ap() && !z && presenceIdentity.e == 2) {
            fqma fqmaVar = fqma.a;
            if (!fqmaVar.a().aK() || !fqmaVar.a().I().b.contains(str)) {
                throw new bxhd(13, "public identity is not supported for the package ".concat(String.valueOf(str)));
            }
        }
    }

    public static final void h() {
        if (!fqma.a.a().U()) {
            throw new bxhd(13, "Discover Api disabled");
        }
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        Context applicationContext = getApplicationContext();
        bxgjVar.c(new cksd(this, applicationContext, new ckoh(ClientIdentity.e(bxgjVar.b, getServiceRequest, Binder.getCallingUid(), Binder.getCallingPid())), new bxgo(applicationContext, this.e, this.a), getServiceRequest.f));
    }

    @Override // defpackage.cfcn
    public final cfcm b() {
        return this.w;
    }

    public final Future c(Runnable runnable) {
        return ((cfdg) this.a).submit(runnable);
    }

    public final void d() {
        if (this.o != null) {
            this.o.a();
            this.o = null;
            ((cljd) this.p).a = null;
            ((ejhf) ckmb.a.f(ckmb.a()).ah(8218)).x("Nearby Presence destructed DiscoveryManager");
        }
    }

    @Override // defpackage.bxgd, com.google.android.chimera.BoundService
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        aspo aspoVar = new aspo(printWriter, "  ");
        printWriter.println();
        printWriter.println("Nearby Presence Service");
        printWriter.println();
        if (fqma.a.a().ac()) {
            cfch.b(aspoVar, fqme.class, fqkh.class);
        }
        if (this.n != null) {
            this.n.z(fileDescriptor, printWriter, strArr);
        }
        if (this.o != null) {
            this.o.z(fileDescriptor, printWriter, strArr);
        }
        if (fqma.a.a().aa() && this.C != null) {
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
            clen clenVar = new clen(this);
            this.z = clenVar;
            clenVar.a();
        }
        ckqj ckqjVar = this.C;
        ScheduledExecutorService scheduledExecutorService = this.a;
        dnlf dnlfVar = this.b;
        ckmf ckmfVar = new ckmf(this, ckqjVar, scheduledExecutorService, dnlfVar, this.z, this.v);
        this.o = new clfe(this, ckmfVar, dnlfVar);
        this.o.b();
        ((cljd) this.p).a = ckmfVar;
        ((ejhf) ckmb.a.f(ckmb.a()).ah(8220)).x("Nearby Presence initialized DiscoveryManager");
    }

    public final void f() {
        if (this.d == null) {
            cfet cfetVar = new cfet();
            cfetVar.a = "nearby.presence";
            this.d = cewl.a(this, new cfeu(cfetVar));
        }
        aqxt aqxtVar = this.d;
        cizm cizmVar = (cizm) aqxtVar;
        aqxo aqxoVar = (aqxo) aqxtVar;
        arcb a = cizmVar.a.a(aqxoVar, this.p, "device_provider");
        final cjas cjasVar = new cjas(a);
        ciut ciutVar = cizmVar.a;
        arcm arcmVar = new arcm();
        arcmVar.a = new arco() { // from class: ciye
            @Override // defpackage.arco
            public final void d(Object obj, Object obj2) {
                int i = cizm.b;
                cjbj cjbjVar = (cjbj) ((ciwx) obj).H();
                RegisterDeviceProviderParams registerDeviceProviderParams = new RegisterDeviceProviderParams();
                registerDeviceProviderParams.a = cjas.this;
                cjbjVar.l(registerDeviceProviderParams);
            }
        };
        arcmVar.b = new arco() { // from class: ciyf
            @Override // defpackage.arco
            public final void d(Object obj, Object obj2) {
                int i = cizm.b;
                cjbj cjbjVar = (cjbj) ((ciwx) obj).H();
                UnregisterDeviceProviderParams unregisterDeviceProviderParams = new UnregisterDeviceProviderParams();
                unregisterDeviceProviderParams.a = cjas.this;
                cjbjVar.H(unregisterDeviceProviderParams);
                ((dfau) obj2).b(true);
            }
        };
        arcmVar.c = a;
        arcmVar.d = new Feature[]{cewk.A};
        arcmVar.e = 1229;
        ciutVar.c(aqxoVar, arcmVar.a());
        if (!fqma.L()) {
            juc.a(this).e(asng.k(new Intent("com.google.android.nearby.presence.internal.PRESENCE_REGISTER_DEVICE_PROVIDER_STARTED")));
        }
        ((ejhf) ckmb.a.f(ckmb.a()).ah(8224)).x("Nearby Presence registered Device Provider");
    }

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final void onCreate() {
        this.D = c(new Runnable() { // from class: clhy
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v5, types: [asqt, cklw, ckmh] */
            @Override // java.lang.Runnable
            public final void run() {
                dnlf dnlfVar;
                PresenceChimeraService presenceChimeraService = PresenceChimeraService.this;
                try {
                    presenceChimeraService.t.await();
                } catch (InterruptedException e) {
                    ((ejhf) ((ejhf) ((ejhf) ckmb.a.j()).s(e)).ah((char) 8222)).x("PresenceChimeraService.onCreate Interrupted waiting for test latch to open");
                }
                if (!fqma.I()) {
                    presenceChimeraService.v = new cljm(fqma.S(), fqma.B());
                }
                presenceChimeraService.s = bvax.v();
                presenceChimeraService.w = new cfcm(presenceChimeraService);
                presenceChimeraService.w.h(new clhx());
                cklv cklvVar = (cklv) presenceChimeraService.w.b(cklv.class);
                brbz brbzVar = presenceChimeraService.s;
                dnlf dnlfVar2 = presenceChimeraService.b;
                cklvVar.a = new cklu(brbzVar, "com.google.android.gms.nearby.presence", presenceChimeraService);
                presenceChimeraService.m = new clhs(presenceChimeraService);
                if (presenceChimeraService.v.a && presenceChimeraService.c == null) {
                    presenceChimeraService.c = new ckoy(presenceChimeraService);
                }
                presenceChimeraService.y = new ckqk(presenceChimeraService, presenceChimeraService.v);
                if (presenceChimeraService.C == null) {
                    ckoy ckoyVar = presenceChimeraService.c;
                    clhs clhsVar = presenceChimeraService.m;
                    cljm cljmVar = presenceChimeraService.v;
                    ckqk ckqkVar = presenceChimeraService.y;
                    cexc.l(presenceChimeraService);
                    presenceChimeraService.C = new ckqj(presenceChimeraService, ckoyVar, true != cexc.j(presenceChimeraService) ? 1 : 2, asnz.a, clhsVar, ckqkVar, cljmVar);
                }
                if (((Boolean) presenceChimeraService.A.a()).booleanValue()) {
                    final ckqj ckqjVar = presenceChimeraService.C;
                    if (ckqjVar.b.isShutdown()) {
                        ckqjVar.b = cfdj.b();
                    }
                    if (ckqjVar.g.a) {
                        final ckqi ckqiVar = new ckqi(ckqjVar);
                        ckqjVar.b.execute(new Runnable() { // from class: ckqg
                            @Override // java.lang.Runnable
                            public final void run() {
                                ckoy ckoyVar2 = ckqj.this.d;
                                if (ckoyVar2 == null || ckoyVar2.d(ckqiVar)) {
                                    return;
                                }
                                ((ejhf) ckmb.a.j()).B("%s: Failed to start monitoring TidepoolManager setting changes.", "IdentityManager");
                            }
                        });
                    }
                }
                if (fqma.B() && presenceChimeraService.x == null) {
                    ckoy ckoyVar2 = presenceChimeraService.c;
                    clhs clhsVar2 = presenceChimeraService.m;
                    cljm cljmVar2 = presenceChimeraService.v;
                    ckqk ckqkVar2 = presenceChimeraService.y;
                    cexc.l(presenceChimeraService);
                    presenceChimeraService.x = new ckqx(presenceChimeraService, ckoyVar2, true != cexc.j(presenceChimeraService) ? 1 : 2, asnz.a, clhsVar2, ckqkVar2, cljmVar2);
                    final ckqx ckqxVar = presenceChimeraService.x;
                    if (ckqxVar.b.isShutdown()) {
                        ckqxVar.b = cfdj.b();
                    }
                    if (ckqxVar.h.a) {
                        final ckqw ckqwVar = new ckqw(ckqxVar);
                        ckqxVar.b.execute(new Runnable() { // from class: ckqu
                            @Override // java.lang.Runnable
                            public final void run() {
                                ckoy ckoyVar3 = ckqx.this.i;
                                if (ckoyVar3 == null || ckoyVar3.d(ckqwVar)) {
                                    return;
                                }
                                ((ejhf) ((ejhf) ckmb.a.j()).ah((char) 7956)).B("%s: Failed to start monitoring TidepoolManager setting changes.", "TidepoolIdentityProvider");
                            }
                        });
                    }
                }
                presenceChimeraService.z = new clen(presenceChimeraService);
                presenceChimeraService.z.a();
                if (fqma.a.a().av()) {
                    dnlfVar = dnlfVar2;
                    presenceChimeraService.p = new cljd(presenceChimeraService, presenceChimeraService.C, presenceChimeraService.v);
                } else {
                    dnlfVar = dnlfVar2;
                    ckmf ckmfVar = new ckmf(presenceChimeraService, presenceChimeraService.C, presenceChimeraService.a, dnlfVar, presenceChimeraService.z, presenceChimeraService.v);
                    presenceChimeraService.o = new clfe(presenceChimeraService, ckmfVar, dnlfVar);
                    presenceChimeraService.o.b();
                    presenceChimeraService.p = new cljd(presenceChimeraService, ckmfVar, presenceChimeraService.C, presenceChimeraService.v);
                }
                presenceChimeraService.n = new clew(presenceChimeraService, new ckms(presenceChimeraService, presenceChimeraService.C, presenceChimeraService.a, presenceChimeraService.v), presenceChimeraService.C, dnlfVar);
                clew clewVar = presenceChimeraService.n;
                synchronized (clewVar.a) {
                    clewVar.h = true;
                    ?? r3 = clewVar.g;
                    if (!((ckms) r3).f) {
                        ((ejhf) ckmb.a.h()).B("%s: Enabling engine.", "BroadcastEngineImplV1");
                        ((ckms) r3).f = true;
                        asqu asquVar = ((ckms) r3).a;
                        ((ckms) r3).g = asquVar.d();
                        ((ckms) r3).o = clewVar;
                        bhiz d = cexc.d(((ckms) r3).i, "BroadcastEngineImplV1");
                        ((ckms) r3).h = d != null && d.r();
                        asquVar.b(r3);
                        ((ckms) r3).b.b(r3);
                        ((ckms) r3).i();
                    }
                }
                if (presenceChimeraService.v.b) {
                    presenceChimeraService.C.o(new clih(presenceChimeraService));
                }
                ConnectivityManager connectivityManager = (ConnectivityManager) presenceChimeraService.getSystemService("connectivity");
                presenceChimeraService.q = connectivityManager == null ? null : new clgb(connectivityManager);
                clgb clgbVar = presenceChimeraService.q;
                if (clgbVar != null) {
                    clif clifVar = presenceChimeraService.B;
                    if (clgbVar.i != null) {
                        ((ejhf) ckmb.a.j()).x("NetworkMonitorImpl there is already an active callback.");
                    } else {
                        clgbVar.i = clifVar;
                    }
                    if (!clgbVar.c) {
                        clgbVar.c = true;
                        clgbVar.a.registerNetworkCallback(clgbVar.d, clgbVar.f);
                        ((ejhf) ckmb.a.h()).x("NetworkMonitorImpl started.");
                    }
                }
                presenceChimeraService.f();
                if (((Boolean) presenceChimeraService.A.a()).booleanValue()) {
                    int i = PresenceSyncBoundService.a;
                    byjl a = byjl.a(presenceChimeraService);
                    if (fnck.e()) {
                        byko bykoVar = new byko();
                        bykoVar.w(PresenceSyncBoundService.class.getName());
                        bykoVar.q("PresenceServerSync");
                        bykoVar.v(1);
                        bykoVar.l(true);
                        bykoVar.a = bykv.j;
                        bykw b = bykoVar.b();
                        try {
                            a.f(b);
                            ((ejhf) ((ejhf) ckmb.a.h()).ah(8247)).B("Scheduled Presence server sync recurring task with cadence %s.", ((byke) b).a);
                        } catch (IllegalArgumentException e2) {
                            ((ejhf) ((ejhf) ((ejhf) ckmb.a.j()).s(e2)).ah((char) 8248)).x("Failed to schedule server sync task.");
                        }
                    } else {
                        bykm bykmVar = new bykm();
                        bykmVar.w(PresenceSyncBoundService.class.getName());
                        bykmVar.x(0, 1);
                        bykmVar.y(0, 1);
                        bykmVar.q("PresenceServerSync");
                        bykmVar.v(1);
                        bykmVar.j(byki.a(fqma.a.a().A()));
                        bykn b2 = bykmVar.b();
                        try {
                            a.f(b2);
                            ((ejhf) ((ejhf) ckmb.a.h()).ah(8245)).A("Scheduled Presence server sync periodic task with period %s seconds.", b2.a);
                        } catch (IllegalArgumentException e3) {
                            ((ejhf) ((ejhf) ((ejhf) ckmb.a.j()).s(e3)).ah((char) 8246)).x("Failed to schedule server sync task.");
                        }
                    }
                }
                ((ejhf) ckmb.a.f(ckmb.a()).ah(8221)).x("Nearby Presence service is created!");
            }
        });
    }

    @Override // defpackage.bxgd, com.google.android.chimera.BoundService, defpackage.qan
    public final void onDestroy() {
        this.E = c(new Runnable() { // from class: clia
            @Override // java.lang.Runnable
            public final void run() {
                Object b;
                Object b2;
                Object b3;
                Object b4;
                Object b5;
                PresenceChimeraService presenceChimeraService = PresenceChimeraService.this;
                clen clenVar = presenceChimeraService.z;
                if (clenVar != null) {
                    fvid.e(clenVar.e, null);
                    clenVar.a.c();
                    clenVar.b.c();
                    clei cleiVar = clenVar.g;
                    if (cleiVar != null) {
                        clenVar.m.a.k(cleiVar);
                    }
                    if (!clenVar.c.d(3)) {
                        ((ejhf) ckmb.a.j()).x("Failed to unregister DedupHintManager.");
                    }
                    crpd crpdVar = clenVar.d;
                    if (crpdVar != null) {
                        crpdVar.e();
                    }
                    fvrz fvrzVar = clenVar.o;
                    do {
                        b = fvrzVar.b();
                        ((Boolean) b).booleanValue();
                    } while (!fvrzVar.g(b, false));
                    fvrz fvrzVar2 = clenVar.n;
                    do {
                        b2 = fvrzVar2.b();
                        ((Boolean) b2).booleanValue();
                    } while (!fvrzVar2.g(b2, false));
                    fvrz fvrzVar3 = clenVar.p;
                    do {
                        b3 = fvrzVar3.b();
                    } while (!fvrzVar3.g(b3, new clec(fuwm.C(new byte[8]))));
                    fvrz fvrzVar4 = clenVar.q;
                    do {
                        b4 = fvrzVar4.b();
                    } while (!fvrzVar4.g(b4, new ckzs(fuwx.a)));
                    fvrz fvrzVar5 = clenVar.r;
                    do {
                        b5 = fvrzVar5.b();
                        ((Boolean) b5).booleanValue();
                    } while (!fvrzVar5.g(b5, false));
                }
                int i = PresenceSyncBoundService.a;
                byjl.a(presenceChimeraService).d("PresenceServerSync", PresenceSyncBoundService.class.getName());
                clgb clgbVar = presenceChimeraService.q;
                if (clgbVar != null) {
                    if (clgbVar.c) {
                        clgbVar.c = false;
                        clgbVar.b.clear();
                        clgbVar.a.unregisterNetworkCallback(clgbVar.f);
                        ((ejhf) ckmb.a.h()).x("NetworkMonitorImpl stopped.");
                    }
                    clgbVar.i = null;
                }
                if (presenceChimeraService.v.b) {
                    presenceChimeraService.C.r("com.google.gms.tidepool");
                }
                if (presenceChimeraService.n != null) {
                    clew clewVar = presenceChimeraService.n;
                    synchronized (clewVar.a) {
                        clewVar.m(new eiih() { // from class: cleu
                            @Override // defpackage.eiih
                            public final boolean a(Object obj) {
                                int i2 = clew.l;
                                return true;
                            }
                        });
                        ckmh ckmhVar = clewVar.g;
                        if (((ckms) ckmhVar).f) {
                            ((ejhf) ckmb.a.h()).B("%s: Disabling engine.", "BroadcastEngineImplV1");
                            ((ckms) ckmhVar).a.c();
                            ((ckms) ckmhVar).b.c();
                            ((ckms) ckmhVar).f = false;
                            ((ckms) ckmhVar).i();
                        }
                        clewVar.h = false;
                    }
                }
                if (presenceChimeraService.o != null) {
                    presenceChimeraService.o.a();
                }
                if (presenceChimeraService.c != null) {
                    ckoy ckoyVar = presenceChimeraService.c;
                    OnAccountsUpdateListener onAccountsUpdateListener = ckoyVar.d;
                    if (onAccountsUpdateListener != null) {
                        ckoyVar.a.i(onAccountsUpdateListener);
                        ckoyVar.d = null;
                    }
                    ContentObserver contentObserver = ckoyVar.e;
                    if (contentObserver != null) {
                        ckoyVar.b.unregisterContentObserver(contentObserver);
                        ckoyVar.e = null;
                    }
                    ckoyVar.c = null;
                    ((ejhf) ckmb.a.f(ckmb.a()).ah(7918)).x("stopMonitorSettingChange!");
                }
                if (presenceChimeraService.d == null) {
                    cfet cfetVar = new cfet();
                    cfetVar.a = "nearby.presence";
                    presenceChimeraService.d = cewl.a(presenceChimeraService, new cfeu(cfetVar));
                }
                aqxt aqxtVar = presenceChimeraService.d;
                ((cizm) aqxtVar).a.d((aqxo) aqxtVar, "device_provider");
                asot asotVar = ckmb.a;
                ((ejhf) asotVar.f(ckmb.a()).ah(8225)).x("Nearby Presence unregistered Device Provider");
                presenceChimeraService.w.g();
                ((ejhf) asotVar.f(ckmb.a()).ah(8223)).x("Nearby Presence service is destroyed!");
                presenceChimeraService.a.shutdown();
            }
        });
        super.onDestroy();
    }
}
