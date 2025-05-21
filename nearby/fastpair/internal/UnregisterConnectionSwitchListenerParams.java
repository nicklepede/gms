package com.google.android.gms.nearby.fastpair.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cifk;
import defpackage.cifs;
import defpackage.cifu;
import defpackage.cigt;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class UnregisterConnectionSwitchListenerParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cigt();
    public cifu a;
    public cifk b;

    private UnregisterConnectionSwitchListenerParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UnregisterConnectionSwitchListenerParams) {
            UnregisterConnectionSwitchListenerParams unregisterConnectionSwitchListenerParams = (UnregisterConnectionSwitchListenerParams) obj;
            if (arwb.b(this.a, unregisterConnectionSwitchListenerParams.a) && arwb.b(this.b, unregisterConnectionSwitchListenerParams.b)) {
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
        arxc.D(parcel, 2, this.b.a);
        arxc.c(parcel, a);
    }

    public UnregisterConnectionSwitchListenerParams(IBinder iBinder, IBinder iBinder2) {
        cifu cifsVar;
        cifk cifkVar = null;
        if (iBinder == null) {
            cifsVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.fastpair.internal.IFastPairStatusCallback");
            cifsVar = queryLocalInterface instanceof cifu ? (cifu) queryLocalInterface : new cifs(iBinder);
        }
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.fastpair.internal.IConnectionSwitchListener");
            cifkVar = queryLocalInterface2 instanceof cifk ? (cifk) queryLocalInterface2 : new cifk(iBinder2);
        }
        this.a = cifsVar;
        this.b = cifkVar;
    }
}
