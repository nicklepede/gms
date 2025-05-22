package com.google.android.gms.ocr;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.cuox;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@Deprecated
/* loaded from: classes6.dex */
public class CreditCardOcrAnalyticsData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cuox();
    public final CreditCardOcrResult a;
    public final CreditCardOcrResult b;
    public final long c;

    public CreditCardOcrAnalyticsData(CreditCardOcrResult creditCardOcrResult, CreditCardOcrResult creditCardOcrResult2, long j) {
        this.a = creditCardOcrResult;
        this.b = creditCardOcrResult2;
        this.c = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        CreditCardOcrResult creditCardOcrResult = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, creditCardOcrResult, i, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.q(parcel, 3, this.c);
        atzr.c(parcel, a);
    }
}
