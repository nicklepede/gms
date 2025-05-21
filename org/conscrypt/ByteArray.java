package com.google.android.gms.org.conscrypt;

import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class ByteArray {
    private final byte[] bytes;
    private final int hashCode;

    public ByteArray(byte[] bArr) {
        this.bytes = bArr;
        this.hashCode = Arrays.hashCode(bArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteArray)) {
            return false;
        }
        ByteArray byteArray = (ByteArray) obj;
        if (this.hashCode != byteArray.hashCode) {
            return false;
        }
        return Arrays.equals(this.bytes, byteArray.bytes);
    }

    public int hashCode() {
        return this.hashCode;
    }
}
