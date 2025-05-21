package com.google.android.gms.ads.internal.overlay;

import java.util.concurrent.Callable;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
final class f implements Callable {
    private final long a;

    public f(long j) {
        this.a = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (AdOverlayInfoParcel.a.remove(Long.valueOf(this.a)) == null) {
            return null;
        }
        com.google.android.gms.ads.internal.c.d().d(new Exception("Key was non-null in AdOverlayObjectsCleanupTask"), "AdOverlayObjectsCleanupTask");
        return null;
    }
}
