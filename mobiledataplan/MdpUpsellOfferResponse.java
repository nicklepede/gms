package com.google.android.gms.mobiledataplan;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.mobiledataplan.payment.PaymentForm;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cdzb;
import defpackage.ceal;
import defpackage.ceam;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class MdpUpsellOfferResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ceam();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final MdpUpsellPlan[] e;
    public final Bundle f;
    public final Integer g;
    public final Long h;
    public final PaymentForm[] i;
    public final List j;

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class Filter extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new ceal();
        public final String a;
        public final String b;

        public Filter(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.a, this.b});
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            arwa.b("tag", this.a, arrayList);
            arwa.b("display_text", this.b, arrayList);
            return arwa.a(arrayList, this);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.a);
            parcel.writeString(this.b);
        }
    }

    public MdpUpsellOfferResponse(String str, String str2, String str3, String str4, MdpUpsellPlan[] mdpUpsellPlanArr, Bundle bundle, Integer num, Long l, PaymentForm[] paymentFormArr, List list) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = mdpUpsellPlanArr;
        this.f = bundle;
        this.g = num;
        this.h = l;
        this.i = paymentFormArr;
        this.j = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MdpUpsellOfferResponse)) {
            return false;
        }
        MdpUpsellOfferResponse mdpUpsellOfferResponse = (MdpUpsellOfferResponse) obj;
        return arwb.b(this.a, mdpUpsellOfferResponse.a) && arwb.b(this.b, mdpUpsellOfferResponse.b) && arwb.b(this.c, mdpUpsellOfferResponse.c) && arwb.b(this.d, mdpUpsellOfferResponse.d) && Arrays.equals(this.e, mdpUpsellOfferResponse.e) && cdzb.b(this.f, mdpUpsellOfferResponse.f) && arwb.b(this.g, mdpUpsellOfferResponse.g) && arwb.b(this.h, mdpUpsellOfferResponse.h) && Arrays.equals(this.i, mdpUpsellOfferResponse.i) && arwb.b(this.j, mdpUpsellOfferResponse.j);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, Integer.valueOf(cdzb.a(this.f)), this.g, this.h, Integer.valueOf(Arrays.hashCode(this.e)), Integer.valueOf(Arrays.hashCode(this.i)), this.j});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("CarrierName", this.a, arrayList);
        arwa.b("CarrierLogoUrl", this.b, arrayList);
        arwa.b("PromoMessage", this.c, arrayList);
        arwa.b("Info", this.d, arrayList);
        arwa.b("UpsellPlans", Arrays.toString(this.e), arrayList);
        arwa.b("ExtraInfo", this.f, arrayList);
        arwa.b("EventFlowId", this.g, arrayList);
        arwa.b("UniqueRequestId", this.h, arrayList);
        arwa.b("PaymentForms", Arrays.toString(this.i), arrayList);
        arwa.b("Filters", this.j.toString(), arrayList);
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
        arxc.J(parcel, 5, this.e, i);
        arxc.g(parcel, 6, this.f, false);
        arxc.F(parcel, 7, this.g);
        arxc.I(parcel, 8, this.h);
        arxc.J(parcel, 9, this.i, i);
        arxc.y(parcel, 10, this.j, false);
        arxc.c(parcel, a);
    }
}
