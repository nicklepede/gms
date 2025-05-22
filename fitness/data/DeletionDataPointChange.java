package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.bihz;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class DeletionDataPointChange extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bihz();
    public final long a;
    public final DataPoint b;

    public DeletionDataPointChange(long j, DataPoint dataPoint) {
        this.a = j;
        this.b = dataPoint;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeletionDataPointChange)) {
            return false;
        }
        DeletionDataPointChange deletionDataPointChange = (DeletionDataPointChange) obj;
        return this.a == deletionDataPointChange.a && atyq.b(this.b, deletionDataPointChange.b);
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
