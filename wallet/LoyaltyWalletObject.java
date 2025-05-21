package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import com.google.android.gms.wallet.wobs.LoyaltyPoints;
import com.google.android.gms.wallet.wobs.TimeInterval;
import defpackage.arxc;
import defpackage.didv;
import defpackage.djiw;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class LoyaltyWalletObject extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new didv();
    String a;
    public String b;
    String c;
    String d;
    public String e;
    String f;
    String g;
    String h;

    @Deprecated
    String i;
    String j;
    int k;
    final ArrayList l;
    TimeInterval m;
    final ArrayList n;

    @Deprecated
    String o;

    @Deprecated
    String p;
    final ArrayList q;
    boolean r;
    final ArrayList s;
    final ArrayList t;
    final ArrayList u;
    public LoyaltyPoints v;

    public LoyaltyWalletObject(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, ArrayList arrayList, TimeInterval timeInterval, ArrayList arrayList2, String str11, String str12, ArrayList arrayList3, boolean z, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, LoyaltyPoints loyaltyPoints) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = str10;
        this.k = i;
        this.l = arrayList;
        this.m = timeInterval;
        this.n = arrayList2;
        this.o = str11;
        this.p = str12;
        this.q = arrayList3;
        this.r = z;
        this.s = arrayList4;
        this.t = arrayList5;
        this.u = arrayList6;
        this.v = loyaltyPoints;
    }

    public final CommonWalletObject a() {
        djiw a = CommonWalletObject.a();
        a.a(this.a);
        CommonWalletObject commonWalletObject = a.a;
        commonWalletObject.b = this.j;
        commonWalletObject.c = this.d;
        commonWalletObject.d = this.c;
        commonWalletObject.e = this.f;
        commonWalletObject.f = this.g;
        commonWalletObject.g = this.h;
        commonWalletObject.h = this.i;
        commonWalletObject.i = this.k;
        commonWalletObject.j.addAll(this.l);
        commonWalletObject.k = this.m;
        commonWalletObject.l.addAll(this.n);
        commonWalletObject.m = this.o;
        commonWalletObject.n = this.p;
        commonWalletObject.o.addAll(this.q);
        commonWalletObject.p = this.r;
        commonWalletObject.q.addAll(this.s);
        commonWalletObject.r.addAll(this.t);
        commonWalletObject.s.addAll(this.u);
        return commonWalletObject;
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
        arxc.v(parcel, 10, this.i, false);
        arxc.v(parcel, 11, this.j, false);
        arxc.o(parcel, 12, this.k);
        arxc.y(parcel, 13, this.l, false);
        arxc.t(parcel, 14, this.m, i, false);
        arxc.y(parcel, 15, this.n, false);
        arxc.v(parcel, 16, this.o, false);
        arxc.v(parcel, 17, this.p, false);
        arxc.y(parcel, 18, this.q, false);
        arxc.e(parcel, 19, this.r);
        arxc.y(parcel, 20, this.s, false);
        arxc.y(parcel, 21, this.t, false);
        arxc.y(parcel, 22, this.u, false);
        arxc.t(parcel, 23, this.v, i, false);
        arxc.c(parcel, a);
    }

    LoyaltyWalletObject() {
        this.l = new ArrayList();
        this.n = new ArrayList();
        this.q = new ArrayList();
        this.s = new ArrayList();
        this.t = new ArrayList();
        this.u = new ArrayList();
    }
}
