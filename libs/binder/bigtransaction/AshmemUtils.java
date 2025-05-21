package com.google.android.gms.libs.binder.bigtransaction;

import android.util.Log;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class AshmemUtils {
    static {
        try {
            System.loadLibrary("ashmem_utils_jni");
        } catch (UnsatisfiedLinkError unused) {
            Log.e("AshmemUtils", "error loading ashmem_utils_jni");
        }
    }

    public static final native int ashmemCreate(String str, int i);

    public static final native byte[] readFromFileDescriptor(int i, int i2);

    public static final native boolean writeToFileDescriptor(byte[] bArr, int i);
}
