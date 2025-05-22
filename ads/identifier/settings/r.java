package com.google.android.gms.ads.identifier.settings;

import com.google.android.gms.chimera.modules.ads.AppContextProvider;
import defpackage.cauf;
import defpackage.fmqe;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class r implements com.google.android.gms.ads.task.a {
    @Override // com.google.android.gms.ads.task.a
    public final synchronized int a(cauf caufVar) {
        int i;
        AtomicInteger atomicInteger = p.a;
        if (fmqe.i() && !p.a()) {
            if (p.a.incrementAndGet() < fmqe.a.lK().j()) {
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
