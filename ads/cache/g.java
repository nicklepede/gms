package com.google.android.gms.ads.cache;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class g extends Exception {
    public g() {
    }

    public g(byte[] bArr) {
        super("CacheEntry is no longer valid.");
    }

    public g(String str, Throwable th) {
        super(str, th);
    }
}
