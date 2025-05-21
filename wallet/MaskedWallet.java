package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import defpackage.arxc;
import defpackage.didw;
import defpackage.didx;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class MaskedWallet extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new didx();
    public String a;
    public String b;
    public String[] c;
    public String d;
    public Address e;
    public Address f;
    LoyaltyWalletObject[] g;
    OfferWalletObject[] h;
    public UserAddress i;
    public UserAddress j;
    public InstrumentInfo[] k;

    private MaskedWallet() {
    }

    public static didw a() {
        return new didw(new MaskedWallet());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.v(parcel, 2, this.a, false);
        arxc.v(parcel, 3, this.b, false);
        arxc.w(parcel, 4, this.c, false);
        arxc.v(parcel, 5, this.d, false);
        arxc.t(parcel, 6, this.e, i, false);
        arxc.t(parcel, 7, this.f, i, false);
        arxc.J(parcel, 8, this.g, i);
        arxc.J(parcel, 9, this.h, i);
        arxc.t(parcel, 10, this.i, i, false);
        arxc.t(parcel, 11, this.j, i, false);
        arxc.J(parcel, 12, this.k, i);
        arxc.c(parcel, a);
    }

    public MaskedWallet(String str, String str2, String[] strArr, String str3, Address address, Address address2, LoyaltyWalletObject[] loyaltyWalletObjectArr, OfferWalletObject[] offerWalletObjectArr, UserAddress userAddress, UserAddress userAddress2, InstrumentInfo[] instrumentInfoArr) {
        this.a = str;
        this.b = str2;
        this.c = strArr;
        this.d = str3;
        this.e = address;
        this.f = address2;
        this.g = loyaltyWalletObjectArr;
        this.h = offerWalletObjectArr;
        this.i = userAddress;
        this.j = userAddress2;
        this.k = instrumentInfoArr;
    }
}
