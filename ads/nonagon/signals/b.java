package com.google.android.gms.ads.nonagon.signals;

import com.google.android.gms.ads.internal.config.p;
import defpackage.eqcq;
import defpackage.eqdv;
import defpackage.eqgc;
import defpackage.eqgl;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class b implements e {
    public final e a;
    private final long b;
    private final ScheduledExecutorService c;

    public b(e eVar, long j, ScheduledExecutorService scheduledExecutorService) {
        this.a = eVar;
        this.b = j;
        this.c = scheduledExecutorService;
    }

    @Override // com.google.android.gms.ads.nonagon.signals.e
    public final int a() {
        return this.a.a();
    }

    @Override // com.google.android.gms.ads.nonagon.signals.e
    public final eqgl b() {
        eqgl b = this.a.b();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (((Boolean) p.T.g()).booleanValue()) {
            timeUnit = TimeUnit.MICROSECONDS;
        }
        long j = this.b;
        if (j > 0) {
            b = eqgc.q(b, j, timeUnit, this.c);
        }
        return eqcq.g(b, Throwable.class, new eqdv() { // from class: com.google.android.gms.ads.nonagon.signals.a
            @Override // defpackage.eqdv
            public final eqgl a(Object obj) {
                Throwable th = (Throwable) obj;
                if (((Boolean) p.S.g()).booleanValue()) {
                    e eVar = b.this.a;
                    com.google.android.gms.ads.internal.c.d().d(th, "OptionalSignalTimeout:" + eVar.a());
                }
                return eqgc.i(null);
            }
        }, com.google.android.gms.ads.internal.util.future.e.d);
    }
}
