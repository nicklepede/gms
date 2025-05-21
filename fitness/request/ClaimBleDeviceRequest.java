package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.BleDevice;
import defpackage.arxc;
import defpackage.bgiu;
import defpackage.bgiw;
import defpackage.bgkh;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class ClaimBleDeviceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bgkh();
    public final String a;
    public final BleDevice b;
    public final bgiw c;

    public ClaimBleDeviceRequest(String str, BleDevice bleDevice, bgiw bgiwVar) {
        this.a = str;
        this.b = bleDevice;
        this.c = bgiwVar;
    }

    public final String toString() {
        return String.format("ClaimBleDeviceRequest{%s %s}", this.a, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.t(parcel, 2, this.b, i, false);
        bgiw bgiwVar = this.c;
        arxc.D(parcel, 3, bgiwVar == null ? null : bgiwVar.asBinder());
        arxc.c(parcel, a);
    }

    public ClaimBleDeviceRequest(String str, BleDevice bleDevice, IBinder iBinder) {
        bgiw bgiuVar;
        this.a = str;
        this.b = bleDevice;
        if (iBinder == null) {
            bgiuVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IStatusCallback");
            bgiuVar = queryLocalInterface instanceof bgiw ? (bgiw) queryLocalInterface : new bgiu(iBinder);
        }
        this.c = bgiuVar;
    }
}
