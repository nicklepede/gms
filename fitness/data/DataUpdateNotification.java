package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.bgdh;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class DataUpdateNotification extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bgdh();
    public final long a;
    public final long b;
    public final int c;
    public final DataSource d;
    public final DataType e;

    public DataUpdateNotification(long j, long j2, int i, DataSource dataSource, DataType dataType) {
        this.a = j;
        this.b = j2;
        this.c = i;
        this.d = dataSource;
        this.e = dataType;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DataUpdateNotification)) {
            return false;
        }
        DataUpdateNotification dataUpdateNotification = (DataUpdateNotification) obj;
        return this.a == dataUpdateNotification.a && this.b == dataUpdateNotification.b && this.c == dataUpdateNotification.c && arwb.b(this.d, dataUpdateNotification.d) && arwb.b(this.e, dataUpdateNotification.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b), Integer.valueOf(this.c), this.d, this.e});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("updateStartTimeNanos", Long.valueOf(this.a), arrayList);
        arwa.b("updateEndTimeNanos", Long.valueOf(this.b), arrayList);
        arwa.b("operationType", Integer.valueOf(this.c), arrayList);
        arwa.b("dataSource", this.d, arrayList);
        arwa.b("dataType", this.e, arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.a;
        int a = arxc.a(parcel);
        arxc.q(parcel, 1, j);
        arxc.q(parcel, 2, this.b);
        arxc.o(parcel, 3, this.c);
        arxc.t(parcel, 4, this.d, i, false);
        arxc.t(parcel, 5, this.e, i, false);
        arxc.c(parcel, a);
    }
}
