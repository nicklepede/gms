package com.google.android.gms.nearby.fastpair.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cknp;
import defpackage.cknx;
import defpackage.cknz;
import defpackage.ckoy;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class UnregisterConnectionSwitchListenerParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ckoy();
    public cknz a;
    public cknp b;

    private UnregisterConnectionSwitchListenerParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UnregisterConnectionSwitchListenerParams) {
            UnregisterConnectionSwitchListenerParams unregisterConnectionSwitchListenerParams = (UnregisterConnectionSwitchListenerParams) obj;
            if (atyq.b(this.a, unregisterConnectionSwitchListenerParams.a) && atyq.b(this.b, unregisterConnectionSwitchListenerParams.b)) {
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
        atzr.D(parcel, 1, this.a.asBinder());
        atzr.D(parcel, 2, this.b.a);
        atzr.c(parcel, a);
    }

    public UnregisterConnectionSwitchListenerParams(IBinder iBinder, IBinder iBinder2) {
        cknz cknxVar;
        cknp cknpVar = null;
        if (iBinder == null) {
            cknxVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.fastpair.internal.IFastPairStatusCallback");
            cknxVar = queryLocalInterface instanceof cknz ? (cknz) queryLocalInterface : new cknx(iBinder);
        }
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.fastpair.internal.IConnectionSwitchListener");
            cknpVar = queryLocalInterface2 instanceof cknp ? (cknp) queryLocalInterface2 : new cknp(iBinder2);
        }
        this.a = cknxVar;
        this.b = cknpVar;
    }
}
