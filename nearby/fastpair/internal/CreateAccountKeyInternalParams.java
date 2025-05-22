package com.google.android.gms.nearby.fastpair.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.ckmz;
import defpackage.cknq;
import defpackage.ckns;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class CreateAccountKeyInternalParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ckmz();
    public String a;
    public String b;
    public Account c;
    public ckns d;

    public CreateAccountKeyInternalParams() {
    }

    public final IBinder a() {
        return this.d.asBinder();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CreateAccountKeyInternalParams) {
            CreateAccountKeyInternalParams createAccountKeyInternalParams = (CreateAccountKeyInternalParams) obj;
            if (atyq.b(this.a, createAccountKeyInternalParams.a) && atyq.b(this.b, createAccountKeyInternalParams.b) && atyq.b(this.c, createAccountKeyInternalParams.c) && atyq.b(this.d, createAccountKeyInternalParams.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, this.a, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.D(parcel, 4, a());
        atzr.c(parcel, a);
    }

    public CreateAccountKeyInternalParams(String str, String str2, Account account, IBinder iBinder) {
        ckns cknqVar;
        if (iBinder == null) {
            cknqVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.fastpair.internal.IFastPairCreateAccountKeyCallback");
            cknqVar = queryLocalInterface instanceof ckns ? (ckns) queryLocalInterface : new cknq(iBinder);
        }
        this.a = str;
        this.b = str2;
        this.c = account;
        this.d = cknqVar;
    }
}
