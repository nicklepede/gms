package com.google.android.gms.serviceentitlement;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.dbph;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class GmsTs43Operator extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dbph();
    public final String a;
    public final int b;
    public final List c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final List o;
    public final String p;
    public final String q;
    public final String r;
    public final String s;
    public final String t;
    public final String u;
    public final String v;
    public final String w;

    public GmsTs43Operator(String str, int i, List list, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, List list2, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20) {
        this.a = str;
        this.b = i;
        this.c = list;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = str9;
        this.l = str10;
        this.m = str11;
        this.o = list2;
        this.n = str12;
        this.p = str13;
        this.q = str14;
        this.r = str15;
        this.s = str16;
        this.t = str17;
        this.u = str18;
        this.v = str19;
        this.w = str20;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GmsTs43Operator) {
            GmsTs43Operator gmsTs43Operator = (GmsTs43Operator) obj;
            if (this.a.equals(gmsTs43Operator.a) && this.b == gmsTs43Operator.b && this.c.equals(gmsTs43Operator.c) && this.d.equals(gmsTs43Operator.d) && this.e.equals(gmsTs43Operator.e) && this.f.equals(gmsTs43Operator.f) && this.g.equals(gmsTs43Operator.g) && this.h.equals(gmsTs43Operator.h) && this.i.equals(gmsTs43Operator.i) && this.j.equals(gmsTs43Operator.j) && this.k.equals(gmsTs43Operator.k) && Objects.equals(this.l, gmsTs43Operator.l) && this.m.equals(gmsTs43Operator.m) && this.n.equals(gmsTs43Operator.n) && this.p.equals(gmsTs43Operator.p) && this.q.equals(gmsTs43Operator.q) && this.r.equals(gmsTs43Operator.r) && this.s.equals(gmsTs43Operator.s) && this.t.equals(gmsTs43Operator.t) && this.u.equals(gmsTs43Operator.u) && this.v.equals(gmsTs43Operator.v) && this.w.equals(gmsTs43Operator.w)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w);
    }

    public final String toString() {
        return String.format(Locale.ROOT, "GmsTs43Operator[operation=%s, operationType=%d, operationTargets=%s, companionTerminalId=%s, companionTerminalVendor=%s, companionTerminalModel=%s, companionTerminalSoftwareVersion=%s, companionTerminalFriendlyName=%s, companionTerminalService=%s, companionTerminalIccid=%s, companionTerminalEid=%s, terminalIccid=%s, terminalEid=%s, targetTerminalId=%s, targetTerminalIds=%s, targetTerminalIccid=%s, targetTerminalEid=%s, targetTerminalSerialNumber=%s, targetTerminalModel=%s, oldTerminalId=%s, oldTerminalIccid=%s, messageResponse=%s, messageButton=%s]", this.a, Integer.valueOf(this.b), this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.o(parcel, 2, this.b);
        arxc.x(parcel, 3, this.c, false);
        arxc.v(parcel, 4, this.d, false);
        arxc.v(parcel, 5, this.e, false);
        arxc.v(parcel, 6, this.f, false);
        arxc.v(parcel, 7, this.g, false);
        arxc.v(parcel, 8, this.h, false);
        arxc.v(parcel, 9, this.i, false);
        arxc.v(parcel, 10, this.j, false);
        arxc.v(parcel, 11, this.k, false);
        arxc.v(parcel, 12, this.l, false);
        arxc.v(parcel, 13, this.m, false);
        arxc.v(parcel, 14, this.n, false);
        arxc.x(parcel, 15, this.o, false);
        arxc.v(parcel, 16, this.p, false);
        arxc.v(parcel, 17, this.q, false);
        arxc.v(parcel, 18, this.r, false);
        arxc.v(parcel, 19, this.s, false);
        arxc.v(parcel, 20, this.t, false);
        arxc.v(parcel, 21, this.u, false);
        arxc.v(parcel, 22, this.v, false);
        arxc.v(parcel, 23, this.w, false);
        arxc.c(parcel, a);
    }
}
