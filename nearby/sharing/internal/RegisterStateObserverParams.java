package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atec;
import defpackage.atee;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cpfq;
import defpackage.cpfs;
import defpackage.cpjq;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class RegisterStateObserverParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cpjq();
    public cpfs a;
    public atee b;

    public RegisterStateObserverParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RegisterStateObserverParams) {
            RegisterStateObserverParams registerStateObserverParams = (RegisterStateObserverParams) obj;
            if (atyq.b(this.a, registerStateObserverParams.a) && atyq.b(this.b, registerStateObserverParams.b)) {
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
        atzr.D(parcel, 2, this.b.asBinder());
        atzr.c(parcel, a);
    }

    public RegisterStateObserverParams(IBinder iBinder, IBinder iBinder2) {
        cpfs cpfqVar;
        atee ateeVar = null;
        if (iBinder == null) {
            cpfqVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.IStateUpdateCallback");
            cpfqVar = queryLocalInterface instanceof cpfs ? (cpfs) queryLocalInterface : new cpfq(iBinder);
        }
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            ateeVar = queryLocalInterface2 instanceof atee ? (atee) queryLocalInterface2 : new atec(iBinder2);
        }
        this.a = cpfqVar;
        this.b = ateeVar;
    }
}
