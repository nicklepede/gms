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
import defpackage.ctzx;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class ReconfigureRangingIntervalParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctzx();
    public ctzd a;
    public int b;

    public ReconfigureRangingIntervalParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ReconfigureRangingIntervalParams) {
            ReconfigureRangingIntervalParams reconfigureRangingIntervalParams = (ReconfigureRangingIntervalParams) obj;
            if (atyq.b(this.a, reconfigureRangingIntervalParams.a) && atyq.b(Integer.valueOf(this.b), Integer.valueOf(reconfigureRangingIntervalParams.b))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.D(parcel, 1, this.a.asBinder());
        atzr.o(parcel, 2, this.b);
        atzr.c(parcel, a);
    }

    public ReconfigureRangingIntervalParams(IBinder iBinder, int i) {
        ctzd ctzbVar;
        if (iBinder == null) {
            ctzbVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.uwb.internal.IResultListener");
            ctzbVar = queryLocalInterface instanceof ctzd ? (ctzd) queryLocalInterface : new ctzb(iBinder);
        }
        this.a = ctzbVar;
        this.b = i;
    }
}
