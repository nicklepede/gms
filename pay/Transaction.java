package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cvnu;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class Transaction extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cvnu();
    public byte[] a;
    public long b;

    private Transaction() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Transaction) {
            Transaction transaction = (Transaction) obj;
            if (Arrays.equals(this.a, transaction.a) && atyq.b(Long.valueOf(this.b), Long.valueOf(transaction.b))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), Long.valueOf(this.b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.i(parcel, 1, this.a, false);
        atzr.q(parcel, 2, this.b);
        atzr.c(parcel, a);
    }

    public Transaction(byte[] bArr, long j) {
        this.a = bArr;
        this.b = j;
    }
}
