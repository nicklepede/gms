package com.google.android.gms.org.conscrypt;

import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class HpkeContextSender extends HpkeContext {
    private HpkeContextSender(HpkeSpi hpkeSpi) {
        super(hpkeSpi);
    }

    public static HpkeContextSender getInstance(String str) {
        return new HpkeContextSender(findSpi(str));
    }

    public byte[] getEncapsulated() {
        return this.spi.getEncapsulated();
    }

    public void init(PublicKey publicKey, byte[] bArr) {
        this.spi.engineInitSender(publicKey, bArr, null, HpkeSpi.DEFAULT_PSK, HpkeSpi.DEFAULT_PSK_ID);
    }

    public void initForTesting(PublicKey publicKey, byte[] bArr, byte[] bArr2) {
        if (bArr2 == null) {
            throw new IllegalArgumentException("null seed");
        }
        HpkeSpi hpkeSpi = this.spi;
        byte[] bArr3 = HpkeSpi.DEFAULT_PSK;
        hpkeSpi.engineInitSenderForTesting(publicKey, bArr, null, bArr3, bArr3, bArr2);
    }

    public byte[] seal(byte[] bArr, byte[] bArr2) {
        return this.spi.engineSeal(bArr, bArr2);
    }

    public static HpkeContextSender getInstance(String str, String str2) {
        return new HpkeContextSender(findSpi(str, str2));
    }

    public void init(PublicKey publicKey, byte[] bArr, PrivateKey privateKey) {
        if (privateKey == null) {
            throw new InvalidKeyException("Sender private key is null");
        }
        this.spi.engineInitSender(publicKey, bArr, privateKey, HpkeSpi.DEFAULT_PSK, HpkeSpi.DEFAULT_PSK_ID);
    }

    public static HpkeContextSender getInstance(String str, Provider provider) {
        return new HpkeContextSender(findSpi(str, provider));
    }

    public void init(PublicKey publicKey, byte[] bArr, PrivateKey privateKey, byte[] bArr2, byte[] bArr3) {
        if (privateKey != null) {
            this.spi.engineInitSender(publicKey, bArr, privateKey, bArr2, bArr3);
            return;
        }
        throw new InvalidKeyException("Sender private key is null");
    }

    public void init(PublicKey publicKey, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.spi.engineInitSender(publicKey, bArr, null, bArr2, bArr3);
    }
}
