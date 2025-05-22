package com.google.android.gms.org.conscrypt;

import com.google.android.gms.org.conscrypt.OpenSSLCipher;
import com.google.android.gms.org.conscrypt.metrics.MetricsAlgorithm;
import com.google.android.gms.org.conscrypt.metrics.MetricsCipher;
import com.google.android.gms.org.conscrypt.metrics.MetricsMode;
import com.google.android.gms.org.conscrypt.metrics.MetricsPadding;
import defpackage.a;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class OpenSSLCipherChaCha20 extends OpenSSLCipher {
    private static final int BLOCK_SIZE_BYTES = 64;
    private static final int NONCE_SIZE_BYTES = 12;
    private int currentBlockConsumedBytes = 0;
    private int blockCounter = 0;

    public OpenSSLCipherChaCha20() {
        Platform.getStatsLog().countServiceUsage(MetricsAlgorithm.CIPHER.getId(), MetricsCipher.CHACHA20.getId(), MetricsMode.NO_MODE.getId(), MetricsPadding.NO_PADDING.getId());
    }

    private void reset() {
        this.blockCounter = 0;
        this.currentBlockConsumedBytes = 0;
    }

    @Override // com.google.android.gms.org.conscrypt.OpenSSLCipher
    public void checkSupportedKeySize(int i) {
        if (i != 32) {
            throw new InvalidKeyException(a.l(i, "Unsupported key size: ", " bytes (must be 32)"));
        }
    }

    @Override // com.google.android.gms.org.conscrypt.OpenSSLCipher
    public void checkSupportedMode(OpenSSLCipher.Mode mode) {
        if (mode != OpenSSLCipher.Mode.NONE) {
            throw new NoSuchAlgorithmException("Mode must be NONE");
        }
    }

    @Override // com.google.android.gms.org.conscrypt.OpenSSLCipher
    public void checkSupportedPadding(OpenSSLCipher.Padding padding) {
        if (padding != OpenSSLCipher.Padding.NOPADDING) {
            throw new NoSuchPaddingException("Must be NoPadding");
        }
    }

    @Override // javax.crypto.CipherSpi
    protected byte[] engineDoFinal(byte[] bArr, int i, int i2) {
        int i3;
        int outputSizeForFinal = getOutputSizeForFinal(i2);
        byte[] bArr2 = new byte[outputSizeForFinal];
        if (i2 > 0) {
            try {
                i3 = updateInternal(bArr, i, i2, bArr2, 0, outputSizeForFinal);
            } catch (ShortBufferException e) {
                throw new RuntimeException("our calculated buffer was too small", e);
            }
        } else {
            i3 = 0;
        }
        reset();
        return i3 == outputSizeForFinal ? bArr2 : i3 == 0 ? EmptyArray.BYTE : Arrays.copyOfRange(bArr2, 0, i3);
    }

    @Override // com.google.android.gms.org.conscrypt.OpenSSLCipher
    public void engineInitInternal(byte[] bArr, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        if (algorithmParameterSpec instanceof IvParameterSpec) {
            IvParameterSpec ivParameterSpec = (IvParameterSpec) algorithmParameterSpec;
            if (ivParameterSpec.getIV().length != 12) {
                throw new InvalidAlgorithmParameterException("IV must be 12 bytes long");
            }
            this.iv = ivParameterSpec.getIV();
            return;
        }
        if (!isEncrypting()) {
            throw new InvalidAlgorithmParameterException("IV must be specified when decrypting");
        }
        this.iv = new byte[12];
        if (secureRandom != null) {
            secureRandom.nextBytes(this.iv);
        } else {
            NativeCrypto.RAND_bytes(this.iv);
        }
    }

    @Override // com.google.android.gms.org.conscrypt.OpenSSLCipher
    public String getBaseCipherName() {
        return "ChaCha20";
    }

    @Override // com.google.android.gms.org.conscrypt.OpenSSLCipher
    public int getCipherBlockSize() {
        return 0;
    }

    @Override // com.google.android.gms.org.conscrypt.OpenSSLCipher
    public int updateInternal(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        if (i2 > bArr2.length - i3) {
            throw new ShortBufferWithoutStackTraceException("Insufficient output space");
        }
        int i8 = this.currentBlockConsumedBytes;
        if (i8 > 0) {
            int min = Math.min(64 - i8, i2);
            byte[] bArr3 = new byte[64];
            byte[] bArr4 = new byte[64];
            System.arraycopy(bArr, i, bArr3, this.currentBlockConsumedBytes, min);
            NativeCrypto.chacha20_encrypt_decrypt(bArr3, 0, bArr4, 0, 64, this.encodedKey, this.iv, this.blockCounter);
            System.arraycopy(bArr4, this.currentBlockConsumedBytes, bArr2, i3, min);
            int i9 = this.currentBlockConsumedBytes + min;
            this.currentBlockConsumedBytes = i9;
            if (i9 < 64) {
                return min;
            }
            this.currentBlockConsumedBytes = 0;
            this.blockCounter++;
            i5 = i2 - min;
            i7 = i3 + min;
            i6 = i + min;
        } else {
            i5 = i2;
            i6 = i;
            i7 = i3;
        }
        NativeCrypto.chacha20_encrypt_decrypt(bArr, i6, bArr2, i7, i5, this.encodedKey, this.iv, this.blockCounter);
        this.currentBlockConsumedBytes = i5 % 64;
        this.blockCounter += i5 / 64;
        return i2;
    }

    @Override // javax.crypto.CipherSpi
    protected int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (bArr2 != null) {
            int updateInternal = i2 > 0 ? updateInternal(bArr, i, i2, bArr2, i3, getOutputSizeForFinal(i2)) : 0;
            reset();
            return updateInternal;
        }
        throw new NullPointerException("output == null");
    }

    @Override // com.google.android.gms.org.conscrypt.OpenSSLCipher
    public int getOutputSizeForFinal(int i) {
        return i;
    }

    @Override // com.google.android.gms.org.conscrypt.OpenSSLCipher
    public int getOutputSizeForUpdate(int i) {
        return i;
    }
}
