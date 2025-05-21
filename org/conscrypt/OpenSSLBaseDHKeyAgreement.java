package com.google.android.gms.org.conscrypt;

import defpackage.a;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.KeyAgreementSpi;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public abstract class OpenSSLBaseDHKeyAgreement extends KeyAgreementSpi {
    private int mExpectedResultLength;
    private Object mPrivateKey;
    private byte[] mResult;

    protected OpenSSLBaseDHKeyAgreement() {
    }

    private void checkCompleted() {
        if (this.mResult == null) {
            throw new IllegalStateException("Key agreement not completed");
        }
    }

    protected abstract int computeKey(byte[] bArr, Object obj, Object obj2);

    protected abstract Object convertPrivateKey(PrivateKey privateKey);

    protected abstract Object convertPublicKey(PublicKey publicKey);

    @Override // javax.crypto.KeyAgreementSpi
    public Key engineDoPhase(Key key, boolean z) {
        if (this.mPrivateKey == null) {
            throw new IllegalStateException("Not initialized");
        }
        if (!z) {
            throw new IllegalStateException("DH only has one phase");
        }
        if (key == null) {
            throw new InvalidKeyException("key == null");
        }
        if (!(key instanceof PublicKey)) {
            throw new InvalidKeyException("Not a public key: ".concat(String.valueOf(String.valueOf(key.getClass()))));
        }
        Object convertPublicKey = convertPublicKey((PublicKey) key);
        byte[] bArr = new byte[this.mExpectedResultLength];
        int computeKey = computeKey(bArr, convertPublicKey, this.mPrivateKey);
        if (computeKey == -1) {
            throw new RuntimeException("Engine returned -1");
        }
        int i = this.mExpectedResultLength;
        if (computeKey != i) {
            if (computeKey >= i) {
                throw new RuntimeException(a.t(computeKey, i, "Engine produced a longer than expected result. Expected: ", ", actual: "));
            }
            byte[] bArr2 = this.mResult;
            System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
            bArr = new byte[computeKey];
        }
        this.mResult = bArr;
        return null;
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected byte[] engineGenerateSecret() {
        checkCompleted();
        return this.mResult;
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected void engineInit(Key key, SecureRandom secureRandom) {
        if (key == null) {
            throw new InvalidKeyException("key == null");
        }
        if (!(key instanceof PrivateKey)) {
            throw new InvalidKeyException("Not a private key: ".concat(String.valueOf(String.valueOf(key.getClass()))));
        }
        Object convertPrivateKey = convertPrivateKey((PrivateKey) key);
        this.mExpectedResultLength = getOutputSize(convertPrivateKey);
        this.mPrivateKey = convertPrivateKey;
    }

    protected abstract int getOutputSize(Object obj);

    @Override // javax.crypto.KeyAgreementSpi
    protected SecretKey engineGenerateSecret(String str) {
        checkCompleted();
        return new SecretKeySpec(engineGenerateSecret(), str);
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected int engineGenerateSecret(byte[] bArr, int i) {
        checkCompleted();
        int length = bArr.length - i;
        byte[] bArr2 = this.mResult;
        int length2 = bArr2.length;
        if (length2 <= length) {
            System.arraycopy(bArr2, 0, bArr, i, length2);
            return this.mResult.length;
        }
        throw new ShortBufferWithoutStackTraceException("Needed: " + this.mResult.length + ", available: " + length);
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        if (algorithmParameterSpec == null) {
            engineInit(key, secureRandom);
            return;
        }
        throw new InvalidAlgorithmParameterException("No algorithm parameters supported");
    }
}
