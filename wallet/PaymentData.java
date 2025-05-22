package com.google.android.gms.wallet;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.atzs;
import defpackage.dkpp;
import defpackage.dkpq;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class PaymentData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dkpq();
    public String a;
    public CardInfo b;
    public UserAddress c;
    public PaymentMethodToken d;
    public String e;
    public Bundle f;
    public String g;
    public Bundle h;

    private PaymentData() {
    }

    public static dkpp a() {
        return new dkpp(new PaymentData());
    }

    public static PaymentData b(String str) {
        dkpp a = a();
        atzb.t(str, "paymentDataJson cannot be null!");
        PaymentData paymentData = a.a;
        paymentData.g = str;
        return paymentData;
    }

    public final void c(Intent intent) {
        atzs.l(this, intent, "com.google.android.gms.wallet.PaymentData");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, this.a, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.t(parcel, 4, this.d, i, false);
        atzr.v(parcel, 5, this.e, false);
        atzr.g(parcel, 6, this.f, false);
        atzr.v(parcel, 7, this.g, false);
        atzr.g(parcel, 8, this.h, false);
        atzr.c(parcel, a);
    }

    public PaymentData(String str, CardInfo cardInfo, UserAddress userAddress, PaymentMethodToken paymentMethodToken, String str2, Bundle bundle, String str3, Bundle bundle2) {
        this.a = str;
        this.b = cardInfo;
        this.c = userAddress;
        this.d = paymentMethodToken;
        this.e = str2;
        this.f = bundle;
        this.g = str3;
        this.h = bundle2;
    }
}
