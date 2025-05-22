package com.google.android.gms.nearby.uwb.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.ctyt;
import defpackage.ctze;
import defpackage.ctzg;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class GetLocalAddressParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctyt();
    public ctzg a;

    public GetLocalAddressParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetLocalAddressParams) {
            return atyq.b(this.a, ((GetLocalAddressParams) obj).a);
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

    public GetLocalAddressParams(IBinder iBinder) {
        ctzg ctzeVar;
        if (iBinder == null) {
            ctzeVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.uwb.internal.IUwbAddressResultListener");
            ctzeVar = queryLocalInterface instanceof ctzg ? (ctzg) queryLocalInterface : new ctze(iBinder);
        }
        this.a = ctzeVar;
    }
}
