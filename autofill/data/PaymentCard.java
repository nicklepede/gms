package com.google.android.gms.autofill.data;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.adtj;
import defpackage.adtp;
import defpackage.adts;
import defpackage.eihn;
import j$.time.YearMonth;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class PaymentCard implements Parcelable {
    public static final Parcelable.Creator CREATOR = new adtj();
    public final adts a;
    public final adts b;
    public final String c;
    public final YearMonth d;
    public final adtp e;
    public final int f;

    public PaymentCard(adts adtsVar, adts adtsVar2, String str, YearMonth yearMonth, adtp adtpVar, int i) {
        this.a = adtsVar;
        this.b = adtsVar2;
        this.c = str;
        this.d = yearMonth;
        this.e = adtpVar;
        this.f = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentCard)) {
            return false;
        }
        PaymentCard paymentCard = (PaymentCard) obj;
        return this.a.equals(paymentCard.a) && eihn.a(this.b, paymentCard.b) && eihn.a(this.c, paymentCard.c) && eihn.a(this.d, paymentCard.d) && eihn.a(this.e, paymentCard.e) && this.f == paymentCard.f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, Integer.valueOf(this.f)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a.a);
        adts adtsVar = this.b;
        parcel.writeString(adtsVar != null ? adtsVar.a : null);
        parcel.writeString(this.c);
        YearMonth yearMonth = this.d;
        if (yearMonth != null) {
            parcel.writeInt(1);
            parcel.writeInt(yearMonth.getMonthValue());
            parcel.writeInt(yearMonth.getYear());
        } else {
            parcel.writeInt(0);
        }
        adtp adtpVar = this.e;
        if (adtpVar != null) {
            parcel.writeInt(1);
            parcel.writeByteArray(adtpVar.r());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.f);
    }
}
