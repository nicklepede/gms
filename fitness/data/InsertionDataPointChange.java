package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.biin;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class InsertionDataPointChange extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new biin();
    public final long a;
    public final DataPoint b;

    public InsertionDataPointChange(long j, DataPoint dataPoint) {
        this.a = j;
        this.b = dataPoint;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InsertionDataPointChange)) {
            return false;
        }
        InsertionDataPointChange insertionDataPointChange = (InsertionDataPointChange) obj;
        return this.a == insertionDataPointChange.a && atyq.b(this.b, insertionDataPointChange.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.a;
        int a = atzr.a(parcel);
        atzr.q(parcel, 1, j);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.c(parcel, a);
    }
}
