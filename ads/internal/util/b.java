package com.google.android.gms.ads.internal.util;

import defpackage.eqgl;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public abstract class b {
    private final Runnable a = new a(this);
    public volatile Thread b;

    public abstract void a();

    public final eqgl b() {
        return com.google.android.gms.ads.internal.util.future.e.a.submit(this.a);
    }
}
