package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.dewx;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class GetActiveCardsForAccountResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dewx();
    public final CardInfo[] a;

    public GetActiveCardsForAccountResponse(CardInfo[] cardInfoArr) {
        this.a = cardInfoArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.J(parcel, 2, this.a, i);
        arxc.c(parcel, a);
    }
}
