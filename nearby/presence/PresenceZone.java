package com.google.android.gms.nearby.presence;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.cmqx;
import defpackage.cmrx;
import defpackage.cmsu;
import defpackage.ekus;
import defpackage.elgo;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class PresenceZone extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cmsu();
    public final DistanceBoundary a;
    public final AngleOfArrivalBoundary b;
    public final AngleOfArrivalBoundary c;
    private final List d;

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class AngleOfArrivalBoundary extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new cmqx();
        public final float a;
        public final float b;

        public AngleOfArrivalBoundary(float f, float f2) {
            this.a = f;
            this.b = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AngleOfArrivalBoundary)) {
                return false;
            }
            AngleOfArrivalBoundary angleOfArrivalBoundary = (AngleOfArrivalBoundary) obj;
            return Float.compare(angleOfArrivalBoundary.a, this.a) == 0 && Float.compare(angleOfArrivalBoundary.b, this.b) == 0;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Float.valueOf(this.a), Float.valueOf(this.b)});
        }

        public final String toString() {
            return "AngleOfArrivalBoundary{minAngleDegrees=" + this.a + ", maxAngleDegrees=" + this.b + "}";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            float f = this.a;
            int a = atzr.a(parcel);
            atzr.l(parcel, 1, f);
            atzr.l(parcel, 2, this.b);
            atzr.c(parcel, a);
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class DistanceBoundary extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new cmrx();
        public final float a;
        public final float b;
        public final int c;

        public DistanceBoundary(float f, float f2, int i) {
            this.a = f;
            this.b = f2;
            this.c = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DistanceBoundary)) {
                return false;
            }
            DistanceBoundary distanceBoundary = (DistanceBoundary) obj;
            return Float.compare(distanceBoundary.a, this.a) == 0 && Float.compare(distanceBoundary.b, this.b) == 0 && this.c == distanceBoundary.c;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Float.valueOf(this.a), Float.valueOf(this.b), Integer.valueOf(this.c)});
        }

        public final String toString() {
            return "DistanceBoundary{minDistanceMeters=" + this.a + ", maxDistanceMeters=" + this.b + ", distanceRange=" + this.c + "}";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            float f = this.a;
            int a = atzr.a(parcel);
            atzr.l(parcel, 1, f);
            atzr.l(parcel, 2, this.b);
            atzr.o(parcel, 3, this.c);
            atzr.c(parcel, a);
        }
    }

    public PresenceZone(DistanceBoundary distanceBoundary, AngleOfArrivalBoundary angleOfArrivalBoundary, AngleOfArrivalBoundary angleOfArrivalBoundary2, List list) {
        this.a = distanceBoundary;
        this.b = angleOfArrivalBoundary;
        this.c = angleOfArrivalBoundary2;
        this.d = list;
    }

    public final List a() {
        return elgo.i(this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PresenceZone)) {
            return false;
        }
        PresenceZone presenceZone = (PresenceZone) obj;
        return ekus.a(this.a, presenceZone.a) && ekus.a(this.b, presenceZone.b) && ekus.a(this.c, presenceZone.c) && ekus.a(this.d, presenceZone.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    public final String toString() {
        List list = this.d;
        AngleOfArrivalBoundary angleOfArrivalBoundary = this.c;
        AngleOfArrivalBoundary angleOfArrivalBoundary2 = this.b;
        return "PresenceZone{distanceBoundary=" + String.valueOf(this.a) + ", azimuthAngleBoundary=" + String.valueOf(angleOfArrivalBoundary2) + ", elevationAngleBoundary=" + String.valueOf(angleOfArrivalBoundary) + ", localDeviceMotions=" + String.valueOf(list) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        DistanceBoundary distanceBoundary = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, distanceBoundary, i, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.y(parcel, 4, a(), false);
        atzr.c(parcel, a);
    }
}
