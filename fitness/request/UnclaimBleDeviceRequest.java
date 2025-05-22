package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.bink;
import defpackage.binm;
import defpackage.biqk;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class UnclaimBleDeviceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new biqk();
    public final String a;
    public final binm b;

    public UnclaimBleDeviceRequest(String str, binm binmVar) {
        this.a = str;
        this.b = binmVar;
    }

    public final String toString() {
        return String.format("UnclaimBleDeviceRequest{%s}", this.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 2, str, false);
        binm binmVar = this.b;
        atzr.D(parcel, 3, binmVar == null ? null : binmVar.asBinder());
        atzr.c(parcel, a);
    }

    public UnclaimBleDeviceRequest(String str, IBinder iBinder) {
        binm binkVar;
        this.a = str;
        if (iBinder == null) {
            binkVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IStatusCallback");
            binkVar = queryLocalInterface instanceof binm ? (binm) queryLocalInterface : new bink(iBinder);
        }
        this.b = binkVar;
    }
}
