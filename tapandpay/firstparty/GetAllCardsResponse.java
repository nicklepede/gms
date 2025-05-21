package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.dewy;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class GetAllCardsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dewy();
    final CardInfo[] a;
    final AccountInfo b;
    final String c;
    final String d;
    final SparseArray e;
    final byte[] f;

    public GetAllCardsResponse(CardInfo[] cardInfoArr, AccountInfo accountInfo, String str, String str2, SparseArray sparseArray, byte[] bArr) {
        this.a = cardInfoArr;
        this.b = accountInfo;
        this.c = str;
        this.d = str2;
        this.e = sparseArray;
        this.f = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.J(parcel, 2, this.a, i);
        arxc.t(parcel, 3, this.b, i, false);
        arxc.v(parcel, 4, this.c, false);
        arxc.v(parcel, 5, this.d, false);
        SparseArray sparseArray = this.e;
        if (sparseArray != null) {
            int b = arxc.b(parcel, 6);
            int size = sparseArray.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeInt(sparseArray.keyAt(i2));
                parcel.writeString((String) sparseArray.valueAt(i2));
            }
            arxc.c(parcel, b);
        }
        arxc.i(parcel, 7, this.f, false);
        arxc.c(parcel, a);
    }
}
