package com.google.android.gms.nearby.uwb.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.ctyy;
import defpackage.ctza;
import defpackage.ctzb;
import defpackage.ctzd;
import defpackage.ctzz;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class StartRangingParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctzz();
    public ctzd a;
    public RangingParametersParams b;
    public ctza c;

    public StartRangingParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StartRangingParams) {
            StartRangingParams startRangingParams = (StartRangingParams) obj;
            if (atyq.b(this.a, startRangingParams.a) && atyq.b(this.b, startRangingParams.b) && atyq.b(this.c, startRangingParams.c)) {
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
        int a = atzr.a(parcel);
        ctzd ctzdVar = this.a;
        atzr.D(parcel, 1, ctzdVar == null ? null : ctzdVar.asBinder());
        atzr.t(parcel, 2, this.b, i, false);
        atzr.D(parcel, 3, this.c.asBinder());
        atzr.c(parcel, a);
    }

    public StartRangingParams(IBinder iBinder, RangingParametersParams rangingParametersParams, IBinder iBinder2) {
        ctzd ctzbVar;
        ctza ctzaVar = null;
        if (iBinder == null) {
            ctzbVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.uwb.internal.IResultListener");
            ctzbVar = queryLocalInterface instanceof ctzd ? (ctzd) queryLocalInterface : new ctzb(iBinder);
        }
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.uwb.internal.IRangingSessionCallback");
            ctzaVar = queryLocalInterface2 instanceof ctza ? (ctza) queryLocalInterface2 : new ctyy(iBinder2);
        }
        this.a = ctzbVar;
        this.b = rangingParametersParams;
        this.c = ctzaVar;
    }
}
