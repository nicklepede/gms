package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dkps;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class PaymentMethodToken extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dkps();
    public int a;
    public String b;

    public PaymentMethodToken() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 2, this.a);
        atzr.v(parcel, 3, this.b, false);
        atzr.c(parcel, a);
    }

    public PaymentMethodToken(int i, String str) {
        this.a = i;
        this.b = str;
    }
}
