package com.google.android.gms.libs.platform;

import android.util.Log;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
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
