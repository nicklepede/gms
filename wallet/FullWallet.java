package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import defpackage.atzr;
import defpackage.dkox;
import defpackage.dkoy;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class FullWallet extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new dkoy();
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

    public static dkox a() {
        return new dkox(new FullWallet());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.v(parcel, 2, this.a, false);
        atzr.v(parcel, 3, this.b, false);
        atzr.t(parcel, 4, this.c, i, false);
        atzr.v(parcel, 5, this.d, false);
        atzr.t(parcel, 6, this.e, i, false);
        atzr.t(parcel, 7, this.f, i, false);
        atzr.w(parcel, 8, this.g, false);
        atzr.t(parcel, 9, this.h, i, false);
        atzr.t(parcel, 10, this.i, i, false);
        atzr.J(parcel, 11, this.j, i);
        atzr.t(parcel, 12, this.k, i, false);
        atzr.c(parcel, a);
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
