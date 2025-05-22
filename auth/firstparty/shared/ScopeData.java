package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.adas;
import defpackage.atzr;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
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
    public static final Parcelable.Creator CREATOR = new adas();

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
        int a2 = atzr.a(parcel);
        atzr.o(parcel, 1, this.b);
        atzr.v(parcel, 2, this.c, false);
        atzr.v(parcel, 3, this.d, false);
        atzr.v(parcel, 4, this.e, false);
        atzr.v(parcel, 5, this.f, false);
        atzr.e(parcel, 6, this.g);
        atzr.v(parcel, 7, this.h, false);
        atzr.v(parcel, 8, this.i, false);
        atzr.e(parcel, 9, this.j);
        atzr.e(parcel, 10, this.k);
        atzr.e(parcel, 11, this.l);
        atzr.e(parcel, 12, this.m);
        atzr.e(parcel, 13, this.n);
        atzr.e(parcel, 14, this.o);
        atzr.x(parcel, 15, this.p, false);
        atzr.v(parcel, 16, this.q, false);
        atzr.c(parcel, a2);
    }

    public ScopeData(String str, String str2, String str3, String str4, boolean z, String str5, String str6, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, List list, String str7) {
        this(1, str, str2, str3, str4, z, str5, str6, z2, z3, z4, z5, z6, z7, list, str7);
    }
}
