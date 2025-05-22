package com.google.android.gms.family.v2.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.bcfx;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class BirthdayData implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new bcfx();
    public int a;
    public int b;

    public BirthdayData() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
    }

    public BirthdayData(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
    }
}
