package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.sharing.ContactFilter;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cmvi;
import defpackage.cmwa;
import defpackage.cmwc;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class GetContactsParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cmvi();
    public cmwc a;
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
            if (arwb.b(this.a, getContactsParams.a) && arwb.b(Integer.valueOf(this.b), Integer.valueOf(getContactsParams.b)) && arwb.b(Integer.valueOf(this.c), Integer.valueOf(getContactsParams.c)) && arwb.b(this.d, getContactsParams.d)) {
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
        int a = arxc.a(parcel);
        arxc.D(parcel, 1, this.a.asBinder());
        arxc.o(parcel, 2, this.b);
        arxc.o(parcel, 3, this.c);
        arxc.t(parcel, 4, this.d, i, false);
        arxc.c(parcel, a);
    }

    public GetContactsParams(IBinder iBinder, int i, int i2, ContactFilter contactFilter) {
        cmwc cmwaVar;
        if (iBinder == null) {
            cmwaVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.IContactsResultListener");
            cmwaVar = queryLocalInterface instanceof cmwc ? (cmwc) queryLocalInterface : new cmwa(iBinder);
        }
        this.a = cmwaVar;
        this.b = i;
        this.c = i2;
        this.d = contactFilter;
    }
}
