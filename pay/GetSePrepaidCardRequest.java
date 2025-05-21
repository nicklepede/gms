package com.google.android.gms.pay;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.ctcm;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class GetSePrepaidCardRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctcm();
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
            if (arwb.b(this.a, getSePrepaidCardRequest.a) && arwb.b(this.b, getSePrepaidCardRequest.b) && arwb.b(this.c, getSePrepaidCardRequest.c) && arwb.b(Integer.valueOf(this.d), Integer.valueOf(getSePrepaidCardRequest.d)) && arwb.b(Integer.valueOf(this.e), Integer.valueOf(getSePrepaidCardRequest.e))) {
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
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, this.a, i, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.o(parcel, 4, this.d);
        arxc.o(parcel, 6, this.e);
        arxc.c(parcel, a);
    }

    public GetSePrepaidCardRequest(Account account, SeServiceProvider seServiceProvider, String str, int i, int i2) {
        this.a = account;
        this.b = seServiceProvider;
        this.c = str;
        this.d = i;
        this.e = i2;
    }
}
