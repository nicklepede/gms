package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ccof;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class ReplaySignal implements Parcelable {
    public static final Parcelable.Creator CREATOR = new ccof();
    private final Class a;
    private final Parcelable b;
    private final long c;

    public ReplaySignal(Parcelable parcelable, long j, Class cls) {
        this.b = parcelable;
        this.c = j;
        this.a = cls;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.a);
        parcel.writeParcelable(this.b, 0);
        parcel.writeLong(this.c);
    }
}
