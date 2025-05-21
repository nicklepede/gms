package com.google.android.gms.dtdi.core.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.aywa;
import defpackage.aywd;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class GetCallStreamingDeviceParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aywa();
    public ParcelUuid a;
    private aywd b;

    private GetCallStreamingDeviceParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetCallStreamingDeviceParams) {
            GetCallStreamingDeviceParams getCallStreamingDeviceParams = (GetCallStreamingDeviceParams) obj;
            if (arwb.b(this.a, getCallStreamingDeviceParams.a) && arwb.b(this.b, getCallStreamingDeviceParams.b)) {
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
        arxc.t(parcel, 1, this.a, i, false);
        arxc.D(parcel, 2, this.b.a);
        arxc.c(parcel, a);
    }

    public GetCallStreamingDeviceParams(ParcelUuid parcelUuid, IBinder iBinder) {
        aywd aywdVar;
        if (iBinder == null) {
            aywdVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dtdi.core.internal.ICallStreamingDeviceStatusCallback");
            aywdVar = queryLocalInterface instanceof aywd ? (aywd) queryLocalInterface : new aywd(iBinder);
        }
        this.a = parcelUuid;
        this.b = aywdVar;
    }
}
