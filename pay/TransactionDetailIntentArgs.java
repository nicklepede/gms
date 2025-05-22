package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cvnv;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class TransactionDetailIntentArgs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cvnv();
    public String a;
    public String b;
    public Transaction c;
    public int d;

    private TransactionDetailIntentArgs() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TransactionDetailIntentArgs) {
            TransactionDetailIntentArgs transactionDetailIntentArgs = (TransactionDetailIntentArgs) obj;
            if (atyq.b(this.a, transactionDetailIntentArgs.a) && atyq.b(this.b, transactionDetailIntentArgs.b) && atyq.b(this.c, transactionDetailIntentArgs.c) && atyq.b(Integer.valueOf(this.d), Integer.valueOf(transactionDetailIntentArgs.d))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Integer.valueOf(this.d)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, this.a, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.o(parcel, 4, this.d);
        atzr.c(parcel, a);
    }

    public TransactionDetailIntentArgs(String str, String str2, Transaction transaction, int i) {
        this.a = str;
        this.b = str2;
        this.c = transaction;
        this.d = i;
    }
}
