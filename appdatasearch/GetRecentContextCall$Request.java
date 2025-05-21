package com.google.android.gms.appdatasearch;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.trg;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class GetRecentContextCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new trg();
    public final Account a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final String e;

    public GetRecentContextCall$Request(Account account, boolean z, boolean z2, boolean z3, String str) {
        this.a = account;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, this.a, i, false);
        arxc.e(parcel, 2, this.b);
        arxc.e(parcel, 3, this.c);
        arxc.e(parcel, 4, this.d);
        arxc.v(parcel, 5, this.e, false);
        arxc.c(parcel, a);
    }

    public GetRecentContextCall$Request() {
        this(null, false, false, false, null);
    }
}
