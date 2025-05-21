package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cteq;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class TransactionDetailIntentArgs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cteq();
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
            if (arwb.b(this.a, transactionDetailIntentArgs.a) && arwb.b(this.b, transactionDetailIntentArgs.b) && arwb.b(this.c, transactionDetailIntentArgs.c) && arwb.b(Integer.valueOf(this.d), Integer.valueOf(transactionDetailIntentArgs.d))) {
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
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, this.a, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.o(parcel, 4, this.d);
        arxc.c(parcel, a);
    }

    public TransactionDetailIntentArgs(String str, String str2, Transaction transaction, int i) {
        this.a = str;
        this.b = str2;
        this.c = transaction;
        this.d = i;
    }
}
