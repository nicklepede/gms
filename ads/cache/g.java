package com.google.android.gms.ads.cache;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
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
