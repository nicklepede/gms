package com.google.android.gms.ads.internal.util.future;

import com.google.android.gms.ads.internal.config.p;
import defpackage.aurj;
import defpackage.caqb;
import defpackage.caqh;
import defpackage.eqex;
import defpackage.eqgo;
import defpackage.eqgv;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class e {
    public static final eqgo a;
    public static final ScheduledExecutorService b;
    public static final eqgo c;
    public static final eqgo d;

    static {
        ExecutorService threadPoolExecutor;
        ExecutorService executorService;
        ExecutorService executorService2;
        if (aurj.d()) {
            threadPoolExecutor = caqb.b.f(new b("Default"), caqh.HIGH_SPEED);
        } else if (p.bF.i() == null || !((Boolean) p.bF.i()).booleanValue() || p.bG.i() == null || p.bH.i() == null) {
            threadPoolExecutor = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new b("Default"));
        } else {
            ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(((Integer) p.bG.i()).intValue(), ((Integer) p.bG.i()).intValue(), 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b("Default"));
            threadPoolExecutor2.allowCoreThreadTimeOut(((Boolean) p.bH.i()).booleanValue());
            threadPoolExecutor = threadPoolExecutor2;
        }
        a = new d(threadPoolExecutor);
        if (aurj.d()) {
            executorService = caqb.b.g(5, new b("Loader"), caqh.LOW_POWER);
        } else {
            ThreadPoolExecutor threadPoolExecutor3 = new ThreadPoolExecutor(5, 5, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b("Loader"));
            threadPoolExecutor3.allowCoreThreadTimeOut(true);
            executorService = threadPoolExecutor3;
        }
        new d(executorService);
        if (aurj.d()) {
            executorService2 = caqb.b.c(new b("Activeview"), caqh.LOW_POWER);
        } else {
            ThreadPoolExecutor threadPoolExecutor4 = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b("Activeview"));
            threadPoolExecutor4.allowCoreThreadTimeOut(true);
            executorService2 = threadPoolExecutor4;
        }
        new d(executorService2);
        a aVar = new a(new b("Schedule"));
        b = aVar;
        eqgv.b(aVar);
        c = new d(new c());
        d = new d(eqex.a);
    }
}
