package com.google.android.gms.mobiledataplan;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cgju;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class MdpUpsellPlan extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new cgju();
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
        return atyq.b(this.a, mdpUpsellPlan.a) && atyq.b(this.b, mdpUpsellPlan.b) && atyq.b(this.c, mdpUpsellPlan.c) && atyq.b(Long.valueOf(this.d), Long.valueOf(mdpUpsellPlan.d)) && atyq.b(this.e, mdpUpsellPlan.e) && atyq.b(this.f, mdpUpsellPlan.f) && atyq.b(Long.valueOf(this.g), Long.valueOf(mdpUpsellPlan.g)) && atyq.b(Long.valueOf(this.h), Long.valueOf(mdpUpsellPlan.h)) && atyq.b(this.i, mdpUpsellPlan.i) && atyq.b(this.j, mdpUpsellPlan.j) && atyq.b(Integer.valueOf(this.k), Integer.valueOf(mdpUpsellPlan.k)) && atyq.b(this.l, mdpUpsellPlan.l) && atyq.b(this.m, mdpUpsellPlan.m) && atyq.b(this.n, mdpUpsellPlan.n) && atyq.b(this.o, mdpUpsellPlan.o);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Long.valueOf(this.d), this.e, this.f, Long.valueOf(this.g), Long.valueOf(this.h), this.i, this.j, Integer.valueOf(this.k), this.l, this.m, this.n, this.o});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("PlanId", this.a, arrayList);
        atyp.b("PlanName", this.b, arrayList);
        atyp.b("PlanType", this.c, arrayList);
        atyp.b("Cost", Long.valueOf(this.d), arrayList);
        atyp.b("CostCurrency", this.e, arrayList);
        atyp.b("ConnectionType", this.f, arrayList);
        atyp.b("DurationInSeconds", Long.valueOf(this.g), arrayList);
        atyp.b("mQuotaBytes", Long.valueOf(this.h), arrayList);
        atyp.b("mOfferContext", this.i, arrayList);
        atyp.b("planDescription", this.j, arrayList);
        atyp.b("offerType", Integer.valueOf(this.k), arrayList);
        atyp.b("filterTags", this.l, arrayList);
        atyp.b("paymentUrl", this.m, arrayList);
        atyp.b("fundSources", this.n, arrayList);
        atyp.b("paymentGatewayConfig", this.o, arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.q(parcel, 4, this.d);
        atzr.v(parcel, 5, this.e, false);
        atzr.v(parcel, 6, this.f, false);
        atzr.q(parcel, 7, this.g);
        atzr.q(parcel, 8, this.h);
        atzr.v(parcel, 9, this.i, false);
        atzr.v(parcel, 10, this.j, false);
        atzr.o(parcel, 11, this.k);
        atzr.x(parcel, 12, this.l, false);
        atzr.v(parcel, 13, this.m, false);
        atzr.E(parcel, 14, this.n);
        atzr.y(parcel, 15, this.o, false);
        atzr.c(parcel, a);
    }
}
