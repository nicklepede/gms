package com.google.android.gms.pay;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.ctbv;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class DebitSePrepaidCardRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctbv();
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
            if (arwb.b(this.a, debitSePrepaidCardRequest.a) && arwb.b(this.b, debitSePrepaidCardRequest.b) && arwb.b(this.c, debitSePrepaidCardRequest.c) && arwb.b(this.d, debitSePrepaidCardRequest.d)) {
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
        arxc.t(parcel, 1, this.a, i, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.v(parcel, 4, this.d, false);
        arxc.c(parcel, a);
    }

    public DebitSePrepaidCardRequest(Account account, SeServiceProvider seServiceProvider, String str, String str2) {
        this.a = account;
        this.b = seServiceProvider;
        this.c = str;
        this.d = str2;
    }
}
