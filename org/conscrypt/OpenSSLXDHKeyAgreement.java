package com.google.android.gms.org.conscrypt;

import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class OpenSSLXDHKeyAgreement extends OpenSSLBaseDHKeyAgreement {
    @Override // com.google.android.gms.org.conscrypt.OpenSSLBaseDHKeyAgreement
    protected /* bridge */ /* synthetic */ int computeKey(byte[] bArr, Object obj, Object obj2) {
        computeKey(bArr, (byte[]) obj, (byte[]) obj2);
        return 32;
    }

    protected int getOutputSize(byte[] bArr) {
        return 32;
    }

    protected int computeKey(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (NativeCrypto.X25519(bArr, bArr3, bArr2)) {
            return 32;
        }
        throw new InvalidKeyException("Error running X25519");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.org.conscrypt.OpenSSLBaseDHKeyAgreement
    public byte[] convertPrivateKey(PrivateKey privateKey) {
        if (privateKey instanceof OpenSSLX25519PrivateKey) {
            return ((OpenSSLX25519PrivateKey) privateKey).getU();
        }
        throw new InvalidKeyException("Only OpenSSLX25519PublicKey accepted");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.org.conscrypt.OpenSSLBaseDHKeyAgreement
    public byte[] convertPublicKey(PublicKey publicKey) {
        if (publicKey instanceof OpenSSLX25519PublicKey) {
            return ((OpenSSLX25519PublicKey) publicKey).getU();
        }
        throw new InvalidKeyException("Only OpenSSLX25519PublicKey accepted");
    }

    @Override // com.google.android.gms.org.conscrypt.OpenSSLBaseDHKeyAgreement
    protected /* bridge */ /* synthetic */ int getOutputSize(Object obj) {
        return 32;
    }
}
