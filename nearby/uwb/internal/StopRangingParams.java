package com.google.android.gms.nearby.uwb.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.ctzb;
import defpackage.ctzd;
import defpackage.cuaa;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class StopRangingParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cuaa();
    public ctzd a;

    public StopRangingParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StopRangingParams) {
            return atyq.b(this.a, ((StopRangingParams) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        ctzd ctzdVar = this.a;
        atzr.D(parcel, 1, ctzdVar == null ? null : ctzdVar.asBinder());
        atzr.c(parcel, a);
    }

    public StopRangingParams(IBinder iBinder) {
        ctzd ctzbVar;
        if (iBinder == null) {
            ctzbVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.uwb.internal.IResultListener");
            ctzbVar = queryLocalInterface instanceof ctzd ? (ctzd) queryLocalInterface : new ctzb(iBinder);
        }
        this.a = ctzbVar;
    }
}
