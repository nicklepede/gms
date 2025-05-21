package com.google.android.gms.dtdi.core.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arbn;
import defpackage.arbp;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.aywx;
import defpackage.ayxd;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class RegisterForSpatialEventsParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ayxd();
    public arbp a;
    public aywx b;

    private RegisterForSpatialEventsParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RegisterForSpatialEventsParams) {
            RegisterForSpatialEventsParams registerForSpatialEventsParams = (RegisterForSpatialEventsParams) obj;
            if (arwb.b(this.b, registerForSpatialEventsParams.b) && arwb.b(this.a, registerForSpatialEventsParams.a)) {
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
        arxc.D(parcel, 2, this.a.asBinder());
        arxc.c(parcel, a);
    }

    public RegisterForSpatialEventsParams(IBinder iBinder, IBinder iBinder2) {
        aywx aywxVar;
        arbp arbpVar = null;
        if (iBinder == null) {
            aywxVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dtdi.core.internal.IOnSpatialEventListener");
            aywxVar = queryLocalInterface instanceof aywx ? (aywx) queryLocalInterface : new aywx(iBinder);
        }
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            arbpVar = queryLocalInterface2 instanceof arbp ? (arbp) queryLocalInterface2 : new arbn(iBinder2);
        }
        this.b = aywxVar;
        this.a = arbpVar;
    }
}
