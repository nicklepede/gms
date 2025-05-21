package com.google.android.gms.ads.internal.util.future;

import com.google.android.gms.ads.internal.config.p;
import defpackage.asnp;
import defpackage.byhj;
import defpackage.byhp;
import defpackage.enre;
import defpackage.ensv;
import defpackage.entc;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class e {
    public static final ensv a;
    public static final ScheduledExecutorService b;
    public static final ensv c;
    public static final ensv d;

    static {
        ExecutorService threadPoolExecutor;
        ExecutorService executorService;
        ExecutorService executorService2;
        if (asnp.d()) {
            threadPoolExecutor = byhj.b.f(new b("Default"), byhp.HIGH_SPEED);
        } else if (p.bE.i() == null || !((Boolean) p.bE.i()).booleanValue() || p.bF.i() == null || p.bG.i() == null) {
            threadPoolExecutor = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new b("Default"));
        } else {
            ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(((Integer) p.bF.i()).intValue(), ((Integer) p.bF.i()).intValue(), 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b("Default"));
            threadPoolExecutor2.allowCoreThreadTimeOut(((Boolean) p.bG.i()).booleanValue());
            threadPoolExecutor = threadPoolExecutor2;
        }
        a = new d(threadPoolExecutor);
        if (asnp.d()) {
            executorService = byhj.b.g(5, new b("Loader"), byhp.LOW_POWER);
        } else {
            ThreadPoolExecutor threadPoolExecutor3 = new ThreadPoolExecutor(5, 5, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b("Loader"));
            threadPoolExecutor3.allowCoreThreadTimeOut(true);
            executorService = threadPoolExecutor3;
        }
        new d(executorService);
        if (asnp.d()) {
            executorService2 = byhj.b.c(new b("Activeview"), byhp.LOW_POWER);
        } else {
            ThreadPoolExecutor threadPoolExecutor4 = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b("Activeview"));
            threadPoolExecutor4.allowCoreThreadTimeOut(true);
            executorService2 = threadPoolExecutor4;
        }
        new d(executorService2);
        a aVar = new a(new b("Schedule"));
        b = aVar;
        entc.b(aVar);
        c = new d(new c());
        d = new d(enre.a);
    }
}
