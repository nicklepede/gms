package com.google.android.gms.org.conscrypt;

import java.security.InvalidParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class OpenSslSlhDsaKeyPairGenerator extends KeyPairGenerator {
    private static final String ALGORITHM = "SLH-DSA-SHA2-128S";

    public OpenSslSlhDsaKeyPairGenerator() {
        super(ALGORITHM);
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        byte[] bArr = new byte[64];
        byte[] bArr2 = new byte[32];
        NativeCrypto.SLHDSA_SHA2_128S_generate_key(bArr2, bArr);
        return new KeyPair(new OpenSslSlhDsaPublicKey(bArr2), new OpenSslSlhDsaPrivateKey(bArr));
    }

    @Override // java.security.KeyPairGenerator
    public void initialize(int i) {
        if (i != -1) {
            throw new InvalidParameterException("SLH-DSA only supports -1 for bits");
        }
    }
}
