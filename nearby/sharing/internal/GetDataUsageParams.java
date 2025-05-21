package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cmvj;
import defpackage.cmwn;
import defpackage.cmwp;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class GetDataUsageParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cmvj();
    public cmwp a;

    public GetDataUsageParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetDataUsageParams) {
            return arwb.b(this.a, ((GetDataUsageParams) obj).a);
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

    public GetDataUsageParams(IBinder iBinder) {
        cmwp cmwnVar;
        if (iBinder == null) {
            cmwnVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.IIntResultListener");
            cmwnVar = queryLocalInterface instanceof cmwp ? (cmwp) queryLocalInterface : new cmwn(iBinder);
        }
        this.a = cmwnVar;
    }
}
