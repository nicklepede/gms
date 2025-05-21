package com.google.android.gms.family.v2.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.baca;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class BillingSignupData implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new baca();
    public final String a;
    public final String b;

    public BillingSignupData(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }

    public BillingSignupData(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
    }
}
