package com.google.android.gms.ads.internal.js;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class ab extends com.google.android.gms.ads.internal.util.promise.f {
    public final ag a;
    private final Object c = new Object();
    private boolean d;

    public ab(ag agVar) {
        this.a = agVar;
    }

    public final void a() {
        synchronized (this.c) {
            if (this.d) {
                return;
            }
            this.d = true;
            i(new y(), new com.google.android.gms.ads.internal.util.promise.b());
            i(new z(this), new aa(this));
        }
    }
}
