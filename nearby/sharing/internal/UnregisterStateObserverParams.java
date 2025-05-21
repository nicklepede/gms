package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arbn;
import defpackage.arbp;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cmxi;
import defpackage.cmxk;
import defpackage.cncl;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class UnregisterStateObserverParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cncl();
    public cmxk a;
    public arbp b;

    public UnregisterStateObserverParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UnregisterStateObserverParams) {
            UnregisterStateObserverParams unregisterStateObserverParams = (UnregisterStateObserverParams) obj;
            if (arwb.b(this.a, unregisterStateObserverParams.a) && arwb.b(this.b, unregisterStateObserverParams.b)) {
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
        arxc.D(parcel, 1, this.a.asBinder());
        arxc.D(parcel, 2, this.b.asBinder());
        arxc.c(parcel, a);
    }

    public UnregisterStateObserverParams(IBinder iBinder, IBinder iBinder2) {
        cmxk cmxiVar;
        arbp arbpVar = null;
        if (iBinder == null) {
            cmxiVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.IStateUpdateCallback");
            cmxiVar = queryLocalInterface instanceof cmxk ? (cmxk) queryLocalInterface : new cmxi(iBinder);
        }
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            arbpVar = queryLocalInterface2 instanceof arbp ? (arbp) queryLocalInterface2 : new arbn(iBinder2);
        }
        this.a = cmxiVar;
        this.b = arbpVar;
    }
}
