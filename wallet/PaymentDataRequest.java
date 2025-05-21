package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.dieg;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class PaymentDataRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dieg();
    public boolean a;
    public boolean b;
    public CardRequirements c;
    public boolean d;
    public ShippingAddressRequirements e;
    public ArrayList f;
    public PaymentMethodTokenizationParameters g;
    public TransactionInfo h;
    public final boolean i;
    public String j;
    public byte[] k;
    public Bundle l;

    public PaymentDataRequest() {
        this.i = true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.e(parcel, 1, this.a);
        arxc.e(parcel, 2, this.b);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.e(parcel, 4, this.d);
        arxc.t(parcel, 5, this.e, i, false);
        arxc.E(parcel, 6, this.f);
        arxc.t(parcel, 7, this.g, i, false);
        arxc.t(parcel, 8, this.h, i, false);
        arxc.e(parcel, 9, this.i);
        arxc.v(parcel, 10, this.j, false);
        arxc.g(parcel, 11, this.l, false);
        arxc.i(parcel, 12, this.k, false);
        arxc.c(parcel, a);
    }

    public PaymentDataRequest(boolean z, boolean z2, CardRequirements cardRequirements, boolean z3, ShippingAddressRequirements shippingAddressRequirements, ArrayList arrayList, PaymentMethodTokenizationParameters paymentMethodTokenizationParameters, TransactionInfo transactionInfo, boolean z4, String str, byte[] bArr, Bundle bundle) {
        this.a = z;
        this.b = z2;
        this.c = cardRequirements;
        this.d = z3;
        this.e = shippingAddressRequirements;
        this.f = arrayList;
        this.g = paymentMethodTokenizationParameters;
        this.h = transactionInfo;
        this.i = z4;
        this.j = str;
        this.k = bArr;
        this.l = bundle;
    }
}
