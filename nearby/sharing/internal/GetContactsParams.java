package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.sharing.ContactFilter;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cpdq;
import defpackage.cpei;
import defpackage.cpek;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class GetContactsParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cpdq();
    public cpek a;
    public int b;
    public int c;
    public ContactFilter d;

    public GetContactsParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetContactsParams) {
            GetContactsParams getContactsParams = (GetContactsParams) obj;
            if (atyq.b(this.a, getContactsParams.a) && atyq.b(Integer.valueOf(this.b), Integer.valueOf(getContactsParams.b)) && atyq.b(Integer.valueOf(this.c), Integer.valueOf(getContactsParams.c)) && atyq.b(this.d, getContactsParams.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Integer.valueOf(this.c), this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.D(parcel, 1, this.a.asBinder());
        atzr.o(parcel, 2, this.b);
        atzr.o(parcel, 3, this.c);
        atzr.t(parcel, 4, this.d, i, false);
        atzr.c(parcel, a);
    }

    public GetContactsParams(IBinder iBinder, int i, int i2, ContactFilter contactFilter) {
        cpek cpeiVar;
        if (iBinder == null) {
            cpeiVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.IContactsResultListener");
            cpeiVar = queryLocalInterface instanceof cpek ? (cpek) queryLocalInterface : new cpei(iBinder);
        }
        this.a = cpeiVar;
        this.b = i;
        this.c = i2;
        this.d = contactFilter;
    }
}
