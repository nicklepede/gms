package com.google.android.gms.org.conscrypt;

import java.security.InvalidParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class OpenSslMlDsaKeyPairGenerator extends KeyPairGenerator {
    private static final String ALGORITHM = "ML-DSA";

    public OpenSslMlDsaKeyPairGenerator() {
        super(ALGORITHM);
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        byte[] bArr = new byte[32];
        NativeCrypto.RAND_bytes(bArr);
        return new KeyPair(new OpenSslMlDsaPublicKey(NativeCrypto.MLDSA65_public_key_from_seed(bArr)), new OpenSslMlDsaPrivateKey(bArr));
    }

    @Override // java.security.KeyPairGenerator
    public void initialize(int i) {
        if (i != -1) {
            throw new InvalidParameterException("ML-DSA only supports -1 for bits");
        }
    }
}
