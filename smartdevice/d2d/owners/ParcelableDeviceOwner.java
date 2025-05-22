package com.google.android.gms.smartdevice.d2d.owners;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import defpackage.dfye;
import defpackage.dwiw;
import defpackage.ekus;
import defpackage.ekvl;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class ParcelableDeviceOwner implements Parcelable {
    public static final Parcelable.Creator CREATOR = new dfye();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Bitmap e;
    public boolean f;

    public ParcelableDeviceOwner(dwiw dwiwVar, Bitmap bitmap) {
        this.f = true;
        this.a = dwiwVar.c;
        this.b = dwiwVar.b;
        this.c = dwiwVar.d;
        this.d = dwiwVar.e;
        this.e = bitmap;
    }

    public final BootstrapAccount a() {
        return new BootstrapAccount(this.a, "com.google");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParcelableDeviceOwner)) {
            return false;
        }
        ParcelableDeviceOwner parcelableDeviceOwner = (ParcelableDeviceOwner) obj;
        return (ekus.a(this.a, parcelableDeviceOwner.a) && ekus.a(this.b, parcelableDeviceOwner.b) && ekus.a(this.c, parcelableDeviceOwner.c) && ekus.a(this.d, parcelableDeviceOwner.d) && this.f == parcelableDeviceOwner.f && (bitmap = this.e) != null && (bitmap2 = parcelableDeviceOwner.e) != null) ? bitmap.sameAs(bitmap2) : this.e == parcelableDeviceOwner.e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeParcelable(this.e, i);
        parcel.writeInt(this.f ? 1 : 0);
    }

    public ParcelableDeviceOwner(Parcel parcel) {
        this.f = true;
        String readString = parcel.readString();
        ekvl.y(readString);
        this.a = readString;
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.f = parcel.readInt() == 1;
    }
}
