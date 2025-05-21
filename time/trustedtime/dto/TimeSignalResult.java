package com.google.android.gms.time.trustedtime.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.time.dto.ParcelableDuration;
import com.google.android.gms.time.dto.ParcelableInstant;
import defpackage.arxc;
import defpackage.dgdx;
import j$.util.Objects;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class TimeSignalResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dgdx();
    public final ParcelableDuration a;
    public final ParcelableInstant b;
    public final ParcelableTicks c;
    public final List d;
    public final List e;

    public TimeSignalResult(ParcelableDuration parcelableDuration, ParcelableInstant parcelableInstant, ParcelableTicks parcelableTicks, List list, List list2) {
        this.a = (ParcelableDuration) Objects.requireNonNull(parcelableDuration);
        this.b = (ParcelableInstant) Objects.requireNonNull(parcelableInstant);
        this.c = (ParcelableTicks) Objects.requireNonNull(parcelableTicks);
        this.d = (List) Objects.requireNonNull(list);
        this.e = (List) Objects.requireNonNull(list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeSignalResult)) {
            return false;
        }
        TimeSignalResult timeSignalResult = (TimeSignalResult) obj;
        return this.a.equals(timeSignalResult.a) && this.b.equals(timeSignalResult.b) && this.c.equals(timeSignalResult.c) && this.d.equals(timeSignalResult.d) && this.e.equals(timeSignalResult.e);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, this.e);
    }

    public final String toString() {
        List list = this.e;
        List list2 = this.d;
        ParcelableTicks parcelableTicks = this.c;
        ParcelableInstant parcelableInstant = this.b;
        return "TimeSignalResult{estimatedError=" + String.valueOf(this.a) + ", currentTime=" + String.valueOf(parcelableInstant) + ", acquisitionTicks=" + String.valueOf(parcelableTicks) + ", pastUnixEpochClockAdjustments=" + String.valueOf(list2) + ", futureUnixEpochClockAdjustments=" + String.valueOf(list) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ParcelableDuration parcelableDuration = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, parcelableDuration, i, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.y(parcel, 4, this.d, false);
        arxc.y(parcel, 5, this.e, false);
        arxc.c(parcel, a);
    }
}
