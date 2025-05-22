package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.biix;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class Subscription extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new biix();
    public final DataSource a;
    public final DataType b;
    public final long c;
    public final int d;
    public final int e;

    public Subscription(DataSource dataSource, DataType dataType, long j, int i, int i2) {
        this.a = dataSource;
        this.b = dataType;
        this.c = j;
        this.d = i;
        this.e = i2;
    }

    public final DataType a() {
        DataType dataType = this.b;
        return dataType == null ? this.a.a : dataType;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Subscription)) {
            return false;
        }
        Subscription subscription = (Subscription) obj;
        return atyq.b(this.a, subscription.a) && atyq.b(this.b, subscription.b) && this.c == subscription.c && this.d == subscription.d && this.e == subscription.e;
    }

    public final int hashCode() {
        DataSource dataSource = this.a;
        return Arrays.hashCode(new Object[]{dataSource, dataSource, Long.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e)});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("dataSource", this.a, arrayList);
        atyp.b("dataType", this.b, arrayList);
        atyp.b("samplingIntervalMicros", Long.valueOf(this.c), arrayList);
        atyp.b("accuracyMode", Integer.valueOf(this.d), arrayList);
        atyp.b("subscriptionType", Integer.valueOf(this.e), arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        DataSource dataSource = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, dataSource, i, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.q(parcel, 3, this.c);
        atzr.o(parcel, 4, this.d);
        atzr.o(parcel, 5, this.e);
        atzr.c(parcel, a);
    }
}
