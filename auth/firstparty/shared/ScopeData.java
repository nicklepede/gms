package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abas;
import defpackage.arxc;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class ScopeData extends AbstractSafeParcelable implements ReflectedParcelable {
    final int b;
    public final String c;
    public final String d;
    public final String e;
    public String f;
    public final boolean g;
    public String h;
    public final String i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public List p;
    public String q;
    public static final List a = Collections.EMPTY_LIST;
    public static final Parcelable.Creator CREATOR = new abas();

    public ScopeData(int i, String str, String str2, String str3, String str4, boolean z, String str5, String str6, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, List list, String str7) {
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = z;
        this.h = str5;
        this.i = str6;
        this.j = z2;
        this.k = z3;
        this.l = z4;
        this.m = z5;
        this.n = z6;
        this.o = z7;
        this.p = list;
        this.q = str7;
    }

    public final String a() {
        return c() ? (String) this.p.get(0) : "";
    }

    public final boolean b() {
        return this.f != null;
    }

    public final boolean c() {
        return !this.p.isEmpty();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = arxc.a(parcel);
        arxc.o(parcel, 1, this.b);
        arxc.v(parcel, 2, this.c, false);
        arxc.v(parcel, 3, this.d, false);
        arxc.v(parcel, 4, this.e, false);
        arxc.v(parcel, 5, this.f, false);
        arxc.e(parcel, 6, this.g);
        arxc.v(parcel, 7, this.h, false);
        arxc.v(parcel, 8, this.i, false);
        arxc.e(parcel, 9, this.j);
        arxc.e(parcel, 10, this.k);
        arxc.e(parcel, 11, this.l);
        arxc.e(parcel, 12, this.m);
        arxc.e(parcel, 13, this.n);
        arxc.e(parcel, 14, this.o);
        arxc.x(parcel, 15, this.p, false);
        arxc.v(parcel, 16, this.q, false);
        arxc.c(parcel, a2);
    }

    public ScopeData(String str, String str2, String str3, String str4, boolean z, String str5, String str6, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, List list, String str7) {
        this(1, str, str2, str3, str4, z, str5, str6, z2, z3, z4, z5, z6, z7, list, str7);
    }
}
