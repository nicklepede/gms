package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dhib;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class GetActiveCardsForAccountResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dhib();
    public final CardInfo[] a;

    public GetActiveCardsForAccountResponse(CardInfo[] cardInfoArr) {
        this.a = cardInfoArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.J(parcel, 2, this.a, i);
        atzr.c(parcel, a);
    }
}
