package com.google.android.gms.ads.internal.util;

import defpackage.enss;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public abstract class b {
    private final Runnable a = new a(this);
    public volatile Thread b;

    public abstract void a();

    public final enss b() {
        return com.google.android.gms.ads.internal.util.future.e.a.submit(this.a);
    }
}
