package com.google.android.gms.wallet.firstparty.bootstrap;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dipq;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class PaymentMethodsWidgetOptions extends BaseWidgetOptions {
    public static final Parcelable.Creator CREATOR = new dipq();
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
