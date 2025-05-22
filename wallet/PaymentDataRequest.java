package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dkpr;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class PaymentDataRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dkpr();
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
        int a = atzr.a(parcel);
        atzr.e(parcel, 1, this.a);
        atzr.e(parcel, 2, this.b);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.e(parcel, 4, this.d);
        atzr.t(parcel, 5, this.e, i, false);
        atzr.E(parcel, 6, this.f);
        atzr.t(parcel, 7, this.g, i, false);
        atzr.t(parcel, 8, this.h, i, false);
        atzr.e(parcel, 9, this.i);
        atzr.v(parcel, 10, this.j, false);
        atzr.g(parcel, 11, this.l, false);
        atzr.i(parcel, 12, this.k, false);
        atzr.c(parcel, a);
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
