package com.google.android.gms.org.conscrypt;

import java.security.PrivateKey;
import java.security.PublicKey;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public interface HpkeSpi {
    public static final byte[] DEFAULT_PSK;
    public static final byte[] DEFAULT_PSK_ID;

    static {
        byte[] bArr = new byte[0];
        DEFAULT_PSK = bArr;
        DEFAULT_PSK_ID = bArr;
    }

    byte[] engineExport(int i, byte[] bArr);

    void engineInitRecipient(byte[] bArr, PrivateKey privateKey, byte[] bArr2, PublicKey publicKey, byte[] bArr3, byte[] bArr4);

    void engineInitSender(PublicKey publicKey, byte[] bArr, PrivateKey privateKey, byte[] bArr2, byte[] bArr3);

    void engineInitSenderForTesting(PublicKey publicKey, byte[] bArr, PrivateKey privateKey, byte[] bArr2, byte[] bArr3, byte[] bArr4);

    byte[] engineOpen(byte[] bArr, byte[] bArr2);

    byte[] engineSeal(byte[] bArr, byte[] bArr2);

    byte[] getEncapsulated();
}
