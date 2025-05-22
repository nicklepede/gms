package com.google.android.gms.org.conscrypt;

import java.lang.reflect.InvocationTargetException;
import java.security.spec.EncodedKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
final class KeySpecUtil {
    private KeySpecUtil() {
    }

    public static KeySpec makeRawKeySpec(byte[] bArr, Class cls) {
        try {
            KeySpec keySpec = (KeySpec) cls.getConstructor(byte[].class).newInstance(bArr);
            if (((EncodedKeySpec) keySpec).getFormat().equalsIgnoreCase("raw")) {
                return keySpec;
            }
            throw new InvalidKeySpecException("EncodedKeySpec class must be raw format");
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new InvalidKeySpecException("Can't process KeySpec class ".concat(String.valueOf(cls.getName())), e);
        }
    }
}
