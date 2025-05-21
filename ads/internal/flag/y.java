package com.google.android.gms.ads.internal.flag;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class y {
    public static final AtomicReference a = new AtomicReference();
    private static final AtomicReference b = new AtomicReference();

    static {
        new AtomicBoolean();
    }

    static x a() {
        return (x) b.get();
    }
}
