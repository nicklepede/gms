package com.google.android.gms.nearby.sharing.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cpdy;
import defpackage.cpft;
import defpackage.cpfv;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class GetReachablePhoneNumbersParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cpdy();
    public cpfv a;
    public Account b;

    public GetReachablePhoneNumbersParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetReachablePhoneNumbersParams) {
            GetReachablePhoneNumbersParams getReachablePhoneNumbersParams = (GetReachablePhoneNumbersParams) obj;
            if (atyq.b(this.a, getReachablePhoneNumbersParams.a) && atyq.b(this.b, getReachablePhoneNumbersParams.b)) {
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
        atzr.t(parcel, 2, this.b, i, false);
        atzr.c(parcel, a);
    }

    public GetReachablePhoneNumbersParams(IBinder iBinder, Account account) {
        cpfv cpftVar;
        if (iBinder == null) {
            cpftVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.IStringListResultListener");
            cpftVar = queryLocalInterface instanceof cpfv ? (cpfv) queryLocalInterface : new cpft(iBinder);
        }
        this.a = cpftVar;
        this.b = account;
    }
}
