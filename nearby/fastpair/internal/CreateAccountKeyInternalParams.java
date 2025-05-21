package com.google.android.gms.nearby.fastpair.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cieu;
import defpackage.cifl;
import defpackage.cifn;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class CreateAccountKeyInternalParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cieu();
    public String a;
    public String b;
    public Account c;
    public cifn d;

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
            if (arwb.b(this.a, createAccountKeyInternalParams.a) && arwb.b(this.b, createAccountKeyInternalParams.b) && arwb.b(this.c, createAccountKeyInternalParams.c) && arwb.b(this.d, createAccountKeyInternalParams.d)) {
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
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, this.a, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.D(parcel, 4, a());
        arxc.c(parcel, a);
    }

    public CreateAccountKeyInternalParams(String str, String str2, Account account, IBinder iBinder) {
        cifn ciflVar;
        if (iBinder == null) {
            ciflVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.fastpair.internal.IFastPairCreateAccountKeyCallback");
            ciflVar = queryLocalInterface instanceof cifn ? (cifn) queryLocalInterface : new cifl(iBinder);
        }
        this.a = str;
        this.b = str2;
        this.c = account;
        this.d = ciflVar;
    }
}
