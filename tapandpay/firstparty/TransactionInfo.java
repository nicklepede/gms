package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atzr;
import defpackage.dhjd;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class TransactionInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dhjd();
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
        atyp.b("transactionDelivery", Integer.valueOf(this.a), arrayList);
        atyp.b("transactionLimit", Integer.valueOf(this.b), arrayList);
        atyp.b("supportedTransactions", Integer.valueOf(this.c), arrayList);
        atyp.b("deliveryPreference", Integer.valueOf(this.d), arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 2, this.a);
        atzr.o(parcel, 3, this.b);
        atzr.o(parcel, 4, this.c);
        atzr.o(parcel, 5, this.d);
        atzr.c(parcel, a);
    }
}
