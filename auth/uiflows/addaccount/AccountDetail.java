package com.google.android.gms.auth.uiflows.addaccount;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.afdy;
import defpackage.atzr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class AccountDetail extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new afdy();
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
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.e(parcel, 3, this.c);
        atzr.v(parcel, 4, this.d, false);
        atzr.e(parcel, 5, this.e);
        atzr.t(parcel, 6, this.f, i, false);
        atzr.v(parcel, 7, this.g, false);
        atzr.e(parcel, 8, this.h);
        atzr.e(parcel, 9, this.i);
        atzr.c(parcel, a);
    }
}
