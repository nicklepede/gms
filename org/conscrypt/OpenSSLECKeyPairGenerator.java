package com.google.android.gms.org.conscrypt;

import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.a;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class OpenSSLECKeyPairGenerator extends KeyPairGenerator {
    private static final String ALGORITHM = "EC";
    private static final int DEFAULT_KEY_SIZE = 256;
    private static final Map SIZE_TO_CURVE_NAME;
    private OpenSSLECGroupContext group;

    static {
        HashMap hashMap = new HashMap();
        SIZE_TO_CURVE_NAME = hashMap;
        hashMap.put(Integer.valueOf(AndroidInputTypeSignal.TYPE_TEXT_VARIATION_WEB_PASSWORD), "secp224r1");
        hashMap.put(256, "prime256v1");
        hashMap.put(384, "secp384r1");
        hashMap.put(521, "secp521r1");
    }

    public OpenSSLECKeyPairGenerator() {
        super(ALGORITHM);
    }

    public static void assertCurvesAreValid() {
        ArrayList arrayList = new ArrayList();
        for (String str : SIZE_TO_CURVE_NAME.values()) {
            if (OpenSSLECGroupContext.getCurveByName(str) == null) {
                arrayList.add(str);
            }
        }
        if (arrayList.size() > 0) {
            throw new AssertionError("Invalid curve names: ".concat(String.valueOf(Arrays.toString(arrayList.toArray()))));
        }
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        OpenSSLECGroupContext openSSLECGroupContext = this.group;
        if (openSSLECGroupContext == null) {
            String str = (String) SIZE_TO_CURVE_NAME.get(256);
            OpenSSLECGroupContext curveByName = OpenSSLECGroupContext.getCurveByName(str);
            this.group = curveByName;
            if (curveByName == null) {
                throw new RuntimeException("Curve not recognized: ".concat(String.valueOf(str)));
            }
            openSSLECGroupContext = curveByName;
        }
        OpenSSLKey openSSLKey = new OpenSSLKey(NativeCrypto.EC_KEY_generate_key(openSSLECGroupContext.getNativeRef()));
        return new KeyPair(new OpenSSLECPublicKey(this.group, openSSLKey), new OpenSSLECPrivateKey(this.group, openSSLKey));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, SecureRandom secureRandom) {
        String str = (String) SIZE_TO_CURVE_NAME.get(Integer.valueOf(i));
        if (str == null) {
            throw new InvalidParameterException(a.j(i, "unknown key size "));
        }
        OpenSSLECGroupContext curveByName = OpenSSLECGroupContext.getCurveByName(str);
        if (curveByName == null) {
            throw new InvalidParameterException("unknown curve ".concat(str));
        }
        this.group = curveByName;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        if (algorithmParameterSpec instanceof ECParameterSpec) {
            this.group = OpenSSLECGroupContext.getInstance((ECParameterSpec) algorithmParameterSpec);
            return;
        }
        if (algorithmParameterSpec instanceof ECGenParameterSpec) {
            String name = ((ECGenParameterSpec) algorithmParameterSpec).getName();
            OpenSSLECGroupContext curveByName = OpenSSLECGroupContext.getCurveByName(name);
            if (curveByName != null) {
                this.group = curveByName;
                return;
            }
            throw new InvalidAlgorithmParameterException("unknown curve name: ".concat(String.valueOf(name)));
        }
        throw new InvalidAlgorithmParameterException("parameter must be ECParameterSpec or ECGenParameterSpec");
    }
}
