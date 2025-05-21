package com.google.android.gms.carsetup;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.alos;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class BinderParcel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new alos();
    public final IBinder a;

    public BinderParcel(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.a);
    }
}
