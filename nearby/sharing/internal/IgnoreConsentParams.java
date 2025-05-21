package com.google.android.gms.nearby.sharing.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arbn;
import defpackage.arbp;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cmxu;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class IgnoreConsentParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cmxu();
    public Account a;
    public int b;
    public boolean c;
    public arbp d;

    public IgnoreConsentParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IgnoreConsentParams) {
            IgnoreConsentParams ignoreConsentParams = (IgnoreConsentParams) obj;
            if (arwb.b(this.a, ignoreConsentParams.a) && arwb.b(Integer.valueOf(this.b), Integer.valueOf(ignoreConsentParams.b)) && arwb.b(Boolean.valueOf(this.c), Boolean.valueOf(ignoreConsentParams.c)) && arwb.b(this.d, ignoreConsentParams.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Boolean.valueOf(this.c), this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, this.a, i, false);
        arxc.o(parcel, 2, this.b);
        arxc.e(parcel, 3, this.c);
        arxc.D(parcel, 4, this.d.asBinder());
        arxc.c(parcel, a);
    }

    public IgnoreConsentParams(Account account, int i, boolean z, IBinder iBinder) {
        arbp arbnVar;
        if (iBinder == null) {
            arbnVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            arbnVar = queryLocalInterface instanceof arbp ? (arbp) queryLocalInterface : new arbn(iBinder);
        }
        this.a = account;
        this.b = i;
        this.c = z;
        this.d = arbnVar;
    }
}
