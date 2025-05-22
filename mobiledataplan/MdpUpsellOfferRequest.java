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
import defpackage.cgjr;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class MdpUpsellOfferRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cgjr();
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
        return atyq.b(this.a, mdpUpsellOfferRequest.a) && cgii.b(this.b, mdpUpsellOfferRequest.b) && atyq.b(this.c, mdpUpsellOfferRequest.c) && atyq.b(this.d, mdpUpsellOfferRequest.d) && atyq.b(this.f, mdpUpsellOfferRequest.f) && atyq.b(this.g, mdpUpsellOfferRequest.g) && atyq.b(this.h, mdpUpsellOfferRequest.h) && atyq.b(this.i, mdpUpsellOfferRequest.i) && atyq.b(this.j, mdpUpsellOfferRequest.j);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(cgii.a(this.b)), this.c, this.d, this.h, this.i, this.j});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("CarrierPlanId", this.a, arrayList);
        atyp.b("ExtraInfo", this.b, arrayList);
        atyp.b("EventFlowId", this.c, arrayList);
        atyp.b("UniqueRequestId", this.d, arrayList);
        atyp.b("UpsellContext", this.f, arrayList);
        atyp.b("CarrierId", this.g, arrayList);
        atyp.b("WalletBalance", this.h, arrayList);
        atyp.b("PlanSegmentId", this.i, arrayList);
        atyp.b("PlanSubsegmentId", this.j, arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.g(parcel, 2, this.b, false);
        atzr.F(parcel, 3, this.c);
        atzr.I(parcel, 4, this.d);
        atzr.J(parcel, 5, this.e, i);
        atzr.v(parcel, 6, this.f, false);
        atzr.I(parcel, 7, this.g);
        atzr.t(parcel, 8, this.h, i, false);
        atzr.v(parcel, 9, this.i, false);
        atzr.v(parcel, 10, this.j, false);
        atzr.c(parcel, a);
    }
}
