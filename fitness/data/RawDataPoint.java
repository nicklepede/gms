package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.bifj;
import defpackage.biir;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class RawDataPoint extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new biir();
    public final long a;
    public final long b;
    public final Value[] c;
    public final int d;
    public final int e;
    public final long f;

    public RawDataPoint(long j, long j2, Value[] valueArr, int i, int i2, long j3) {
        this.a = j;
        this.b = j2;
        this.d = i;
        this.e = i2;
        this.f = j3;
        this.c = valueArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RawDataPoint)) {
            return false;
        }
        RawDataPoint rawDataPoint = (RawDataPoint) obj;
        return this.a == rawDataPoint.a && this.b == rawDataPoint.b && Arrays.equals(this.c, rawDataPoint.c) && this.d == rawDataPoint.d && this.e == rawDataPoint.e && this.f == rawDataPoint.f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b)});
    }

    public final String toString() {
        return String.format(Locale.US, "RawDataPoint{%s@[%s, %s](%d,%d)}", Arrays.toString(this.c), Long.valueOf(this.b), Long.valueOf(this.a), Integer.valueOf(this.d), Integer.valueOf(this.e));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.a;
        int a = atzr.a(parcel);
        atzr.q(parcel, 1, j);
        atzr.q(parcel, 2, this.b);
        atzr.J(parcel, 3, this.c, i);
        atzr.o(parcel, 4, this.d);
        atzr.o(parcel, 5, this.e);
        atzr.q(parcel, 6, this.f);
        atzr.c(parcel, a);
    }

    public RawDataPoint(DataPoint dataPoint, List list) {
        this.a = dataPoint.b(TimeUnit.NANOSECONDS);
        this.b = dataPoint.a(TimeUnit.NANOSECONDS);
        this.c = dataPoint.d;
        this.d = bifj.a(dataPoint.a, list);
        this.e = bifj.a(dataPoint.e, list);
        this.f = dataPoint.f;
    }
}
