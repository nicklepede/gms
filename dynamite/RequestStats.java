package com.google.android.gms.dynamite;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzp;
import defpackage.atzr;
import defpackage.atzs;
import defpackage.bbnb;
import defpackage.bbnc;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class RequestStats extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bbnc();
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

    public static bbnb a(byte[] bArr) {
        RequestStats requestStats;
        try {
            requestStats = (RequestStats) atzs.a(bArr, CREATOR);
        } catch (atzp e) {
            Log.w("RequestStats", "Failed to parse safe parcel RequestStats!".concat(String.valueOf(e.getMessage())));
            requestStats = null;
        }
        if (requestStats == null) {
            return null;
        }
        bbnb bbnbVar = new bbnb();
        bbnbVar.a = requestStats.a;
        bbnbVar.b = requestStats.b;
        bbnbVar.c = requestStats.c;
        bbnbVar.d = requestStats.d;
        bbnbVar.e = requestStats.e;
        return bbnbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestStats)) {
            return false;
        }
        RequestStats requestStats = (RequestStats) obj;
        return atyq.b(this.a, requestStats.a) && this.b == requestStats.b && this.c == requestStats.c && this.d == requestStats.d && this.e == requestStats.e && this.f == requestStats.f && this.g == requestStats.g && this.h == requestStats.h;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(this.b), Boolean.valueOf(this.c), Long.valueOf(this.d), Long.valueOf(this.e), Integer.valueOf(this.f), Long.valueOf(this.g), Long.valueOf(this.h)});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("requestedFeature", this.a, arrayList);
        atyp.b("requestStartUptimeMs", Long.valueOf(this.b), arrayList);
        atyp.b("lowPrecisionRequestStartTime", Boolean.valueOf(this.c), arrayList);
        atyp.b("configUpdatingLatencyMs", Long.valueOf(this.d), arrayList);
        atyp.b("fileApkStagingLatencyMs", Long.valueOf(this.e), arrayList);
        atyp.b("loadPathValue", Integer.valueOf(this.f), arrayList);
        atyp.b("moduleLoadDurationMs", Long.valueOf(this.g), arrayList);
        atyp.b("requestEndUptimeMs", Long.valueOf(this.h), arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 2, str, false);
        atzr.q(parcel, 3, this.b);
        atzr.e(parcel, 4, this.c);
        atzr.q(parcel, 5, this.d);
        atzr.q(parcel, 6, this.e);
        atzr.o(parcel, 9, this.f);
        atzr.q(parcel, 10, this.g);
        atzr.q(parcel, 11, this.h);
        atzr.c(parcel, a);
    }
}
