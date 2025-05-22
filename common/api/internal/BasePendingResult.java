package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import defpackage.atah;
import defpackage.atak;
import defpackage.atal;
import defpackage.atao;
import defpackage.atau;
import defpackage.atav;
import defpackage.atay;
import defpackage.atbx;
import defpackage.atby;
import defpackage.atbz;
import defpackage.atfq;
import defpackage.atxr;
import defpackage.atzb;
import defpackage.caqd;
import defpackage.caqf;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public abstract class BasePendingResult extends atal {
    static final ThreadLocal e = new atbx();
    public static final /* synthetic */ int k = 0;
    private final CountDownLatch a;
    private final ArrayList b;
    private atav c;
    private final AtomicReference d;
    public final Object f;
    protected final atby g;
    public final WeakReference h;
    public atau i;
    public boolean j;
    private Status l;
    private volatile boolean m;
    private boolean n;
    private boolean o;
    private atxr p;
    private volatile atay q;
    private atbz resultGuardian;

    @Deprecated
    BasePendingResult() {
        this.f = new Object();
        this.a = new CountDownLatch(1);
        this.b = new ArrayList();
        this.d = new AtomicReference();
        this.j = false;
        this.g = new atby(Looper.getMainLooper());
        this.h = new WeakReference(null);
    }

    private final atau h() {
        atau atauVar;
        synchronized (this.f) {
            atzb.m(!this.m, "Result has already been consumed.");
            atzb.m(r(), "Result is not ready.");
            atauVar = this.i;
            this.i = null;
            this.c = null;
            this.m = true;
        }
        atfq atfqVar = (atfq) this.d.getAndSet(null);
        if (atfqVar != null) {
            atfqVar.a.b.remove(this);
        }
        atzb.s(atauVar);
        return atauVar;
    }

    public static atav k(final atav atavVar) {
        final caqf a = caqd.b.a();
        return new atav() { // from class: atbt
            @Override // defpackage.atav
            public final void a(final atau atauVar) {
                int i = BasePendingResult.k;
                final atav atavVar2 = atavVar;
                caqf.this.c(new Runnable() { // from class: atbv
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i2 = BasePendingResult.k;
                        atav.this.a(atauVar);
                    }
                });
            }
        };
    }

    public static void n(atau atauVar) {
        if (atauVar instanceof atao) {
            try {
                ((atao) atauVar).iy();
            } catch (RuntimeException e2) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(String.valueOf(atauVar))), e2);
            }
        }
    }

    private final void y(atau atauVar) {
        this.i = atauVar;
        this.l = atauVar.a();
        this.p = null;
        this.a.countDown();
        if (this.n) {
            this.c = null;
        } else {
            atav atavVar = this.c;
            if (atavVar != null) {
                atby atbyVar = this.g;
                atbyVar.removeMessages(2);
                atbyVar.b(atavVar, h());
            } else if (this.i instanceof atao) {
                this.resultGuardian = new atbz(this);
            }
        }
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((atak) arrayList.get(i)).a(this.l);
        }
        arrayList.clear();
    }

    @Override // defpackage.atal
    public final void c(final atak atakVar) {
        atzb.c(true, "Callback cannot be null.");
        synchronized (this.f) {
            if (r()) {
                atakVar.a(this.l);
            } else {
                final caqf a = caqd.b.a();
                this.b.add(new atak() { // from class: atbw
                    @Override // defpackage.atak
                    public final void a(final Status status) {
                        int i = BasePendingResult.k;
                        final atak atakVar2 = atakVar;
                        caqf.this.c(new Runnable() { // from class: atbu
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i2 = BasePendingResult.k;
                                atak.this.a(status);
                            }
                        });
                    }
                });
            }
        }
    }

    @Override // defpackage.atal
    public final void d() {
        synchronized (this.f) {
            if (!this.n && !this.m) {
                atxr atxrVar = this.p;
                if (atxrVar != null) {
                    try {
                        atxrVar.a();
                    } catch (RemoteException unused) {
                    }
                }
                n(this.i);
                this.n = true;
                y(g(Status.f));
            }
        }
    }

    @Override // defpackage.atal
    public final void e(atav atavVar) {
        synchronized (this.f) {
            if (atavVar == null) {
                this.c = null;
                return;
            }
            atzb.m(!this.m, "Result has already been consumed.");
            atzb.m(true, "Cannot set callbacks if then() has been called.");
            if (q()) {
                return;
            }
            if (r()) {
                this.g.b(atavVar, h());
            } else {
                this.c = k(atavVar);
            }
        }
    }

    @Override // defpackage.atal
    public final void f(atav atavVar, long j, TimeUnit timeUnit) {
        synchronized (this.f) {
            atzb.m(!this.m, "Result has already been consumed.");
            atzb.m(true, "Cannot set callbacks if then() has been called.");
            if (q()) {
                return;
            }
            if (r()) {
                this.g.b(atavVar, h());
            } else {
                this.c = k(atavVar);
                atby atbyVar = this.g;
                atbyVar.sendMessageDelayed(atbyVar.obtainMessage(2, this), timeUnit.toMillis(j));
            }
        }
    }

    protected abstract atau g(Status status);

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

    protected final void o(atxr atxrVar) {
        synchronized (this.f) {
            this.p = atxrVar;
        }
    }

    public final void p(atau atauVar) {
        synchronized (this.f) {
            if (this.o || this.n) {
                n(atauVar);
                return;
            }
            r();
            atzb.m(!r(), "Results have already been set");
            atzb.m(!this.m, "Result has already been consumed");
            y(atauVar);
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

    public final void s(atfq atfqVar) {
        this.d.set(atfqVar);
    }

    @Override // defpackage.atal
    public final atau w() {
        atzb.k("await must not be called on the UI thread");
        atzb.m(!this.m, "Result has already been consumed");
        atzb.m(true, "Cannot await if then() has been called.");
        try {
            this.a.await();
        } catch (InterruptedException unused) {
            l(Status.c);
        }
        atzb.m(r(), "Result is not ready.");
        return h();
    }

    @Override // defpackage.atal
    public final atau x(long j, TimeUnit timeUnit) {
        if (j > 0) {
            atzb.k("await must not be called on the UI thread when time is greater than zero.");
        }
        atzb.m(!this.m, "Result has already been consumed.");
        atzb.m(true, "Cannot await if then() has been called.");
        try {
            if (!this.a.await(j, timeUnit)) {
                l(Status.e);
            }
        } catch (InterruptedException unused) {
            l(Status.c);
        }
        atzb.m(r(), "Result is not ready.");
        return h();
    }

    @Deprecated
    protected BasePendingResult(Looper looper) {
        this.f = new Object();
        this.a = new CountDownLatch(1);
        this.b = new ArrayList();
        this.d = new AtomicReference();
        this.j = false;
        this.g = new atby(looper);
        this.h = new WeakReference(null);
    }

    protected BasePendingResult(atah atahVar) {
        this.f = new Object();
        this.a = new CountDownLatch(1);
        this.b = new ArrayList();
        this.d = new AtomicReference();
        this.j = false;
        this.g = new atby(atahVar != null ? atahVar.a() : Looper.getMainLooper());
        this.h = new WeakReference(atahVar);
    }
}
