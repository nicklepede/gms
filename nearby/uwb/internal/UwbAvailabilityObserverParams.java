package com.google.android.gms.nearby.uwb.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.crqc;
import defpackage.crqe;
import defpackage.crqx;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class UwbAvailabilityObserverParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new crqx();
    public crqe a;

    public UwbAvailabilityObserverParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UwbAvailabilityObserverParams) {
            return arwb.b(this.a, ((UwbAvailabilityObserverParams) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.D(parcel, 1, this.a.asBinder());
        arxc.c(parcel, a);
    }

    public UwbAvailabilityObserverParams(IBinder iBinder) {
        crqe crqcVar;
        if (iBinder == null) {
            crqcVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.uwb.internal.IUwbAvailabilityObserver");
            crqcVar = queryLocalInterface instanceof crqe ? (crqe) queryLocalInterface : new crqc(iBinder);
        }
        this.a = crqcVar;
    }
}
