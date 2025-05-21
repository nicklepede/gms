package com.google.android.gms.car.bluetooth.data;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.akxy;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public abstract class CarBluetoothData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new akxy();

    public abstract BluetoothDevice a();

    public abstract boolean b();

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(a(), i);
        parcel.writeByte(b() ? (byte) 1 : (byte) 0);
    }
}
