package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.libs.identity.ClientIdentity;
import defpackage.a;
import defpackage.arwb;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.asrj;
import defpackage.bzhx;
import defpackage.bzio;
import defpackage.bziy;
import defpackage.bzjc;
import defpackage.canl;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new bzio();
    public int a;
    public long b;
    public long c;
    public long d;
    public long e;
    public int f;
    public float g;
    public boolean h;
    public long i;
    public final int j;
    public final int k;
    public final boolean l;
    public final WorkSource m;
    public final ClientIdentity n;

    @Deprecated
    public LocationRequest() {
        this(102, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, Integer.MAX_VALUE, 0.0f, true, 3600000L, 0, 0, false, new WorkSource(), null);
    }

    private static String j(long j) {
        return j == Long.MAX_VALUE ? "∞" : canl.a(j);
    }

    public final boolean a() {
        long j = this.d;
        return j > 0 && (j >> 1) >= this.b;
    }

    public final boolean b() {
        return this.a == 105;
    }

    @Deprecated
    public final void c(long j) {
        arwm.c(j > 0, "durationMillis must be greater than 0");
        this.e = j;
    }

    @Deprecated
    public final void d(long j) {
        arwm.d(j >= 0, "illegal fastest interval: %d", Long.valueOf(j));
        this.c = j;
    }

    @Deprecated
    public final void e(long j) {
        arwm.c(j >= 0, "intervalMillis must be greater than or equal to 0");
        long j2 = this.c;
        long j3 = this.b;
        if (j2 == j3 / 6) {
            this.c = j / 6;
        }
        if (this.i == j3) {
            this.i = j;
        }
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            boolean a = a();
            if (this.a == locationRequest.a && ((b() || this.b == locationRequest.b) && this.c == locationRequest.c && a == locationRequest.a() && ((!a || this.d == locationRequest.d) && this.e == locationRequest.e && this.f == locationRequest.f && this.g == locationRequest.g && this.h == locationRequest.h && this.j == locationRequest.j && this.k == locationRequest.k && this.l == locationRequest.l && this.m.equals(locationRequest.m) && arwb.b(this.n, locationRequest.n)))) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    public final void f(long j) {
        arwm.d(j >= 0, "illegal max wait time: %d", Long.valueOf(j));
        this.d = j;
    }

    @Deprecated
    public final void g(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(a.j(i, "invalid numUpdates: "));
        }
        this.f = i;
    }

    @Deprecated
    public final void h(int i) {
        bziy.b(i);
        this.a = i;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c), this.m});
    }

    @Deprecated
    public final void i() {
        this.h = false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request[");
        if (b()) {
            sb.append(bziy.a(this.a));
            if (this.d > 0) {
                sb.append("/");
                canl.e(this.d, sb);
            }
        } else {
            sb.append("@");
            if (a()) {
                canl.e(this.b, sb);
                sb.append("/");
                canl.e(this.d, sb);
            } else {
                canl.e(this.b, sb);
            }
            sb.append(" ");
            sb.append(bziy.a(this.a));
        }
        if (b() || this.c != this.b) {
            sb.append(", minUpdateInterval=");
            sb.append(j(this.c));
        }
        if (this.g > 0.0d) {
            sb.append(", minUpdateDistance=");
            sb.append(this.g);
        }
        if (!b() ? this.i != this.b : this.i != Long.MAX_VALUE) {
            sb.append(", maxUpdateAge=");
            sb.append(j(this.i));
        }
        if (this.e != Long.MAX_VALUE) {
            sb.append(", duration=");
            canl.e(this.e, sb);
        }
        if (this.f != Integer.MAX_VALUE) {
            sb.append(", maxUpdates=");
            sb.append(this.f);
        }
        int i = this.k;
        if (i != 0) {
            sb.append(", ");
            sb.append(bzjc.a(i));
        }
        int i2 = this.j;
        if (i2 != 0) {
            sb.append(", ");
            sb.append(bzhx.a(i2));
        }
        if (this.h) {
            sb.append(", waitForAccurateLocation");
        }
        if (this.l) {
            sb.append(", bypass");
        }
        WorkSource workSource = this.m;
        if (!asrj.g(workSource)) {
            sb.append(", ");
            sb.append(workSource);
        }
        ClientIdentity clientIdentity = this.n;
        if (clientIdentity != null) {
            sb.append(", impersonation=");
            sb.append(clientIdentity);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.q(parcel, 2, this.b);
        arxc.q(parcel, 3, this.c);
        arxc.o(parcel, 6, this.f);
        arxc.l(parcel, 7, this.g);
        arxc.q(parcel, 8, this.d);
        arxc.e(parcel, 9, this.h);
        arxc.q(parcel, 10, this.e);
        arxc.q(parcel, 11, this.i);
        arxc.o(parcel, 12, this.j);
        arxc.o(parcel, 13, this.k);
        arxc.e(parcel, 15, this.l);
        arxc.t(parcel, 16, this.m, i, false);
        arxc.t(parcel, 17, this.n, i, false);
        arxc.c(parcel, a);
    }

    public LocationRequest(int i, long j, long j2, long j3, long j4, long j5, int i2, float f, boolean z, long j6, int i3, int i4, boolean z2, WorkSource workSource, ClientIdentity clientIdentity) {
        this.a = i;
        if (i == 105) {
            this.b = Long.MAX_VALUE;
        } else {
            this.b = j;
        }
        this.c = j2;
        this.d = j3;
        this.e = j4 == Long.MAX_VALUE ? j5 : Math.min(Math.max(1L, j4 - SystemClock.elapsedRealtime()), j5);
        this.f = i2;
        this.g = f;
        this.h = z;
        this.i = j6 != -1 ? j6 : j;
        this.j = i3;
        this.k = i4;
        this.l = z2;
        this.m = workSource;
        this.n = clientIdentity;
    }
}
