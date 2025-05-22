package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.cvoq;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class WearTransactionListIntentArgs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cvoq();
    public Transaction[] a;

    private WearTransactionListIntentArgs() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WearTransactionListIntentArgs) {
            return Arrays.equals(this.a, ((WearTransactionListIntentArgs) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.J(parcel, 1, this.a, i);
        atzr.c(parcel, a);
    }

    public WearTransactionListIntentArgs(Transaction[] transactionArr) {
        this.a = transactionArr;
    }
}
