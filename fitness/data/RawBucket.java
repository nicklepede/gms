package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.bgea;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class RawBucket extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bgea();
    public final long a;
    public final long b;
    public final Session c;
    public final int d;
    public final List e;
    public final int f;

    public RawBucket(long j, long j2, Session session, int i, List list, int i2) {
        this.a = j;
        this.b = j2;
        this.c = session;
        this.d = i;
        this.e = list;
        this.f = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RawBucket)) {
            return false;
        }
        RawBucket rawBucket = (RawBucket) obj;
        return this.a == rawBucket.a && this.b == rawBucket.b && this.d == rawBucket.d && arwb.b(this.e, rawBucket.e) && this.f == rawBucket.f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b), Integer.valueOf(this.f)});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("startTime", Long.valueOf(this.a), arrayList);
        arwa.b("endTime", Long.valueOf(this.b), arrayList);
        arwa.b("activity", Integer.valueOf(this.d), arrayList);
        arwa.b("dataSets", this.e, arrayList);
        arwa.b("bucketType", Integer.valueOf(this.f), arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.q(parcel, 1, this.a);
        arxc.q(parcel, 2, this.b);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.o(parcel, 4, this.d);
        arxc.y(parcel, 5, this.e, false);
        arxc.o(parcel, 6, this.f);
        arxc.c(parcel, a);
    }

    public RawBucket(Bucket bucket, List list) {
        this.a = bucket.b(TimeUnit.MILLISECONDS);
        this.b = bucket.a(TimeUnit.MILLISECONDS);
        this.c = bucket.c;
        this.d = bucket.d;
        this.f = bucket.f;
        List list2 = bucket.e;
        this.e = new ArrayList(list2.size());
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            this.e.add(new RawDataSet((DataSet) it.next(), list));
        }
    }
}
