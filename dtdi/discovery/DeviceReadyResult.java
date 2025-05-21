package com.google.android.gms.dtdi.discovery;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.azes;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class DeviceReadyResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new azes();
    public final IBinder a;
    public final int b;

    public DeviceReadyResult(IBinder iBinder, int i) {
        fvbo.f(iBinder, "internalToken");
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
        return fvbo.n(this.a, deviceReadyResult.a) && this.b == deviceReadyResult.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "DeviceReadyResult(internalToken=" + this.a + ", readyStatus=" + this.b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fvbo.f(parcel, "dest");
        IBinder iBinder = this.a;
        int a = arxc.a(parcel);
        arxc.D(parcel, 1, iBinder);
        arxc.o(parcel, 2, this.b);
        arxc.c(parcel, a);
    }
}
