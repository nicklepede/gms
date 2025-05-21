package com.google.android.gms.autofill.data;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.adsi;
import defpackage.adtg;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class AutoValue_MaskedPaymentCardIntentData extends C$AutoValue_MaskedPaymentCardIntentData {
    public static final Parcelable.Creator CREATOR = new adsi();

    public AutoValue_MaskedPaymentCardIntentData(long j, int i, String str) {
        super(j, i, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeString(adtg.a(this.c));
        parcel.writeString(this.b);
    }
}
