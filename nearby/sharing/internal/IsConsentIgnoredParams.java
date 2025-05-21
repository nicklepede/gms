package com.google.android.gms.nearby.sharing.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cmvx;
import defpackage.cmvz;
import defpackage.cnaf;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class IsConsentIgnoredParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cnaf();
    public Account a;
    public int b;
    public cmvz c;

    private IsConsentIgnoredParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IsConsentIgnoredParams) {
            IsConsentIgnoredParams isConsentIgnoredParams = (IsConsentIgnoredParams) obj;
            if (arwb.b(this.a, isConsentIgnoredParams.a) && arwb.b(Integer.valueOf(this.b), Integer.valueOf(isConsentIgnoredParams.b)) && arwb.b(this.c, isConsentIgnoredParams.c)) {
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
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, this.a, i, false);
        arxc.o(parcel, 2, this.b);
        arxc.D(parcel, 3, this.c.asBinder());
        arxc.c(parcel, a);
    }

    public IsConsentIgnoredParams(Account account, int i, IBinder iBinder) {
        cmvz cmvxVar;
        if (iBinder == null) {
            cmvxVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.IBooleanResultListener");
            cmvxVar = queryLocalInterface instanceof cmvz ? (cmvz) queryLocalInterface : new cmvx(iBinder);
        }
        this.a = account;
        this.b = i;
        this.c = cmvxVar;
    }
}
