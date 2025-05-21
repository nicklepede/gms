package com.google.android.gms.nearby.fastpair.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cifg;
import defpackage.cifo;
import defpackage.cifq;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class GetDeviceInfoParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cifg();
    public String a;
    public cifq b;

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
            if (arwb.b(this.a, getDeviceInfoParams.a) && arwb.b(this.b, getDeviceInfoParams.b)) {
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
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, this.a, false);
        arxc.D(parcel, 2, a());
        arxc.c(parcel, a);
    }

    public GetDeviceInfoParams(String str, IBinder iBinder) {
        cifq cifoVar;
        if (iBinder == null) {
            cifoVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.fastpair.internal.IFastPairGetDeviceInfoCallback");
            cifoVar = queryLocalInterface instanceof cifq ? (cifq) queryLocalInterface : new cifo(iBinder);
        }
        this.a = str;
        this.b = cifoVar;
    }
}
