package com.google.android.gms.tapandpay.internal.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dhka;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class FirstPartyTokenizePanRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dhka();
    public String a;
    public boolean b;
    public byte[] c;
    public boolean d;
    public String e;
    boolean f;
    String g;
    boolean h;
    public int i;
    String j;
    public String k;
    public int l;
    boolean m;
    boolean n;
    byte[] o;
    public boolean p;
    String q;
    public String r;
    boolean s;

    public FirstPartyTokenizePanRequest() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.v(parcel, 2, this.a, false);
        atzr.e(parcel, 3, this.b);
        atzr.i(parcel, 5, this.c, false);
        atzr.e(parcel, 6, this.d);
        atzr.v(parcel, 7, this.e, false);
        atzr.e(parcel, 9, this.f);
        atzr.v(parcel, 11, this.g, false);
        atzr.e(parcel, 12, this.h);
        atzr.o(parcel, 13, this.i);
        atzr.v(parcel, 14, this.j, false);
        atzr.v(parcel, 15, this.k, false);
        atzr.o(parcel, 16, this.l);
        atzr.e(parcel, 17, this.m);
        atzr.e(parcel, 18, this.n);
        atzr.i(parcel, 19, this.o, false);
        atzr.e(parcel, 20, this.p);
        atzr.v(parcel, 21, this.q, false);
        atzr.v(parcel, 22, this.r, false);
        atzr.e(parcel, 23, this.s);
        atzr.c(parcel, a);
    }

    public FirstPartyTokenizePanRequest(String str, boolean z, boolean z2, byte[] bArr, boolean z3, String str2, boolean z4, String str3, boolean z5, int i, String str4, String str5, int i2, boolean z6, boolean z7, byte[] bArr2, String str6, String str7, boolean z8) {
        this.a = str;
        this.b = z;
        this.p = z2;
        this.c = bArr;
        this.d = z3;
        this.e = str2;
        this.f = z4;
        this.g = str3;
        this.h = z5;
        this.i = i;
        this.j = str4;
        this.k = str5;
        this.l = i2;
        this.m = z6;
        this.n = z7;
        this.o = bArr2;
        this.q = str6;
        this.r = str7;
        this.s = z8;
    }
}
