package com.google.android.gms.car.senderprotocol;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.anep;
import defpackage.aniy;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public abstract class Channel$FlattenedChannel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new anep();

    public abstract int a();

    public abstract int b();

    public abstract int c();

    public abstract aniy d();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(a());
        parcel.writeInt(b());
        parcel.writeInt(c());
        parcel.writeString(d().name());
    }
}
