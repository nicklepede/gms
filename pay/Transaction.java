package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.ctep;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class Transaction extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctep();
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
            if (Arrays.equals(this.a, transaction.a) && arwb.b(Long.valueOf(this.b), Long.valueOf(transaction.b))) {
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
        int a = arxc.a(parcel);
        arxc.i(parcel, 1, this.a, false);
        arxc.q(parcel, 2, this.b);
        arxc.c(parcel, a);
    }

    public Transaction(byte[] bArr, long j) {
        this.a = bArr;
        this.b = j;
    }
}
