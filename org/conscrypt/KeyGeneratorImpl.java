package com.google.android.gms.org.conscrypt;

import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.KeyGeneratorSpi;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public abstract class KeyGeneratorImpl extends KeyGeneratorSpi {
    private final String algorithm;
    private int keySizeBits;
    protected SecureRandom secureRandom;

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public final class AES extends KeyGeneratorImpl {
        public AES() {
            super("AES", 128);
        }

        @Override // com.google.android.gms.org.conscrypt.KeyGeneratorImpl
        protected void checkKeySize(int i) {
            if (i != 128 && i != 192 && i != 256) {
                throw new InvalidParameterException("Key size must be either 128, 192, or 256 bits");
            }
        }
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public final class ARC4 extends KeyGeneratorImpl {
        public ARC4() {
            super("ARC4", 128);
        }

        @Override // com.google.android.gms.org.conscrypt.KeyGeneratorImpl
        protected void checkKeySize(int i) {
            if (i < 40 || i > 2048) {
                throw new InvalidParameterException("Key size must be between 40 and 2048 bits");
            }
        }
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public final class ChaCha20 extends KeyGeneratorImpl {
        public ChaCha20() {
            super("ChaCha20", 256);
        }

        @Override // com.google.android.gms.org.conscrypt.KeyGeneratorImpl
        protected void checkKeySize(int i) {
            if (i != 256) {
                throw new InvalidParameterException("Key size must be 256 bits");
            }
        }
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public final class DESEDE extends KeyGeneratorImpl {
        public DESEDE() {
            super("DESEDE", AndroidInputTypeSignal.TYPE_TEXT_VARIATION_PHONETIC);
        }

        @Override // com.google.android.gms.org.conscrypt.KeyGeneratorImpl
        protected void checkKeySize(int i) {
            if (i != 112 && i != 168) {
                throw new InvalidParameterException("Key size must be either 112 or 168 bits");
            }
        }

        @Override // com.google.android.gms.org.conscrypt.KeyGeneratorImpl
        protected byte[] doKeyGeneration(int i) {
            byte[] bArr = new byte[24];
            this.secureRandom.nextBytes(bArr);
            for (int i2 = 0; i2 < 24; i2++) {
                if (Integer.bitCount(bArr[i2]) % 2 == 0) {
                    bArr[i2] = (byte) (bArr[i2] ^ 1);
                }
            }
            if (i == 14) {
                System.arraycopy(bArr, 0, bArr, 16, 8);
            }
            return bArr;
        }
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public final class HmacMD5 extends KeyGeneratorImpl {
        public HmacMD5() {
            super("HmacMD5", 128);
        }
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public final class HmacSHA1 extends KeyGeneratorImpl {
        public HmacSHA1() {
            super("HmacSHA1", AndroidInputTypeSignal.TYPE_TEXT_VARIATION_WEB_EDIT_TEXT);
        }
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public final class HmacSHA224 extends KeyGeneratorImpl {
        public HmacSHA224() {
            super("HmacSHA224", AndroidInputTypeSignal.TYPE_TEXT_VARIATION_WEB_PASSWORD);
        }
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public final class HmacSHA256 extends KeyGeneratorImpl {
        public HmacSHA256() {
            super("HmacSHA256", 256);
        }
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public final class HmacSHA384 extends KeyGeneratorImpl {
        public HmacSHA384() {
            super("HmacSHA384", 384);
        }
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public final class HmacSHA512 extends KeyGeneratorImpl {
        public HmacSHA512() {
            super("HmacSHA512", 512);
        }
    }

    protected void checkKeySize(int i) {
        if (i <= 0) {
            throw new InvalidParameterException("Key size must be positive");
        }
    }

    protected byte[] doKeyGeneration(int i) {
        byte[] bArr = new byte[i];
        this.secureRandom.nextBytes(bArr);
        return bArr;
    }

    @Override // javax.crypto.KeyGeneratorSpi
    protected SecretKey engineGenerateKey() {
        if (this.secureRandom == null) {
            this.secureRandom = new SecureRandom();
        }
        return new SecretKeySpec(doKeyGeneration((this.keySizeBits + 7) / 8), this.algorithm);
    }

    @Override // javax.crypto.KeyGeneratorSpi
    protected void engineInit(SecureRandom secureRandom) {
        this.secureRandom = secureRandom;
    }

    private KeyGeneratorImpl(String str, int i) {
        this.algorithm = str;
        this.keySizeBits = i;
    }

    @Override // javax.crypto.KeyGeneratorSpi
    protected void engineInit(int i, SecureRandom secureRandom) {
        checkKeySize(i);
        this.keySizeBits = i;
        this.secureRandom = secureRandom;
    }

    @Override // javax.crypto.KeyGeneratorSpi
    protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        if (algorithmParameterSpec == null) {
            throw new InvalidAlgorithmParameterException("No params provided");
        }
        throw new InvalidAlgorithmParameterException("Unknown param type: ".concat(String.valueOf(algorithmParameterSpec.getClass().getName())));
    }
}
