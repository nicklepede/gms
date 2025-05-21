package com.google.android.gms.auth.uiflows.addaccount;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.addw;
import defpackage.arxc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class AccountDetail extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new addw();
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final boolean e;
    public final Intent f;
    public final String g;
    public final boolean h;
    public final boolean i;

    public AccountDetail(String str, String str2, boolean z, String str3, boolean z2, Intent intent, String str4, boolean z3, boolean z4) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = z2;
        this.f = intent;
        this.g = str4;
        this.h = z3;
        this.i = z4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.e(parcel, 3, this.c);
        arxc.v(parcel, 4, this.d, false);
        arxc.e(parcel, 5, this.e);
        arxc.t(parcel, 6, this.f, i, false);
        arxc.v(parcel, 7, this.g, false);
        arxc.e(parcel, 8, this.h);
        arxc.e(parcel, 9, this.i);
        arxc.c(parcel, a);
    }
}
