package com.google.android.gms.mobiledataplan;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cdzb;
import defpackage.ceai;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class MdpPurchaseOfferResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ceai();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final String f;
    public final String g;
    public final Bundle h;
    public final Integer i;
    public final Long j;

    public MdpPurchaseOfferResponse(String str, String str2, String str3, String str4, long j, String str5, String str6, Bundle bundle, Integer num, Long l) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = j;
        this.f = str5;
        this.g = str6;
        this.h = bundle;
        this.i = num;
        this.j = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MdpPurchaseOfferResponse)) {
            return false;
        }
        MdpPurchaseOfferResponse mdpPurchaseOfferResponse = (MdpPurchaseOfferResponse) obj;
        return arwb.b(this.a, mdpPurchaseOfferResponse.a) && arwb.b(this.b, mdpPurchaseOfferResponse.b) && arwb.b(this.c, mdpPurchaseOfferResponse.c) && arwb.b(this.d, mdpPurchaseOfferResponse.d) && arwb.b(Long.valueOf(this.e), Long.valueOf(mdpPurchaseOfferResponse.e)) && arwb.b(this.f, mdpPurchaseOfferResponse.f) && arwb.b(this.g, mdpPurchaseOfferResponse.g) && cdzb.b(this.h, mdpPurchaseOfferResponse.h) && arwb.b(this.i, mdpPurchaseOfferResponse.i) && arwb.b(this.j, mdpPurchaseOfferResponse.j);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, Long.valueOf(this.e), this.f, this.g, this.h, this.i, this.j});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("CarrierName", this.a, arrayList);
        arwa.b("TransactionId", this.b, arrayList);
        arwa.b("ConfirmationCode", this.c, arrayList);
        arwa.b("TransactionMsg", this.d, arrayList);
        arwa.b("RemainingBalance", Long.valueOf(this.e), arrayList);
        arwa.b("CostCurrency", this.f, arrayList);
        arwa.b("PlanActivationTime", this.g, arrayList);
        arwa.b("ExtraInfo", this.h, arrayList);
        arwa.b("EventFlowId", this.i, arrayList);
        arwa.b("UniqueRequestId", this.j, arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.v(parcel, 4, this.d, false);
        arxc.q(parcel, 5, this.e);
        arxc.v(parcel, 6, this.f, false);
        arxc.v(parcel, 7, this.g, false);
        arxc.g(parcel, 8, this.h, false);
        arxc.F(parcel, 9, this.i);
        arxc.I(parcel, 10, this.j);
        arxc.c(parcel, a);
    }
}
