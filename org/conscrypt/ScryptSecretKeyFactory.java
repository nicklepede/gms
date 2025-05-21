package com.google.android.gms.org.conscrypt;

import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactorySpi;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class ScryptSecretKeyFactory extends SecretKeyFactorySpi {

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    class NotImplementedException extends RuntimeException {
        private static final long serialVersionUID = -7755435858585859108L;

        public NotImplementedException() {
            super("Not implemented");
        }
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    class ScryptKey implements SecretKey {
        private static final long serialVersionUID = 2024924811854189128L;
        private final byte[] key;

        public ScryptKey(byte[] bArr) {
            this.key = bArr;
        }

        @Override // java.security.Key
        public String getAlgorithm() {
            return "SCRYPT";
        }

        @Override // java.security.Key
        public byte[] getEncoded() {
            return this.key;
        }

        @Override // java.security.Key
        public String getFormat() {
            return "RAW";
        }
    }

    private Object getValue(KeySpec keySpec, String str) {
        return keySpec.getClass().getMethod(str, null).invoke(keySpec, null);
    }

    @Override // javax.crypto.SecretKeyFactorySpi
    protected SecretKey engineGenerateSecret(KeySpec keySpec) {
        char[] cArr;
        byte[] bArr;
        int intValue;
        int intValue2;
        int intValue3;
        int intValue4;
        if (keySpec instanceof ScryptKeySpec) {
            ScryptKeySpec scryptKeySpec = (ScryptKeySpec) keySpec;
            cArr = scryptKeySpec.getPassword();
            bArr = scryptKeySpec.getSalt();
            intValue = scryptKeySpec.getCostParameter();
            intValue2 = scryptKeySpec.getBlockSize();
            intValue3 = scryptKeySpec.getParallelizationParameter();
            intValue4 = scryptKeySpec.getKeyLength();
        } else {
            try {
                cArr = (char[]) getValue(keySpec, "getPassword");
                bArr = (byte[]) getValue(keySpec, "getSalt");
                intValue = ((Integer) getValue(keySpec, "getCostParameter")).intValue();
                intValue2 = ((Integer) getValue(keySpec, "getBlockSize")).intValue();
                intValue3 = ((Integer) getValue(keySpec, "getParallelizationParameter")).intValue();
                intValue4 = ((Integer) getValue(keySpec, "getKeyLength")).intValue();
            } catch (Exception e) {
                throw new InvalidKeySpecException("Not a valid scrypt KeySpec", e);
            }
        }
        int i = intValue3;
        int i2 = intValue2;
        int i3 = intValue;
        byte[] bArr2 = bArr;
        if (intValue4 % 8 == 0) {
            return new ScryptKey(NativeCrypto.Scrypt_generate_key(new String(cArr).getBytes(StandardCharsets.UTF_8), bArr2, i3, i2, i, intValue4 / 8));
        }
        throw new InvalidKeySpecException("Cannot produce fractional-byte outputs");
    }

    @Override // javax.crypto.SecretKeyFactorySpi
    protected KeySpec engineGetKeySpec(SecretKey secretKey, Class cls) {
        if (secretKey == null) {
            throw new InvalidKeySpecException("Null KeySpec");
        }
        throw new NotImplementedException();
    }

    @Override // javax.crypto.SecretKeyFactorySpi
    protected SecretKey engineTranslateKey(SecretKey secretKey) {
        if (secretKey == null) {
            throw new InvalidKeyException("Null SecretKey");
        }
        throw new NotImplementedException();
    }
}
