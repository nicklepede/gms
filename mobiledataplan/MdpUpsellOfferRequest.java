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
import defpackage.ceak;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class MdpUpsellOfferRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ceak();
    public final String a;
    public final Bundle b;
    public final Integer c;
    public final Long d;

    @Deprecated
    public final PaymentForm[] e;
    public final String f;
    public final Long g;
    public final MdpMoney h;
    public final String i;
    public final String j;

    public MdpUpsellOfferRequest(String str, Bundle bundle, Integer num, Long l, PaymentForm[] paymentFormArr, String str2, Long l2, MdpMoney mdpMoney, String str3, String str4) {
        this.a = str;
        this.b = bundle;
        this.c = num;
        this.d = l;
        this.e = paymentFormArr;
        this.f = str2;
        this.g = l2;
        this.h = mdpMoney;
        this.i = str3;
        this.j = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MdpUpsellOfferRequest)) {
            return false;
        }
        MdpUpsellOfferRequest mdpUpsellOfferRequest = (MdpUpsellOfferRequest) obj;
        return arwb.b(this.a, mdpUpsellOfferRequest.a) && cdzb.b(this.b, mdpUpsellOfferRequest.b) && arwb.b(this.c, mdpUpsellOfferRequest.c) && arwb.b(this.d, mdpUpsellOfferRequest.d) && arwb.b(this.f, mdpUpsellOfferRequest.f) && arwb.b(this.g, mdpUpsellOfferRequest.g) && arwb.b(this.h, mdpUpsellOfferRequest.h) && arwb.b(this.i, mdpUpsellOfferRequest.i) && arwb.b(this.j, mdpUpsellOfferRequest.j);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(cdzb.a(this.b)), this.c, this.d, this.h, this.i, this.j});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("CarrierPlanId", this.a, arrayList);
        arwa.b("ExtraInfo", this.b, arrayList);
        arwa.b("EventFlowId", this.c, arrayList);
        arwa.b("UniqueRequestId", this.d, arrayList);
        arwa.b("UpsellContext", this.f, arrayList);
        arwa.b("CarrierId", this.g, arrayList);
        arwa.b("WalletBalance", this.h, arrayList);
        arwa.b("PlanSegmentId", this.i, arrayList);
        arwa.b("PlanSubsegmentId", this.j, arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.g(parcel, 2, this.b, false);
        arxc.F(parcel, 3, this.c);
        arxc.I(parcel, 4, this.d);
        arxc.J(parcel, 5, this.e, i);
        arxc.v(parcel, 6, this.f, false);
        arxc.I(parcel, 7, this.g);
        arxc.t(parcel, 8, this.h, i, false);
        arxc.v(parcel, 9, this.i, false);
        arxc.v(parcel, 10, this.j, false);
        arxc.c(parcel, a);
    }
}
