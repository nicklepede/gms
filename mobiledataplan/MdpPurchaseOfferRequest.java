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
import defpackage.cgjo;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class MdpPurchaseOfferRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cgjo();
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
        return atyq.b(this.a, mdpPurchaseOfferRequest.a) && atyq.b(this.b, mdpPurchaseOfferRequest.b) && atyq.b(this.c, mdpPurchaseOfferRequest.c) && atyq.b(this.d, mdpPurchaseOfferRequest.d) && cgii.b(this.e, mdpPurchaseOfferRequest.e) && atyq.b(this.f, mdpPurchaseOfferRequest.f) && atyq.b(this.g, mdpPurchaseOfferRequest.g) && atyq.b(Integer.valueOf(this.h), Integer.valueOf(mdpPurchaseOfferRequest.h)) && Arrays.equals(this.i, mdpPurchaseOfferRequest.i) && atyq.b(this.j, mdpPurchaseOfferRequest.j);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, Integer.valueOf(cgii.a(this.e)), this.f, this.g, Integer.valueOf(this.h), Integer.valueOf(Arrays.hashCode(this.i)), this.j});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("CarrierPlanId", this.a, arrayList);
        atyp.b("PlanId", this.b, arrayList);
        atyp.b("OfferContext", this.c, arrayList);
        atyp.b("TransactionId", this.d, arrayList);
        atyp.b("ExtraInfo", this.e, arrayList);
        atyp.b("EventFlowId", this.f, arrayList);
        atyp.b("UniqueRequestId", this.g, arrayList);
        atyp.b("OfferType", Integer.valueOf(this.h), arrayList);
        atyp.b("PaymentForms", Arrays.toString(this.i), arrayList);
        atyp.b("GooglePayPaymentDataSerialized", this.j, arrayList);
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
        atzr.g(parcel, 5, this.e, false);
        atzr.F(parcel, 6, this.f);
        atzr.I(parcel, 7, this.g);
        atzr.o(parcel, 8, this.h);
        atzr.J(parcel, 9, this.i, i);
        atzr.v(parcel, 10, this.j, false);
        atzr.c(parcel, a);
    }
}
