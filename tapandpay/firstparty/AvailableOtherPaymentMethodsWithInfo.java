package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.dewn;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class AvailableOtherPaymentMethodsWithInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dewn();
    final int a;
    final AvailableOtherPaymentMethodInfo b;

    public AvailableOtherPaymentMethodsWithInfo(int i, AvailableOtherPaymentMethodInfo availableOtherPaymentMethodInfo) {
        this.a = i;
        this.b = availableOtherPaymentMethodInfo;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.c(parcel, a);
    }
}
