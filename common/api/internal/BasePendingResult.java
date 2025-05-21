package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import defpackage.aqxs;
import defpackage.aqxv;
import defpackage.aqxw;
import defpackage.aqxz;
import defpackage.aqyf;
import defpackage.aqyg;
import defpackage.aqyj;
import defpackage.aqzi;
import defpackage.aqzj;
import defpackage.aqzk;
import defpackage.ardb;
import defpackage.arvc;
import defpackage.arwm;
import defpackage.byhl;
import defpackage.byhn;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public abstract class BasePendingResult extends aqxw {
    static final ThreadLocal e = new aqzi();
    public static final /* synthetic */ int k = 0;
    private final CountDownLatch a;
    private final ArrayList b;
    private aqyg c;
    private final AtomicReference d;
    public final Object f;
    protected final aqzj g;
    public final WeakReference h;
    public aqyf i;
    public boolean j;
    private Status l;
    private volatile boolean m;
    private boolean n;
    private boolean o;
    private arvc p;
    private volatile aqyj q;
    private aqzk resultGuardian;

    @Deprecated
    BasePendingResult() {
        this.f = new Object();
        this.a = new CountDownLatch(1);
        this.b = new ArrayList();
        this.d = new AtomicReference();
        this.j = false;
        this.g = new aqzj(Looper.getMainLooper());
        this.h = new WeakReference(null);
    }

    private final aqyf h() {
        aqyf aqyfVar;
        synchronized (this.f) {
            arwm.m(!this.m, "Result has already been consumed.");
            arwm.m(r(), "Result is not ready.");
            aqyfVar = this.i;
            this.i = null;
            this.c = null;
            this.m = true;
        }
        ardb ardbVar = (ardb) this.d.getAndSet(null);
        if (ardbVar != null) {
            ardbVar.a.b.remove(this);
        }
        arwm.s(aqyfVar);
        return aqyfVar;
    }

    public static aqyg k(final aqyg aqygVar) {
        final byhn a = byhl.b.a();
        return new aqyg() { // from class: aqze
            @Override // defpackage.aqyg
            public final void a(final aqyf aqyfVar) {
                int i = BasePendingResult.k;
                final aqyg aqygVar2 = aqygVar;
                byhn.this.c(new Runnable() { // from class: aqzg
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i2 = BasePendingResult.k;
                        aqyg.this.a(aqyfVar);
                    }
                });
            }
        };
    }

    public static void n(aqyf aqyfVar) {
        if (aqyfVar instanceof aqxz) {
            try {
                ((aqxz) aqyfVar).ij();
            } catch (RuntimeException e2) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(String.valueOf(aqyfVar))), e2);
            }
        }
    }

    private final void y(aqyf aqyfVar) {
        this.i = aqyfVar;
        this.l = aqyfVar.a();
        this.p = null;
        this.a.countDown();
        if (this.n) {
            this.c = null;
        } else {
            aqyg aqygVar = this.c;
            if (aqygVar != null) {
                aqzj aqzjVar = this.g;
                aqzjVar.removeMessages(2);
                aqzjVar.b(aqygVar, h());
            } else if (this.i instanceof aqxz) {
                this.resultGuardian = new aqzk(this);
            }
        }
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((aqxv) arrayList.get(i)).a(this.l);
        }
        arrayList.clear();
    }

    @Override // defpackage.aqxw
    public final void c(final aqxv aqxvVar) {
        arwm.c(true, "Callback cannot be null.");
        synchronized (this.f) {
            if (r()) {
                aqxvVar.a(this.l);
            } else {
                final byhn a = byhl.b.a();
                this.b.add(new aqxv() { // from class: aqzh
                    @Override // defpackage.aqxv
                    public final void a(final Status status) {
                        int i = BasePendingResult.k;
                        final aqxv aqxvVar2 = aqxvVar;
                        byhn.this.c(new Runnable() { // from class: aqzf
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i2 = BasePendingResult.k;
                                aqxv.this.a(status);
                            }
                        });
                    }
                });
            }
        }
    }

    @Override // defpackage.aqxw
    public final void d() {
        synchronized (this.f) {
            if (!this.n && !this.m) {
                arvc arvcVar = this.p;
                if (arvcVar != null) {
                    try {
                        arvcVar.a();
                    } catch (RemoteException unused) {
                    }
                }
                n(this.i);
                this.n = true;
                y(g(Status.f));
            }
        }
    }

    @Override // defpackage.aqxw
    public final void e(aqyg aqygVar) {
        synchronized (this.f) {
            if (aqygVar == null) {
                this.c = null;
                return;
            }
            arwm.m(!this.m, "Result has already been consumed.");
            arwm.m(true, "Cannot set callbacks if then() has been called.");
            if (q()) {
                return;
            }
            if (r()) {
                this.g.b(aqygVar, h());
            } else {
                this.c = k(aqygVar);
            }
        }
    }

    @Override // defpackage.aqxw
    public final void f(aqyg aqygVar, long j, TimeUnit timeUnit) {
        synchronized (this.f) {
            arwm.m(!this.m, "Result has already been consumed.");
            arwm.m(true, "Cannot set callbacks if then() has been called.");
            if (q()) {
                return;
            }
            if (r()) {
                this.g.b(aqygVar, h());
            } else {
                this.c = k(aqygVar);
                aqzj aqzjVar = this.g;
                aqzjVar.sendMessageDelayed(aqzjVar.obtainMessage(2, this), timeUnit.toMillis(j));
            }
        }
    }

    protected abstract aqyf g(Status status);

    @Deprecated
    public final void l(Status status) {
        synchronized (this.f) {
            if (!r()) {
                p(g(status));
                this.o = true;
            }
        }
    }

    public final void m() {
        boolean z = true;
        if (!this.j && !((Boolean) e.get()).booleanValue()) {
            z = false;
        }
        this.j = z;
    }

    protected final void o(arvc arvcVar) {
        synchronized (this.f) {
            this.p = arvcVar;
        }
    }

    public final void p(aqyf aqyfVar) {
        synchronized (this.f) {
            if (this.o || this.n) {
                n(aqyfVar);
                return;
            }
            r();
            arwm.m(!r(), "Results have already been set");
            arwm.m(!this.m, "Result has already been consumed");
            y(aqyfVar);
        }
    }

    public final boolean q() {
        boolean z;
        synchronized (this.f) {
            z = this.n;
        }
        return z;
    }

    public final boolean r() {
        return this.a.getCount() == 0;
    }

    public final void s(ardb ardbVar) {
        this.d.set(ardbVar);
    }

    @Override // defpackage.aqxw
    public final aqyf w() {
        arwm.k("await must not be called on the UI thread");
        arwm.m(!this.m, "Result has already been consumed");
        arwm.m(true, "Cannot await if then() has been called.");
        try {
            this.a.await();
        } catch (InterruptedException unused) {
            l(Status.c);
        }
        arwm.m(r(), "Result is not ready.");
        return h();
    }

    @Override // defpackage.aqxw
    public final aqyf x(long j, TimeUnit timeUnit) {
        if (j > 0) {
            arwm.k("await must not be called on the UI thread when time is greater than zero.");
        }
        arwm.m(!this.m, "Result has already been consumed.");
        arwm.m(true, "Cannot await if then() has been called.");
        try {
            if (!this.a.await(j, timeUnit)) {
                l(Status.e);
            }
        } catch (InterruptedException unused) {
            l(Status.c);
        }
        arwm.m(r(), "Result is not ready.");
        return h();
    }

    @Deprecated
    protected BasePendingResult(Looper looper) {
        this.f = new Object();
        this.a = new CountDownLatch(1);
        this.b = new ArrayList();
        this.d = new AtomicReference();
        this.j = false;
        this.g = new aqzj(looper);
        this.h = new WeakReference(null);
    }

    protected BasePendingResult(aqxs aqxsVar) {
        this.f = new Object();
        this.a = new CountDownLatch(1);
        this.b = new ArrayList();
        this.d = new AtomicReference();
        this.j = false;
        this.g = new aqzj(aqxsVar != null ? aqxsVar.a() : Looper.getMainLooper());
        this.h = new WeakReference(aqxsVar);
    }
}
