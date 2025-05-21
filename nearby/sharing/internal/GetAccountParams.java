package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cmve;
import defpackage.cmvu;
import defpackage.cmvw;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class GetAccountParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cmve();
    public cmvw a;

    public GetAccountParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetAccountParams) {
            return arwb.b(this.a, ((GetAccountParams) obj).a);
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

    public GetAccountParams(IBinder iBinder) {
        cmvw cmvuVar;
        if (iBinder == null) {
            cmvuVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.IAccountResultListener");
            cmvuVar = queryLocalInterface instanceof cmvw ? (cmvw) queryLocalInterface : new cmvu(iBinder);
        }
        this.a = cmvuVar;
    }
}
