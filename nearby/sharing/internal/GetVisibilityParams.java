package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cpea;
import defpackage.cpev;
import defpackage.cpex;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class GetVisibilityParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cpea();
    public cpex a;

    public GetVisibilityParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetVisibilityParams) {
            return atyq.b(this.a, ((GetVisibilityParams) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.D(parcel, 1, this.a.asBinder());
        atzr.c(parcel, a);
    }

    public GetVisibilityParams(IBinder iBinder) {
        cpex cpevVar;
        if (iBinder == null) {
            cpevVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.IIntResultListener");
            cpevVar = queryLocalInterface instanceof cpex ? (cpex) queryLocalInterface : new cpev(iBinder);
        }
        this.a = cpevVar;
    }
}
