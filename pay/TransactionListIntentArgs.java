package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cter;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class TransactionListIntentArgs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cter();
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
            if (Arrays.equals(this.a, transactionListIntentArgs.a) && arwb.b(Integer.valueOf(this.b), Integer.valueOf(transactionListIntentArgs.b)) && arwb.b(Integer.valueOf(this.c), Integer.valueOf(transactionListIntentArgs.c)) && arwb.b(this.d, transactionListIntentArgs.d)) {
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
        int a = arxc.a(parcel);
        arxc.J(parcel, 1, this.a, i);
        arxc.o(parcel, 2, this.b);
        arxc.o(parcel, 3, this.c);
        arxc.t(parcel, 4, this.d, i, false);
        arxc.c(parcel, a);
    }

    public TransactionListIntentArgs(GooglePaymentMethodId[] googlePaymentMethodIdArr, int i, int i2, Transaction transaction) {
        this.a = googlePaymentMethodIdArr;
        this.b = i;
        this.c = i2;
        this.d = transaction;
    }
}
