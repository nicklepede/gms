package com.google.android.gms.common.threads.internal;

import com.google.android.gms.common.threads.internal.GlobalExecutorsImpl;
import defpackage.a;
import defpackage.asrm;
import defpackage.eijr;
import defpackage.eijy;
import defpackage.fner;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class GlobalExecutorsImpl {
    private static final ThreadPoolExecutor a = new ThreadPoolExecutor(4, Integer.MAX_VALUE, 10, TimeUnit.SECONDS, new SynchronousQueue(), new asrm("lowpool", 10));
    private static final ThreadPoolExecutor b = new ThreadPoolExecutor(4, Integer.MAX_VALUE, 10, TimeUnit.SECONDS, new SynchronousQueue(), new asrm("highpool", 9));
    private static final eijr c = eijy.a(new eijr() { // from class: asmn
        @Override // defpackage.eijr
        public final Object a() {
            return GlobalExecutorsImpl.lambda$static$0();
        }
    });

    private GlobalExecutorsImpl() {
    }

    public static ThreadPoolExecutor getPool(int i) {
        if (i == 0) {
            return (ThreadPoolExecutor) c.a();
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
        return new ThreadPoolExecutor((int) fner.a.a().a(), Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new asrm("actvpool", 0));
    }
}
