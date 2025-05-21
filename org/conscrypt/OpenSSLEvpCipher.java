package com.google.android.gms.org.conscrypt;

import com.google.android.gms.org.conscrypt.NativeRef;
import com.google.android.gms.org.conscrypt.OpenSSLCipher;
import defpackage.a;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public abstract class OpenSSLEvpCipher extends OpenSSLCipher {
    private boolean calledUpdate;
    private final NativeRef.EVP_CIPHER_CTX cipherCtx;
    private int modeBlockSize;

    public OpenSSLEvpCipher(OpenSSLCipher.Mode mode, OpenSSLCipher.Padding padding) {
        super(mode, padding);
        this.cipherCtx = new NativeRef.EVP_CIPHER_CTX(NativeCrypto.EVP_CIPHER_CTX_new());
    }

    private void reset() {
        NativeCrypto.EVP_CipherInit_ex(this.cipherCtx, 0L, this.encodedKey, this.iv, isEncrypting());
        this.calledUpdate = false;
    }

    public int doFinalInternal(byte[] bArr, int i, int i2) {
        int i3;
        if (!isEncrypting() && !this.calledUpdate) {
            return 0;
        }
        int length = bArr.length - i;
        if (length >= i2) {
            i3 = NativeCrypto.EVP_CipherFinal_ex(this.cipherCtx, bArr, i);
        } else {
            byte[] bArr2 = new byte[i2];
            int EVP_CipherFinal_ex = NativeCrypto.EVP_CipherFinal_ex(this.cipherCtx, bArr2, 0);
            if (EVP_CipherFinal_ex > length) {
                throw new ShortBufferWithoutStackTraceException(a.t(length, EVP_CipherFinal_ex, "buffer is too short: ", " > "));
            }
            if (EVP_CipherFinal_ex > 0) {
                System.arraycopy(bArr2, 0, bArr, i, EVP_CipherFinal_ex);
            }
            i3 = EVP_CipherFinal_ex;
        }
        reset();
        return (i3 + i) - i;
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
        try {
            int doFinalInternal = i3 + doFinalInternal(bArr2, i3, outputSizeForFinal - i3);
            return doFinalInternal == outputSizeForFinal ? bArr2 : doFinalInternal == 0 ? EmptyArray.BYTE : Arrays.copyOfRange(bArr2, 0, doFinalInternal);
        } catch (ShortBufferException e2) {
            throw new RuntimeException("our calculated buffer was too small", e2);
        }
    }

    @Override // com.google.android.gms.org.conscrypt.OpenSSLCipher
    public void engineInitInternal(byte[] bArr, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        byte[] bArr2;
        int length;
        byte[] bArr3 = null;
        byte[] iv = algorithmParameterSpec instanceof IvParameterSpec ? ((IvParameterSpec) algorithmParameterSpec).getIV() : null;
        int length2 = bArr.length;
        long EVP_get_cipherbyname = NativeCrypto.EVP_get_cipherbyname(getCipherName(length2, this.mode));
        if (EVP_get_cipherbyname == 0) {
            throw new InvalidAlgorithmParameterException("Cannot find name for key length = " + (length2 * 8) + " and mode = " + String.valueOf(this.mode));
        }
        boolean isEncrypting = isEncrypting();
        int EVP_CIPHER_iv_length = NativeCrypto.EVP_CIPHER_iv_length(EVP_get_cipherbyname);
        if (iv != null || EVP_CIPHER_iv_length == 0) {
            if (EVP_CIPHER_iv_length != 0) {
                bArr3 = iv;
            } else if (iv != null) {
                throw new InvalidAlgorithmParameterException("IV not used in " + String.valueOf(this.mode) + " mode");
            }
            if (iv != null && (length = iv.length) != EVP_CIPHER_iv_length) {
                throw new InvalidAlgorithmParameterException(a.t(length, EVP_CIPHER_iv_length, "expected IV length of ", " but was "));
            }
            bArr2 = bArr3;
        } else {
            if (!isEncrypting) {
                throw new InvalidAlgorithmParameterException("IV must be specified in " + String.valueOf(this.mode) + " mode");
            }
            bArr2 = new byte[EVP_CIPHER_iv_length];
            if (secureRandom != null) {
                secureRandom.nextBytes(bArr2);
            } else {
                NativeCrypto.RAND_bytes(bArr2);
            }
        }
        this.iv = bArr2;
        if (supportsVariableSizeKey()) {
            NativeCrypto.EVP_CipherInit_ex(this.cipherCtx, EVP_get_cipherbyname, null, null, isEncrypting);
            NativeCrypto.EVP_CIPHER_CTX_set_key_length(this.cipherCtx, length2);
            NativeCrypto.EVP_CipherInit_ex(this.cipherCtx, 0L, bArr, bArr2, isEncrypting());
        } else {
            NativeCrypto.EVP_CipherInit_ex(this.cipherCtx, EVP_get_cipherbyname, bArr, bArr2, isEncrypting);
        }
        NativeCrypto.EVP_CIPHER_CTX_set_padding(this.cipherCtx, getPadding() == OpenSSLCipher.Padding.PKCS5PADDING);
        this.modeBlockSize = NativeCrypto.EVP_CIPHER_CTX_block_size(this.cipherCtx);
        this.calledUpdate = false;
    }

    public abstract String getCipherName(int i, OpenSSLCipher.Mode mode);

    @Override // com.google.android.gms.org.conscrypt.OpenSSLCipher
    public int getOutputSizeForFinal(int i) {
        if (this.modeBlockSize == 1) {
            return i;
        }
        int i2 = NativeCrypto.get_EVP_CIPHER_CTX_buf_len(this.cipherCtx) + i;
        if (getPadding() == OpenSSLCipher.Padding.NOPADDING) {
            return i2;
        }
        int i3 = i2 + (NativeCrypto.get_EVP_CIPHER_CTX_final_used(this.cipherCtx) ? this.modeBlockSize : 0);
        int i4 = i3 + ((i3 % this.modeBlockSize != 0 || isEncrypting()) ? this.modeBlockSize : 0);
        return i4 - (i4 % this.modeBlockSize);
    }

    @Override // com.google.android.gms.org.conscrypt.OpenSSLCipher
    public int getOutputSizeForUpdate(int i) {
        return getOutputSizeForFinal(i);
    }

    @Override // com.google.android.gms.org.conscrypt.OpenSSLCipher
    public int updateInternal(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        int length = bArr2.length - i3;
        if (length < i4) {
            throw new ShortBufferWithoutStackTraceException(a.t(i4, length, "output buffer too small during update: ", " < "));
        }
        int EVP_CipherUpdate = i3 + NativeCrypto.EVP_CipherUpdate(this.cipherCtx, bArr2, i3, bArr, i, i2);
        this.calledUpdate = true;
        return EVP_CipherUpdate - i3;
    }

    @Override // javax.crypto.CipherSpi
    protected int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        byte[] bArr3;
        int i4;
        if (bArr2 != null) {
            int outputSizeForFinal = getOutputSizeForFinal(i2);
            if (i2 > 0) {
                bArr3 = bArr2;
                i4 = updateInternal(bArr, i, i2, bArr3, i3, outputSizeForFinal);
                i3 += i4;
                outputSizeForFinal -= i4;
            } else {
                bArr3 = bArr2;
                i4 = 0;
            }
            return i4 + doFinalInternal(bArr3, i3, outputSizeForFinal);
        }
        throw new NullPointerException("output == null");
    }
}
