package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cvnw;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class TransactionListIntentArgs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cvnw();
    public GooglePaymentMethodId[] a;
    public int b;
    public int c;
    public Transaction d;

    private TransactionListIntentArgs() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TransactionListIntentArgs) {
            TransactionListIntentArgs transactionListIntentArgs = (TransactionListIntentArgs) obj;
            if (Arrays.equals(this.a, transactionListIntentArgs.a) && atyq.b(Integer.valueOf(this.b), Integer.valueOf(transactionListIntentArgs.b)) && atyq.b(Integer.valueOf(this.c), Integer.valueOf(transactionListIntentArgs.c)) && atyq.b(this.d, transactionListIntentArgs.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), Integer.valueOf(this.b), Integer.valueOf(this.c), this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.J(parcel, 1, this.a, i);
        atzr.o(parcel, 2, this.b);
        atzr.o(parcel, 3, this.c);
        atzr.t(parcel, 4, this.d, i, false);
        atzr.c(parcel, a);
    }

    public TransactionListIntentArgs(GooglePaymentMethodId[] googlePaymentMethodIdArr, int i, int i2, Transaction transaction) {
        this.a = googlePaymentMethodIdArr;
        this.b = i;
        this.c = i2;
        this.d = transaction;
    }
}
