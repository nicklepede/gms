package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cpdt;
import defpackage.cpfw;
import defpackage.cpfy;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class GetDeviceNameParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cpdt();
    public cpfy a;

    public GetDeviceNameParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetDeviceNameParams) {
            return atyq.b(this.a, ((GetDeviceNameParams) obj).a);
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

    public GetDeviceNameParams(IBinder iBinder) {
        cpfy cpfwVar;
        if (iBinder == null) {
            cpfwVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.IStringResultListener");
            cpfwVar = queryLocalInterface instanceof cpfy ? (cpfy) queryLocalInterface : new cpfw(iBinder);
        }
        this.a = cpfwVar;
    }
}
