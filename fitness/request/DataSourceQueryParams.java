package com.google.android.gms.fitness.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataSource;
import defpackage.atzr;
import defpackage.bipe;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class DataSourceQueryParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bipe();
    public final DataSource a;
    public final long b;
    public final long c;
    public final int d;
    public final int e;

    public DataSourceQueryParams(DataSource dataSource, long j, long j2, int i, int i2) {
        this.a = dataSource;
        this.b = j;
        this.c = j2;
        this.d = i;
        this.e = i2;
    }

    public final String toString() {
        return String.format(Locale.US, "{%1$s, %2$tF %2$tT - %3$tF %3$tT (%4$s %5$s)}", this.a.a(), Long.valueOf(TimeUnit.NANOSECONDS.toMillis(this.b)), Long.valueOf(TimeUnit.NANOSECONDS.toMillis(this.c)), Integer.valueOf(this.d), Integer.valueOf(this.e));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        DataSource dataSource = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, dataSource, i, false);
        atzr.q(parcel, 3, this.b);
        atzr.q(parcel, 4, this.c);
        atzr.o(parcel, 5, this.d);
        atzr.o(parcel, 6, this.e);
        atzr.c(parcel, a);
    }
}
