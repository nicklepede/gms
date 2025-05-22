package com.google.android.gms.nearby.sharing.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atec;
import defpackage.atee;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cpgc;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class IgnoreConsentParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cpgc();
    public Account a;
    public int b;
    public boolean c;
    public atee d;

    public IgnoreConsentParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IgnoreConsentParams) {
            IgnoreConsentParams ignoreConsentParams = (IgnoreConsentParams) obj;
            if (atyq.b(this.a, ignoreConsentParams.a) && atyq.b(Integer.valueOf(this.b), Integer.valueOf(ignoreConsentParams.b)) && atyq.b(Boolean.valueOf(this.c), Boolean.valueOf(ignoreConsentParams.c)) && atyq.b(this.d, ignoreConsentParams.d)) {
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
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, this.a, i, false);
        atzr.o(parcel, 2, this.b);
        atzr.e(parcel, 3, this.c);
        atzr.D(parcel, 4, this.d.asBinder());
        atzr.c(parcel, a);
    }

    public IgnoreConsentParams(Account account, int i, boolean z, IBinder iBinder) {
        atee atecVar;
        if (iBinder == null) {
            atecVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            atecVar = queryLocalInterface instanceof atee ? (atee) queryLocalInterface : new atec(iBinder);
        }
        this.a = account;
        this.b = i;
        this.c = z;
        this.d = atecVar;
    }
}
