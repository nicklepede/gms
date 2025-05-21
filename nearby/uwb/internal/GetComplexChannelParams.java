package com.google.android.gms.nearby.uwb.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.crpn;
import defpackage.crqf;
import defpackage.crqh;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class GetComplexChannelParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new crpn();
    public crqh a;

    public GetComplexChannelParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetComplexChannelParams) {
            return arwb.b(this.a, ((GetComplexChannelParams) obj).a);
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

    public GetComplexChannelParams(IBinder iBinder) {
        crqh crqfVar;
        if (iBinder == null) {
            crqfVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.uwb.internal.IUwbComplexChannelResultListener");
            crqfVar = queryLocalInterface instanceof crqh ? (crqh) queryLocalInterface : new crqf(iBinder);
        }
        this.a = crqfVar;
    }
}
