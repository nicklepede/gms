package com.google.android.gms.autofill.data;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aftq;
import defpackage.aftw;
import defpackage.aftz;
import defpackage.ekus;
import j$.time.YearMonth;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class PaymentCard implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aftq();
    public final aftz a;
    public final aftz b;
    public final String c;
    public final YearMonth d;
    public final aftw e;
    public final int f;

    public PaymentCard(aftz aftzVar, aftz aftzVar2, String str, YearMonth yearMonth, aftw aftwVar, int i) {
        this.a = aftzVar;
        this.b = aftzVar2;
        this.c = str;
        this.d = yearMonth;
        this.e = aftwVar;
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
        return this.a.equals(paymentCard.a) && ekus.a(this.b, paymentCard.b) && ekus.a(this.c, paymentCard.c) && ekus.a(this.d, paymentCard.d) && ekus.a(this.e, paymentCard.e) && this.f == paymentCard.f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, Integer.valueOf(this.f)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a.a);
        aftz aftzVar = this.b;
        parcel.writeString(aftzVar != null ? aftzVar.a : null);
        parcel.writeString(this.c);
        YearMonth yearMonth = this.d;
        if (yearMonth != null) {
            parcel.writeInt(1);
            parcel.writeInt(yearMonth.getMonthValue());
            parcel.writeInt(yearMonth.getYear());
        } else {
            parcel.writeInt(0);
        }
        aftw aftwVar = this.e;
        if (aftwVar != null) {
            parcel.writeInt(1);
            parcel.writeByteArray(aftwVar.r());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.f);
    }
}
