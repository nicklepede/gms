package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.dhjc;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class TransactionData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dhjc();
    final long a;
    final long b;
    final String c;
    final int d;
    final List e;
    final int f;
    final boolean g;
    final String h;
    final String i;
    final String j;

    public TransactionData(long j, long j2, String str, int i, List list, int i2, boolean z, String str2, String str3, String str4) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = i;
        this.e = list;
        this.f = i2;
        this.g = z;
        if (str2 != null && str2.length() > 150) {
            str2 = str2.substring(0, 150);
        }
        this.h = str2;
        this.i = str3;
        this.j = str4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TransactionData) {
            TransactionData transactionData = (TransactionData) obj;
            if (atyq.b(Long.valueOf(this.a), Long.valueOf(transactionData.a)) && atyq.b(Long.valueOf(this.b), Long.valueOf(transactionData.b)) && atyq.b(this.c, transactionData.c) && atyq.b(Integer.valueOf(this.d), Integer.valueOf(transactionData.d)) && atyq.b(this.e, transactionData.e) && atyq.b(Integer.valueOf(this.f), Integer.valueOf(transactionData.f)) && atyq.b(Boolean.valueOf(this.g), Boolean.valueOf(transactionData.g)) && atyq.b(this.h, transactionData.h) && atyq.b(this.i, transactionData.i) && atyq.b(this.j, transactionData.j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b), this.c, Integer.valueOf(this.d), this.e, Integer.valueOf(this.f), Boolean.valueOf(this.g), this.h, this.i, this.j});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.q(parcel, 2, this.a);
        atzr.q(parcel, 4, this.b);
        atzr.v(parcel, 5, this.c, false);
        atzr.o(parcel, 6, this.d);
        atzr.E(parcel, 7, this.e);
        atzr.o(parcel, 8, this.f);
        atzr.e(parcel, 9, this.g);
        atzr.v(parcel, 10, this.h, false);
        atzr.v(parcel, 11, this.i, false);
        atzr.v(parcel, 12, this.j, false);
        atzr.c(parcel, a);
    }
}
