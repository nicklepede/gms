package com.google.android.gms.pay;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cvla;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class DebitSePrepaidCardRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cvla();
    public Account a;
    public SeServiceProvider b;
    public String c;
    public String d;

    public DebitSePrepaidCardRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DebitSePrepaidCardRequest) {
            DebitSePrepaidCardRequest debitSePrepaidCardRequest = (DebitSePrepaidCardRequest) obj;
            if (atyq.b(this.a, debitSePrepaidCardRequest.a) && atyq.b(this.b, debitSePrepaidCardRequest.b) && atyq.b(this.c, debitSePrepaidCardRequest.c) && atyq.b(this.d, debitSePrepaidCardRequest.d)) {
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
        atzr.t(parcel, 1, this.a, i, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.v(parcel, 4, this.d, false);
        atzr.c(parcel, a);
    }

    public DebitSePrepaidCardRequest(Account account, SeServiceProvider seServiceProvider, String str, String str2) {
        this.a = account;
        this.b = seServiceProvider;
        this.c = str;
        this.d = str2;
    }
}
