package com.google.android.gms.nearby.uwb.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.crpp;
import defpackage.crpr;
import defpackage.crqi;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class IsAvailableParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new crqi();
    public crpr a;

    public IsAvailableParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IsAvailableParams) {
            return arwb.b(this.a, ((IsAvailableParams) obj).a);
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

    public IsAvailableParams(IBinder iBinder) {
        crpr crppVar;
        if (iBinder == null) {
            crppVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.uwb.internal.IBooleanResultListener");
            crppVar = queryLocalInterface instanceof crpr ? (crpr) queryLocalInterface : new crpp(iBinder);
        }
        this.a = crppVar;
    }
}
