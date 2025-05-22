package com.google.android.gms.org.conscrypt;

import com.google.android.gms.org.conscrypt.NativeRef;
import java.security.PrivateKey;
import java.security.PublicKey;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class OpenSSLECDHKeyAgreement extends OpenSSLBaseDHKeyAgreement {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.org.conscrypt.OpenSSLBaseDHKeyAgreement
    public int computeKey(byte[] bArr, OpenSSLKey openSSLKey, OpenSSLKey openSSLKey2) {
        return NativeCrypto.ECDH_compute_key(bArr, 0, openSSLKey.getNativeRef(), openSSLKey2.getNativeRef());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.org.conscrypt.OpenSSLBaseDHKeyAgreement
    public OpenSSLKey convertPrivateKey(PrivateKey privateKey) {
        return OpenSSLKey.fromPrivateKey(privateKey);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.org.conscrypt.OpenSSLBaseDHKeyAgreement
    public OpenSSLKey convertPublicKey(PublicKey publicKey) {
        return OpenSSLKey.fromPublicKey(publicKey);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.org.conscrypt.OpenSSLBaseDHKeyAgreement
    public int getOutputSize(OpenSSLKey openSSLKey) {
        return (NativeCrypto.EC_GROUP_get_degree(new NativeRef.EC_GROUP(NativeCrypto.EC_KEY_get1_group(openSSLKey.getNativeRef()))) + 7) / 8;
    }
}
