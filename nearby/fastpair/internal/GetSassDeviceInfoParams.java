package com.google.android.gms.nearby.fastpair.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cifh;
import defpackage.cifw;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class GetSassDeviceInfoParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cifh();
    public int a;
    public cifw b;

    private GetSassDeviceInfoParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetSassDeviceInfoParams) {
            GetSassDeviceInfoParams getSassDeviceInfoParams = (GetSassDeviceInfoParams) obj;
            if (arwb.b(Integer.valueOf(this.a), Integer.valueOf(getSassDeviceInfoParams.a)) && arwb.b(this.b, getSassDeviceInfoParams.b)) {
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
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.D(parcel, 2, this.b.a);
        arxc.c(parcel, a);
    }

    public GetSassDeviceInfoParams(int i, IBinder iBinder) {
        cifw cifwVar;
        if (iBinder == null) {
            cifwVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.fastpair.internal.IGetSassDeviceInfoCallback");
            cifwVar = queryLocalInterface instanceof cifw ? (cifw) queryLocalInterface : new cifw(iBinder);
        }
        this.a = i;
        this.b = cifwVar;
    }
}
