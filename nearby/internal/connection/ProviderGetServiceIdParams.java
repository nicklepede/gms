package com.google.android.gms.nearby.internal.connection;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.clkb;
import defpackage.clkd;
import defpackage.cllq;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class ProviderGetServiceIdParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cllq();
    public clkd a;

    public ProviderGetServiceIdParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProviderGetServiceIdParams) {
            return atyq.b(this.a, ((ProviderGetServiceIdParams) obj).a);
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

    public ProviderGetServiceIdParams(IBinder iBinder) {
        clkd clkbVar;
        if (iBinder == null) {
            clkbVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IStringResultListener");
            clkbVar = queryLocalInterface instanceof clkd ? (clkd) queryLocalInterface : new clkb(iBinder);
        }
        this.a = clkbVar;
    }
}
