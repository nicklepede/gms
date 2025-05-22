package com.google.android.gms.org.conscrypt;

import java.io.ByteArrayOutputStream;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.SignatureSpi;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class OpenSslSignatureSlhDsa extends SignatureSpi {
    private ByteArrayOutputStream buffer = new ByteArrayOutputStream();
    private OpenSslSlhDsaPrivateKey privateKey;
    private OpenSslSlhDsaPublicKey publicKey;

    @Override // java.security.SignatureSpi
    protected Object engineGetParameter(String str) {
        return null;
    }

    @Override // java.security.SignatureSpi
    protected void engineInitSign(PrivateKey privateKey) {
        this.privateKey = (OpenSslSlhDsaPrivateKey) privateKey;
        this.publicKey = null;
        this.buffer.reset();
    }

    @Override // java.security.SignatureSpi
    protected void engineInitVerify(PublicKey publicKey) {
        this.publicKey = (OpenSslSlhDsaPublicKey) publicKey;
        this.privateKey = null;
        this.buffer.reset();
    }

    @Override // java.security.SignatureSpi
    protected byte[] engineSign() {
        if (this.privateKey == null) {
            throw new SignatureException("No privateKey provided");
        }
        byte[] byteArray = this.buffer.toByteArray();
        this.buffer.reset();
        return NativeCrypto.SLHDSA_SHA2_128S_sign(byteArray, this.privateKey.getRaw());
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte b) {
        this.buffer.write(b);
    }

    @Override // java.security.SignatureSpi
    protected boolean engineVerify(byte[] bArr) {
        if (this.publicKey == null) {
            throw new SignatureException("No publicKey provided");
        }
        byte[] byteArray = this.buffer.toByteArray();
        this.buffer.reset();
        return NativeCrypto.SLHDSA_SHA2_128S_verify(byteArray, bArr, this.publicKey.getRaw()) == 1;
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte[] bArr, int i, int i2) {
        this.buffer.write(bArr, i, i2);
    }

    @Override // java.security.SignatureSpi
    protected void engineSetParameter(String str, Object obj) {
    }
}
