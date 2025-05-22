package com.google.android.gms.nearby.internal.connection;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.clik;
import defpackage.clim;
import defpackage.cllr;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class ReadAuthMessageParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cllr();
    public clim a;

    public ReadAuthMessageParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ReadAuthMessageParams) {
            return atyq.b(this.a, ((ReadAuthMessageParams) obj).a);
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

    public ReadAuthMessageParams(IBinder iBinder) {
        clim clikVar;
        if (iBinder == null) {
            clikVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IBytesResultListener");
            clikVar = queryLocalInterface instanceof clim ? (clim) queryLocalInterface : new clik(iBinder);
        }
        this.a = clikVar;
    }
}
