package com.google.android.gms.backup.d2d.component;

import android.content.Intent;
import android.net.Uri;
import android.os.IBinder;
import android.util.Base64;
import com.google.android.chimera.Service;
import com.google.android.gms.backup.d2d.component.D2dEarlySourceChimeraService;
import com.google.android.gms.backup.d2d.migrate.service.protocol.p2p.PlayP2pRestoreServiceResultReceiver;
import defpackage.ahwd;
import defpackage.ahwz;
import defpackage.aias;
import defpackage.aihh;
import defpackage.aihi;
import defpackage.aihj;
import defpackage.aihl;
import defpackage.aihm;
import defpackage.aihn;
import defpackage.aiho;
import defpackage.aijh;
import defpackage.aiju;
import defpackage.aijx;
import defpackage.aikv;
import defpackage.aiou;
import defpackage.aioz;
import defpackage.aiph;
import defpackage.aipk;
import defpackage.aivk;
import defpackage.ajfo;
import defpackage.ajfw;
import defpackage.aslk;
import defpackage.asmb;
import defpackage.asmf;
import defpackage.bxfy;
import defpackage.dxbn;
import defpackage.dxbo;
import defpackage.dxhi;
import defpackage.dxhj;
import defpackage.enps;
import defpackage.enqc;
import defpackage.enre;
import defpackage.ensa;
import defpackage.ensi;
import defpackage.ensj;
import defpackage.ensm;
import defpackage.enss;
import defpackage.ensv;
import defpackage.entj;
import defpackage.fllb;
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

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class D2dEarlySourceChimeraService extends Service {
    public static final ahwd a = (ahwd) ahwd.a("D2dEarlySourceChimeraService");
    public aiph d;
    public aivk e;
    public aijh f;
    private aipk m;
    private aias n;
    private aiju o;
    private aslk p;
    private ensv q;
    private ensv r;
    private final IBinder k = new aiho(this);
    public final AtomicLong b = new AtomicLong(0);
    public final AtomicBoolean c = new AtomicBoolean(false);
    private final AtomicInteger l = new AtomicInteger(0);
    public enss g = ensj.i(false);
    public enss h = ensj.i(ajfo.a);
    public entj i = a();
    public enss j = ensm.a;

    public static entj a() {
        entj entjVar = new entj();
        entjVar.q(null);
        return entjVar;
    }

    public static final long g(Intent intent) {
        String stringExtra = intent.getStringExtra("suw_session_id");
        if (stringExtra == null) {
            return 0L;
        }
        return Long.parseLong(stringExtra);
    }

    public static final void h(enss enssVar) {
        try {
            ensj.r(enssVar);
        } catch (CancellationException unused) {
        } catch (IllegalStateException | ExecutionException e) {
            a.n("Future failed with error", e, new Object[0]);
        }
    }

    public final void b(final aioz aiozVar, final byte[] bArr) {
        boolean e = this.d.e();
        if (this.c.get()) {
            this.i.cancel(false);
            return;
        }
        if (!e) {
            if (!aiozVar.b()) {
                this.i.q(null);
                return;
            } else if (aiozVar.b()) {
                aiozVar.a(new Runnable() { // from class: aihb
                    @Override // java.lang.Runnable
                    public final void run() {
                        D2dEarlySourceChimeraService.this.b(aiozVar, bArr);
                    }
                });
                return;
            }
        }
        aihl aihlVar = new aihl(this, aiozVar, bArr);
        this.d.b(bArr, new PlayP2pRestoreServiceResultReceiver(this.m, aihlVar, this.q), aihlVar);
    }

    public final void c() {
        d(0L);
        ensj.t(this.n.b(), new aihn(), enre.a);
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
        enss a2;
        ahwd ahwdVar = a;
        ahwdVar.h("Starting processing for session ID: %d", Long.valueOf(this.b.get()));
        ensj.t(this.n.a(), new aihm(), enre.a);
        this.o.a(this);
        if (this.c.get()) {
            a2 = ensj.g();
        } else {
            this.h = ensj.m(new Callable() { // from class: aihc
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    ahwd ahwdVar2 = aijp.a;
                    D2dEarlySourceChimeraService d2dEarlySourceChimeraService = D2dEarlySourceChimeraService.this;
                    aivk aivkVar = d2dEarlySourceChimeraService.e;
                    eijr a3 = eijy.a(new aijo());
                    fecy fecyVar = fllb.a.a().L().b;
                    fecj v = ajfl.a.v();
                    for (ahji ahjiVar : d2dEarlySourceChimeraService.e.c()) {
                        if (ahjiVar != ahji.APK && !fecyVar.contains(Integer.valueOf(ahjiVar.q))) {
                            v.cO(ahkt.b(ahjiVar));
                        }
                    }
                    return aijp.b((ajfl) v.Q(), 1, a3, d2dEarlySourceChimeraService, aivkVar);
                }
            }, this.r);
            if (fllb.w()) {
                String stringExtra = intent.getStringExtra("p2p_device_token");
                if (stringExtra == null) {
                    ahwdVar.d("Got a null p2p device token from source", new Object[0]);
                } else {
                    try {
                        byte[] decode = Base64.decode(stringExtra, 2);
                        ahwdVar.d("Device Token: %s", Arrays.toString(decode));
                        this.i = new entj();
                        b(new aioz(this.p), decode);
                    } catch (IllegalArgumentException e) {
                        a.g("Failed to decode device token", e, new Object[0]);
                    }
                }
                a2 = ensj.d(this.h, this.i).a(new Callable() { // from class: aihd
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        D2dEarlySourceChimeraService d2dEarlySourceChimeraService = D2dEarlySourceChimeraService.this;
                        ajfo ajfoVar = (ajfo) ensj.r(d2dEarlySourceChimeraService.h);
                        ajfk ajfkVar = (ajfk) ahkt.b(ahji.APK).Q();
                        aivf a3 = d2dEarlySourceChimeraService.e.a(ajfkVar);
                        fecj v = ajfn.a.v();
                        if (!v.b.L()) {
                            v.U();
                        }
                        ajfn ajfnVar = (ajfn) v.b;
                        ajfkVar.getClass();
                        ajfnVar.c = ajfkVar;
                        ajfnVar.b |= 1;
                        v.cP(a3.c());
                        ajfn ajfnVar2 = (ajfn) v.Q();
                        D2dEarlySourceChimeraService.a.j("Adding flavor summary apk with %d items", Integer.valueOf(ajfnVar2.d.size()));
                        fecj w = ajfo.a.w(ajfoVar);
                        if (!w.b.L()) {
                            w.U();
                        }
                        ajfo ajfoVar2 = (ajfo) w.b;
                        ajfnVar2.getClass();
                        ajfoVar2.b();
                        ajfoVar2.c.add(ajfnVar2);
                        return (ajfo) w.Q();
                    }
                }, this.r);
            } else {
                ahwdVar.h("Experiment flag for apk transfer disabled", new Object[0]);
                a2 = this.h;
            }
        }
        enss g = enps.g(ensi.h(a2), new enqc() { // from class: aihg
            @Override // defpackage.enqc
            public final enss a(Object obj) {
                D2dEarlySourceChimeraService d2dEarlySourceChimeraService = D2dEarlySourceChimeraService.this;
                AtomicLong atomicLong = d2dEarlySourceChimeraService.b;
                final ajfo ajfoVar = (ajfo) obj;
                final aijh aijhVar = d2dEarlySourceChimeraService.f;
                final long j = atomicLong.get();
                final Function function = new Function() { // from class: aijb
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo464andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        ajfw ajfwVar = (ajfw) obj2;
                        fecj fecjVar = (fecj) ajfwVar.iB(5, null);
                        fecjVar.X(ajfwVar);
                        if (!fecjVar.b.L()) {
                            fecjVar.U();
                        }
                        long j2 = j;
                        ajfw ajfwVar2 = (ajfw) fecjVar.b;
                        ajfw ajfwVar3 = ajfw.a;
                        ajfwVar2.b |= 1;
                        ajfwVar2.c = j2;
                        if (!fecjVar.b.L()) {
                            fecjVar.U();
                        }
                        ajfo ajfoVar2 = ajfoVar;
                        ajfw ajfwVar4 = (ajfw) fecjVar.b;
                        ajfoVar2.getClass();
                        ajfwVar4.d = ajfoVar2;
                        ajfwVar4.b |= 4;
                        return (ajfw) fecjVar.Q();
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                };
                return enps.g(ensi.h(aijhVar.a()), new enqc() { // from class: aijd
                    @Override // defpackage.enqc
                    public final enss a(Object obj2) {
                        long j2 = j;
                        Long l = (Long) obj2;
                        if (j2 == 0) {
                            return ensm.a;
                        }
                        final Function function2 = function;
                        aijh aijhVar2 = aijh.this;
                        if (l.longValue() != j2) {
                            return aijhVar2.a.b(new eiho() { // from class: aijf
                                @Override // defpackage.eiho
                                public final Object apply(Object obj3) {
                                    Object apply;
                                    apply = Function.this.apply(ajfw.a);
                                    return (ajfw) apply;
                                }
                            }, enre.a);
                        }
                        dxkm dxkmVar = aijhVar2.a;
                        Objects.requireNonNull(function2);
                        return dxkmVar.b(new eiho() { // from class: aije
                            @Override // defpackage.eiho
                            public final Object apply(Object obj3) {
                                Object apply;
                                apply = Function.this.apply((ajfw) obj3);
                                return (ajfw) apply;
                            }
                        }, enre.a);
                    }
                }, enre.a);
            }
        }, this.r);
        this.j = g;
        ensj.t(g, new aihj(this), this.r);
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
        this.p = new asmb(1, 9);
        this.r = new asmf(1, 9);
        this.q = new asmf(1, 9);
        Pattern pattern = dxbo.a;
        dxbn dxbnVar = new dxbn(this);
        dxbnVar.e("backup");
        dxbnVar.f("D2dIndexingProtoDataStore.pb");
        Uri a2 = dxbnVar.a();
        dxhi a3 = dxhj.a();
        a3.f(a2);
        a3.e(ajfw.a);
        this.f = new aijh(bxfy.a.a(a3.a()));
        this.d = new aiph(this, this.q, this.p);
        this.m = new aipk();
        this.n = new aias(this, this.p, "com.google.android.gms.backup.component.D2dEarlySourceService");
        this.o = new aiju();
        aijx aijxVar = new aijx(this);
        this.e = aivk.b(this, aikv.a(this, aijxVar), aijxVar, new ahwz(this), this.m, new aiou(this), this.r);
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
        ahwd ahwdVar = a;
        ahwdVar.j("#onStartCommand", new Object[0]);
        if (intent == null) {
            ahwdVar.m("OnStartCommand called with null intent, not doing any work as there are no pending starts to this service.", new Object[0]);
            f();
        } else if (fllb.x()) {
            long g = g(intent);
            if (g == 0) {
                ahwdVar.h("Did not receive SUW session ID from source", new Object[0]);
                f();
            } else {
                AtomicLong atomicLong = this.b;
                if (atomicLong.get() == g) {
                    ahwdVar.h("Processing already in progress for session ID: %d", Long.valueOf(g));
                } else if (atomicLong.get() == 0) {
                    long g2 = g(intent);
                    d(g2);
                    enss b = this.f.b(g2);
                    this.g = b;
                    ensj.t(b, new aihh(this, g2, intent), enre.a);
                } else {
                    ahwdVar.h("Processing in progress for a different session ID", new Object[0]);
                    ahwdVar.d("Cancelling processing for session ID: %d", Long.valueOf(atomicLong.get()));
                    this.c.set(true);
                    this.g.cancel(false);
                    this.h.cancel(false);
                    ensa b2 = ensj.b(this.g, this.h, this.i, this.j);
                    Callable callable = new Callable() { // from class: aihf
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            D2dEarlySourceChimeraService d2dEarlySourceChimeraService = D2dEarlySourceChimeraService.this;
                            D2dEarlySourceChimeraService.h(d2dEarlySourceChimeraService.g);
                            D2dEarlySourceChimeraService.h(d2dEarlySourceChimeraService.h);
                            D2dEarlySourceChimeraService.h(d2dEarlySourceChimeraService.j);
                            D2dEarlySourceChimeraService.h(d2dEarlySourceChimeraService.i);
                            D2dEarlySourceChimeraService.a.h("Processing cancelled for session ID: %d", Long.valueOf(d2dEarlySourceChimeraService.b.get()));
                            d2dEarlySourceChimeraService.g = ensj.i(false);
                            d2dEarlySourceChimeraService.h = ensj.i(ajfo.a);
                            d2dEarlySourceChimeraService.j = ensm.a;
                            d2dEarlySourceChimeraService.i = D2dEarlySourceChimeraService.a();
                            d2dEarlySourceChimeraService.d(0L);
                            d2dEarlySourceChimeraService.c.set(false);
                            return null;
                        }
                    };
                    enre enreVar = enre.a;
                    ensj.t(b2.a(callable, enreVar), new aihi(this, intent), enreVar);
                }
            }
        } else {
            ahwdVar.h("Early indexing is disabled", new Object[0]);
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
