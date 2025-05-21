package com.google.android.gms.auth.firstparty.shared;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abap;
import defpackage.arxc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class LatencyTracker extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new abap();
    final int a;
    final String b;
    final long c;
    public final LatencyTracker d;

    public LatencyTracker(int i, String str, long j, LatencyTracker latencyTracker) {
        this.a = i;
        this.b = str;
        this.c = j;
        this.d = latencyTracker;
    }

    public static LatencyTracker c() {
        return new LatencyTracker(1, "session", SystemClock.elapsedRealtime(), null);
    }

    public final LatencyTracker a(String str) {
        return new LatencyTracker(1, str, SystemClock.elapsedRealtime(), this);
    }

    public final void b(Intent intent) {
        intent.putExtra("latency.tracker", this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.v(parcel, 2, this.b, false);
        arxc.q(parcel, 3, this.c);
        arxc.t(parcel, 4, this.d, i, false);
        arxc.c(parcel, a);
    }
}
