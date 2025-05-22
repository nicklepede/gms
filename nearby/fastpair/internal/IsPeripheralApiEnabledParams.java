package com.google.android.gms.nearby.fastpair.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.ckno;
import defpackage.ckoh;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class IsPeripheralApiEnabledParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ckoh();
    public ckno a;

    private IsPeripheralApiEnabledParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IsPeripheralApiEnabledParams) {
            return atyq.b(this.a, ((IsPeripheralApiEnabledParams) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.D(parcel, 1, this.a.a);
        atzr.c(parcel, a);
    }

    public IsPeripheralApiEnabledParams(IBinder iBinder) {
        ckno cknoVar;
        if (iBinder == null) {
            cknoVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.fastpair.internal.IBooleanCallback");
            cknoVar = queryLocalInterface instanceof ckno ? (ckno) queryLocalInterface : new ckno(iBinder);
        }
        this.a = cknoVar;
    }
}
