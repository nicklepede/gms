package com.google.android.gms.nearby.fastpair.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cknm;
import defpackage.ckob;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class GetSassDeviceInfoParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cknm();
    public int a;
    public ckob b;

    private GetSassDeviceInfoParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetSassDeviceInfoParams) {
            GetSassDeviceInfoParams getSassDeviceInfoParams = (GetSassDeviceInfoParams) obj;
            if (atyq.b(Integer.valueOf(this.a), Integer.valueOf(getSassDeviceInfoParams.a)) && atyq.b(this.b, getSassDeviceInfoParams.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.D(parcel, 2, this.b.a);
        atzr.c(parcel, a);
    }

    public GetSassDeviceInfoParams(int i, IBinder iBinder) {
        ckob ckobVar;
        if (iBinder == null) {
            ckobVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.fastpair.internal.IGetSassDeviceInfoCallback");
            ckobVar = queryLocalInterface instanceof ckob ? (ckob) queryLocalInterface : new ckob(iBinder);
        }
        this.a = i;
        this.b = ckobVar;
    }
}
