package com.google.android.gms.ads.internal.js;

import defpackage.arwm;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class ag extends com.google.android.gms.ads.internal.util.promise.f {
    public final com.google.android.gms.ads.internal.util.u a;
    private final Object c = new Object();
    private boolean d = false;
    private int e = 0;

    public ag(com.google.android.gms.ads.internal.util.u uVar) {
        this.a = uVar;
    }

    public final ab a() {
        ab abVar = new ab(this);
        synchronized (this.c) {
            i(new ac(abVar), new ad(abVar));
            arwm.l(this.e >= 0);
            this.e++;
        }
        return abVar;
    }

    public final void b() {
        synchronized (this.c) {
            arwm.l(this.e >= 0);
            this.d = true;
            c();
        }
    }

    protected final void c() {
        synchronized (this.c) {
            arwm.l(this.e >= 0);
            if (this.d && this.e == 0) {
                i(new af(this), new com.google.android.gms.ads.internal.util.promise.b());
            }
        }
    }

    protected final void d() {
        synchronized (this.c) {
            arwm.l(this.e > 0);
            this.e--;
            c();
        }
    }
}
