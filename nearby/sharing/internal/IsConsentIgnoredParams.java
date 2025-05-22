package com.google.android.gms.nearby.sharing.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cpef;
import defpackage.cpeh;
import defpackage.cpin;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class IsConsentIgnoredParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cpin();
    public Account a;
    public int b;
    public cpeh c;

    private IsConsentIgnoredParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IsConsentIgnoredParams) {
            IsConsentIgnoredParams isConsentIgnoredParams = (IsConsentIgnoredParams) obj;
            if (atyq.b(this.a, isConsentIgnoredParams.a) && atyq.b(Integer.valueOf(this.b), Integer.valueOf(isConsentIgnoredParams.b)) && atyq.b(this.c, isConsentIgnoredParams.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, this.a, i, false);
        atzr.o(parcel, 2, this.b);
        atzr.D(parcel, 3, this.c.asBinder());
        atzr.c(parcel, a);
    }

    public IsConsentIgnoredParams(Account account, int i, IBinder iBinder) {
        cpeh cpefVar;
        if (iBinder == null) {
            cpefVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.IBooleanResultListener");
            cpefVar = queryLocalInterface instanceof cpeh ? (cpeh) queryLocalInterface : new cpef(iBinder);
        }
        this.a = account;
        this.b = i;
        this.c = cpefVar;
    }
}
