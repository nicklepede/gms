package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.djiw;
import defpackage.djix;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class CommonWalletObject extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new djix();
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;

    @Deprecated
    public String h;
    public int i;
    public final ArrayList j;
    public TimeInterval k;
    public final ArrayList l;

    @Deprecated
    public String m;

    @Deprecated
    public String n;
    public final ArrayList o;
    public boolean p;
    public final ArrayList q;
    public final ArrayList r;
    public final ArrayList s;

    public CommonWalletObject(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, ArrayList arrayList, TimeInterval timeInterval, ArrayList arrayList2, String str9, String str10, ArrayList arrayList3, boolean z, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = i;
        this.j = arrayList;
        this.k = timeInterval;
        this.l = arrayList2;
        this.m = str9;
        this.n = str10;
        this.o = arrayList3;
        this.p = z;
        this.q = arrayList4;
        this.r = arrayList5;
        this.s = arrayList6;
    }

    public static djiw a() {
        return new djiw(new CommonWalletObject());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.v(parcel, 2, this.a, false);
        arxc.v(parcel, 3, this.b, false);
        arxc.v(parcel, 4, this.c, false);
        arxc.v(parcel, 5, this.d, false);
        arxc.v(parcel, 6, this.e, false);
        arxc.v(parcel, 7, this.f, false);
        arxc.v(parcel, 8, this.g, false);
        arxc.v(parcel, 9, this.h, false);
        arxc.o(parcel, 10, this.i);
        arxc.y(parcel, 11, this.j, false);
        arxc.t(parcel, 12, this.k, i, false);
        arxc.y(parcel, 13, this.l, false);
        arxc.v(parcel, 14, this.m, false);
        arxc.v(parcel, 15, this.n, false);
        arxc.y(parcel, 16, this.o, false);
        arxc.e(parcel, 17, this.p);
        arxc.y(parcel, 18, this.q, false);
        arxc.y(parcel, 19, this.r, false);
        arxc.y(parcel, 20, this.s, false);
        arxc.c(parcel, a);
    }

    public CommonWalletObject() {
        this.j = new ArrayList();
        this.l = new ArrayList();
        this.o = new ArrayList();
        this.q = new ArrayList();
        this.r = new ArrayList();
        this.s = new ArrayList();
    }
}
