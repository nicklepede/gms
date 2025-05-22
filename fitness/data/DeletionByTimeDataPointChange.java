package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.bihy;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class DeletionByTimeDataPointChange extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bihy();
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
        return this.a == deletionByTimeDataPointChange.a && this.c == deletionByTimeDataPointChange.c && this.d == deletionByTimeDataPointChange.d && atyq.b(this.b, deletionByTimeDataPointChange.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, Long.valueOf(this.c), Long.valueOf(this.d)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.a;
        int a = atzr.a(parcel);
        atzr.q(parcel, 1, j);
        atzr.x(parcel, 2, this.b, false);
        atzr.q(parcel, 3, this.c);
        atzr.q(parcel, 4, this.d);
        atzr.c(parcel, a);
    }
}
