package com.google.android.gms.ads.eventattestation;

import android.content.Context;
import com.google.android.gms.ads.eventattestation.internal.u;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class b {
    private static a a;

    public static synchronized a a(Context context) {
        a aVar;
        synchronized (b.class) {
            if (a == null) {
                a = new u(context.getApplicationContext());
            }
            aVar = a;
        }
        return aVar;
    }
}
