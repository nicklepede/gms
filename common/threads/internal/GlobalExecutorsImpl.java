package com.google.android.gms.common.threads.internal;

import com.google.android.gms.common.threads.internal.GlobalExecutorsImpl;
import defpackage.a;
import defpackage.auvg;
import defpackage.ekww;
import defpackage.ekxd;
import defpackage.fpwq;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class GlobalExecutorsImpl {
    private static final ThreadPoolExecutor a = new ThreadPoolExecutor(4, Integer.MAX_VALUE, 10, TimeUnit.SECONDS, new SynchronousQueue(), new auvg("lowpool", 10));
    private static final ThreadPoolExecutor b = new ThreadPoolExecutor(4, Integer.MAX_VALUE, 10, TimeUnit.SECONDS, new SynchronousQueue(), new auvg("highpool", 9));
    private static final ekww c = ekxd.a(new ekww() { // from class: auqh
        @Override // defpackage.ekww
        public final Object lK() {
            return GlobalExecutorsImpl.lambda$static$0();
        }
    });

    private GlobalExecutorsImpl() {
    }

    public static ThreadPoolExecutor getPool(int i) {
        if (i == 0) {
            return (ThreadPoolExecutor) c.lK();
        }
        if (i == 9) {
            return b;
        }
        if (i == 10) {
            return a;
        }
        throw new IllegalArgumentException(a.j(i, "Unexpected priority "));
    }

    public static /* synthetic */ ThreadPoolExecutor lambda$static$0() {
        return new ThreadPoolExecutor((int) fpwq.a.lK().a(), Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new auvg("actvpool", 0));
    }
}
