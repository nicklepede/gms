package com.google.android.gms.ads.nonagon.util.logging.cui;

import android.content.Context;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final /* synthetic */ class a {
    public static b a(Context context, int i) {
        boolean booleanValue;
        if (n.a()) {
            int i2 = i - 2;
            if (i2 != 20) {
                switch (i2) {
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        booleanValue = ((Boolean) com.google.android.gms.ads.internal.flag.h.d.d()).booleanValue();
                        break;
                    case 5:
                        booleanValue = ((Boolean) com.google.android.gms.ads.internal.flag.h.b.d()).booleanValue();
                        break;
                    case 6:
                    case 7:
                    case 8:
                        booleanValue = ((Boolean) com.google.android.gms.ads.internal.flag.h.c.d()).booleanValue();
                        break;
                }
            } else {
                booleanValue = ((Boolean) com.google.android.gms.ads.internal.flag.h.e.d()).booleanValue();
            }
            if (booleanValue) {
                return new d(context, i);
            }
        }
        return new s();
    }
}
