package com.google.android.gms.time.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.dgct;
import defpackage.dgcz;
import defpackage.dgje;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class ParcelableDuration extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final long a;
    public final int b;

    static {
        new ParcelableDuration(0L, 0);
        CREATOR = new dgcz();
    }

    public ParcelableDuration(long j, int i) {
        if (i < 0 || i > 999999999) {
            throw new dgct("Nano adjustment should be in the range 0 to 999,999,999");
        }
        this.a = j;
        this.b = i;
    }

    public final long a() {
        return dgje.a(dgje.b(this.a, 1000L), this.b / 1000000);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParcelableDuration)) {
            return false;
        }
        ParcelableDuration parcelableDuration = (ParcelableDuration) obj;
        return this.a == parcelableDuration.a && this.b == parcelableDuration.b;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Integer.valueOf(this.b));
    }

    public final String toString() {
        return "ParcelableDuration{seconds=" + this.a + ", nano=" + this.b + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.a;
        int a = arxc.a(parcel);
        arxc.q(parcel, 1, j);
        arxc.o(parcel, 2, this.b);
        arxc.c(parcel, a);
    }
}
