package com.google.android.gms.wearable.selector;

import defpackage.dolp;
import defpackage.dolr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class NativeOsCompat extends dolr {
    static {
        System.loadLibrary("wearable-selector");
    }

    public NativeOsCompat() {
        super(nativeGetErrnoAgainValue(), nativeGetErrnoBrokenPipeValue());
    }

    public static void a(int i, String str) {
        if (i < 0) {
            throw new dolp(str, nativeGetErrno());
        }
    }

    private static final native int nativeGetErrno();

    private static final native int nativeGetErrnoAgainValue();

    private static final native int nativeGetErrnoBrokenPipeValue();

    public static final native int nativePoll(int[] iArr, short[] sArr, short[] sArr2, int i);

    public static final native int nativeRead(int i, byte[] bArr, int i2, int i3);

    public static final native int nativeWrite(int i, byte[] bArr, int i2, int i3);
}
