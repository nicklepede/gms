package com.google.android.gms.instantapps.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.bofk;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class DiagnosticInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bofk();
    public final int a;
    public final long b;
    public final int c;
    public final Account d;
    public final Account[] e;

    public DiagnosticInfo(int i, long j, int i2, Account account, Account[] accountArr) {
        this.a = i;
        this.b = j;
        this.c = i2;
        this.d = account;
        this.e = accountArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = arxc.a(parcel);
        arxc.o(parcel, 2, i2);
        arxc.q(parcel, 3, this.b);
        arxc.o(parcel, 4, this.c);
        arxc.t(parcel, 5, this.d, i, false);
        arxc.J(parcel, 6, this.e, i);
        arxc.c(parcel, a);
    }
}
