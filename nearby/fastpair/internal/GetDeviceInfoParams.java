package com.google.android.gms.nearby.fastpair.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cknl;
import defpackage.cknt;
import defpackage.cknv;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class GetDeviceInfoParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cknl();
    public String a;
    public cknv b;

    public GetDeviceInfoParams() {
    }

    public final IBinder a() {
        return this.b.asBinder();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetDeviceInfoParams) {
            GetDeviceInfoParams getDeviceInfoParams = (GetDeviceInfoParams) obj;
            if (atyq.b(this.a, getDeviceInfoParams.a) && atyq.b(this.b, getDeviceInfoParams.b)) {
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
        atzr.v(parcel, 1, this.a, false);
        atzr.D(parcel, 2, a());
        atzr.c(parcel, a);
    }

    public GetDeviceInfoParams(String str, IBinder iBinder) {
        cknv ckntVar;
        if (iBinder == null) {
            ckntVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.fastpair.internal.IFastPairGetDeviceInfoCallback");
            ckntVar = queryLocalInterface instanceof cknv ? (cknv) queryLocalInterface : new cknt(iBinder);
        }
        this.a = str;
        this.b = ckntVar;
    }
}
