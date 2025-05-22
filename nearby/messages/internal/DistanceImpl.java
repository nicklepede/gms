package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.cmma;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class DistanceImpl extends AbstractSafeParcelable implements Comparable {
    public static final Parcelable.Creator CREATOR = new cmma();
    final int a;
    public final int b;
    public final double c;

    public DistanceImpl(int i, int i2, double d) {
        this.a = i;
        this.b = i2;
        this.c = d;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(DistanceImpl distanceImpl) {
        double d = this.c;
        if (Double.isNaN(d) && Double.isNaN(distanceImpl.c)) {
            return 0;
        }
        return Double.compare(d, distanceImpl.c);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DistanceImpl)) {
            return false;
        }
        DistanceImpl distanceImpl = (DistanceImpl) obj;
        return this.b == distanceImpl.b && compareTo(distanceImpl) == 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Double.valueOf(this.c)});
    }

    public final String toString() {
        return String.format(Locale.US, "(%.1fm, %s)", Double.valueOf(this.c), this.b != 1 ? "UNKNOWN" : "LOW");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.o(parcel, 2, this.b);
        atzr.j(parcel, 3, this.c);
        atzr.c(parcel, a);
    }

    public DistanceImpl(double d) {
        this(1, 1, d);
    }
}
