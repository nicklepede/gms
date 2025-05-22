package com.google.android.gms.nearby.presence.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.presence.DiscoveryFilter;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cmzo;
import defpackage.cnac;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class GetDevicesParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cmzo();
    public DiscoveryFilter a;
    public cnac b;

    private GetDevicesParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetDevicesParams) {
            GetDevicesParams getDevicesParams = (GetDevicesParams) obj;
            if (atyq.b(this.b, getDevicesParams.b) && atyq.b(this.a, getDevicesParams.a)) {
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
        int a = atzr.a(parcel);
        atzr.D(parcel, 1, this.b.a);
        atzr.t(parcel, 2, this.a, i, false);
        atzr.c(parcel, a);
    }

    public GetDevicesParams(IBinder iBinder, DiscoveryFilter discoveryFilter) {
        cnac cnacVar;
        if (iBinder == null) {
            cnacVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.presence.internal.IGetDevicesCallback");
            cnacVar = queryLocalInterface instanceof cnac ? (cnac) queryLocalInterface : new cnac(iBinder);
        }
        this.b = cnacVar;
        this.a = discoveryFilter;
    }
}
