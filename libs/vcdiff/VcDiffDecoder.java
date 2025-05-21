package com.google.android.gms.libs.vcdiff;

import android.util.Log;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class VcDiffDecoder {
    public static boolean a = false;

    static {
        try {
            System.loadLibrary("vcdiffjni");
            a = true;
        } catch (Throwable th) {
            Log.e("VcDiffDecoder: ", "Unable to load vcdiffjni.so", th);
        }
    }

    public static native byte[] nativeDecoder(byte[] bArr, byte[] bArr2);
}
