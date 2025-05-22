package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cpds;
import defpackage.cpel;
import defpackage.cpen;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class GetDeviceAccountIdParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cpds();
    public cpen a;

    public GetDeviceAccountIdParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetDeviceAccountIdParams) {
            return atyq.b(this.a, ((GetDeviceAccountIdParams) obj).a);
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

    public GetDeviceAccountIdParams(IBinder iBinder) {
        cpen cpelVar;
        if (iBinder == null) {
            cpelVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.IDeviceAccountIdResultListener");
            cpelVar = queryLocalInterface instanceof cpen ? (cpen) queryLocalInterface : new cpel(iBinder);
        }
        this.a = cpelVar;
    }
}
