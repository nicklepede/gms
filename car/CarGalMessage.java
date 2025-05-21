package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.akqf;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class CarGalMessage implements Parcelable {
    public static final Parcelable.Creator CREATOR = new akqf();
    public long a;
    public int b;
    public int c;
    public byte[] d;
    public int e;
    public int f;
    public boolean g;

    public CarGalMessage() {
        a(0L, 0, 0, null, 0, 0, false);
    }

    public final void a(long j, int i, int i2, byte[] bArr, int i3, int i4, boolean z) {
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = bArr;
        this.e = i3;
        this.f = i4;
        this.g = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        if (this.d != null) {
            parcel.writeInt(this.f);
            int i2 = this.f;
            if (i2 > 0) {
                parcel.writeByteArray(this.d, this.e, i2);
            }
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.g ? 1 : 0);
    }

    public CarGalMessage(Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.e = 0;
        int readInt = parcel.readInt();
        this.f = readInt;
        if (readInt > 0) {
            byte[] bArr = new byte[readInt];
            this.d = bArr;
            parcel.readByteArray(bArr);
        } else {
            this.d = null;
        }
        this.g = parcel.readInt() != 0;
    }
}
