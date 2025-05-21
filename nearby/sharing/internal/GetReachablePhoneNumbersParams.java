package com.google.android.gms.nearby.sharing.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cmvq;
import defpackage.cmxl;
import defpackage.cmxn;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class GetReachablePhoneNumbersParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cmvq();
    public cmxn a;
    public Account b;

    public GetReachablePhoneNumbersParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetReachablePhoneNumbersParams) {
            GetReachablePhoneNumbersParams getReachablePhoneNumbersParams = (GetReachablePhoneNumbersParams) obj;
            if (arwb.b(this.a, getReachablePhoneNumbersParams.a) && arwb.b(this.b, getReachablePhoneNumbersParams.b)) {
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

    public GetReachablePhoneNumbersParams(IBinder iBinder, Account account) {
        cmxn cmxlVar;
        if (iBinder == null) {
            cmxlVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.IStringListResultListener");
            cmxlVar = queryLocalInterface instanceof cmxn ? (cmxn) queryLocalInterface : new cmxl(iBinder);
        }
        this.a = cmxlVar;
        this.b = account;
    }
}
