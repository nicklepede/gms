package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arxc;
import defpackage.dexz;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class TransactionInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dexz();
    final int a;
    final int b;
    final int c;
    final int d;

    public TransactionInfo(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TransactionInfo) {
            TransactionInfo transactionInfo = (TransactionInfo) obj;
            if (this.a == transactionInfo.a && this.b == transactionInfo.b && this.c == transactionInfo.c && this.d == transactionInfo.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d)});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("transactionDelivery", Integer.valueOf(this.a), arrayList);
        arwa.b("transactionLimit", Integer.valueOf(this.b), arrayList);
        arwa.b("supportedTransactions", Integer.valueOf(this.c), arrayList);
        arwa.b("deliveryPreference", Integer.valueOf(this.d), arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 2, this.a);
        arxc.o(parcel, 3, this.b);
        arxc.o(parcel, 4, this.c);
        arxc.o(parcel, 5, this.d);
        arxc.c(parcel, a);
    }
}
