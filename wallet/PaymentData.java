package com.google.android.gms.wallet;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.arxd;
import defpackage.diee;
import defpackage.dief;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class PaymentData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dief();
    public String a;
    public CardInfo b;
    public UserAddress c;
    public PaymentMethodToken d;
    public String e;
    public Bundle f;
    String g;
    public Bundle h;

    private PaymentData() {
    }

    public static diee a() {
        return new diee(new PaymentData());
    }

    public static PaymentData b(String str) {
        diee a = a();
        arwm.t(str, "paymentDataJson cannot be null!");
        PaymentData paymentData = a.a;
        paymentData.g = str;
        return paymentData;
    }

    public final void c(Intent intent) {
        arxd.l(this, intent, "com.google.android.gms.wallet.PaymentData");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, this.a, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.t(parcel, 4, this.d, i, false);
        arxc.v(parcel, 5, this.e, false);
        arxc.g(parcel, 6, this.f, false);
        arxc.v(parcel, 7, this.g, false);
        arxc.g(parcel, 8, this.h, false);
        arxc.c(parcel, a);
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
