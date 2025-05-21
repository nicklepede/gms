package com.google.android.gms.dtdi.core.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.ayvz;
import defpackage.aywm;
import defpackage.aywn;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class GetApiAvailabilityParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ayvz();
    public aywn a;

    private GetApiAvailabilityParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetApiAvailabilityParams) {
            return arwb.b(this.a, ((GetApiAvailabilityParams) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.D(parcel, 1, this.a.asBinder());
        arxc.c(parcel, a);
    }

    public GetApiAvailabilityParams(IBinder iBinder) {
        aywn aywmVar;
        if (iBinder == null) {
            aywmVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dtdi.core.internal.IGetApiAvailabilityCallback");
            aywmVar = queryLocalInterface instanceof aywn ? (aywn) queryLocalInterface : new aywm(iBinder);
        }
        this.a = aywmVar;
    }
}
