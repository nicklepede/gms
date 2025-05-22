package com.google.android.gms.time.trustedtime.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.time.dto.ParcelableDuration;
import defpackage.atzr;
import defpackage.dipa;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class ParcelableClockAdjustmentPeriod extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dipa();
    public final ParcelableDuration a;
    public final ParcelableDuration b;
    public final ParcelableDuration c;
    public final ParcelableDuration d;

    public ParcelableClockAdjustmentPeriod(ParcelableDuration parcelableDuration, ParcelableDuration parcelableDuration2, ParcelableDuration parcelableDuration3, ParcelableDuration parcelableDuration4) {
        if (parcelableDuration3.a == 0 && parcelableDuration3.b == 0) {
            throw new IllegalArgumentException("deltaClock == 0");
        }
        if (parcelableDuration4.a < 0) {
            throw new IllegalArgumentException("deltaClockError must not be negative");
        }
        this.a = (ParcelableDuration) Objects.requireNonNull(parcelableDuration);
        this.b = (ParcelableDuration) Objects.requireNonNull(parcelableDuration2);
        this.c = (ParcelableDuration) Objects.requireNonNull(parcelableDuration3);
        this.d = (ParcelableDuration) Objects.requireNonNull(parcelableDuration4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ParcelableClockAdjustmentPeriod parcelableClockAdjustmentPeriod = (ParcelableClockAdjustmentPeriod) obj;
            if (this.a.equals(parcelableClockAdjustmentPeriod.a) && this.b.equals(parcelableClockAdjustmentPeriod.b) && this.c.equals(parcelableClockAdjustmentPeriod.c) && this.d.equals(parcelableClockAdjustmentPeriod.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d);
    }

    public final String toString() {
        ParcelableDuration parcelableDuration = this.d;
        ParcelableDuration parcelableDuration2 = this.c;
        ParcelableDuration parcelableDuration3 = this.b;
        return "ParcelableClockAdjustmentPeriod{beginRelativePhysical=" + String.valueOf(this.a) + ", durationPhysical=" + String.valueOf(parcelableDuration3) + ", deltaClock=" + String.valueOf(parcelableDuration2) + ", deltaClockError=" + String.valueOf(parcelableDuration) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ParcelableDuration parcelableDuration = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, parcelableDuration, i, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.t(parcel, 4, this.d, i, false);
        atzr.c(parcel, a);
    }
}
