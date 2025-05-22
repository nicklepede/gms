package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.BleDevice;
import defpackage.atzr;
import defpackage.bink;
import defpackage.binm;
import defpackage.biox;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class ClaimBleDeviceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new biox();
    public final String a;
    public final BleDevice b;
    public final binm c;

    public ClaimBleDeviceRequest(String str, BleDevice bleDevice, binm binmVar) {
        this.a = str;
        this.b = bleDevice;
        this.c = binmVar;
    }

    public final String toString() {
        return String.format("ClaimBleDeviceRequest{%s %s}", this.a, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.t(parcel, 2, this.b, i, false);
        binm binmVar = this.c;
        atzr.D(parcel, 3, binmVar == null ? null : binmVar.asBinder());
        atzr.c(parcel, a);
    }

    public ClaimBleDeviceRequest(String str, BleDevice bleDevice, IBinder iBinder) {
        binm binkVar;
        this.a = str;
        this.b = bleDevice;
        if (iBinder == null) {
            binkVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IStatusCallback");
            binkVar = queryLocalInterface instanceof binm ? (binm) queryLocalInterface : new bink(iBinder);
        }
        this.c = binkVar;
    }
}
