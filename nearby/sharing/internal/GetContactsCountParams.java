package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.sharing.ContactFilter;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cmvh;
import defpackage.cmwn;
import defpackage.cmwp;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class GetContactsCountParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cmvh();
    public cmwp a;
    public ContactFilter b;

    public GetContactsCountParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetContactsCountParams) {
            GetContactsCountParams getContactsCountParams = (GetContactsCountParams) obj;
            if (arwb.b(this.a, getContactsCountParams.a) && arwb.b(this.b, getContactsCountParams.b)) {
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
        arxc.t(parcel, 2, this.b, i, false);
        arxc.c(parcel, a);
    }

    public GetContactsCountParams(IBinder iBinder, ContactFilter contactFilter) {
        cmwp cmwnVar;
        if (iBinder == null) {
            cmwnVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.IIntResultListener");
            cmwnVar = queryLocalInterface instanceof cmwp ? (cmwp) queryLocalInterface : new cmwn(iBinder);
        }
        this.a = cmwnVar;
        this.b = contactFilter;
    }
}
