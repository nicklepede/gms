package com.google.android.gms.time.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.diny;
import defpackage.dioe;
import defpackage.diuj;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class ParcelableDuration extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final long a;
    public final int b;

    static {
        new ParcelableDuration(0L, 0);
        CREATOR = new dioe();
    }

    public ParcelableDuration(long j, int i) {
        if (i < 0 || i > 999999999) {
            throw new diny("Nano adjustment should be in the range 0 to 999,999,999");
        }
        this.a = j;
        this.b = i;
    }

    public final long a() {
        return diuj.a(diuj.b(this.a, 1000L), this.b / 1000000);
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
        int a = atzr.a(parcel);
        atzr.q(parcel, 1, j);
        atzr.o(parcel, 2, this.b);
        atzr.c(parcel, a);
    }
}
