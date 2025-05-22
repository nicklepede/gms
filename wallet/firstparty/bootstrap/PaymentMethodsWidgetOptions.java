package com.google.android.gms.wallet.firstparty.bootstrap;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dlbb;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class PaymentMethodsWidgetOptions extends BaseWidgetOptions {
    public static final Parcelable.Creator CREATOR = new dlbb();
    public boolean a;

    public PaymentMethodsWidgetOptions() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
    }

    public PaymentMethodsWidgetOptions(Parcel parcel) {
        this.a = parcel.readInt() == 1;
    }
}
