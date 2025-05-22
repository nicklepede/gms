package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cpdz;
import defpackage.cpfn;
import defpackage.cpfp;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class GetShareTargetsParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cpdz();
    public int a;
    public cpfp b;

    public GetShareTargetsParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetShareTargetsParams) {
            GetShareTargetsParams getShareTargetsParams = (GetShareTargetsParams) obj;
            if (atyq.b(Integer.valueOf(this.a), Integer.valueOf(getShareTargetsParams.a)) && atyq.b(this.b, getShareTargetsParams.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.D(parcel, 2, this.b.asBinder());
        atzr.c(parcel, a);
    }

    public GetShareTargetsParams(int i, IBinder iBinder) {
        cpfp cpfnVar;
        if (iBinder == null) {
            cpfnVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.IShareTargetsResultListener");
            cpfnVar = queryLocalInterface instanceof cpfp ? (cpfp) queryLocalInterface : new cpfn(iBinder);
        }
        this.a = i;
        this.b = cpfnVar;
    }
}
