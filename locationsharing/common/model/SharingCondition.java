package com.google.android.gms.locationsharing.common.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cdaf;
import defpackage.cdag;
import defpackage.cdam;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class SharingCondition extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new cdam();
    public final int a;
    public final long b;
    public final Destination c;
    public final long d;

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class Destination extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new cdaf();
        public final String a;
        public final FeatureId b;
        public final LatLng c;
        public final long d;

        public Destination(String str, FeatureId featureId, LatLng latLng, long j) {
            this.a = str;
            this.b = featureId;
            this.c = latLng;
            this.d = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                Destination destination = (Destination) obj;
                if (atyq.b(this.a, destination.a) && atyq.b(this.b, destination.b) && atyq.b(this.c, destination.c)) {
                    if (atyq.b(Long.valueOf(this.d), Long.valueOf(destination.d))) {
                        return true;
                    }
                }
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Long.valueOf(this.d)});
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            String str = this.a;
            int a = atzr.a(parcel);
            atzr.v(parcel, 2, str, false);
            atzr.t(parcel, 3, this.b, i, false);
            atzr.t(parcel, 4, this.c, i, false);
            atzr.q(parcel, 5, this.d);
            atzr.c(parcel, a);
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class FeatureId extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new cdag();
        public final long a;
        public final long b;

        public FeatureId(long j, long j2) {
            this.a = j;
            this.b = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                FeatureId featureId = (FeatureId) obj;
                if (this.a == featureId.a && this.b == featureId.b) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b)});
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            long j = this.a;
            int a = atzr.a(parcel);
            atzr.q(parcel, 2, j);
            atzr.q(parcel, 3, this.b);
            atzr.c(parcel, a);
        }
    }

    public SharingCondition(int i, long j, Destination destination, long j2) {
        this.a = i;
        this.b = j;
        this.c = destination;
        this.d = j2;
    }

    public final long a() {
        if (b() != 2) {
            return -1L;
        }
        return TimeUnit.MINUTES.toMillis(TimeUnit.MILLISECONDS.toMinutes((this.b - (SystemClock.elapsedRealtime() - this.d)) - 1) + 1);
    }

    public final int b() {
        return new int[]{1, 2, 3}[this.a];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SharingCondition)) {
            return false;
        }
        SharingCondition sharingCondition = (SharingCondition) obj;
        return this.a == sharingCondition.a && this.b == sharingCondition.b && atyq.b(this.c, sharingCondition.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b), this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, i2);
        atzr.q(parcel, 2, this.b);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.q(parcel, 4, this.d);
        atzr.c(parcel, a);
    }
}
