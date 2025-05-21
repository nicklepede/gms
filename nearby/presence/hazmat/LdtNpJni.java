package com.google.android.gms.nearby.presence.hazmat;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class LdtNpJni {
    static {
        System.loadLibrary("ldt_np_jni");
    }

    public static native void closeEncryptCipher(long j);

    public static native long createDecryptionCipher(byte[] bArr, byte[] bArr2);

    public static native long createEncryptionCipher(byte[] bArr);

    public static native int decryptAndVerify(long j, char c, byte[] bArr);

    public static native int encrypt(long j, char c, byte[] bArr);
}
