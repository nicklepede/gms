package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.didj;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class CreateWalletObjectsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new didj();
    public LoyaltyWalletObject a;
    public OfferWalletObject b;
    public GiftCardWalletObject c;
    public int d;

    CreateWalletObjectsRequest() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.t(parcel, 2, this.a, i, false);
        arxc.t(parcel, 3, this.b, i, false);
        arxc.t(parcel, 4, this.c, i, false);
        arxc.o(parcel, 5, this.d);
        arxc.c(parcel, a);
    }

    public CreateWalletObjectsRequest(LoyaltyWalletObject loyaltyWalletObject, OfferWalletObject offerWalletObject, GiftCardWalletObject giftCardWalletObject, int i) {
        this.a = loyaltyWalletObject;
        this.b = offerWalletObject;
        this.c = giftCardWalletObject;
        this.d = i;
    }
}
