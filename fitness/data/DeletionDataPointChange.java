package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.bgdj;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class DeletionDataPointChange extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bgdj();
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
        return this.a == deletionDataPointChange.a && arwb.b(this.b, deletionDataPointChange.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.a;
        int a = arxc.a(parcel);
        arxc.q(parcel, 1, j);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.c(parcel, a);
    }
}
