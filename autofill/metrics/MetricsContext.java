package com.google.android.gms.autofill.metrics;

import android.os.Parcelable;
import android.view.autofill.AutofillId;
import defpackage.ahng;
import defpackage.ahrw;
import defpackage.ekvi;
import defpackage.elgo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public interface MetricsContext extends Parcelable {

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public interface FillContext extends Parcelable {
        ekvi a();

        ekvi b();

        elgo c();

        boolean d();

        boolean e();

        boolean f();
    }

    int a(AutofillId autofillId);

    int b();

    int c();

    ahng d();

    ahrw e();

    elgo f();

    void g(FillContext fillContext);
}
