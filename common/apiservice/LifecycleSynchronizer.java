package com.google.android.gms.common.apiservice;

import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.chimera.Service;
import defpackage.aurp;
import defpackage.aurt;
import defpackage.auud;
import defpackage.caqb;
import defpackage.caqh;
import defpackage.ekvk;
import defpackage.ekxj;
import defpackage.ekxm;
import defpackage.ekxs;
import defpackage.ekyw;
import defpackage.fpil;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class LifecycleSynchronizer {
    private int a;
    private final Object b;
    private Intent c;
    private final Service d;
    private final boolean e;
    private final long f;
    private final ScheduledExecutorService g;
    private final aurp h;
    private final ekxm i;
    private ScheduledFuture j;
    private long k;
    private int l;

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public interface Callback {
        void onServiceDestroy();
    }

    /* renamed from: $r8$lambda$HsuCSGeR_ASuZdcKXm7d-foRfqU, reason: not valid java name */
    public static /* synthetic */ void m225$r8$lambda$HsuCSGeR_ASuZdcKXm7dfoRfqU(LifecycleSynchronizer lifecycleSynchronizer) {
        ekxj.e(lifecycleSynchronizer.d);
        synchronized (lifecycleSynchronizer.b) {
            lifecycleSynchronizer.j = null;
            if (lifecycleSynchronizer.a == 0) {
                lifecycleSynchronizer.a(false);
            }
        }
    }

    public LifecycleSynchronizer() {
        this(null, false, 0L, null, null);
    }

    private final void a(boolean z) {
        long j;
        if (this.l != 3) {
            return;
        }
        long c = this.h.c();
        if (z) {
            j = this.f;
            this.k = c + j;
        } else {
            j = this.k - c;
        }
        if (j > 0) {
            if (this.j == null) {
                ScheduledExecutorService scheduledExecutorService = this.g;
                ekxj.e(scheduledExecutorService);
                this.j = scheduledExecutorService.schedule(new Runnable() { // from class: com.google.android.gms.common.apiservice.LifecycleSynchronizer$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        LifecycleSynchronizer.m225$r8$lambda$HsuCSGeR_ASuZdcKXm7dfoRfqU(LifecycleSynchronizer.this);
                    }
                }, j, TimeUnit.NANOSECONDS);
                return;
            }
            return;
        }
        this.d.stopSelf();
        this.l = 1;
        ScheduledFuture scheduledFuture = this.j;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.j = null;
        }
    }

    public int getRefCount() {
        int i;
        synchronized (this.b) {
            i = this.a;
        }
        return i;
    }

    public void onAfterExecution() {
        if (this.d == null) {
            return;
        }
        synchronized (this.b) {
            int i = this.a;
            if (i > 0) {
                int i2 = i - 1;
                this.a = i2;
                if (i2 == 0) {
                    Iterator it = ((ekyw) this.i).a.keySet().iterator();
                    while (it.hasNext()) {
                        try {
                            ((Callback) it.next()).onServiceDestroy();
                        } catch (RuntimeException e) {
                            Log.e("LifecycleSync", "Failed to execute a callback", e);
                        }
                    }
                    a(true);
                }
            }
        }
    }

    public void onBeforeDispatching() {
        Service service = this.d;
        if (service == null) {
            return;
        }
        synchronized (this.b) {
            int i = this.a;
            this.a = i + 1;
            if (i == 0 && this.l == 1) {
                if (this.c == null) {
                    this.c = new Intent().setClassName(service, service.getContainerServiceClassName());
                }
                Intent intent = this.c;
                try {
                    service.startService(intent);
                    this.l = true != this.e ? 3 : 2;
                } catch (IllegalStateException e) {
                    if (Build.VERSION.SDK_INT >= 26 && ((ekvk.c(intent.getPackage()) || this.d.getPackageName().equals(intent.getPackage())) && fpil.d() && new Random().nextFloat() < fpil.b())) {
                        Log.e("LifecycleSync", "Google Play services is unable to start a service. Exiting.", e);
                        auud.f();
                    }
                    throw e;
                }
            }
        }
    }

    public void onServiceStart() {
        if (this.d == null) {
            return;
        }
        synchronized (this.b) {
            this.l = 3;
            if (this.a == 0) {
                a(true);
            }
        }
    }

    public LifecycleSynchronizer registerCallback(Callback callback) {
        this.i.h(callback, true);
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public LifecycleSynchronizer(com.google.android.chimera.Service r13) {
        /*
            r12 = this;
            long r0 = defpackage.fpng.b()
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            long r3 = defpackage.fpng.b()
            long r8 = r2.toNanos(r3)
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L16
            r0 = 1
            goto L17
        L16:
            r0 = 0
        L17:
            r7 = r0
            r10 = 0
            r11 = 0
            r5 = r12
            r6 = r13
            r5.<init>(r6, r7, r8, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.apiservice.LifecycleSynchronizer.<init>(com.google.android.chimera.Service):void");
    }

    public LifecycleSynchronizer(Service service, boolean z, long j, ScheduledExecutorService scheduledExecutorService, aurp aurpVar) {
        this.b = new Object();
        this.l = 1;
        ekxs ekxsVar = new ekxs();
        ekxsVar.e(4);
        ekxsVar.n();
        this.i = ekxsVar.a();
        this.j = null;
        this.k = 0L;
        this.d = service;
        this.e = z;
        this.f = j;
        this.g = scheduledExecutorService == null ? j > 0 ? caqb.b.h(1, caqh.LOW_POWER) : null : scheduledExecutorService;
        this.h = aurpVar == null ? aurt.a : aurpVar;
    }
}
