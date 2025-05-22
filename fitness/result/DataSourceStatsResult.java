package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataSource;
import defpackage.atzr;
import defpackage.biqr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class DataSourceStatsResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new biqr();
    public final DataSource a;
    public final long b;
    public final boolean c;
    public final long d;
    public final long e;
    public final long f;

    public DataSourceStatsResult(DataSource dataSource, long j, boolean z, long j2, long j3, long j4) {
        this.a = dataSource;
        this.b = j;
        this.c = z;
        this.d = j2;
        this.e = j3;
        this.f = j4;
    }

    public final String toString() {
        return String.format("DataSourceStatsResult{dataSource=%s, id=%s, isRemote=%s, minEndTimeNanos=%s, maxEndTimeNanos=%s, minContiguousTimeNanos=%s}", this.a, Long.valueOf(this.b), Boolean.valueOf(this.c), Long.valueOf(this.d), Long.valueOf(this.e), Long.valueOf(this.f));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        DataSource dataSource = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, dataSource, i, false);
        atzr.q(parcel, 2, this.b);
        atzr.e(parcel, 3, this.c);
        atzr.q(parcel, 4, this.d);
        atzr.q(parcel, 5, this.e);
        atzr.q(parcel, 6, this.f);
        atzr.c(parcel, a);
    }
}
