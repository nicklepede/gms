package com.google.android.gms.car.senderprotocol;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.alde;
import defpackage.alhn;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public abstract class Channel$FlattenedChannel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new alde();

    public abstract int a();

    public abstract int b();

    public abstract int c();

    public abstract alhn d();

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
