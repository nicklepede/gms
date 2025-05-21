package com.google.android.gms.wearable.selector;

import defpackage.dmad;
import defpackage.dmaf;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class NativeOsCompat extends dmaf {
    static {
        System.loadLibrary("wearable-selector");
    }

    public NativeOsCompat() {
        super(nativeGetErrnoAgainValue(), nativeGetErrnoBrokenPipeValue());
    }

    public static void a(int i, String str) {
        if (i < 0) {
            throw new dmad(str, nativeGetErrno());
        }
    }

    private static final native int nativeGetErrno();

    private static final native int nativeGetErrnoAgainValue();

    private static final native int nativeGetErrnoBrokenPipeValue();

    public static final native int nativePoll(int[] iArr, short[] sArr, short[] sArr2, int i);

    public static final native int nativeRead(int i, byte[] bArr, int i2, int i3);

    public static final native int nativeWrite(int i, byte[] bArr, int i2, int i3);
}
