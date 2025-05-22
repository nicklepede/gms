package com.google.android.gms.ads.measurement.service;

import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.h;
import defpackage.bzps;
import defpackage.cfyy;
import defpackage.cgfd;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class b extends c implements bzps {
    public static final Object a = new Object();
    public static b b;
    final cgfd c;
    private final cfyy d;

    public b(cgfd cgfdVar, cfyy cfyyVar) {
        this.c = cgfdVar;
        this.d = cfyyVar;
    }

    @Override // com.google.android.gms.ads.measurement.service.d
    public final void a(Bundle bundle) {
        int i = com.google.android.gms.ads.internal.util.c.a;
        h.d("Reporting in-app purchase data in gmp conversion tracking service.");
        String string = bundle.getString("ap");
        bundle.remove("ap");
        this.d.aL().f(new a(this, bundle, string));
    }
}
