package com.google.android.gms.autofill.data;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.afsp;
import defpackage.aftn;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class AutoValue_MaskedPaymentCardIntentData extends C$AutoValue_MaskedPaymentCardIntentData {
    public static final Parcelable.Creator CREATOR = new afsp();

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
        parcel.writeString(aftn.a(this.c));
        parcel.writeString(this.b);
    }
}
