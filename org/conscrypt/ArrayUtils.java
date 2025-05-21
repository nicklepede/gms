package com.google.android.gms.org.conscrypt;

import defpackage.a;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class ArrayUtils {
    private ArrayUtils() {
    }

    static void checkOffsetAndCount(int i, int i2, int i3) {
        if ((i2 | i3) < 0 || i2 > i || i - i2 < i3) {
            throw new ArrayIndexOutOfBoundsException(a.u(i3, i2, i, "length=", "; regionStart=", "; regionLength="));
        }
    }

    public static byte[] concat(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] copyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(bArr2, 0, copyOf, length, length2);
        return copyOf;
    }

    @SafeVarargs
    public static Object[] concatValues(Object[] objArr, Object... objArr2) {
        return concat(objArr, objArr2);
    }

    public static boolean isEmpty(Object[] objArr) {
        return objArr == null || objArr.length == 0;
    }

    public static byte[] reverse(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        int i = 0;
        for (int i2 = length - 1; i2 >= 0; i2--) {
            bArr2[i] = bArr[i2];
            i++;
        }
        return bArr2;
    }

    public static boolean startsWith(byte[] bArr, byte[] bArr2) {
        if (bArr.length < bArr2.length) {
            return false;
        }
        for (int i = 0; i < bArr2.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static Object[] concat(Object[] objArr, Object[] objArr2) {
        int length = objArr.length;
        int length2 = objArr2.length;
        Object[] copyOf = Arrays.copyOf(objArr, length + length2);
        System.arraycopy(objArr2, 0, copyOf, length, length2);
        return copyOf;
    }
}
