package com.google.android.gms.org.conscrypt;

import com.google.android.gms.org.conscrypt.EvpMdRef;
import com.google.android.gms.org.conscrypt.NativeRef;
import defpackage.a;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.BadPaddingException;
import javax.crypto.CipherSpi;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public abstract class OpenSSLCipherRSA extends CipherSpi {
    private byte[] buffer;
    private int bufferOffset;
    boolean encrypting;
    private boolean inputTooLarge;
    OpenSSLKey key;
    int padding;
    boolean usingPrivateKey;

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public abstract class DirectRSA extends OpenSSLCipherRSA {
        public DirectRSA(int i) {
            super(i);
        }

        @Override // com.google.android.gms.org.conscrypt.OpenSSLCipherRSA
        public int doCryptoOperation(byte[] bArr, byte[] bArr2) {
            if (this.encrypting) {
                return this.usingPrivateKey ? NativeCrypto.RSA_private_encrypt(bArr.length, bArr, bArr2, this.key.getNativeRef(), this.padding) : NativeCrypto.RSA_public_encrypt(bArr.length, bArr, bArr2, this.key.getNativeRef(), this.padding);
            }
            try {
                return this.usingPrivateKey ? NativeCrypto.RSA_private_decrypt(bArr.length, bArr, bArr2, this.key.getNativeRef(), this.padding) : NativeCrypto.RSA_public_decrypt(bArr.length, bArr, bArr2, this.key.getNativeRef(), this.padding);
            } catch (SignatureException e) {
                IllegalBlockSizeException illegalBlockSizeException = new IllegalBlockSizeException();
                illegalBlockSizeException.initCause(e);
                throw illegalBlockSizeException;
            }
        }
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public final class PKCS1 extends DirectRSA {
        public PKCS1() {
            super(1);
        }
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public final class Raw extends DirectRSA {
        public Raw() {
            super(3);
        }
    }

    public OpenSSLCipherRSA(int i) {
        this.padding = i;
    }

    public abstract int doCryptoOperation(byte[] bArr, byte[] bArr2);

    @Override // javax.crypto.CipherSpi
    protected byte[] engineDoFinal(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            engineUpdate(bArr, i, i2);
        }
        if (this.inputTooLarge) {
            throw new IllegalBlockSizeException("input must be under " + this.buffer.length + " bytes");
        }
        int i3 = this.bufferOffset;
        byte[] bArr2 = this.buffer;
        int length = bArr2.length;
        if (i3 != length) {
            if (this.padding == 3) {
                byte[] bArr3 = new byte[length];
                System.arraycopy(bArr2, 0, bArr3, length - i3, i3);
                bArr2 = bArr3;
            } else {
                bArr2 = Arrays.copyOf(bArr2, i3);
            }
        }
        int length2 = this.buffer.length;
        byte[] bArr4 = new byte[length2];
        int doCryptoOperation = doCryptoOperation(bArr2, bArr4);
        if (!this.encrypting && doCryptoOperation != length2) {
            bArr4 = Arrays.copyOf(bArr4, doCryptoOperation);
        }
        this.bufferOffset = 0;
        return bArr4;
    }

    @Override // javax.crypto.CipherSpi
    protected int engineGetBlockSize() {
        return this.encrypting ? paddedBlockSizeBytes() : keySizeBytes();
    }

    @Override // javax.crypto.CipherSpi
    protected byte[] engineGetIV() {
        return null;
    }

    @Override // javax.crypto.CipherSpi
    protected int engineGetKeySize(Key key) {
        if (key instanceof OpenSSLRSAPrivateKey) {
            return ((OpenSSLRSAPrivateKey) key).getModulus().bitLength();
        }
        if (key instanceof RSAPrivateCrtKey) {
            return ((RSAPrivateCrtKey) key).getModulus().bitLength();
        }
        if (key instanceof RSAPrivateKey) {
            return ((RSAPrivateKey) key).getModulus().bitLength();
        }
        if (key instanceof OpenSSLRSAPublicKey) {
            return ((OpenSSLRSAPublicKey) key).getModulus().bitLength();
        }
        if (key instanceof RSAPublicKey) {
            return ((RSAPublicKey) key).getModulus().bitLength();
        }
        if (key == null) {
            throw new InvalidKeyException("RSA private or public key is null");
        }
        throw new InvalidKeyException("Need RSA private or public key");
    }

    @Override // javax.crypto.CipherSpi
    protected int engineGetOutputSize(int i) {
        return this.encrypting ? keySizeBytes() : paddedBlockSizeBytes();
    }

    @Override // javax.crypto.CipherSpi
    protected AlgorithmParameters engineGetParameters() {
        return null;
    }

    @Override // javax.crypto.CipherSpi
    protected void engineInit(int i, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) {
        if (algorithmParameters != null) {
            throw new InvalidAlgorithmParameterException("unknown param type: ".concat(String.valueOf(algorithmParameters.getClass().getName())));
        }
        engineInitInternal(i, key, null);
    }

    public void engineInitInternal(int i, Key key, AlgorithmParameterSpec algorithmParameterSpec) {
        if (i == 1 || i == 3) {
            this.encrypting = true;
        } else {
            if (i != 2 && i != 4) {
                throw new InvalidParameterException(a.j(i, "Unsupported opmode "));
            }
            this.encrypting = false;
        }
        if (key instanceof OpenSSLRSAPrivateKey) {
            this.usingPrivateKey = true;
            this.key = ((OpenSSLRSAPrivateKey) key).getOpenSSLKey();
        } else if (key instanceof RSAPrivateCrtKey) {
            this.usingPrivateKey = true;
            this.key = OpenSSLRSAPrivateCrtKey.getInstance((RSAPrivateCrtKey) key);
        } else if (key instanceof RSAPrivateKey) {
            this.usingPrivateKey = true;
            this.key = OpenSSLRSAPrivateKey.getInstance((RSAPrivateKey) key);
        } else if (key instanceof OpenSSLRSAPublicKey) {
            this.usingPrivateKey = false;
            this.key = ((OpenSSLRSAPublicKey) key).getOpenSSLKey();
        } else {
            if (!(key instanceof RSAPublicKey)) {
                if (key != null) {
                    throw new InvalidKeyException("Need RSA private or public key");
                }
                throw new InvalidKeyException("RSA private or public key is null");
            }
            this.usingPrivateKey = false;
            this.key = OpenSSLRSAPublicKey.getInstance((RSAPublicKey) key);
        }
        this.buffer = new byte[NativeCrypto.RSA_size(this.key.getNativeRef())];
        this.bufferOffset = 0;
        this.inputTooLarge = false;
        doCryptoInit(algorithmParameterSpec);
    }

    @Override // javax.crypto.CipherSpi
    protected void engineSetMode(String str) {
        String upperCase = str.toUpperCase(Locale.ROOT);
        if (!"NONE".equals(upperCase) && !"ECB".equals(upperCase)) {
            throw new NoSuchAlgorithmException("mode not supported: ".concat(String.valueOf(str)));
        }
    }

    @Override // javax.crypto.CipherSpi
    protected void engineSetPadding(String str) {
        int i;
        String upperCase = str.toUpperCase(Locale.ROOT);
        if ("PKCS1PADDING".equals(upperCase)) {
            i = 1;
        } else {
            if (!"NOPADDING".equals(upperCase)) {
                throw new NoSuchPaddingException("padding not supported: ".concat(String.valueOf(str)));
            }
            i = 3;
        }
        this.padding = i;
    }

    @Override // javax.crypto.CipherSpi
    protected Key engineUnwrap(byte[] bArr, String str, int i) {
        try {
            byte[] engineDoFinal = engineDoFinal(bArr, 0, bArr.length);
            if (i == 1) {
                return KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(engineDoFinal));
            }
            if (i == 2) {
                return KeyFactory.getInstance(str).generatePrivate(new PKCS8EncodedKeySpec(engineDoFinal));
            }
            if (i == 3) {
                return new SecretKeySpec(engineDoFinal, str);
            }
            throw new UnsupportedOperationException(a.j(i, "wrappedKeyType == "));
        } catch (InvalidKeySpecException e) {
            throw new InvalidKeyException(e);
        } catch (BadPaddingException e2) {
            throw new InvalidKeyException(e2);
        } catch (IllegalBlockSizeException e3) {
            throw new InvalidKeyException(e3);
        }
    }

    @Override // javax.crypto.CipherSpi
    protected byte[] engineUpdate(byte[] bArr, int i, int i2) {
        int i3 = this.bufferOffset;
        int i4 = i3 + i2;
        byte[] bArr2 = this.buffer;
        if (i4 > bArr2.length) {
            this.inputTooLarge = true;
            return EmptyArray.BYTE;
        }
        System.arraycopy(bArr, i, bArr2, i3, i2);
        this.bufferOffset += i2;
        return EmptyArray.BYTE;
    }

    @Override // javax.crypto.CipherSpi
    protected byte[] engineWrap(Key key) {
        try {
            byte[] encoded = key.getEncoded();
            return engineDoFinal(encoded, 0, encoded.length);
        } catch (BadPaddingException e) {
            IllegalBlockSizeException illegalBlockSizeException = new IllegalBlockSizeException();
            illegalBlockSizeException.initCause(e);
            throw illegalBlockSizeException;
        }
    }

    public boolean isInitialized() {
        return this.key != null;
    }

    public int keySizeBytes() {
        if (isInitialized()) {
            return NativeCrypto.RSA_size(this.key.getNativeRef());
        }
        throw new IllegalStateException("cipher is not initialized");
    }

    public int paddedBlockSizeBytes() {
        int keySizeBytes = keySizeBytes();
        return this.padding == 1 ? keySizeBytes - 11 : keySizeBytes;
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class OAEP extends OpenSSLCipherRSA {
        private byte[] label;
        private long mgf1Md;
        private long oaepMd;
        private int oaepMdSizeBytes;
        private NativeRef.EVP_PKEY_CTX pkeyCtx;

        /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
        public final class SHA1 extends OAEP {
            public SHA1() {
                super(EvpMdRef.SHA1.EVP_MD, EvpMdRef.SHA1.SIZE_BYTES);
            }
        }

        /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
        public final class SHA224 extends OAEP {
            public SHA224() {
                super(EvpMdRef.SHA224.EVP_MD, EvpMdRef.SHA224.SIZE_BYTES);
            }
        }

        /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
        public final class SHA256 extends OAEP {
            public SHA256() {
                super(EvpMdRef.SHA256.EVP_MD, EvpMdRef.SHA256.SIZE_BYTES);
            }
        }

        /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
        public final class SHA384 extends OAEP {
            public SHA384() {
                super(EvpMdRef.SHA384.EVP_MD, EvpMdRef.SHA384.SIZE_BYTES);
            }
        }

        /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
        public final class SHA512 extends OAEP {
            public SHA512() {
                super(EvpMdRef.SHA512.EVP_MD, EvpMdRef.SHA512.SIZE_BYTES);
            }
        }

        public OAEP(long j, int i) {
            super(4);
            this.mgf1Md = j;
            this.oaepMd = j;
            this.oaepMdSizeBytes = i;
        }

        private void readOAEPParameters(OAEPParameterSpec oAEPParameterSpec) {
            String upperCase = oAEPParameterSpec.getMGFAlgorithm().toUpperCase(Locale.US);
            AlgorithmParameterSpec mGFParameters = oAEPParameterSpec.getMGFParameters();
            if ((!"MGF1".equals(upperCase) && !"1.2.840.113549.1.1.8".equals(upperCase)) || !(mGFParameters instanceof MGF1ParameterSpec)) {
                throw new InvalidAlgorithmParameterException("Only MGF1 supported as mask generation function");
            }
            MGF1ParameterSpec mGF1ParameterSpec = (MGF1ParameterSpec) mGFParameters;
            String upperCase2 = oAEPParameterSpec.getDigestAlgorithm().toUpperCase(Locale.US);
            try {
                this.oaepMd = EvpMdRef.getEVP_MDByJcaDigestAlgorithmStandardName(upperCase2);
                this.oaepMdSizeBytes = EvpMdRef.getDigestSizeBytesByJcaDigestAlgorithmStandardName(upperCase2);
                this.mgf1Md = EvpMdRef.getEVP_MDByJcaDigestAlgorithmStandardName(mGF1ParameterSpec.getDigestAlgorithm());
                PSource pSource = oAEPParameterSpec.getPSource();
                if (!"PSpecified".equals(pSource.getAlgorithm()) || !(pSource instanceof PSource.PSpecified)) {
                    throw new InvalidAlgorithmParameterException("Only PSpecified accepted for PSource");
                }
                this.label = ((PSource.PSpecified) pSource).getValue();
            } catch (NoSuchAlgorithmException e) {
                throw new InvalidAlgorithmParameterException(e);
            }
        }

        @Override // com.google.android.gms.org.conscrypt.OpenSSLCipherRSA
        public void doCryptoInit(AlgorithmParameterSpec algorithmParameterSpec) {
            this.pkeyCtx = new NativeRef.EVP_PKEY_CTX(this.encrypting ? NativeCrypto.EVP_PKEY_encrypt_init(this.key.getNativeRef()) : NativeCrypto.EVP_PKEY_decrypt_init(this.key.getNativeRef()));
            if (algorithmParameterSpec instanceof OAEPParameterSpec) {
                readOAEPParameters((OAEPParameterSpec) algorithmParameterSpec);
            }
            NativeCrypto.EVP_PKEY_CTX_set_rsa_padding(this.pkeyCtx.address, 4);
            NativeCrypto.EVP_PKEY_CTX_set_rsa_oaep_md(this.pkeyCtx.address, this.oaepMd);
            NativeCrypto.EVP_PKEY_CTX_set_rsa_mgf1_md(this.pkeyCtx.address, this.mgf1Md);
            byte[] bArr = this.label;
            if (bArr == null || bArr.length <= 0) {
                return;
            }
            NativeCrypto.EVP_PKEY_CTX_set_rsa_oaep_label(this.pkeyCtx.address, bArr);
        }

        @Override // com.google.android.gms.org.conscrypt.OpenSSLCipherRSA
        public int doCryptoOperation(byte[] bArr, byte[] bArr2) {
            return this.encrypting ? NativeCrypto.EVP_PKEY_encrypt(this.pkeyCtx, bArr2, 0, bArr, 0, bArr.length) : NativeCrypto.EVP_PKEY_decrypt(this.pkeyCtx, bArr2, 0, bArr, 0, bArr.length);
        }

        @Override // com.google.android.gms.org.conscrypt.OpenSSLCipherRSA, javax.crypto.CipherSpi
        protected AlgorithmParameters engineGetParameters() {
            if (!isInitialized()) {
                return null;
            }
            try {
                AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance("OAEP");
                algorithmParameters.init(new OAEPParameterSpec(EvpMdRef.getJcaDigestAlgorithmStandardNameFromEVP_MD(this.oaepMd), "MGF1", new MGF1ParameterSpec(EvpMdRef.getJcaDigestAlgorithmStandardNameFromEVP_MD(this.mgf1Md)), this.label == null ? PSource.PSpecified.DEFAULT : new PSource.PSpecified(this.label)));
                return algorithmParameters;
            } catch (NoSuchAlgorithmException e) {
                throw ((Error) new AssertionError("OAEP not supported").initCause(e));
            } catch (InvalidParameterSpecException unused) {
                throw new RuntimeException("No providers of AlgorithmParameters.OAEP available");
            }
        }

        @Override // com.google.android.gms.org.conscrypt.OpenSSLCipherRSA, javax.crypto.CipherSpi
        protected void engineInit(int i, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) {
            OAEPParameterSpec oAEPParameterSpec;
            if (algorithmParameters != null) {
                try {
                    oAEPParameterSpec = (OAEPParameterSpec) algorithmParameters.getParameterSpec(OAEPParameterSpec.class);
                } catch (InvalidParameterSpecException e) {
                    throw new InvalidAlgorithmParameterException("Only OAEP parameters are supported", e);
                }
            } else {
                oAEPParameterSpec = null;
            }
            engineInitInternal(i, key, oAEPParameterSpec);
        }

        @Override // com.google.android.gms.org.conscrypt.OpenSSLCipherRSA
        public void engineInitInternal(int i, Key key, AlgorithmParameterSpec algorithmParameterSpec) {
            if (i != 1 && i != 3) {
                if (i != 2) {
                    if (i == 4) {
                        i = 4;
                    }
                }
                if (!(key instanceof PrivateKey)) {
                    throw new InvalidKeyException("Only private keys may be used to decrypt");
                }
            } else if (!(key instanceof PublicKey)) {
                throw new InvalidKeyException("Only public keys may be used to encrypt");
            }
            super.engineInitInternal(i, key, algorithmParameterSpec);
        }

        @Override // com.google.android.gms.org.conscrypt.OpenSSLCipherRSA, javax.crypto.CipherSpi
        protected void engineSetPadding(String str) {
            if (!str.toUpperCase(Locale.US).equals("OAEPPADDING")) {
                throw new NoSuchPaddingException("Only OAEP padding is supported");
            }
            this.padding = 4;
        }

        @Override // com.google.android.gms.org.conscrypt.OpenSSLCipherRSA
        public int paddedBlockSizeBytes() {
            int keySizeBytes = keySizeBytes();
            int i = this.oaepMdSizeBytes;
            return keySizeBytes - ((i + i) + 2);
        }

        @Override // com.google.android.gms.org.conscrypt.OpenSSLCipherRSA, javax.crypto.CipherSpi
        protected void engineInit(int i, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
            if (algorithmParameterSpec != null && !(algorithmParameterSpec instanceof OAEPParameterSpec)) {
                throw new InvalidAlgorithmParameterException("Only OAEPParameterSpec accepted in OAEP mode");
            }
            engineInitInternal(i, key, algorithmParameterSpec);
        }
    }

    @Override // javax.crypto.CipherSpi
    protected int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        engineUpdate(bArr, i, i2);
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    protected void engineInit(int i, Key key, SecureRandom secureRandom) {
        try {
            engineInitInternal(i, key, null);
        } catch (InvalidAlgorithmParameterException e) {
            throw new InvalidKeyException("Algorithm parameters rejected when none supplied", e);
        }
    }

    @Override // javax.crypto.CipherSpi
    protected void engineInit(int i, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        if (algorithmParameterSpec == null) {
            engineInitInternal(i, key, null);
            return;
        }
        throw new InvalidAlgorithmParameterException("unknown param type: ".concat(String.valueOf(algorithmParameterSpec.getClass().getName())));
    }

    @Override // javax.crypto.CipherSpi
    protected int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        byte[] engineDoFinal = engineDoFinal(bArr, i, i2);
        int length = engineDoFinal.length;
        int i4 = i3 + length;
        int length2 = bArr2.length;
        if (i4 <= length2) {
            System.arraycopy(engineDoFinal, 0, bArr2, i3, length);
            return length;
        }
        throw new ShortBufferWithoutStackTraceException(a.t(i4, length2, "output buffer is too small ", " < "));
    }

    public void doCryptoInit(AlgorithmParameterSpec algorithmParameterSpec) {
    }
}
