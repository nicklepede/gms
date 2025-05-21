package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.diei;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class PaymentMethodTokenizationParameters extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new diei();
    public int a;
    public final Bundle b;

    public PaymentMethodTokenizationParameters() {
        this.b = new Bundle();
    }

    public final Bundle a() {
        return new Bundle(this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 2, this.a);
        arxc.g(parcel, 3, this.b, false);
        arxc.c(parcel, a);
    }

    public PaymentMethodTokenizationParameters(int i, Bundle bundle) {
        new Bundle();
        this.a = i;
        this.b = bundle;
    }
}
