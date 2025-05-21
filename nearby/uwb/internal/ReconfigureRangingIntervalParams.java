package com.google.android.gms.nearby.uwb.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.crpw;
import defpackage.crpy;
import defpackage.crqs;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class ReconfigureRangingIntervalParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new crqs();
    public crpy a;
    public int b;

    public ReconfigureRangingIntervalParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ReconfigureRangingIntervalParams) {
            ReconfigureRangingIntervalParams reconfigureRangingIntervalParams = (ReconfigureRangingIntervalParams) obj;
            if (arwb.b(this.a, reconfigureRangingIntervalParams.a) && arwb.b(Integer.valueOf(this.b), Integer.valueOf(reconfigureRangingIntervalParams.b))) {
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
        int a = arxc.a(parcel);
        arxc.D(parcel, 1, this.a.asBinder());
        arxc.o(parcel, 2, this.b);
        arxc.c(parcel, a);
    }

    public ReconfigureRangingIntervalParams(IBinder iBinder, int i) {
        crpy crpwVar;
        if (iBinder == null) {
            crpwVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.uwb.internal.IResultListener");
            crpwVar = queryLocalInterface instanceof crpy ? (crpy) queryLocalInterface : new crpw(iBinder);
        }
        this.a = crpwVar;
        this.b = i;
    }
}
