package com.google.android.gms.smartdevice.d2d.owners;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import defpackage.ddmz;
import defpackage.dtyk;
import defpackage.eihn;
import defpackage.eiig;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class ParcelableDeviceOwner implements Parcelable {
    public static final Parcelable.Creator CREATOR = new ddmz();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Bitmap e;
    public boolean f;

    public ParcelableDeviceOwner(dtyk dtykVar, Bitmap bitmap) {
        this.f = true;
        this.a = dtykVar.c;
        this.b = dtykVar.b;
        this.c = dtykVar.d;
        this.d = dtykVar.e;
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
        return (eihn.a(this.a, parcelableDeviceOwner.a) && eihn.a(this.b, parcelableDeviceOwner.b) && eihn.a(this.c, parcelableDeviceOwner.c) && eihn.a(this.d, parcelableDeviceOwner.d) && this.f == parcelableDeviceOwner.f && (bitmap = this.e) != null && (bitmap2 = parcelableDeviceOwner.e) != null) ? bitmap.sameAs(bitmap2) : this.e == parcelableDeviceOwner.e;
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
        eiig.x(readString);
        this.a = readString;
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.f = parcel.readInt() == 1;
    }
}
