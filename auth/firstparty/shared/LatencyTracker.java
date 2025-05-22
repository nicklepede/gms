package com.google.android.gms.auth.firstparty.shared;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.adap;
import defpackage.atzr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class LatencyTracker extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new adap();
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
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.v(parcel, 2, this.b, false);
        atzr.q(parcel, 3, this.c);
        atzr.t(parcel, 4, this.d, i, false);
        atzr.c(parcel, a);
    }
}
