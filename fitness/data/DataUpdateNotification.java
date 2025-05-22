package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.bihx;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class DataUpdateNotification extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bihx();
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
        return this.a == dataUpdateNotification.a && this.b == dataUpdateNotification.b && this.c == dataUpdateNotification.c && atyq.b(this.d, dataUpdateNotification.d) && atyq.b(this.e, dataUpdateNotification.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b), Integer.valueOf(this.c), this.d, this.e});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("updateStartTimeNanos", Long.valueOf(this.a), arrayList);
        atyp.b("updateEndTimeNanos", Long.valueOf(this.b), arrayList);
        atyp.b("operationType", Integer.valueOf(this.c), arrayList);
        atyp.b("dataSource", this.d, arrayList);
        atyp.b("dataType", this.e, arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.a;
        int a = atzr.a(parcel);
        atzr.q(parcel, 1, j);
        atzr.q(parcel, 2, this.b);
        atzr.o(parcel, 3, this.c);
        atzr.t(parcel, 4, this.d, i, false);
        atzr.t(parcel, 5, this.e, i, false);
        atzr.c(parcel, a);
    }
}
