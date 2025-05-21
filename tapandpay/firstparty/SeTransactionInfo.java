package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.dexu;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class SeTransactionInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dexu();
    final long a;
    final BigDecimal b;
    final String c;
    final long d;
    final int e;

    public SeTransactionInfo(long j, BigDecimal bigDecimal, String str, long j2, int i) {
        this.a = j;
        this.b = bigDecimal;
        this.c = str;
        this.d = j2;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof SeTransactionInfo) {
            SeTransactionInfo seTransactionInfo = (SeTransactionInfo) obj;
            if (this.a == seTransactionInfo.a && arwb.b(this.b, seTransactionInfo.b) && arwb.b(this.c, seTransactionInfo.c) && this.d == seTransactionInfo.d && this.e == seTransactionInfo.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, this.c, Long.valueOf(this.d), Integer.valueOf(this.e)});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("transactionId", Long.valueOf(this.a), arrayList);
        arwa.b("amount", this.b, arrayList);
        arwa.b("currency", this.c, arrayList);
        arwa.b("transactionTimeMillis", Long.valueOf(this.d), arrayList);
        arwa.b("type", Integer.valueOf(this.e), arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.q(parcel, 1, this.a);
        arxc.d(parcel, 2, this.b, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.q(parcel, 4, this.d);
        arxc.o(parcel, 5, this.e);
        arxc.c(parcel, a);
    }
}
