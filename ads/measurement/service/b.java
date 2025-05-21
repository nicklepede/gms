package com.google.android.gms.ads.measurement.service;

import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.h;
import defpackage.bxhc;
import defpackage.cdqa;
import defpackage.cdwd;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class b extends c implements bxhc {
    public static final Object a = new Object();
    public static b b;
    final cdwd c;
    private final cdqa d;

    public b(cdwd cdwdVar, cdqa cdqaVar) {
        this.c = cdwdVar;
        this.d = cdqaVar;
    }

    @Override // com.google.android.gms.ads.measurement.service.d
    public final void a(Bundle bundle) {
        int i = com.google.android.gms.ads.internal.util.c.a;
        h.d("Reporting in-app purchase data in gmp conversion tracking service.");
        String string = bundle.getString("ap");
        bundle.remove("ap");
        this.d.aK().f(new a(this, bundle, string));
    }
}
