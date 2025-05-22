package com.google.android.gms.backup.d2d.component;

import android.content.Intent;
import android.net.Uri;
import android.os.IBinder;
import android.util.Base64;
import com.google.android.chimera.Service;
import com.google.android.gms.backup.d2d.component.D2dEarlySourceChimeraService;
import com.google.android.gms.backup.d2d.migrate.service.protocol.p2p.PlayP2pRestoreServiceResultReceiver;
import defpackage.ajwt;
import defpackage.ajxp;
import defpackage.akbi;
import defpackage.akhx;
import defpackage.akhy;
import defpackage.akhz;
import defpackage.akib;
import defpackage.akic;
import defpackage.akid;
import defpackage.akie;
import defpackage.akjx;
import defpackage.akkk;
import defpackage.akkn;
import defpackage.akll;
import defpackage.akpk;
import defpackage.akpp;
import defpackage.akpx;
import defpackage.akqa;
import defpackage.akwa;
import defpackage.algg;
import defpackage.algo;
import defpackage.aupe;
import defpackage.aupv;
import defpackage.aupz;
import defpackage.bzoo;
import defpackage.dznn;
import defpackage.dzno;
import defpackage.dzti;
import defpackage.dztj;
import defpackage.eqdl;
import defpackage.eqdv;
import defpackage.eqex;
import defpackage.eqft;
import defpackage.eqgb;
import defpackage.eqgc;
import defpackage.eqgf;
import defpackage.eqgl;
import defpackage.eqgo;
import defpackage.eqhc;
import defpackage.focl;
import j$.util.Objects;
import j$.util.function.Function$CC;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Function;
import java.util.regex.Pattern;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class D2dEarlySourceChimeraService extends Service {
    public static final ajwt a = (ajwt) ajwt.a("D2dEarlySourceChimeraService");
    public akpx d;
    public akwa e;
    public akjx f;
    private akqa m;
    private akbi n;
    private akkk o;
    private aupe p;
    private eqgo q;
    private eqgo r;
    private final IBinder k = new akie(this);
    public final AtomicLong b = new AtomicLong(0);
    public final AtomicBoolean c = new AtomicBoolean(false);
    private final AtomicInteger l = new AtomicInteger(0);
    public eqgl g = eqgc.i(false);
    public eqgl h = eqgc.i(algg.a);
    public eqhc i = a();
    public eqgl j = eqgf.a;

    public static eqhc a() {
        eqhc eqhcVar = new eqhc();
        eqhcVar.q(null);
        return eqhcVar;
    }

    public static final long g(Intent intent) {
        String stringExtra = intent.getStringExtra("suw_session_id");
        if (stringExtra == null) {
            return 0L;
        }
        return Long.parseLong(stringExtra);
    }

    public static final void h(eqgl eqglVar) {
        try {
            eqgc.r(eqglVar);
        } catch (CancellationException unused) {
        } catch (IllegalStateException | ExecutionException e) {
            a.n("Future failed with error", e, new Object[0]);
        }
    }

    public final void b(final akpp akppVar, final byte[] bArr) {
        boolean e = this.d.e();
        if (this.c.get()) {
            this.i.cancel(false);
            return;
        }
        if (!e) {
            if (!akppVar.b()) {
                this.i.q(null);
                return;
            } else if (akppVar.b()) {
                akppVar.a(new Runnable() { // from class: akhr
                    @Override // java.lang.Runnable
                    public final void run() {
                        D2dEarlySourceChimeraService.this.b(akppVar, bArr);
                    }
                });
                return;
            }
        }
        akib akibVar = new akib(this, akppVar, bArr);
        this.d.b(bArr, new PlayP2pRestoreServiceResultReceiver(this.m, akibVar, this.q), akibVar);
    }

    public final void c() {
        d(0L);
        eqgc.t(this.n.b(), new akid(), eqex.a);
        this.o.b(this);
        this.n.e();
        f();
    }

    public final void d(long j) {
        AtomicLong atomicLong = this.b;
        synchronized (atomicLong) {
            atomicLong.set(j);
            atomicLong.notifyAll();
        }
    }

    public final void e(Intent intent) {
        eqgl a2;
        ajwt ajwtVar = a;
        ajwtVar.h("Starting processing for session ID: %d", Long.valueOf(this.b.get()));
        eqgc.t(this.n.a(), new akic(), eqex.a);
        this.o.a(this);
        if (this.c.get()) {
            a2 = eqgc.g();
        } else {
            this.h = eqgc.m(new Callable() { // from class: akhs
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    ajwt ajwtVar2 = akkf.a;
                    D2dEarlySourceChimeraService d2dEarlySourceChimeraService = D2dEarlySourceChimeraService.this;
                    akwa akwaVar = d2dEarlySourceChimeraService.e;
                    ekww a3 = ekxd.a(new akke());
                    fgrr fgrrVar = focl.a.lK().L().b;
                    fgrc v = algd.a.v();
                    for (ajjy ajjyVar : d2dEarlySourceChimeraService.e.c()) {
                        if (ajjyVar != ajjy.APK && !fgrrVar.contains(Integer.valueOf(ajjyVar.q))) {
                            v.cO(ajlj.b(ajjyVar));
                        }
                    }
                    return akkf.b((algd) v.Q(), 1, a3, d2dEarlySourceChimeraService, akwaVar);
                }
            }, this.r);
            if (focl.w()) {
                String stringExtra = intent.getStringExtra("p2p_device_token");
                if (stringExtra == null) {
                    ajwtVar.d("Got a null p2p device token from source", new Object[0]);
                } else {
                    try {
                        byte[] decode = Base64.decode(stringExtra, 2);
                        ajwtVar.d("Device Token: %s", Arrays.toString(decode));
                        this.i = new eqhc();
                        b(new akpp(this.p), decode);
                    } catch (IllegalArgumentException e) {
                        a.g("Failed to decode device token", e, new Object[0]);
                    }
                }
                a2 = eqgc.d(this.h, this.i).a(new Callable() { // from class: akht
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        D2dEarlySourceChimeraService d2dEarlySourceChimeraService = D2dEarlySourceChimeraService.this;
                        algg alggVar = (algg) eqgc.r(d2dEarlySourceChimeraService.h);
                        algc algcVar = (algc) ajlj.b(ajjy.APK).Q();
                        akvv a3 = d2dEarlySourceChimeraService.e.a(algcVar);
                        fgrc v = algf.a.v();
                        if (!v.b.L()) {
                            v.U();
                        }
                        algf algfVar = (algf) v.b;
                        algcVar.getClass();
                        algfVar.c = algcVar;
                        algfVar.b |= 1;
                        v.cP(a3.c());
                        algf algfVar2 = (algf) v.Q();
                        D2dEarlySourceChimeraService.a.j("Adding flavor summary apk with %d items", Integer.valueOf(algfVar2.d.size()));
                        fgrc w = algg.a.w(alggVar);
                        if (!w.b.L()) {
                            w.U();
                        }
                        algg alggVar2 = (algg) w.b;
                        algfVar2.getClass();
                        alggVar2.b();
                        alggVar2.c.add(algfVar2);
                        return (algg) w.Q();
                    }
                }, this.r);
            } else {
                ajwtVar.h("Experiment flag for apk transfer disabled", new Object[0]);
                a2 = this.h;
            }
        }
        eqgl g = eqdl.g(eqgb.h(a2), new eqdv() { // from class: akhw
            @Override // defpackage.eqdv
            public final eqgl a(Object obj) {
                D2dEarlySourceChimeraService d2dEarlySourceChimeraService = D2dEarlySourceChimeraService.this;
                AtomicLong atomicLong = d2dEarlySourceChimeraService.b;
                final algg alggVar = (algg) obj;
                final akjx akjxVar = d2dEarlySourceChimeraService.f;
                final long j = atomicLong.get();
                final Function function = new Function() { // from class: akjr
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo479andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        algo algoVar = (algo) obj2;
                        fgrc fgrcVar = (fgrc) algoVar.iQ(5, null);
                        fgrcVar.X(algoVar);
                        if (!fgrcVar.b.L()) {
                            fgrcVar.U();
                        }
                        long j2 = j;
                        algo algoVar2 = (algo) fgrcVar.b;
                        algo algoVar3 = algo.a;
                        algoVar2.b |= 1;
                        algoVar2.c = j2;
                        if (!fgrcVar.b.L()) {
                            fgrcVar.U();
                        }
                        algg alggVar2 = alggVar;
                        algo algoVar4 = (algo) fgrcVar.b;
                        alggVar2.getClass();
                        algoVar4.d = alggVar2;
                        algoVar4.b |= 4;
                        return (algo) fgrcVar.Q();
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                };
                return eqdl.g(eqgb.h(akjxVar.a()), new eqdv() { // from class: akjt
                    @Override // defpackage.eqdv
                    public final eqgl a(Object obj2) {
                        long j2 = j;
                        Long l = (Long) obj2;
                        if (j2 == 0) {
                            return eqgf.a;
                        }
                        final Function function2 = function;
                        akjx akjxVar2 = akjx.this;
                        if (l.longValue() != j2) {
                            return akjxVar2.a.b(new ekut() { // from class: akjv
                                @Override // defpackage.ekut
                                public final Object apply(Object obj3) {
                                    Object apply;
                                    apply = Function.this.apply(algo.a);
                                    return (algo) apply;
                                }
                            }, eqex.a);
                        }
                        dzwm dzwmVar = akjxVar2.a;
                        Objects.requireNonNull(function2);
                        return dzwmVar.b(new ekut() { // from class: akju
                            @Override // defpackage.ekut
                            public final Object apply(Object obj3) {
                                Object apply;
                                apply = Function.this.apply((algo) obj3);
                                return (algo) apply;
                            }
                        }, eqex.a);
                    }
                }, eqex.a);
            }
        }, this.r);
        this.j = g;
        eqgc.t(g, new akhz(this), this.r);
    }

    public final void f() {
        if (this.l.get() == 0 && this.b.get() == 0) {
            a.d("Stopping service as processing is finished and it's not bound", new Object[0]);
            stopSelf();
        }
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        a.j("#onBind", new Object[0]);
        this.l.incrementAndGet();
        return this.k;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        a.j("#onCreate", new Object[0]);
        super.onCreate();
        this.p = new aupv(1, 9);
        this.r = new aupz(1, 9);
        this.q = new aupz(1, 9);
        Pattern pattern = dzno.a;
        dznn dznnVar = new dznn(this);
        dznnVar.e("backup");
        dznnVar.f("D2dIndexingProtoDataStore.pb");
        Uri a2 = dznnVar.a();
        dzti a3 = dztj.a();
        a3.f(a2);
        a3.e(algo.a);
        this.f = new akjx(bzoo.a.a(a3.a()));
        this.d = new akpx(this, this.q, this.p);
        this.m = new akqa();
        this.n = new akbi(this, this.p, "com.google.android.gms.backup.component.D2dEarlySourceService");
        this.o = new akkk();
        akkn akknVar = new akkn(this);
        this.e = akwa.b(this, akll.a(this, akknVar), akknVar, new ajxp(this), this.m, new akpk(this), this.r);
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        a.j("#onDestroy", new Object[0]);
        super.onDestroy();
        this.d.a();
        this.p.shutdown();
        this.r.shutdown();
        this.q.shutdown();
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        ajwt ajwtVar = a;
        ajwtVar.j("#onStartCommand", new Object[0]);
        if (intent == null) {
            ajwtVar.m("OnStartCommand called with null intent, not doing any work as there are no pending starts to this service.", new Object[0]);
            f();
        } else if (focl.x()) {
            long g = g(intent);
            if (g == 0) {
                ajwtVar.h("Did not receive SUW session ID from source", new Object[0]);
                f();
            } else {
                AtomicLong atomicLong = this.b;
                if (atomicLong.get() == g) {
                    ajwtVar.h("Processing already in progress for session ID: %d", Long.valueOf(g));
                } else if (atomicLong.get() == 0) {
                    long g2 = g(intent);
                    d(g2);
                    eqgl b = this.f.b(g2);
                    this.g = b;
                    eqgc.t(b, new akhx(this, g2, intent), eqex.a);
                } else {
                    ajwtVar.h("Processing in progress for a different session ID", new Object[0]);
                    ajwtVar.d("Cancelling processing for session ID: %d", Long.valueOf(atomicLong.get()));
                    this.c.set(true);
                    this.g.cancel(false);
                    this.h.cancel(false);
                    eqft b2 = eqgc.b(this.g, this.h, this.i, this.j);
                    Callable callable = new Callable() { // from class: akhv
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            D2dEarlySourceChimeraService d2dEarlySourceChimeraService = D2dEarlySourceChimeraService.this;
                            D2dEarlySourceChimeraService.h(d2dEarlySourceChimeraService.g);
                            D2dEarlySourceChimeraService.h(d2dEarlySourceChimeraService.h);
                            D2dEarlySourceChimeraService.h(d2dEarlySourceChimeraService.j);
                            D2dEarlySourceChimeraService.h(d2dEarlySourceChimeraService.i);
                            D2dEarlySourceChimeraService.a.h("Processing cancelled for session ID: %d", Long.valueOf(d2dEarlySourceChimeraService.b.get()));
                            d2dEarlySourceChimeraService.g = eqgc.i(false);
                            d2dEarlySourceChimeraService.h = eqgc.i(algg.a);
                            d2dEarlySourceChimeraService.j = eqgf.a;
                            d2dEarlySourceChimeraService.i = D2dEarlySourceChimeraService.a();
                            d2dEarlySourceChimeraService.d(0L);
                            d2dEarlySourceChimeraService.c.set(false);
                            return null;
                        }
                    };
                    eqex eqexVar = eqex.a;
                    eqgc.t(b2.a(callable, eqexVar), new akhy(this, intent), eqexVar);
                }
            }
        } else {
            ajwtVar.h("Early indexing is disabled", new Object[0]);
            f();
        }
        return 2;
    }

    @Override // com.google.android.chimera.Service
    public final boolean onUnbind(Intent intent) {
        a.j("#onUnbind", new Object[0]);
        this.l.decrementAndGet();
        f();
        return false;
    }
}
