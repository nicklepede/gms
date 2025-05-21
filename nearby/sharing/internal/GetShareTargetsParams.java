package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cmvr;
import defpackage.cmxf;
import defpackage.cmxh;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class GetShareTargetsParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cmvr();
    public int a;
    public cmxh b;

    public GetShareTargetsParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetShareTargetsParams) {
            GetShareTargetsParams getShareTargetsParams = (GetShareTargetsParams) obj;
            if (arwb.b(Integer.valueOf(this.a), Integer.valueOf(getShareTargetsParams.a)) && arwb.b(this.b, getShareTargetsParams.b)) {
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
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.D(parcel, 2, this.b.asBinder());
        arxc.c(parcel, a);
    }

    public GetShareTargetsParams(int i, IBinder iBinder) {
        cmxh cmxfVar;
        if (iBinder == null) {
            cmxfVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.IShareTargetsResultListener");
            cmxfVar = queryLocalInterface instanceof cmxh ? (cmxh) queryLocalInterface : new cmxf(iBinder);
        }
        this.a = i;
        this.b = cmxfVar;
    }
}
