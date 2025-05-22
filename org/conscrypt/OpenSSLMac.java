package com.google.android.gms.org.conscrypt;

import com.google.android.gms.org.conscrypt.EvpMdRef;
import com.google.android.gms.org.conscrypt.NativeRef;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.MacSpi;
import javax.crypto.SecretKey;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public abstract class OpenSSLMac extends MacSpi {
    protected boolean initialized;
    private final byte[] singleByte;
    private final int size;

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public final class AesCmac extends OpenSSLMac {
        private NativeRef.CMAC_CTX ctx;

        public AesCmac() {
            super(16);
        }

        @Override // com.google.android.gms.org.conscrypt.OpenSSLMac
        protected byte[] doFinal() {
            return NativeCrypto.CMAC_Final(this.ctx);
        }

        @Override // javax.crypto.MacSpi
        protected void engineUpdate(byte[] bArr, int i, int i2) {
            NativeCrypto.CMAC_Update(this.ctx, bArr, i, i2);
        }

        @Override // com.google.android.gms.org.conscrypt.OpenSSLMac
        protected void initContext(byte[] bArr) {
            NativeRef.CMAC_CTX cmac_ctx = new NativeRef.CMAC_CTX(NativeCrypto.CMAC_CTX_new());
            NativeCrypto.CMAC_Init(cmac_ctx, bArr);
            this.ctx = cmac_ctx;
        }

        @Override // com.google.android.gms.org.conscrypt.OpenSSLMac
        protected void resetContext() {
            NativeCrypto.CMAC_Reset(this.ctx);
        }

        @Override // com.google.android.gms.org.conscrypt.OpenSSLMac
        protected void updateDirect(long j, int i) {
            NativeCrypto.CMAC_UpdateDirect(this.ctx, j, i);
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class Hmac extends OpenSSLMac {
        private NativeRef.HMAC_CTX ctx;
        private final long evpMd;

        public Hmac(long j, int i) {
            super(i);
            this.evpMd = j;
        }

        @Override // com.google.android.gms.org.conscrypt.OpenSSLMac
        protected byte[] doFinal() {
            return NativeCrypto.HMAC_Final(this.ctx);
        }

        @Override // javax.crypto.MacSpi
        protected void engineUpdate(byte[] bArr, int i, int i2) {
            NativeCrypto.HMAC_Update(this.ctx, bArr, i, i2);
        }

        @Override // com.google.android.gms.org.conscrypt.OpenSSLMac
        protected void initContext(byte[] bArr) {
            NativeRef.HMAC_CTX hmac_ctx = new NativeRef.HMAC_CTX(NativeCrypto.HMAC_CTX_new());
            NativeCrypto.HMAC_Init_ex(hmac_ctx, bArr, this.evpMd);
            this.ctx = hmac_ctx;
        }

        @Override // com.google.android.gms.org.conscrypt.OpenSSLMac
        protected void resetContext() {
            NativeCrypto.HMAC_Reset(this.ctx);
        }

        @Override // com.google.android.gms.org.conscrypt.OpenSSLMac
        protected void updateDirect(long j, int i) {
            NativeCrypto.HMAC_UpdateDirect(this.ctx, j, i);
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public final class HmacMD5 extends Hmac {
        public HmacMD5() {
            super(EvpMdRef.MD5.EVP_MD, EvpMdRef.MD5.SIZE_BYTES);
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public final class HmacSHA1 extends Hmac {
        public HmacSHA1() {
            super(EvpMdRef.SHA1.EVP_MD, EvpMdRef.SHA1.SIZE_BYTES);
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public final class HmacSHA224 extends Hmac {
        public HmacSHA224() {
            super(EvpMdRef.SHA224.EVP_MD, EvpMdRef.SHA224.SIZE_BYTES);
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public final class HmacSHA256 extends Hmac {
        public HmacSHA256() {
            super(EvpMdRef.SHA256.EVP_MD, EvpMdRef.SHA256.SIZE_BYTES);
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public final class HmacSHA384 extends Hmac {
        public HmacSHA384() {
            super(EvpMdRef.SHA384.EVP_MD, EvpMdRef.SHA384.SIZE_BYTES);
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public final class HmacSHA512 extends Hmac {
        public HmacSHA512() {
            super(EvpMdRef.SHA512.EVP_MD, EvpMdRef.SHA512.SIZE_BYTES);
        }
    }

    protected abstract byte[] doFinal();

    @Override // javax.crypto.MacSpi
    protected byte[] engineDoFinal() {
        byte[] doFinal = doFinal();
        resetContext();
        return doFinal;
    }

    @Override // javax.crypto.MacSpi
    protected int engineGetMacLength() {
        return this.size;
    }

    @Override // javax.crypto.MacSpi
    protected void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec) {
        if (!(key instanceof SecretKey)) {
            throw new InvalidKeyException("key must be a SecretKey");
        }
        if (algorithmParameterSpec != null) {
            throw new InvalidAlgorithmParameterException("unknown parameter type");
        }
        byte[] encoded = key.getEncoded();
        if (encoded == null) {
            throw new InvalidKeyException("key cannot be encoded");
        }
        try {
            initContext(encoded);
            this.initialized = true;
        } catch (RuntimeException e) {
            throw new InvalidKeyException("invalid key", e);
        }
    }

    @Override // javax.crypto.MacSpi
    protected void engineReset() {
        if (this.initialized) {
            resetContext();
        }
    }

    @Override // javax.crypto.MacSpi
    protected void engineUpdate(byte b) {
        byte[] bArr = this.singleByte;
        bArr[0] = b;
        engineUpdate(bArr, 0, 1);
    }

    protected abstract void initContext(byte[] bArr);

    protected abstract void resetContext();

    protected abstract void updateDirect(long j, int i);

    private OpenSSLMac(int i) {
        this.singleByte = new byte[1];
        this.initialized = false;
        this.size = i;
    }

    @Override // javax.crypto.MacSpi
    protected void engineUpdate(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            if (!byteBuffer.isDirect()) {
                super.engineUpdate(byteBuffer);
                return;
            }
            long directBufferAddress = NativeCrypto.getDirectBufferAddress(byteBuffer);
            if (directBufferAddress == 0) {
                super.engineUpdate(byteBuffer);
                return;
            }
            int position = byteBuffer.position();
            if (position >= 0) {
                long j = directBufferAddress + position;
                int remaining = byteBuffer.remaining();
                if (remaining >= 0) {
                    updateDirect(j, remaining);
                    byteBuffer.position(position + remaining);
                    return;
                }
                throw new IllegalStateException("Negative remaining amount");
            }
            throw new IllegalStateException("Negative position");
        }
    }
}
