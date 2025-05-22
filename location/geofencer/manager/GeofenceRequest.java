package com.google.android.gms.location.geofencer.manager;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.cbqo;
import defpackage.ccer;
import defpackage.cces;
import defpackage.ccha;
import defpackage.cchb;
import defpackage.cchc;
import defpackage.ccwb;
import defpackage.fxxm;
import java.util.EnumSet;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class GeofenceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cchc();
    public final double a;
    public final double b;
    public final float c;
    public final long d;
    public final long e;
    public final int f;
    public final long g;
    public final EnumSet h;
    public final EnumSet i;

    public GeofenceRequest(double d, double d2, float f, long j, long j2, int i, long j3, EnumSet enumSet, EnumSet enumSet2) {
        fxxm.f(enumSet, "listenerEventsFilter");
        fxxm.f(enumSet2, "listenerInitialEventsFilter");
        this.a = d;
        this.b = d2;
        this.c = f;
        this.d = j;
        this.e = j2;
        this.f = i;
        this.g = j3;
        this.h = enumSet;
        this.i = enumSet2;
        if (d < -90.0d || d > 90.0d) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (d2 < -180.0d || d2 > 180.0d) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (j < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (j2 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (j3 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GeofenceRequest)) {
            return false;
        }
        GeofenceRequest geofenceRequest = (GeofenceRequest) obj;
        return Double.compare(this.a, geofenceRequest.a) == 0 && Double.compare(this.b, geofenceRequest.b) == 0 && Float.compare(this.c, geofenceRequest.c) == 0 && this.d == geofenceRequest.d && this.e == geofenceRequest.e && this.f == geofenceRequest.f && this.g == geofenceRequest.g && fxxm.n(this.h, geofenceRequest.h) && fxxm.n(this.i, geofenceRequest.i);
    }

    public final int hashCode() {
        int a = (((ccha.a(this.a) * 31) + ccha.a(this.b)) * 31) + Float.floatToIntBits(this.c);
        EnumSet enumSet = this.h;
        long j = this.g;
        return (((((((((((a * 31) + cchb.a(this.d)) * 31) + cchb.a(this.e)) * 31) + this.f) * 31) + cchb.a(j)) * 31) + enumSet.hashCode()) * 31) + this.i.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GeofenceRequest(");
        sb.append(this.a);
        sb.append(",");
        sb.append(this.b);
        sb.append("+");
        sb.append(this.c);
        sb.append("m");
        long j = this.d;
        if (j != 0) {
            sb.append(", dwell=");
            sb.append(j);
            sb.append("ms");
        }
        long j2 = this.e;
        if (j2 != 0) {
            sb.append(", maxAdditionalTriggerDelay=");
            sb.append(j2);
            sb.append("ms");
        }
        int i = this.f;
        if (i != 0) {
            sb.append(", ");
            sb.append(cbqo.a(i));
        }
        long j3 = this.g;
        if (j3 != Long.MAX_VALUE) {
            sb.append(", expiration=");
            sb.append(ccwb.b((j3 + System.currentTimeMillis()) - SystemClock.elapsedRealtime()));
        }
        EnumSet enumSet = this.h;
        if (!fxxm.n(enumSet, EnumSet.allOf(ccer.class))) {
            sb.append(", eventsFilter=");
            sb.append(enumSet);
        }
        EnumSet enumSet2 = this.i;
        if (!fxxm.n(enumSet2, EnumSet.allOf(ccer.class))) {
            sb.append(", initialEventsFilter=");
            sb.append(enumSet2);
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fxxm.f(parcel, "parcel");
        double d = this.a;
        int a = atzr.a(parcel);
        atzr.j(parcel, 1, d);
        atzr.j(parcel, 2, this.b);
        atzr.l(parcel, 3, this.c);
        atzr.q(parcel, 4, this.d);
        atzr.q(parcel, 5, this.e);
        atzr.o(parcel, 6, this.f);
        atzr.q(parcel, 7, this.g);
        atzr.o(parcel, 8, cces.a(this.h));
        atzr.o(parcel, 9, cces.a(this.i));
        atzr.c(parcel, a);
    }
}
