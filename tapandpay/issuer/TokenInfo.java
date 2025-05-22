package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dhkt;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class TokenInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dhkt();
    final String a;
    final String b;
    final String c;
    final String d;
    final int e;
    final int f;
    final int g;
    final boolean h;
    final String i;
    final String j;
    final Integer k;
    final Integer l;

    public TokenInfo(String str, String str2, String str3, String str4, int i, int i2, int i3, boolean z, String str5, String str6, Integer num, Integer num2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.h = z;
        this.i = str5;
        this.j = str6;
        this.k = num;
        this.l = num2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.v(parcel, 4, this.d, false);
        atzr.o(parcel, 5, this.e);
        atzr.o(parcel, 6, this.f);
        atzr.o(parcel, 7, this.g);
        atzr.e(parcel, 8, this.h);
        atzr.v(parcel, 9, this.i, false);
        atzr.v(parcel, 10, this.j, false);
        atzr.F(parcel, 11, this.k);
        atzr.F(parcel, 12, this.l);
        atzr.c(parcel, a);
    }
}
