package com.google.android.gms.ads.social;

import android.content.Context;
import android.content.pm.PackageManager;
import defpackage.assx;
import java.util.UUID;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class u {
    static boolean a(Context context, String str) {
        if (str != null) {
            try {
                if (assx.b(context).f(str, 0) != null) {
                    return true;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return false;
    }

    static boolean b(Context context, String str) {
        try {
            return com.google.android.gms.ads.identifier.settings.b.c(context).f(assx.b(context).e(str, 0).uid).equals(new UUID(0L, 0L).toString());
        } catch (PackageManager.NameNotFoundException unused) {
            int i = com.google.android.gms.ads.internal.util.c.a;
            com.google.android.gms.ads.internal.util.client.h.k("Name not found.");
            return false;
        }
    }
}
