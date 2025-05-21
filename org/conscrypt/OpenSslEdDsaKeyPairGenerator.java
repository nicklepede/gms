package com.google.android.gms.org.conscrypt;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class OpenSslEdDsaKeyPairGenerator extends KeyPairGenerator {
    private static final String ALGORITHM = "EdDSA";

    public OpenSslEdDsaKeyPairGenerator() {
        super(ALGORITHM);
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        byte[] bArr = new byte[32];
        byte[] bArr2 = new byte[64];
        NativeCrypto.ED25519_keypair(bArr, bArr2);
        return new KeyPair(new OpenSslEdDsaPublicKey(bArr), new OpenSslEdDsaPrivateKey(Arrays.copyOf(bArr2, 32)));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, SecureRandom secureRandom) {
        if (i != 255) {
            throw new IllegalArgumentException("EdDSA only supports key size 255");
        }
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        throw new InvalidAlgorithmParameterException("No AlgorithmParameterSpec classes are supported");
    }
}
