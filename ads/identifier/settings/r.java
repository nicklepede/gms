package com.google.android.gms.ads.identifier.settings;

import com.google.android.gms.chimera.modules.ads.AppContextProvider;
import defpackage.byln;
import defpackage.fjzz;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class r implements com.google.android.gms.ads.task.a {
    @Override // com.google.android.gms.ads.task.a
    public final synchronized int a(byln bylnVar) {
        int i;
        AtomicInteger atomicInteger = p.a;
        if (fjzz.i() && !p.a()) {
            if (p.a.incrementAndGet() < fjzz.a.a().j()) {
                return 1;
            }
            i = 2;
            return i;
        }
        p.a.set(0);
        i = 0;
        return i;
    }

    @Override // com.google.android.gms.ads.task.a
    public final void b() {
        q.a(AppContextProvider.a()).c();
    }
}
