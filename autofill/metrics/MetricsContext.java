package com.google.android.gms.autofill.metrics;

import android.os.Parcelable;
import android.view.autofill.AutofillId;
import defpackage.afmu;
import defpackage.afrk;
import defpackage.eiid;
import defpackage.eitj;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public interface MetricsContext extends Parcelable {

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public interface FillContext extends Parcelable {
        eiid a();

        eiid b();

        eitj c();

        boolean d();

        boolean e();

        boolean f();
    }

    int a(AutofillId autofillId);

    int b();

    int c();

    afmu d();

    afrk e();

    eitj f();

    void g(FillContext fillContext);
}
