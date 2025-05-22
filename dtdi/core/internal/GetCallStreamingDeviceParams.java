package com.google.android.gms.dtdi.core.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.bazu;
import defpackage.bazx;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class GetCallStreamingDeviceParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bazu();
    public ParcelUuid a;
    private bazx b;

    private GetCallStreamingDeviceParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetCallStreamingDeviceParams) {
            GetCallStreamingDeviceParams getCallStreamingDeviceParams = (GetCallStreamingDeviceParams) obj;
            if (atyq.b(this.a, getCallStreamingDeviceParams.a) && atyq.b(this.b, getCallStreamingDeviceParams.b)) {
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
        atzr.t(parcel, 1, this.a, i, false);
        atzr.D(parcel, 2, this.b.a);
        atzr.c(parcel, a);
    }

    public GetCallStreamingDeviceParams(ParcelUuid parcelUuid, IBinder iBinder) {
        bazx bazxVar;
        if (iBinder == null) {
            bazxVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dtdi.core.internal.ICallStreamingDeviceStatusCallback");
            bazxVar = queryLocalInterface instanceof bazx ? (bazx) queryLocalInterface : new bazx(iBinder);
        }
        this.a = parcelUuid;
        this.b = bazxVar;
    }
}
