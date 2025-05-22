package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.dhiq;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class IssuerInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dhiq();
    final String a;
    final String b;
    final String c;
    final String d;
    final String e;
    final String f;
    final String g;
    final String h;
    final String i;
    final String j;
    final String k;
    final String l;
    final String m;
    final long n;
    final String o;
    final String p;
    final String q;
    final String r;
    final String s;
    final String t;
    final String u;
    final int v;

    public IssuerInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, long j, String str14, String str15, String str16, String str17, String str18, String str19, String str20, int i) {
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
        this.k = str11;
        this.l = str12;
        this.m = str13;
        this.n = j;
        this.o = str14;
        this.p = str15;
        this.q = str16;
        this.r = str17;
        this.s = str18;
        this.t = str19;
        this.u = str20;
        this.v = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof IssuerInfo) {
            IssuerInfo issuerInfo = (IssuerInfo) obj;
            if (atyq.b(this.a, issuerInfo.a) && atyq.b(this.b, issuerInfo.b) && atyq.b(this.c, issuerInfo.c) && atyq.b(this.d, issuerInfo.d) && atyq.b(this.e, issuerInfo.e) && atyq.b(this.f, issuerInfo.f) && atyq.b(this.g, issuerInfo.g) && atyq.b(this.h, issuerInfo.h) && atyq.b(this.i, issuerInfo.i) && atyq.b(this.j, issuerInfo.j) && atyq.b(this.k, issuerInfo.k) && atyq.b(this.l, issuerInfo.l) && atyq.b(this.m, issuerInfo.m) && this.n == issuerInfo.n && atyq.b(this.o, issuerInfo.o) && atyq.b(this.p, issuerInfo.p) && atyq.b(this.q, issuerInfo.q) && atyq.b(this.r, issuerInfo.r) && atyq.b(this.s, issuerInfo.s) && atyq.b(this.t, issuerInfo.t) && atyq.b(this.u, issuerInfo.u) && atyq.b(Integer.valueOf(this.v), Integer.valueOf(issuerInfo.v))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, Long.valueOf(this.n), this.o, this.p, this.q, this.r, this.s, this.t, this.u, Integer.valueOf(this.v)});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("issuerName", this.a, arrayList);
        atyp.b("issuerPhoneNumber", this.b, arrayList);
        atyp.b("appLogoUrl", this.c, arrayList);
        atyp.b("appName", this.d, arrayList);
        atyp.b("appDeveloperName", this.e, arrayList);
        atyp.b("appPackageName", this.f, arrayList);
        atyp.b("privacyNoticeUrl", this.g, arrayList);
        atyp.b("termsAndConditionsUrl", this.h, arrayList);
        atyp.b("productShortName", this.i, arrayList);
        atyp.b("appAction", this.j, arrayList);
        atyp.b("appIntentExtraMessage", this.k, arrayList);
        atyp.b("issuerMessageHeadline", this.l, arrayList);
        atyp.b("issuerMessageBody", this.m, arrayList);
        atyp.b("issuerMessageExpiryTimestampMillis", Long.valueOf(this.n), arrayList);
        atyp.b("issuerMessageLinkPackageName", this.o, arrayList);
        atyp.b("issuerMessageLinkAction", this.p, arrayList);
        atyp.b("issuerMessageLinkExtraText", this.q, arrayList);
        atyp.b("issuerMessageLinkUrl", this.r, arrayList);
        atyp.b("issuerMessageLinkText", this.s, arrayList);
        atyp.b("issuerWebLinkUrl", this.t, arrayList);
        atyp.b("issuerWebLinkText", this.u, arrayList);
        atyp.b("issuerMessageType", Integer.valueOf(this.v), arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 2, str, false);
        atzr.v(parcel, 3, this.b, false);
        atzr.v(parcel, 4, this.c, false);
        atzr.v(parcel, 5, this.d, false);
        atzr.v(parcel, 6, this.e, false);
        atzr.v(parcel, 7, this.f, false);
        atzr.v(parcel, 8, this.g, false);
        atzr.v(parcel, 9, this.h, false);
        atzr.v(parcel, 10, this.i, false);
        atzr.v(parcel, 11, this.j, false);
        atzr.v(parcel, 12, this.k, false);
        atzr.v(parcel, 13, this.l, false);
        atzr.v(parcel, 14, this.m, false);
        atzr.q(parcel, 15, this.n);
        atzr.v(parcel, 16, this.o, false);
        atzr.v(parcel, 17, this.p, false);
        atzr.v(parcel, 18, this.q, false);
        atzr.v(parcel, 20, this.r, false);
        atzr.v(parcel, 21, this.s, false);
        atzr.v(parcel, 22, this.t, false);
        atzr.v(parcel, 23, this.u, false);
        atzr.o(parcel, 24, this.v);
        atzr.c(parcel, a);
    }
}
