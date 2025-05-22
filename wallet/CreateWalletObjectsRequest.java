package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dkou;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class CreateWalletObjectsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dkou();
    public LoyaltyWalletObject a;
    public OfferWalletObject b;
    public GiftCardWalletObject c;
    public int d;

    CreateWalletObjectsRequest() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 2, this.a, i, false);
        atzr.t(parcel, 3, this.b, i, false);
        atzr.t(parcel, 4, this.c, i, false);
        atzr.o(parcel, 5, this.d);
        atzr.c(parcel, a);
    }

    public CreateWalletObjectsRequest(LoyaltyWalletObject loyaltyWalletObject, OfferWalletObject offerWalletObject, GiftCardWalletObject giftCardWalletObject, int i) {
        this.a = loyaltyWalletObject;
        this.b = offerWalletObject;
        this.c = giftCardWalletObject;
        this.d = i;
    }
}
