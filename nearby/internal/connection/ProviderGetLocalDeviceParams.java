package com.google.android.gms.nearby.internal.connection;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cliz;
import defpackage.cljb;
import defpackage.cllp;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class ProviderGetLocalDeviceParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cllp();
    public cljb a;

    public ProviderGetLocalDeviceParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProviderGetLocalDeviceParams) {
            return atyq.b(this.a, ((ProviderGetLocalDeviceParams) obj).a);
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

    public ProviderGetLocalDeviceParams(IBinder iBinder) {
        cljb clizVar;
        if (iBinder == null) {
            clizVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IDeviceResultListener");
            clizVar = queryLocalInterface instanceof cljb ? (cljb) queryLocalInterface : new cliz(iBinder);
        }
        this.a = clizVar;
    }
}
