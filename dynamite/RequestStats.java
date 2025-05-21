package com.google.android.gms.dynamite;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arxa;
import defpackage.arxc;
import defpackage.arxd;
import defpackage.azjf;
import defpackage.azjg;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class RequestStats extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new azjg();
    public final String a;
    public final long b;
    public final boolean c;
    public final long d;
    public final long e;
    public final int f;
    public final long g;
    public final long h;

    public RequestStats(String str, long j, boolean z, long j2, long j3, int i, long j4, long j5) {
        this.a = str;
        this.b = j;
        this.c = z;
        this.d = j2;
        this.e = j3;
        this.g = j4;
        this.h = j5;
        this.f = i;
    }

    public static azjf a(byte[] bArr) {
        RequestStats requestStats;
        try {
            requestStats = (RequestStats) arxd.a(bArr, CREATOR);
        } catch (arxa e) {
            Log.w("RequestStats", "Failed to parse safe parcel RequestStats!".concat(String.valueOf(e.getMessage())));
            requestStats = null;
        }
        if (requestStats == null) {
            return null;
        }
        azjf azjfVar = new azjf();
        azjfVar.a = requestStats.a;
        azjfVar.b = requestStats.b;
        azjfVar.c = requestStats.c;
        azjfVar.d = requestStats.d;
        azjfVar.e = requestStats.e;
        return azjfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestStats)) {
            return false;
        }
        RequestStats requestStats = (RequestStats) obj;
        return arwb.b(this.a, requestStats.a) && this.b == requestStats.b && this.c == requestStats.c && this.d == requestStats.d && this.e == requestStats.e && this.f == requestStats.f && this.g == requestStats.g && this.h == requestStats.h;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(this.b), Boolean.valueOf(this.c), Long.valueOf(this.d), Long.valueOf(this.e), Integer.valueOf(this.f), Long.valueOf(this.g), Long.valueOf(this.h)});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("requestedFeature", this.a, arrayList);
        arwa.b("requestStartUptimeMs", Long.valueOf(this.b), arrayList);
        arwa.b("lowPrecisionRequestStartTime", Boolean.valueOf(this.c), arrayList);
        arwa.b("configUpdatingLatencyMs", Long.valueOf(this.d), arrayList);
        arwa.b("fileApkStagingLatencyMs", Long.valueOf(this.e), arrayList);
        arwa.b("loadPathValue", Integer.valueOf(this.f), arrayList);
        arwa.b("moduleLoadDurationMs", Long.valueOf(this.g), arrayList);
        arwa.b("requestEndUptimeMs", Long.valueOf(this.h), arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 2, str, false);
        arxc.q(parcel, 3, this.b);
        arxc.e(parcel, 4, this.c);
        arxc.q(parcel, 5, this.d);
        arxc.q(parcel, 6, this.e);
        arxc.o(parcel, 9, this.f);
        arxc.q(parcel, 10, this.g);
        arxc.q(parcel, 11, this.h);
        arxc.c(parcel, a);
    }
}
