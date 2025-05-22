package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import com.google.android.gms.wallet.wobs.LoyaltyPoints;
import com.google.android.gms.wallet.wobs.TimeInterval;
import defpackage.atzr;
import defpackage.dkpg;
import defpackage.dlup;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class LoyaltyWalletObject extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dkpg();
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
        dlup a = CommonWalletObject.a();
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
        atzr.v(parcel, 11, this.j, false);
        atzr.o(parcel, 12, this.k);
        atzr.y(parcel, 13, this.l, false);
        atzr.t(parcel, 14, this.m, i, false);
        atzr.y(parcel, 15, this.n, false);
        atzr.v(parcel, 16, this.o, false);
        atzr.v(parcel, 17, this.p, false);
        atzr.y(parcel, 18, this.q, false);
        atzr.e(parcel, 19, this.r);
        atzr.y(parcel, 20, this.s, false);
        atzr.y(parcel, 21, this.t, false);
        atzr.y(parcel, 22, this.u, false);
        atzr.t(parcel, 23, this.v, i, false);
        atzr.c(parcel, a);
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
