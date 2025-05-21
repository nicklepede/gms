package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.dewz;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class GetAvailableOtherPaymentMethodsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dewz();
    final int[] a;
    final AvailableOtherPaymentMethodsWithInfo[] b;

    public GetAvailableOtherPaymentMethodsResponse(int[] iArr, AvailableOtherPaymentMethodsWithInfo[] availableOtherPaymentMethodsWithInfoArr) {
        this.a = iArr;
        this.b = availableOtherPaymentMethodsWithInfoArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int[] iArr = this.a;
        int a = arxc.a(parcel);
        arxc.p(parcel, 1, iArr, false);
        arxc.J(parcel, 2, this.b, i);
        arxc.c(parcel, a);
    }
}
