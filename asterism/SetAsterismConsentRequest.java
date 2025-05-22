package com.google.android.gms.asterism;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.wgb;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class SetAsterismConsentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new wgb();
    public final int a;
    public final int b;
    public final int c;
    public final int[] d;
    public final Long e;
    public final int f;
    public final Bundle g;
    public final int h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final int q;
    public final int r;
    public final int s;

    public SetAsterismConsentRequest(int i, int i2, int i3, int[] iArr, Long l, int i4, Bundle bundle, int i5, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i6, int i7, int i8) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = iArr;
        this.e = l;
        this.f = i4;
        this.g = bundle;
        this.h = i5;
        this.i = str;
        this.j = str2;
        this.k = str3;
        this.l = str4;
        this.m = str5;
        this.n = str6;
        this.o = str7;
        this.p = str8;
        this.q = i6;
        this.r = i7;
        this.s = i8;
    }

    public static boolean a(int i, int i2, int i3) {
        return i == 1 && i2 > 0 && i3 > 0;
    }

    public static boolean b(int i, int i2) {
        if (i == 2) {
            return i2 == 2 || i2 == 3 || i2 == 5;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, i2);
        atzr.o(parcel, 2, this.b);
        atzr.o(parcel, 3, this.c);
        atzr.p(parcel, 4, this.d, false);
        atzr.I(parcel, 5, this.e);
        atzr.o(parcel, 6, this.f);
        atzr.g(parcel, 7, this.g, false);
        atzr.o(parcel, 8, this.h);
        atzr.v(parcel, 9, this.i, false);
        atzr.v(parcel, 10, this.j, false);
        atzr.v(parcel, 11, this.k, false);
        atzr.v(parcel, 12, this.l, false);
        atzr.v(parcel, 13, this.m, false);
        atzr.v(parcel, 14, this.n, false);
        atzr.v(parcel, 15, this.o, false);
        atzr.v(parcel, 16, this.p, false);
        atzr.o(parcel, 17, this.q);
        atzr.o(parcel, 18, this.r);
        atzr.o(parcel, 19, this.s);
        atzr.c(parcel, a);
    }
}
