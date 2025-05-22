package com.google.android.gms.mobiledataplan;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cgii;
import defpackage.cgjp;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class MdpPurchaseOfferResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cgjp();
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
        return atyq.b(this.a, mdpPurchaseOfferResponse.a) && atyq.b(this.b, mdpPurchaseOfferResponse.b) && atyq.b(this.c, mdpPurchaseOfferResponse.c) && atyq.b(this.d, mdpPurchaseOfferResponse.d) && atyq.b(Long.valueOf(this.e), Long.valueOf(mdpPurchaseOfferResponse.e)) && atyq.b(this.f, mdpPurchaseOfferResponse.f) && atyq.b(this.g, mdpPurchaseOfferResponse.g) && cgii.b(this.h, mdpPurchaseOfferResponse.h) && atyq.b(this.i, mdpPurchaseOfferResponse.i) && atyq.b(this.j, mdpPurchaseOfferResponse.j);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, Long.valueOf(this.e), this.f, this.g, this.h, this.i, this.j});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("CarrierName", this.a, arrayList);
        atyp.b("TransactionId", this.b, arrayList);
        atyp.b("ConfirmationCode", this.c, arrayList);
        atyp.b("TransactionMsg", this.d, arrayList);
        atyp.b("RemainingBalance", Long.valueOf(this.e), arrayList);
        atyp.b("CostCurrency", this.f, arrayList);
        atyp.b("PlanActivationTime", this.g, arrayList);
        atyp.b("ExtraInfo", this.h, arrayList);
        atyp.b("EventFlowId", this.i, arrayList);
        atyp.b("UniqueRequestId", this.j, arrayList);
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
        atzr.q(parcel, 5, this.e);
        atzr.v(parcel, 6, this.f, false);
        atzr.v(parcel, 7, this.g, false);
        atzr.g(parcel, 8, this.h, false);
        atzr.F(parcel, 9, this.i);
        atzr.I(parcel, 10, this.j);
        atzr.c(parcel, a);
    }
}
