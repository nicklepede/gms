package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cpdm;
import defpackage.cpec;
import defpackage.cpee;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class GetAccountParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cpdm();
    public cpee a;

    public GetAccountParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetAccountParams) {
            return atyq.b(this.a, ((GetAccountParams) obj).a);
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

    public GetAccountParams(IBinder iBinder) {
        cpee cpecVar;
        if (iBinder == null) {
            cpecVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.IAccountResultListener");
            cpecVar = queryLocalInterface instanceof cpee ? (cpee) queryLocalInterface : new cpec(iBinder);
        }
        this.a = cpecVar;
    }
}
