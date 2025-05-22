package com.google.android.gms.nearby.uwb.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.ctzb;
import defpackage.ctzd;
import defpackage.ctzy;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class RemoveControleeParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctzy();
    public ctzd a;
    public UwbAddressParams b;

    public RemoveControleeParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RemoveControleeParams) {
            RemoveControleeParams removeControleeParams = (RemoveControleeParams) obj;
            if (atyq.b(this.a, removeControleeParams.a) && atyq.b(this.b, removeControleeParams.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        ctzd ctzdVar = this.a;
        atzr.D(parcel, 1, ctzdVar == null ? null : ctzdVar.asBinder());
        atzr.t(parcel, 2, this.b, i, false);
        atzr.c(parcel, a);
    }

    public RemoveControleeParams(IBinder iBinder, UwbAddressParams uwbAddressParams) {
        ctzd ctzbVar;
        if (iBinder == null) {
            ctzbVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.uwb.internal.IResultListener");
            ctzbVar = queryLocalInterface instanceof ctzd ? (ctzd) queryLocalInterface : new ctzb(iBinder);
        }
        this.a = ctzbVar;
        this.b = uwbAddressParams;
    }
}
