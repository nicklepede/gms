package com.google.android.gms.ads.internal.util.promise;

import com.google.android.gms.ads.internal.config.p;
import com.google.android.gms.ads.internal.util.future.i;
import defpackage.eqgc;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@Deprecated
/* loaded from: classes2.dex */
public class f {
    private final i a;
    public final AtomicInteger b;

    public f() {
        i iVar = new i();
        this.a = iVar;
        this.b = new AtomicInteger(0);
        eqgc.t(iVar, new d(this), com.google.android.gms.ads.internal.util.future.e.d);
    }

    @Deprecated
    public final int e() {
        return this.b.get();
    }

    @Deprecated
    public final void f() {
        this.a.c(new Exception());
    }

    @Deprecated
    public final void g(Throwable th, String str) {
        this.a.c(th);
        if (((Boolean) p.aZ.g()).booleanValue()) {
            com.google.android.gms.ads.internal.c.d().c(th, str);
        }
    }

    @Deprecated
    public final void h(Object obj) {
        this.a.a(obj);
    }

    @Deprecated
    public final void i(c cVar, a aVar) {
        eqgc.t(this.a, new e(cVar, aVar), com.google.android.gms.ads.internal.util.future.e.d);
    }
}
