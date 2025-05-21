package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import defpackage.arxc;
import defpackage.didm;
import defpackage.didn;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class FullWallet extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new didn();
    public String a;
    public String b;
    ProxyCard c;
    public String d;
    public Address e;
    public Address f;
    public String[] g;
    public UserAddress h;
    public UserAddress i;
    public InstrumentInfo[] j;
    public PaymentMethodToken k;

    private FullWallet() {
    }

    public static didm a() {
        return new didm(new FullWallet());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.v(parcel, 2, this.a, false);
        arxc.v(parcel, 3, this.b, false);
        arxc.t(parcel, 4, this.c, i, false);
        arxc.v(parcel, 5, this.d, false);
        arxc.t(parcel, 6, this.e, i, false);
        arxc.t(parcel, 7, this.f, i, false);
        arxc.w(parcel, 8, this.g, false);
        arxc.t(parcel, 9, this.h, i, false);
        arxc.t(parcel, 10, this.i, i, false);
        arxc.J(parcel, 11, this.j, i);
        arxc.t(parcel, 12, this.k, i, false);
        arxc.c(parcel, a);
    }

    public FullWallet(String str, String str2, ProxyCard proxyCard, String str3, Address address, Address address2, String[] strArr, UserAddress userAddress, UserAddress userAddress2, InstrumentInfo[] instrumentInfoArr, PaymentMethodToken paymentMethodToken) {
        this.a = str;
        this.b = str2;
        this.c = proxyCard;
        this.d = str3;
        this.e = address;
        this.f = address2;
        this.g = strArr;
        this.h = userAddress;
        this.i = userAddress2;
        this.j = instrumentInfoArr;
        this.k = paymentMethodToken;
    }
}
