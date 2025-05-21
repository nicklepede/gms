package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.dexm;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class IssuerInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dexm();
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
            if (arwb.b(this.a, issuerInfo.a) && arwb.b(this.b, issuerInfo.b) && arwb.b(this.c, issuerInfo.c) && arwb.b(this.d, issuerInfo.d) && arwb.b(this.e, issuerInfo.e) && arwb.b(this.f, issuerInfo.f) && arwb.b(this.g, issuerInfo.g) && arwb.b(this.h, issuerInfo.h) && arwb.b(this.i, issuerInfo.i) && arwb.b(this.j, issuerInfo.j) && arwb.b(this.k, issuerInfo.k) && arwb.b(this.l, issuerInfo.l) && arwb.b(this.m, issuerInfo.m) && this.n == issuerInfo.n && arwb.b(this.o, issuerInfo.o) && arwb.b(this.p, issuerInfo.p) && arwb.b(this.q, issuerInfo.q) && arwb.b(this.r, issuerInfo.r) && arwb.b(this.s, issuerInfo.s) && arwb.b(this.t, issuerInfo.t) && arwb.b(this.u, issuerInfo.u) && arwb.b(Integer.valueOf(this.v), Integer.valueOf(issuerInfo.v))) {
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
        arwa.b("issuerName", this.a, arrayList);
        arwa.b("issuerPhoneNumber", this.b, arrayList);
        arwa.b("appLogoUrl", this.c, arrayList);
        arwa.b("appName", this.d, arrayList);
        arwa.b("appDeveloperName", this.e, arrayList);
        arwa.b("appPackageName", this.f, arrayList);
        arwa.b("privacyNoticeUrl", this.g, arrayList);
        arwa.b("termsAndConditionsUrl", this.h, arrayList);
        arwa.b("productShortName", this.i, arrayList);
        arwa.b("appAction", this.j, arrayList);
        arwa.b("appIntentExtraMessage", this.k, arrayList);
        arwa.b("issuerMessageHeadline", this.l, arrayList);
        arwa.b("issuerMessageBody", this.m, arrayList);
        arwa.b("issuerMessageExpiryTimestampMillis", Long.valueOf(this.n), arrayList);
        arwa.b("issuerMessageLinkPackageName", this.o, arrayList);
        arwa.b("issuerMessageLinkAction", this.p, arrayList);
        arwa.b("issuerMessageLinkExtraText", this.q, arrayList);
        arwa.b("issuerMessageLinkUrl", this.r, arrayList);
        arwa.b("issuerMessageLinkText", this.s, arrayList);
        arwa.b("issuerWebLinkUrl", this.t, arrayList);
        arwa.b("issuerWebLinkText", this.u, arrayList);
        arwa.b("issuerMessageType", Integer.valueOf(this.v), arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 2, str, false);
        arxc.v(parcel, 3, this.b, false);
        arxc.v(parcel, 4, this.c, false);
        arxc.v(parcel, 5, this.d, false);
        arxc.v(parcel, 6, this.e, false);
        arxc.v(parcel, 7, this.f, false);
        arxc.v(parcel, 8, this.g, false);
        arxc.v(parcel, 9, this.h, false);
        arxc.v(parcel, 10, this.i, false);
        arxc.v(parcel, 11, this.j, false);
        arxc.v(parcel, 12, this.k, false);
        arxc.v(parcel, 13, this.l, false);
        arxc.v(parcel, 14, this.m, false);
        arxc.q(parcel, 15, this.n);
        arxc.v(parcel, 16, this.o, false);
        arxc.v(parcel, 17, this.p, false);
        arxc.v(parcel, 18, this.q, false);
        arxc.v(parcel, 20, this.r, false);
        arxc.v(parcel, 21, this.s, false);
        arxc.v(parcel, 22, this.t, false);
        arxc.v(parcel, 23, this.u, false);
        arxc.o(parcel, 24, this.v);
        arxc.c(parcel, a);
    }
}
