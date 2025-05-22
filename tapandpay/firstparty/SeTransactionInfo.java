package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.dhiy;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class SeTransactionInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dhiy();
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
            if (this.a == seTransactionInfo.a && atyq.b(this.b, seTransactionInfo.b) && atyq.b(this.c, seTransactionInfo.c) && this.d == seTransactionInfo.d && this.e == seTransactionInfo.e) {
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
        atyp.b("transactionId", Long.valueOf(this.a), arrayList);
        atyp.b("amount", this.b, arrayList);
        atyp.b("currency", this.c, arrayList);
        atyp.b("transactionTimeMillis", Long.valueOf(this.d), arrayList);
        atyp.b("type", Integer.valueOf(this.e), arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.q(parcel, 1, this.a);
        atzr.d(parcel, 2, this.b, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.q(parcel, 4, this.d);
        atzr.o(parcel, 5, this.e);
        atzr.c(parcel, a);
    }
}
