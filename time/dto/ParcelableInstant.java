package com.google.android.gms.time.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.dgct;
import defpackage.dgda;
import defpackage.dgje;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class ParcelableInstant extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final long a;
    public final int b;

    static {
        new ParcelableInstant(0L, 0);
        new ParcelableInstant(31556889864403199L, 999999999);
        new ParcelableInstant(-31557014167219200L, 0);
        CREATOR = new dgda();
    }

    public ParcelableInstant(long j, int i) {
        if (j < -31557014167219200L || j > 31556889864403199L) {
            throw new dgct("Instant exceeds minimum or maximum instant");
        }
        this.a = j;
        if (i < 0 || i > 999999999) {
            throw new dgct("Nano adjustment should be in the range 0 to 999,999,999");
        }
        this.b = i;
    }

    public final long a() {
        long j = this.a;
        int i = this.b / 1000000;
        if (j < 0 && i > 0) {
            j++;
            i -= 1000;
        }
        return dgje.b(j, 1000L) + i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParcelableInstant)) {
            return false;
        }
        ParcelableInstant parcelableInstant = (ParcelableInstant) obj;
        return this.a == parcelableInstant.a && this.b == parcelableInstant.b;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Integer.valueOf(this.b));
    }

    public final String toString() {
        return "ParcelableInstant{epochSecond=" + this.a + ", nanosOfSecond=" + this.b + "}";
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
