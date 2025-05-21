package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.bgdi;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class DeletionByTimeDataPointChange extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bgdi();
    public final long a;
    public final List b;
    public final long c;
    public final long d;

    public DeletionByTimeDataPointChange(long j, List list, long j2, long j3) {
        this.a = j;
        this.b = DesugarCollections.unmodifiableList(list);
        this.c = j2;
        this.d = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeletionByTimeDataPointChange)) {
            return false;
        }
        DeletionByTimeDataPointChange deletionByTimeDataPointChange = (DeletionByTimeDataPointChange) obj;
        return this.a == deletionByTimeDataPointChange.a && this.c == deletionByTimeDataPointChange.c && this.d == deletionByTimeDataPointChange.d && arwb.b(this.b, deletionByTimeDataPointChange.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, Long.valueOf(this.c), Long.valueOf(this.d)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.a;
        int a = arxc.a(parcel);
        arxc.q(parcel, 1, j);
        arxc.x(parcel, 2, this.b, false);
        arxc.q(parcel, 3, this.c);
        arxc.q(parcel, 4, this.d);
        arxc.c(parcel, a);
    }
}
