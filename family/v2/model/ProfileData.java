package com.google.android.gms.family.v2.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.bcgg;
import defpackage.ekvl;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class ProfileData implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new bcgg();
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public BirthdayData f;

    public ProfileData() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeParcelable(this.f, i);
    }

    public ProfileData(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        String readString = parcel.readString();
        ekvl.y(readString);
        this.e = readString;
        this.f = (BirthdayData) parcel.readParcelable(BirthdayData.class.getClassLoader());
    }
}
