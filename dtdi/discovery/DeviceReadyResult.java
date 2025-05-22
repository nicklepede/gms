package com.google.android.gms.dtdi.discovery;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.bbiu;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class DeviceReadyResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bbiu();
    public final IBinder a;
    public final int b;

    public DeviceReadyResult(IBinder iBinder, int i) {
        fxxm.f(iBinder, "internalToken");
        this.a = iBinder;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceReadyResult)) {
            return false;
        }
        DeviceReadyResult deviceReadyResult = (DeviceReadyResult) obj;
        return fxxm.n(this.a, deviceReadyResult.a) && this.b == deviceReadyResult.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "DeviceReadyResult(internalToken=" + this.a + ", readyStatus=" + this.b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fxxm.f(parcel, "dest");
        IBinder iBinder = this.a;
        int a = atzr.a(parcel);
        atzr.D(parcel, 1, iBinder);
        atzr.o(parcel, 2, this.b);
        atzr.c(parcel, a);
    }
}
