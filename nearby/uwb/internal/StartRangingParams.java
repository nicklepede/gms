package com.google.android.gms.nearby.uwb.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.crpt;
import defpackage.crpv;
import defpackage.crpw;
import defpackage.crpy;
import defpackage.crqu;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class StartRangingParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new crqu();
    public crpy a;
    public RangingParametersParams b;
    public crpv c;

    public StartRangingParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StartRangingParams) {
            StartRangingParams startRangingParams = (StartRangingParams) obj;
            if (arwb.b(this.a, startRangingParams.a) && arwb.b(this.b, startRangingParams.b) && arwb.b(this.c, startRangingParams.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        crpy crpyVar = this.a;
        arxc.D(parcel, 1, crpyVar == null ? null : crpyVar.asBinder());
        arxc.t(parcel, 2, this.b, i, false);
        arxc.D(parcel, 3, this.c.asBinder());
        arxc.c(parcel, a);
    }

    public StartRangingParams(IBinder iBinder, RangingParametersParams rangingParametersParams, IBinder iBinder2) {
        crpy crpwVar;
        crpv crpvVar = null;
        if (iBinder == null) {
            crpwVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.uwb.internal.IResultListener");
            crpwVar = queryLocalInterface instanceof crpy ? (crpy) queryLocalInterface : new crpw(iBinder);
        }
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.uwb.internal.IRangingSessionCallback");
            crpvVar = queryLocalInterface2 instanceof crpv ? (crpv) queryLocalInterface2 : new crpt(iBinder2);
        }
        this.a = crpwVar;
        this.b = rangingParametersParams;
        this.c = crpvVar;
    }
}
