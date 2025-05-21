package com.google.android.gms.ads.adinfo;

import android.content.Context;
import defpackage.enss;
import defpackage.otg;
import java.util.concurrent.Callable;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class g {
    public final Context a;
    public otg b;

    public g(Context context) {
        this.b = null;
        this.a = context;
        this.b = new otg(context);
    }

    public static final enss a(final Context context, final int i) {
        return com.google.android.gms.ads.internal.util.future.e.a.submit(new Callable() { // from class: com.google.android.gms.ads.adinfo.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                com.google.android.gms.ads.identifier.settings.b c = com.google.android.gms.ads.identifier.settings.b.c(context);
                int i2 = i;
                return new com.google.android.gms.ads.identifier.c(c.f(i2), c.o(i2));
            }
        });
    }
}
