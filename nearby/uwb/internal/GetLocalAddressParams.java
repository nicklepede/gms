package com.google.android.gms.nearby.uwb.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.crpo;
import defpackage.crpz;
import defpackage.crqb;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class GetLocalAddressParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new crpo();
    public crqb a;

    public GetLocalAddressParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetLocalAddressParams) {
            return arwb.b(this.a, ((GetLocalAddressParams) obj).a);
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

    public GetLocalAddressParams(IBinder iBinder) {
        crqb crpzVar;
        if (iBinder == null) {
            crpzVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.uwb.internal.IUwbAddressResultListener");
            crpzVar = queryLocalInterface instanceof crqb ? (crqb) queryLocalInterface : new crpz(iBinder);
        }
        this.a = crpzVar;
    }
}
