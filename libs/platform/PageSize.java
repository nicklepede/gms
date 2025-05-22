package com.google.android.gms.libs.platform;

import android.util.Log;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class PageSize {
    public static long a() {
        try {
            System.loadLibrary("gmscore");
            return systemPageSize();
        } catch (SecurityException | UnsatisfiedLinkError e) {
            Log.w("GmsCorePageSize", String.format("Unable to load and call the method from the native lib %s", "gmscore"), e);
            return -1L;
        }
    }

    private static native long systemPageSize();
}
