package com.google.android.gms.org.conscrypt;

import com.google.android.gms.org.conscrypt.NativeRef;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.SignatureSpi;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class OpenSslSignatureEdDsa extends SignatureSpi {
    private final ExposedByteArrayOutputStream buffer = new ExposedByteArrayOutputStream();
    private NativeRef.EVP_MD_CTX ctx;
    private OpenSSLKey key;

    private static OpenSSLKey verifyKey(OpenSSLKey openSSLKey) {
        if (NativeCrypto.EVP_PKEY_type(openSSLKey.getNativeRef()) == 949) {
            return openSSLKey;
        }
        throw new InvalidKeyException("Non-ED25519 key used to initialize ED25519 signature.");
    }

    @Override // java.security.SignatureSpi
    protected Object engineGetParameter(String str) {
        return null;
    }

    @Override // java.security.SignatureSpi
    protected void engineInitSign(PrivateKey privateKey) {
        OpenSSLKey fromPrivateKey = OpenSSLKey.fromPrivateKey(privateKey);
        verifyKey(fromPrivateKey);
        this.key = fromPrivateKey;
        NativeRef.EVP_MD_CTX evp_md_ctx = new NativeRef.EVP_MD_CTX(NativeCrypto.EVP_MD_CTX_create());
        NativeCrypto.EVP_DigestSignInit(evp_md_ctx, 0L, this.key.getNativeRef());
        this.ctx = evp_md_ctx;
    }

    @Override // java.security.SignatureSpi
    protected void engineInitVerify(PublicKey publicKey) {
        OpenSSLKey fromPublicKey = OpenSSLKey.fromPublicKey(publicKey);
        verifyKey(fromPublicKey);
        this.key = fromPublicKey;
        NativeRef.EVP_MD_CTX evp_md_ctx = new NativeRef.EVP_MD_CTX(NativeCrypto.EVP_MD_CTX_create());
        NativeCrypto.EVP_DigestVerifyInit(evp_md_ctx, 0L, this.key.getNativeRef());
        this.ctx = evp_md_ctx;
    }

    @Override // java.security.SignatureSpi
    protected byte[] engineSign() {
        NativeRef.EVP_MD_CTX evp_md_ctx = this.ctx;
        if (this.key == null) {
            throw new SignatureException("No key provided");
        }
        ExposedByteArrayOutputStream exposedByteArrayOutputStream = this.buffer;
        byte[] EVP_DigestSign = NativeCrypto.EVP_DigestSign(evp_md_ctx, exposedByteArrayOutputStream.array(), 0, exposedByteArrayOutputStream.size());
        this.buffer.reset();
        return EVP_DigestSign;
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte b) {
        this.buffer.write(b);
    }

    @Override // java.security.SignatureSpi
    protected boolean engineVerify(byte[] bArr) {
        NativeRef.EVP_MD_CTX evp_md_ctx = this.ctx;
        if (this.key == null) {
            throw new SignatureException("No key provided");
        }
        int length = bArr.length;
        ExposedByteArrayOutputStream exposedByteArrayOutputStream = this.buffer;
        boolean EVP_DigestVerify = NativeCrypto.EVP_DigestVerify(evp_md_ctx, bArr, 0, length, exposedByteArrayOutputStream.array(), 0, exposedByteArrayOutputStream.size());
        this.buffer.reset();
        return EVP_DigestVerify;
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte[] bArr, int i, int i2) {
        this.buffer.write(bArr, i, i2);
    }

    @Override // java.security.SignatureSpi
    protected void engineSetParameter(String str, Object obj) {
    }
}
