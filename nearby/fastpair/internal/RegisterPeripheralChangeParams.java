package com.google.android.gms.nearby.fastpair.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cifs;
import defpackage.cifu;
import defpackage.ciga;
import defpackage.cigi;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class RegisterPeripheralChangeParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cigi();
    public cifu a;
    public ciga b;

    private RegisterPeripheralChangeParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RegisterPeripheralChangeParams) {
            RegisterPeripheralChangeParams registerPeripheralChangeParams = (RegisterPeripheralChangeParams) obj;
            if (arwb.b(this.a, registerPeripheralChangeParams.a) && arwb.b(this.b, registerPeripheralChangeParams.b)) {
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

    public RegisterPeripheralChangeParams(IBinder iBinder, IBinder iBinder2) {
        cifu cifsVar;
        ciga cigaVar = null;
        if (iBinder == null) {
            cifsVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.fastpair.internal.IFastPairStatusCallback");
            cifsVar = queryLocalInterface instanceof cifu ? (cifu) queryLocalInterface : new cifs(iBinder);
        }
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.fastpair.internal.IPeripheralChangeCallback");
            cigaVar = queryLocalInterface2 instanceof ciga ? (ciga) queryLocalInterface2 : new ciga(iBinder2);
        }
        this.a = cifsVar;
        this.b = cigaVar;
    }
}
