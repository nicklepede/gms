package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataSource;
import defpackage.arxc;
import defpackage.bgmb;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class DataSourceStatsResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bgmb();
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
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, dataSource, i, false);
        arxc.q(parcel, 2, this.b);
        arxc.e(parcel, 3, this.c);
        arxc.q(parcel, 4, this.d);
        arxc.q(parcel, 5, this.e);
        arxc.q(parcel, 6, this.f);
        arxc.c(parcel, a);
    }
}
