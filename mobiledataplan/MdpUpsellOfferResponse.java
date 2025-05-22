package com.google.android.gms.mobiledataplan;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.mobiledataplan.payment.PaymentForm;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cgii;
import defpackage.cgjs;
import defpackage.cgjt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class MdpUpsellOfferResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cgjt();
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

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class Filter extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new cgjs();
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
            atyp.b("tag", this.a, arrayList);
            atyp.b("display_text", this.b, arrayList);
            return atyp.a(arrayList, this);
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
        return atyq.b(this.a, mdpUpsellOfferResponse.a) && atyq.b(this.b, mdpUpsellOfferResponse.b) && atyq.b(this.c, mdpUpsellOfferResponse.c) && atyq.b(this.d, mdpUpsellOfferResponse.d) && Arrays.equals(this.e, mdpUpsellOfferResponse.e) && cgii.b(this.f, mdpUpsellOfferResponse.f) && atyq.b(this.g, mdpUpsellOfferResponse.g) && atyq.b(this.h, mdpUpsellOfferResponse.h) && Arrays.equals(this.i, mdpUpsellOfferResponse.i) && atyq.b(this.j, mdpUpsellOfferResponse.j);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, Integer.valueOf(cgii.a(this.f)), this.g, this.h, Integer.valueOf(Arrays.hashCode(this.e)), Integer.valueOf(Arrays.hashCode(this.i)), this.j});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("CarrierName", this.a, arrayList);
        atyp.b("CarrierLogoUrl", this.b, arrayList);
        atyp.b("PromoMessage", this.c, arrayList);
        atyp.b("Info", this.d, arrayList);
        atyp.b("UpsellPlans", Arrays.toString(this.e), arrayList);
        atyp.b("ExtraInfo", this.f, arrayList);
        atyp.b("EventFlowId", this.g, arrayList);
        atyp.b("UniqueRequestId", this.h, arrayList);
        atyp.b("PaymentForms", Arrays.toString(this.i), arrayList);
        atyp.b("Filters", this.j.toString(), arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.v(parcel, 4, this.d, false);
        atzr.J(parcel, 5, this.e, i);
        atzr.g(parcel, 6, this.f, false);
        atzr.F(parcel, 7, this.g);
        atzr.I(parcel, 8, this.h);
        atzr.J(parcel, 9, this.i, i);
        atzr.y(parcel, 10, this.j, false);
        atzr.c(parcel, a);
    }
}
