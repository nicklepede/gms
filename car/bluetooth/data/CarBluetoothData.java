package com.google.android.gms.car.bluetooth.data;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.amzj;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public abstract class CarBluetoothData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new amzj();

    public abstract BluetoothDevice a();

    public abstract boolean b();

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(a(), i);
        parcel.writeByte(b() ? (byte) 1 : (byte) 0);
    }
}
