package com.google.android.gms.ads.nonagon.util;

import com.google.android.gms.ads.internal.client.AdErrorParcel;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class b {
    public static AdErrorParcel a(int i) {
        return b(i, null);
    }

    public static AdErrorParcel b(int i, String str) {
        int i2 = i - 1;
        int i3 = 1;
        if (str == null) {
            if (i == 0) {
                throw null;
            }
            str = i2 != 1 ? i2 != 2 ? "Internal error." : "No fill." : "Invalid request.";
        }
        String str2 = str;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            i3 = 0;
        } else if (i2 != 1) {
            if (i2 != 2) {
                throw new AssertionError("Unknown SdkError: ".concat(i != 1 ? i != 2 ? "NO_FILL" : "INVALID_REQUEST" : "INTERNAL_ERROR"));
            }
            i3 = 3;
        }
        return new AdErrorParcel(i3, str2, "com.google.android.gms.ads", null, null);
    }
}
