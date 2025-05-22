package com.google.android.gms.ads.adinfo;

import android.content.Context;
import defpackage.eqgl;
import defpackage.qmj;
import java.util.concurrent.Callable;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class g {
    public final Context a;
    public qmj b;

    public g(Context context) {
        this.b = null;
        this.a = context;
        this.b = new qmj(context);
    }

    public static final eqgl a(final Context context, final int i) {
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
