package com.google.android.gms.ads.nonagon.util.logging.cui;

import defpackage.eqgb;
import defpackage.eqgc;
import defpackage.eqgl;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class j {
    public static void a(eqgl eqglVar, k kVar, b bVar) {
        b(eqglVar, kVar, bVar, false);
    }

    public static void b(eqgl eqglVar, k kVar, b bVar, boolean z) {
        if (((Boolean) com.google.android.gms.ads.internal.flag.h.c.d()).booleanValue()) {
            eqgc.t(eqgb.h(eqglVar), new h(kVar, bVar, z), com.google.android.gms.ads.internal.util.future.e.d);
        }
    }

    public static void c(eqgl eqglVar, b bVar) {
        if (((Boolean) com.google.android.gms.ads.internal.flag.h.c.d()).booleanValue()) {
            eqgc.t(eqgb.h(eqglVar), new g(bVar), com.google.android.gms.ads.internal.util.future.e.d);
        }
    }
}
