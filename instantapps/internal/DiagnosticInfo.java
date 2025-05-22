package com.google.android.gms.instantapps.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.bqna;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class DiagnosticInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bqna();
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
        int a = atzr.a(parcel);
        atzr.o(parcel, 2, i2);
        atzr.q(parcel, 3, this.b);
        atzr.o(parcel, 4, this.c);
        atzr.t(parcel, 5, this.d, i, false);
        atzr.J(parcel, 6, this.e, i);
        atzr.c(parcel, a);
    }
}
