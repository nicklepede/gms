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
import defpackage.ckom;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class RegisterConnectionSwitchListenerParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ckom();
    public cknz a;
    public int[] b;
    public cknp c;

    private RegisterConnectionSwitchListenerParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RegisterConnectionSwitchListenerParams) {
            RegisterConnectionSwitchListenerParams registerConnectionSwitchListenerParams = (RegisterConnectionSwitchListenerParams) obj;
            if (atyq.b(this.a, registerConnectionSwitchListenerParams.a) && atyq.b(this.c, registerConnectionSwitchListenerParams.c) && Arrays.equals(this.b, registerConnectionSwitchListenerParams.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.c, Integer.valueOf(Arrays.hashCode(this.b))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.D(parcel, 1, this.a.asBinder());
        atzr.D(parcel, 2, this.c.a);
        atzr.p(parcel, 3, this.b, false);
        atzr.c(parcel, a);
    }

    public RegisterConnectionSwitchListenerParams(IBinder iBinder, IBinder iBinder2, int[] iArr) {
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
        this.c = cknpVar;
        this.b = iArr;
    }
}
