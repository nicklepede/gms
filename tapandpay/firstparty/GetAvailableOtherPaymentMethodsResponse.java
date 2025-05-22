package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dhid;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class GetAvailableOtherPaymentMethodsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dhid();
    final int[] a;
    final AvailableOtherPaymentMethodsWithInfo[] b;

    public GetAvailableOtherPaymentMethodsResponse(int[] iArr, AvailableOtherPaymentMethodsWithInfo[] availableOtherPaymentMethodsWithInfoArr) {
        this.a = iArr;
        this.b = availableOtherPaymentMethodsWithInfoArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int[] iArr = this.a;
        int a = atzr.a(parcel);
        atzr.p(parcel, 1, iArr, false);
        atzr.J(parcel, 2, this.b, i);
        atzr.c(parcel, a);
    }
}
