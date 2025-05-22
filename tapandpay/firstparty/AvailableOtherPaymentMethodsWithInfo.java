package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dhhr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class AvailableOtherPaymentMethodsWithInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dhhr();
    final int a;
    final AvailableOtherPaymentMethodInfo b;

    public AvailableOtherPaymentMethodsWithInfo(int i, AvailableOtherPaymentMethodInfo availableOtherPaymentMethodInfo) {
        this.a = i;
        this.b = availableOtherPaymentMethodInfo;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.c(parcel, a);
    }
}
