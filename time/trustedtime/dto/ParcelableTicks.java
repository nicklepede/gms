package com.google.android.gms.time.trustedtime.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.dgdw;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class ParcelableTicks extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dgdw();
    public final int a;
    public final long b;

    public ParcelableTicks(int i, long j) {
        if (i != 1) {
            throw new IllegalArgumentException("Invalid ticker type. Refer to @TickerType to see all the valid cases.");
        }
        this.a = 1;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParcelableTicks)) {
            return false;
        }
        ParcelableTicks parcelableTicks = (ParcelableTicks) obj;
        int i = parcelableTicks.a;
        return this.b == parcelableTicks.b;
    }

    public final int hashCode() {
        return Objects.hash(1, Long.valueOf(this.b));
    }

    public final String toString() {
        return "ParcelableTicks{tickerType=1, value=" + this.b + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, 1);
        arxc.q(parcel, 2, this.b);
        arxc.c(parcel, a);
    }
}
