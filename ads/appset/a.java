package com.google.android.gms.ads.appset;

import android.content.Context;
import defpackage.aswe;
import defpackage.weg;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class a {
    private static a b;
    public final weg a;

    public a(Context context) {
        this.a = new weg(context, aswe.d);
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
