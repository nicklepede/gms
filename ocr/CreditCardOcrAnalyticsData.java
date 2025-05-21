package com.google.android.gms.ocr;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.csfs;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@Deprecated
/* loaded from: classes6.dex */
public class CreditCardOcrAnalyticsData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new csfs();
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
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, creditCardOcrResult, i, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.q(parcel, 3, this.c);
        arxc.c(parcel, a);
    }
}
