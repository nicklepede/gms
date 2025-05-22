package com.google.android.gms.wallet.im;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dlcz;
import defpackage.dlda;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class InstrumentManagerResult implements Parcelable {
    public String b;
    public long c;
    public byte[] d;
    public byte[] e;
    public static final InstrumentManagerResult a = a().a;
    public static final Parcelable.Creator CREATOR = new dlcz();

    private InstrumentManagerResult() {
    }

    public static dlda a() {
        return new dlda(new InstrumentManagerResult());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeLong(this.c);
        parcel.writeByteArray(this.d);
        parcel.writeByteArray(this.e);
    }

    public InstrumentManagerResult(Parcel parcel) {
        this.b = parcel.readString();
        this.c = parcel.readLong();
        this.d = parcel.createByteArray();
        this.e = parcel.createByteArray();
    }
}
