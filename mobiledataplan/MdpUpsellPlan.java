package com.google.android.gms.mobiledataplan;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cean;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class MdpUpsellPlan extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new cean();
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final String e;
    public final String f;
    public final long g;
    public final long h;
    public final String i;
    public final String j;
    public final int k;
    public final List l;
    public final String m;
    public final List n;
    public final List o;

    public MdpUpsellPlan(String str, String str2, String str3, long j, String str4, String str5, long j2, long j3, String str6, String str7, int i, List list, String str8, List list2, List list3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = str4;
        this.f = str5;
        this.g = j2;
        this.h = j3;
        this.i = str6;
        this.j = str7;
        this.k = i;
        this.l = list;
        this.m = str8;
        this.n = list2;
        this.o = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MdpUpsellPlan)) {
            return false;
        }
        MdpUpsellPlan mdpUpsellPlan = (MdpUpsellPlan) obj;
        return arwb.b(this.a, mdpUpsellPlan.a) && arwb.b(this.b, mdpUpsellPlan.b) && arwb.b(this.c, mdpUpsellPlan.c) && arwb.b(Long.valueOf(this.d), Long.valueOf(mdpUpsellPlan.d)) && arwb.b(this.e, mdpUpsellPlan.e) && arwb.b(this.f, mdpUpsellPlan.f) && arwb.b(Long.valueOf(this.g), Long.valueOf(mdpUpsellPlan.g)) && arwb.b(Long.valueOf(this.h), Long.valueOf(mdpUpsellPlan.h)) && arwb.b(this.i, mdpUpsellPlan.i) && arwb.b(this.j, mdpUpsellPlan.j) && arwb.b(Integer.valueOf(this.k), Integer.valueOf(mdpUpsellPlan.k)) && arwb.b(this.l, mdpUpsellPlan.l) && arwb.b(this.m, mdpUpsellPlan.m) && arwb.b(this.n, mdpUpsellPlan.n) && arwb.b(this.o, mdpUpsellPlan.o);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Long.valueOf(this.d), this.e, this.f, Long.valueOf(this.g), Long.valueOf(this.h), this.i, this.j, Integer.valueOf(this.k), this.l, this.m, this.n, this.o});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("PlanId", this.a, arrayList);
        arwa.b("PlanName", this.b, arrayList);
        arwa.b("PlanType", this.c, arrayList);
        arwa.b("Cost", Long.valueOf(this.d), arrayList);
        arwa.b("CostCurrency", this.e, arrayList);
        arwa.b("ConnectionType", this.f, arrayList);
        arwa.b("DurationInSeconds", Long.valueOf(this.g), arrayList);
        arwa.b("mQuotaBytes", Long.valueOf(this.h), arrayList);
        arwa.b("mOfferContext", this.i, arrayList);
        arwa.b("planDescription", this.j, arrayList);
        arwa.b("offerType", Integer.valueOf(this.k), arrayList);
        arwa.b("filterTags", this.l, arrayList);
        arwa.b("paymentUrl", this.m, arrayList);
        arwa.b("fundSources", this.n, arrayList);
        arwa.b("paymentGatewayConfig", this.o, arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.q(parcel, 4, this.d);
        arxc.v(parcel, 5, this.e, false);
        arxc.v(parcel, 6, this.f, false);
        arxc.q(parcel, 7, this.g);
        arxc.q(parcel, 8, this.h);
        arxc.v(parcel, 9, this.i, false);
        arxc.v(parcel, 10, this.j, false);
        arxc.o(parcel, 11, this.k);
        arxc.x(parcel, 12, this.l, false);
        arxc.v(parcel, 13, this.m, false);
        arxc.E(parcel, 14, this.n);
        arxc.y(parcel, 15, this.o, false);
        arxc.c(parcel, a);
    }
}
