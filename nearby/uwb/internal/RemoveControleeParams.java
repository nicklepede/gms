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
import defpackage.crqt;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class RemoveControleeParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new crqt();
    public crpy a;
    public UwbAddressParams b;

    public RemoveControleeParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RemoveControleeParams) {
            RemoveControleeParams removeControleeParams = (RemoveControleeParams) obj;
            if (arwb.b(this.a, removeControleeParams.a) && arwb.b(this.b, removeControleeParams.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        crpy crpyVar = this.a;
        arxc.D(parcel, 1, crpyVar == null ? null : crpyVar.asBinder());
        arxc.t(parcel, 2, this.b, i, false);
        arxc.c(parcel, a);
    }

    public RemoveControleeParams(IBinder iBinder, UwbAddressParams uwbAddressParams) {
        crpy crpwVar;
        if (iBinder == null) {
            crpwVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.uwb.internal.IResultListener");
            crpwVar = queryLocalInterface instanceof crpy ? (crpy) queryLocalInterface : new crpw(iBinder);
        }
        this.a = crpwVar;
        this.b = uwbAddressParams;
    }
}
