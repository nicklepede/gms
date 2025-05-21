package com.google.android.gms.nearby.presence.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.presence.DiscoveryFilter;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.ckrj;
import defpackage.ckrx;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class GetDevicesParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ckrj();
    public DiscoveryFilter a;
    public ckrx b;

    private GetDevicesParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetDevicesParams) {
            GetDevicesParams getDevicesParams = (GetDevicesParams) obj;
            if (arwb.b(this.b, getDevicesParams.b) && arwb.b(this.a, getDevicesParams.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.D(parcel, 1, this.b.a);
        arxc.t(parcel, 2, this.a, i, false);
        arxc.c(parcel, a);
    }

    public GetDevicesParams(IBinder iBinder, DiscoveryFilter discoveryFilter) {
        ckrx ckrxVar;
        if (iBinder == null) {
            ckrxVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.presence.internal.IGetDevicesCallback");
            ckrxVar = queryLocalInterface instanceof ckrx ? (ckrx) queryLocalInterface : new ckrx(iBinder);
        }
        this.b = ckrxVar;
        this.a = discoveryFilter;
    }
}
