package com.google.android.gms.org.conscrypt;

import j$.util.Objects;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class Hkdf {
    private final String hmacName;
    private final int macLength;

    public Hkdf(String str) {
        Objects.requireNonNull(str);
        this.hmacName = str;
        this.macLength = Mac.getInstance(str).getMacLength();
    }

    private Mac getMac(byte[] bArr) {
        Mac mac = Mac.getInstance(this.hmacName);
        mac.init(new SecretKeySpec(bArr, "RAW"));
        return mac;
    }

    public byte[] expand(byte[] bArr, byte[] bArr2, int i) {
        Objects.requireNonNull(bArr);
        Objects.requireNonNull(bArr2);
        Preconditions.checkArgument(i >= 0, "Negative length");
        Preconditions.checkArgument(i < getMacLength() * 255, "Length too long");
        Mac mac = getMac(bArr);
        int macLength = getMacLength();
        byte[] bArr3 = new byte[0];
        byte[] bArr4 = new byte[i];
        byte[] bArr5 = {0};
        int i2 = 0;
        while (i2 < i) {
            bArr5[0] = (byte) (bArr5[0] + 1);
            mac.update(bArr3);
            mac.update(bArr2);
            bArr3 = mac.doFinal(bArr5);
            int min = Math.min(macLength, i - i2);
            System.arraycopy(bArr3, 0, bArr4, i2, min);
            i2 += min;
        }
        return bArr4;
    }

    public byte[] extract(byte[] bArr, byte[] bArr2) {
        Objects.requireNonNull(bArr);
        Objects.requireNonNull(bArr2);
        Preconditions.checkArgument(bArr2.length > 0, "Empty keying material");
        if (bArr.length == 0) {
            bArr = new byte[getMacLength()];
        }
        return getMac(bArr).doFinal(bArr2);
    }

    public int getMacLength() {
        return this.macLength;
    }
}
