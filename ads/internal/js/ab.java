package com.google.android.gms.ads.internal.js;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
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
