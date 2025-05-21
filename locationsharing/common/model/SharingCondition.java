package com.google.android.gms.locationsharing.common.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.carp;
import defpackage.carq;
import defpackage.carw;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class SharingCondition extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new carw();
    public final int a;
    public final long b;
    public final Destination c;
    public final long d;

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class Destination extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new carp();
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
                if (arwb.b(this.a, destination.a) && arwb.b(this.b, destination.b) && arwb.b(this.c, destination.c)) {
                    if (arwb.b(Long.valueOf(this.d), Long.valueOf(destination.d))) {
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
            int a = arxc.a(parcel);
            arxc.v(parcel, 2, str, false);
            arxc.t(parcel, 3, this.b, i, false);
            arxc.t(parcel, 4, this.c, i, false);
            arxc.q(parcel, 5, this.d);
            arxc.c(parcel, a);
        }
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class FeatureId extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new carq();
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
            int a = arxc.a(parcel);
            arxc.q(parcel, 2, j);
            arxc.q(parcel, 3, this.b);
            arxc.c(parcel, a);
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
        return this.a == sharingCondition.a && this.b == sharingCondition.b && arwb.b(this.c, sharingCondition.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b), this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, i2);
        arxc.q(parcel, 2, this.b);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.q(parcel, 4, this.d);
        arxc.c(parcel, a);
    }
}
