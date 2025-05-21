package com.google.android.gms.org.conscrypt;

import com.google.android.gms.org.conscrypt.OpenSSLCipher;
import defpackage.a;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public abstract class OpenSSLAeadCipherAES extends OpenSSLAeadCipher {
    private static final int AES_BLOCK_SIZE = 16;

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class GCM extends OpenSSLAeadCipherAES {

        /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
        public class AES_128 extends GCM {
            @Override // com.google.android.gms.org.conscrypt.OpenSSLAeadCipherAES, com.google.android.gms.org.conscrypt.OpenSSLCipher
            public void checkSupportedKeySize(int i) {
                if (i != 16) {
                    throw new InvalidKeyException(a.l(i, "Unsupported key size: ", " bytes (must be 16)"));
                }
            }
        }

        /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
        public class AES_256 extends GCM {
            @Override // com.google.android.gms.org.conscrypt.OpenSSLAeadCipherAES, com.google.android.gms.org.conscrypt.OpenSSLCipher
            public void checkSupportedKeySize(int i) {
                if (i != 32) {
                    throw new InvalidKeyException(a.l(i, "Unsupported key size: ", " bytes (must be 32)"));
                }
            }
        }

        public GCM() {
            super(OpenSSLCipher.Mode.GCM);
        }

        @Override // com.google.android.gms.org.conscrypt.OpenSSLCipher
        public void checkSupportedMode(OpenSSLCipher.Mode mode) {
            if (mode != OpenSSLCipher.Mode.GCM) {
                throw new NoSuchAlgorithmException("Mode must be GCM");
            }
        }

        @Override // com.google.android.gms.org.conscrypt.OpenSSLAeadCipher
        public long getEVP_AEAD(int i) {
            if (i == 16) {
                return NativeCrypto.EVP_aead_aes_128_gcm();
            }
            if (i == 32) {
                return NativeCrypto.EVP_aead_aes_256_gcm();
            }
            throw new RuntimeException(a.j(i, "Unexpected key length: "));
        }
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class GCM_SIV extends OpenSSLAeadCipherAES {

        /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
        public class AES_128 extends GCM_SIV {
            @Override // com.google.android.gms.org.conscrypt.OpenSSLAeadCipherAES, com.google.android.gms.org.conscrypt.OpenSSLCipher
            public void checkSupportedKeySize(int i) {
                if (i != 16) {
                    throw new InvalidKeyException(a.l(i, "Unsupported key size: ", " bytes (must be 16)"));
                }
            }
        }

        /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
        public class AES_256 extends GCM_SIV {
            @Override // com.google.android.gms.org.conscrypt.OpenSSLAeadCipherAES, com.google.android.gms.org.conscrypt.OpenSSLCipher
            public void checkSupportedKeySize(int i) {
                if (i != 32) {
                    throw new InvalidKeyException(a.l(i, "Unsupported key size: ", " bytes (must be 32)"));
                }
            }
        }

        public GCM_SIV() {
            super(OpenSSLCipher.Mode.GCM_SIV);
        }

        @Override // com.google.android.gms.org.conscrypt.OpenSSLAeadCipher
        public boolean allowsNonceReuse() {
            return true;
        }

        @Override // com.google.android.gms.org.conscrypt.OpenSSLCipher
        public void checkSupportedMode(OpenSSLCipher.Mode mode) {
            if (mode != OpenSSLCipher.Mode.GCM_SIV) {
                throw new NoSuchAlgorithmException("Mode must be GCM-SIV");
            }
        }

        @Override // com.google.android.gms.org.conscrypt.OpenSSLAeadCipher
        public void checkSupportedTagLength(int i) {
            if (i != 128) {
                throw new InvalidAlgorithmParameterException("Tag length must be 128 bits");
            }
        }

        @Override // com.google.android.gms.org.conscrypt.OpenSSLAeadCipher
        public long getEVP_AEAD(int i) {
            if (i == 16) {
                return NativeCrypto.EVP_aead_aes_128_gcm_siv();
            }
            if (i == 32) {
                return NativeCrypto.EVP_aead_aes_256_gcm_siv();
            }
            throw new RuntimeException(a.j(i, "Unexpected key length: "));
        }
    }

    public OpenSSLAeadCipherAES(OpenSSLCipher.Mode mode) {
        super(mode);
    }

    @Override // com.google.android.gms.org.conscrypt.OpenSSLCipher
    public void checkSupportedKeySize(int i) {
        if (i != 16 && i != 32) {
            throw new InvalidKeyException(a.l(i, "Unsupported key size: ", " bytes (must be 16 or 32)"));
        }
    }

    @Override // com.google.android.gms.org.conscrypt.OpenSSLCipher, javax.crypto.CipherSpi
    protected AlgorithmParameters engineGetParameters() {
        byte[] bArr = this.iv;
        if (bArr == null) {
            return null;
        }
        AlgorithmParameterSpec gCMParameterSpec = Platform.toGCMParameterSpec(this.tagLengthInBytes * 8, bArr);
        if (gCMParameterSpec == null) {
            return super.engineGetParameters();
        }
        try {
            AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance("GCM");
            algorithmParameters.init(gCMParameterSpec);
            return algorithmParameters;
        } catch (NoSuchAlgorithmException e) {
            throw ((Error) new AssertionError("GCM not supported").initCause(e));
        } catch (InvalidParameterSpecException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.org.conscrypt.OpenSSLCipher
    public String getBaseCipherName() {
        return "AES";
    }

    @Override // com.google.android.gms.org.conscrypt.OpenSSLCipher
    public int getCipherBlockSize() {
        return 16;
    }

    @Override // com.google.android.gms.org.conscrypt.OpenSSLCipher
    public int getOutputSizeForFinal(int i) {
        return isEncrypting() ? this.bufCount + i + this.tagLengthInBytes : Math.max(0, (this.bufCount + i) - this.tagLengthInBytes);
    }

    @Override // com.google.android.gms.org.conscrypt.OpenSSLCipher
    protected AlgorithmParameterSpec getParameterSpec(AlgorithmParameters algorithmParameters) {
        if (algorithmParameters == null) {
            return null;
        }
        AlgorithmParameterSpec fromGCMParameters = Platform.fromGCMParameters(algorithmParameters);
        return fromGCMParameters != null ? fromGCMParameters : super.getParameterSpec(algorithmParameters);
    }
}
