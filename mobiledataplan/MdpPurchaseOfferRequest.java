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
import defpackage.ceah;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class MdpPurchaseOfferRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ceah();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Bundle e;
    public final Integer f;
    public final Long g;
    public final int h;
    public final PaymentForm[] i;
    public final String j;

    public MdpPurchaseOfferRequest(String str, String str2, String str3, String str4, Bundle bundle, Integer num, Long l, int i, PaymentForm[] paymentFormArr, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = bundle;
        this.f = num;
        this.g = l;
        this.h = i;
        this.i = paymentFormArr;
        this.j = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MdpPurchaseOfferRequest)) {
            return false;
        }
        MdpPurchaseOfferRequest mdpPurchaseOfferRequest = (MdpPurchaseOfferRequest) obj;
        return arwb.b(this.a, mdpPurchaseOfferRequest.a) && arwb.b(this.b, mdpPurchaseOfferRequest.b) && arwb.b(this.c, mdpPurchaseOfferRequest.c) && arwb.b(this.d, mdpPurchaseOfferRequest.d) && cdzb.b(this.e, mdpPurchaseOfferRequest.e) && arwb.b(this.f, mdpPurchaseOfferRequest.f) && arwb.b(this.g, mdpPurchaseOfferRequest.g) && arwb.b(Integer.valueOf(this.h), Integer.valueOf(mdpPurchaseOfferRequest.h)) && Arrays.equals(this.i, mdpPurchaseOfferRequest.i) && arwb.b(this.j, mdpPurchaseOfferRequest.j);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, Integer.valueOf(cdzb.a(this.e)), this.f, this.g, Integer.valueOf(this.h), Integer.valueOf(Arrays.hashCode(this.i)), this.j});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("CarrierPlanId", this.a, arrayList);
        arwa.b("PlanId", this.b, arrayList);
        arwa.b("OfferContext", this.c, arrayList);
        arwa.b("TransactionId", this.d, arrayList);
        arwa.b("ExtraInfo", this.e, arrayList);
        arwa.b("EventFlowId", this.f, arrayList);
        arwa.b("UniqueRequestId", this.g, arrayList);
        arwa.b("OfferType", Integer.valueOf(this.h), arrayList);
        arwa.b("PaymentForms", Arrays.toString(this.i), arrayList);
        arwa.b("GooglePayPaymentDataSerialized", this.j, arrayList);
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
        arxc.g(parcel, 5, this.e, false);
        arxc.F(parcel, 6, this.f);
        arxc.I(parcel, 7, this.g);
        arxc.o(parcel, 8, this.h);
        arxc.J(parcel, 9, this.i, i);
        arxc.v(parcel, 10, this.j, false);
        arxc.c(parcel, a);
    }
}
