package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.bihn;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class Bucket extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new bihn();
    public final long a;
    public final long b;
    public final Session c;
    public final int d;
    public final List e;
    public final int f;

    public Bucket(long j, long j2, Session session, int i, List list, int i2) {
        this.a = j;
        this.b = j2;
        this.c = session;
        this.d = i;
        this.e = list;
        this.f = i2;
    }

    public static String c(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "bug" : "intervals" : "segment" : "type" : "session" : "time" : "none";
    }

    public final long a(TimeUnit timeUnit) {
        return timeUnit.convert(this.b, TimeUnit.MILLISECONDS);
    }

    public final long b(TimeUnit timeUnit) {
        return timeUnit.convert(this.a, TimeUnit.MILLISECONDS);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Bucket)) {
            return false;
        }
        Bucket bucket = (Bucket) obj;
        return this.a == bucket.a && this.b == bucket.b && this.d == bucket.d && atyq.b(this.e, bucket.e) && this.f == bucket.f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b), Integer.valueOf(this.d), Integer.valueOf(this.f)});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("startTime", Long.valueOf(this.a), arrayList);
        atyp.b("endTime", Long.valueOf(this.b), arrayList);
        atyp.b("activity", Integer.valueOf(this.d), arrayList);
        atyp.b("dataSets", this.e, arrayList);
        atyp.b("bucketType", c(this.f), arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.a;
        int a = atzr.a(parcel);
        atzr.q(parcel, 1, j);
        atzr.q(parcel, 2, this.b);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.o(parcel, 4, this.d);
        atzr.y(parcel, 5, this.e, false);
        atzr.o(parcel, 6, this.f);
        atzr.c(parcel, a);
    }
}
