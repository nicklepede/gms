package com.google.android.gms.ads.nonagon.util.logging.cui;

import defpackage.ensi;
import defpackage.ensj;
import defpackage.enss;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class j {
    public static void a(enss enssVar, k kVar, b bVar) {
        b(enssVar, kVar, bVar, false);
    }

    public static void b(enss enssVar, k kVar, b bVar, boolean z) {
        if (((Boolean) com.google.android.gms.ads.internal.flag.h.c.d()).booleanValue()) {
            ensj.t(ensi.h(enssVar), new h(kVar, bVar, z), com.google.android.gms.ads.internal.util.future.e.d);
        }
    }

    public static void c(enss enssVar, b bVar) {
        if (((Boolean) com.google.android.gms.ads.internal.flag.h.c.d()).booleanValue()) {
            ensj.t(ensi.h(enssVar), new g(bVar), com.google.android.gms.ads.internal.util.future.e.d);
        }
    }
}
