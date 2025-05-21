package com.google.android.gms.org.conscrypt;

import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class HpkeContextRecipient extends HpkeContext {
    private HpkeContextRecipient(HpkeSpi hpkeSpi) {
        super(hpkeSpi);
    }

    public static HpkeContextRecipient getInstance(String str) {
        return new HpkeContextRecipient(findSpi(str));
    }

    public void init(byte[] bArr, PrivateKey privateKey, byte[] bArr2) {
        this.spi.engineInitRecipient(bArr, privateKey, bArr2, null, HpkeSpi.DEFAULT_PSK, HpkeSpi.DEFAULT_PSK_ID);
    }

    public byte[] open(byte[] bArr, byte[] bArr2) {
        return this.spi.engineOpen(bArr, bArr2);
    }

    public static HpkeContextRecipient getInstance(String str, String str2) {
        return new HpkeContextRecipient(findSpi(str, str2));
    }

    public void init(byte[] bArr, PrivateKey privateKey, byte[] bArr2, PublicKey publicKey) {
        if (publicKey == null) {
            throw new InvalidKeyException("null sender key");
        }
        this.spi.engineInitRecipient(bArr, privateKey, bArr2, publicKey, HpkeSpi.DEFAULT_PSK, HpkeSpi.DEFAULT_PSK_ID);
    }

    public static HpkeContextRecipient getInstance(String str, Provider provider) {
        return new HpkeContextRecipient(findSpi(str, provider));
    }

    public void init(byte[] bArr, PrivateKey privateKey, byte[] bArr2, PublicKey publicKey, byte[] bArr3, byte[] bArr4) {
        if (publicKey != null) {
            this.spi.engineInitRecipient(bArr, privateKey, bArr2, publicKey, bArr3, bArr4);
            return;
        }
        throw new InvalidKeyException("null sender key");
    }

    public void init(byte[] bArr, PrivateKey privateKey, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.spi.engineInitRecipient(bArr, privateKey, bArr2, null, bArr3, bArr4);
    }
}
