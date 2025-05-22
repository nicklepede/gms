package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dkoo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@Deprecated
/* loaded from: classes7.dex */
public final class Address extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dkoo();
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    boolean j;
    public String k;

    public Address() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.v(parcel, 2, this.a, false);
        atzr.v(parcel, 3, this.b, false);
        atzr.v(parcel, 4, this.c, false);
        atzr.v(parcel, 5, this.d, false);
        atzr.v(parcel, 6, this.e, false);
        atzr.v(parcel, 7, this.f, false);
        atzr.v(parcel, 8, this.g, false);
        atzr.v(parcel, 9, this.h, false);
        atzr.v(parcel, 10, this.i, false);
        atzr.e(parcel, 11, this.j);
        atzr.v(parcel, 12, this.k, false);
        atzr.c(parcel, a);
    }

    public Address(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, String str10) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = z;
        this.k = str10;
    }
}
