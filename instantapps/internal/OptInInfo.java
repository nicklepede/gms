package com.google.android.gms.instantapps.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.bogf;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class OptInInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bogf();
    public final int a;
    public final String b;

    @Deprecated
    public final Account[] c;

    public OptInInfo(int i, String str, Account[] accountArr) {
        this.a = i;
        this.b = str;
        this.c = accountArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = arxc.a(parcel);
        arxc.o(parcel, 2, i2);
        arxc.v(parcel, 3, this.b, false);
        arxc.J(parcel, 4, this.c, i);
        arxc.c(parcel, a);
    }
}
