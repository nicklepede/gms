package com.google.android.gms.autofill.data;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.adsj;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class AutoValue_Snackbar extends C$AutoValue_Snackbar {
    public static final Parcelable.Creator CREATOR = new adsj();

    public AutoValue_Snackbar(String str, String str2, Intent intent, int i) {
        super(str, str2, intent, i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
        int i2 = this.d;
        parcel.writeString(i2 != 2 ? i2 != 3 ? "UNRECOGNIZED" : "VIRTUAL_CARD_FILL" : "UNKNOWN_USE_CASE");
    }
}
