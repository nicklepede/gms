package com.google.android.gms.pay;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cvlr;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class GetSePrepaidCardRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cvlr();
    public Account a;
    public SeServiceProvider b;
    public String c;
    public int d;
    public int e;

    public GetSePrepaidCardRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetSePrepaidCardRequest) {
            GetSePrepaidCardRequest getSePrepaidCardRequest = (GetSePrepaidCardRequest) obj;
            if (atyq.b(this.a, getSePrepaidCardRequest.a) && atyq.b(this.b, getSePrepaidCardRequest.b) && atyq.b(this.c, getSePrepaidCardRequest.c) && atyq.b(Integer.valueOf(this.d), Integer.valueOf(getSePrepaidCardRequest.d)) && atyq.b(Integer.valueOf(this.e), Integer.valueOf(getSePrepaidCardRequest.e))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Integer.valueOf(this.d), Integer.valueOf(this.e)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, this.a, i, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.o(parcel, 4, this.d);
        atzr.o(parcel, 6, this.e);
        atzr.c(parcel, a);
    }

    public GetSePrepaidCardRequest(Account account, SeServiceProvider seServiceProvider, String str, int i, int i2) {
        this.a = account;
        this.b = seServiceProvider;
        this.c = str;
        this.d = i;
        this.e = i2;
    }
}
