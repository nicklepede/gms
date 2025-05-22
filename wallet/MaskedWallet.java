package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import defpackage.atzr;
import defpackage.dkph;
import defpackage.dkpi;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class MaskedWallet extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new dkpi();
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

    public static dkph a() {
        return new dkph(new MaskedWallet());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.v(parcel, 2, this.a, false);
        atzr.v(parcel, 3, this.b, false);
        atzr.w(parcel, 4, this.c, false);
        atzr.v(parcel, 5, this.d, false);
        atzr.t(parcel, 6, this.e, i, false);
        atzr.t(parcel, 7, this.f, i, false);
        atzr.J(parcel, 8, this.g, i);
        atzr.J(parcel, 9, this.h, i);
        atzr.t(parcel, 10, this.i, i, false);
        atzr.t(parcel, 11, this.j, i, false);
        atzr.J(parcel, 12, this.k, i);
        atzr.c(parcel, a);
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
