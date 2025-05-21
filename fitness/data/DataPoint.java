package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.bgcz;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class DataPoint extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new bgcz();
    public final DataSource a;
    public long b;
    public long c;
    public final Value[] d;
    public DataSource e;
    public final long f;

    public DataPoint(DataSource dataSource, long j, long j2, Value[] valueArr, DataSource dataSource2, long j3) {
        this.a = dataSource;
        this.e = dataSource2;
        this.b = j;
        this.c = j2;
        this.d = valueArr;
        this.f = j3;
    }

    private static DataSource d(List list, int i) {
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return (DataSource) list.get(i);
    }

    public final long a(TimeUnit timeUnit) {
        return timeUnit.convert(this.c, TimeUnit.NANOSECONDS);
    }

    public final long b(TimeUnit timeUnit) {
        return timeUnit.convert(this.b, TimeUnit.NANOSECONDS);
    }

    public final DataSource c() {
        DataSource dataSource = this.e;
        return dataSource != null ? dataSource : this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataPoint)) {
            return false;
        }
        DataPoint dataPoint = (DataPoint) obj;
        return arwb.b(this.a, dataPoint.a) && this.b == dataPoint.b && this.c == dataPoint.c && Arrays.equals(this.d, dataPoint.d) && arwb.b(c(), dataPoint.c());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(this.b), Long.valueOf(this.c)});
    }

    public final String toString() {
        String arrays = Arrays.toString(this.d);
        Long valueOf = Long.valueOf(this.c);
        Long valueOf2 = Long.valueOf(this.b);
        Long valueOf3 = Long.valueOf(this.f);
        String a = this.a.a();
        DataSource dataSource = this.e;
        return String.format("DataPoint{%s@[%s, %s,raw=%s](%s %s)}", arrays, valueOf, valueOf2, valueOf3, a, dataSource != null ? dataSource.a() : "N/A");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        DataSource dataSource = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, dataSource, i, false);
        arxc.q(parcel, 3, this.b);
        arxc.q(parcel, 4, this.c);
        arxc.J(parcel, 5, this.d, i);
        arxc.t(parcel, 6, this.e, i, false);
        arxc.q(parcel, 7, this.f);
        arxc.c(parcel, a);
    }

    public DataPoint(DataSource dataSource, DataSource dataSource2, RawDataPoint rawDataPoint) {
        this(dataSource, rawDataPoint.a, rawDataPoint.b, rawDataPoint.c, dataSource2, rawDataPoint.f);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public DataPoint(java.util.List r3, com.google.android.gms.fitness.data.RawDataPoint r4) {
        /*
            r2 = this;
            int r0 = r4.d
            com.google.android.gms.fitness.data.DataSource r0 = d(r3, r0)
            defpackage.arwm.s(r0)
            int r1 = r4.e
            com.google.android.gms.fitness.data.DataSource r3 = d(r3, r1)
            r2.<init>(r0, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fitness.data.DataPoint.<init>(java.util.List, com.google.android.gms.fitness.data.RawDataPoint):void");
    }
}
