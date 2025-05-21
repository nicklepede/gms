package com.google.android.gms.nearby.presence;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.ckis;
import defpackage.ckjs;
import defpackage.ckkp;
import defpackage.eihn;
import defpackage.eitj;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class PresenceZone extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ckkp();
    public final DistanceBoundary a;
    public final AngleOfArrivalBoundary b;
    public final AngleOfArrivalBoundary c;
    private final List d;

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class AngleOfArrivalBoundary extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new ckis();
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
            int a = arxc.a(parcel);
            arxc.l(parcel, 1, f);
            arxc.l(parcel, 2, this.b);
            arxc.c(parcel, a);
        }
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class DistanceBoundary extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new ckjs();
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
            int a = arxc.a(parcel);
            arxc.l(parcel, 1, f);
            arxc.l(parcel, 2, this.b);
            arxc.o(parcel, 3, this.c);
            arxc.c(parcel, a);
        }
    }

    public PresenceZone(DistanceBoundary distanceBoundary, AngleOfArrivalBoundary angleOfArrivalBoundary, AngleOfArrivalBoundary angleOfArrivalBoundary2, List list) {
        this.a = distanceBoundary;
        this.b = angleOfArrivalBoundary;
        this.c = angleOfArrivalBoundary2;
        this.d = list;
    }

    public final List a() {
        return eitj.i(this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PresenceZone)) {
            return false;
        }
        PresenceZone presenceZone = (PresenceZone) obj;
        return eihn.a(this.a, presenceZone.a) && eihn.a(this.b, presenceZone.b) && eihn.a(this.c, presenceZone.c) && eihn.a(this.d, presenceZone.d);
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
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, distanceBoundary, i, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.y(parcel, 4, a(), false);
        arxc.c(parcel, a);
    }
}
