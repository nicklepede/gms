package com.google.android.gms.ads.appset;

import android.content.Context;
import defpackage.aqtp;
import defpackage.uih;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class a {
    private static a b;
    public final uih a;

    public a(Context context) {
        this.a = new uih(context, aqtp.d);
    }

    public static synchronized a a(Context context) {
        a aVar;
        synchronized (a.class) {
            if (b == null) {
                b = new a(context);
            }
            aVar = b;
        }
        return aVar;
    }
}
