package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dhic;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class GetAllCardsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dhic();
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
        int a = atzr.a(parcel);
        atzr.J(parcel, 2, this.a, i);
        atzr.t(parcel, 3, this.b, i, false);
        atzr.v(parcel, 4, this.c, false);
        atzr.v(parcel, 5, this.d, false);
        SparseArray sparseArray = this.e;
        if (sparseArray != null) {
            int b = atzr.b(parcel, 6);
            int size = sparseArray.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeInt(sparseArray.keyAt(i2));
                parcel.writeString((String) sparseArray.valueAt(i2));
            }
            atzr.c(parcel, b);
        }
        atzr.i(parcel, 7, this.f, false);
        atzr.c(parcel, a);
    }
}
