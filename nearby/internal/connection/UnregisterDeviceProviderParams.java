package com.google.android.gms.nearby.internal.connection;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cliw;
import defpackage.cliy;
import defpackage.clmk;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class UnregisterDeviceProviderParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new clmk();
    public cliy a;

    public UnregisterDeviceProviderParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UnregisterDeviceProviderParams) {
            return atyq.b(this.a, ((UnregisterDeviceProviderParams) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        cliy cliyVar = this.a;
        atzr.D(parcel, 1, cliyVar == null ? null : cliyVar.asBinder());
        atzr.c(parcel, a);
    }

    public UnregisterDeviceProviderParams(IBinder iBinder) {
        cliy cliwVar;
        if (iBinder == null) {
            cliwVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IDeviceProvider");
            cliwVar = queryLocalInterface instanceof cliy ? (cliy) queryLocalInterface : new cliw(iBinder);
        }
        this.a = cliwVar;
    }
}
