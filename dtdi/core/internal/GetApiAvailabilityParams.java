package com.google.android.gms.dtdi.core.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.bazt;
import defpackage.bbag;
import defpackage.bbah;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class GetApiAvailabilityParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bazt();
    public bbah a;

    private GetApiAvailabilityParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetApiAvailabilityParams) {
            return atyq.b(this.a, ((GetApiAvailabilityParams) obj).a);
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

    public GetApiAvailabilityParams(IBinder iBinder) {
        bbah bbagVar;
        if (iBinder == null) {
            bbagVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dtdi.core.internal.IGetApiAvailabilityCallback");
            bbagVar = queryLocalInterface instanceof bbah ? (bbah) queryLocalInterface : new bbag(iBinder);
        }
        this.a = bbagVar;
    }
}
