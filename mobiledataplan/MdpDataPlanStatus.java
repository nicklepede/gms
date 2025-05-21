package com.google.android.gms.mobiledataplan;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.a;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cdzy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class MdpDataPlanStatus extends AbstractSafeParcelable {
    private static final Map B;
    public static final Parcelable.Creator CREATOR;
    public static final Map a;
    public long A;
    public String b;
    public String c;
    public String d;
    public long e;
    public long f;
    public MdpFlexTimeWindow[] g;
    public int h;
    public String i;
    public String j;
    public String k;
    public String l;
    public int m;
    public List n;
    public long o;
    public long p;
    public long q;
    public String r;
    public String s;
    public boolean t;
    public QoeMetrics u;
    public DataPlanUsageHistory v;
    public int w;
    public long x;
    public long y;
    public long z;

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        hashMap.put(0, "UNSPECIFIED");
        hashMap.put(1, "THROTTLED");
        hashMap.put(2, "BLOCKED");
        hashMap.put(3, "PAY_AS_YOU_GO");
        B = new HashMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            B.put((String) entry.getValue(), (Integer) entry.getKey());
        }
        CREATOR = new cdzy();
    }

    public MdpDataPlanStatus() {
        this.t = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            MdpDataPlanStatus mdpDataPlanStatus = (MdpDataPlanStatus) obj;
            if (arwb.b(this.b, mdpDataPlanStatus.b) && arwb.b(this.c, mdpDataPlanStatus.c) && arwb.b(this.d, mdpDataPlanStatus.d) && arwb.b(Long.valueOf(this.e), Long.valueOf(mdpDataPlanStatus.e)) && arwb.b(Long.valueOf(this.f), Long.valueOf(mdpDataPlanStatus.f)) && Arrays.equals(this.g, mdpDataPlanStatus.g) && arwb.b(Integer.valueOf(this.h), Integer.valueOf(mdpDataPlanStatus.h)) && arwb.b(Long.valueOf(this.o), Long.valueOf(mdpDataPlanStatus.o)) && arwb.b(Long.valueOf(this.p), Long.valueOf(mdpDataPlanStatus.p)) && arwb.b(Long.valueOf(this.q), Long.valueOf(mdpDataPlanStatus.q)) && arwb.b(this.r, mdpDataPlanStatus.r) && arwb.b(this.i, mdpDataPlanStatus.i) && arwb.b(this.s, mdpDataPlanStatus.s) && arwb.b(this.j, mdpDataPlanStatus.j) && arwb.b(Boolean.valueOf(this.t), Boolean.valueOf(mdpDataPlanStatus.t)) && arwb.b(this.k, mdpDataPlanStatus.k) && arwb.b(this.l, mdpDataPlanStatus.l) && arwb.b(Integer.valueOf(this.m), Integer.valueOf(mdpDataPlanStatus.m)) && arwb.b(this.n, mdpDataPlanStatus.n) && arwb.b(this.u, mdpDataPlanStatus.u) && arwb.b(this.v, mdpDataPlanStatus.v)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.b, this.c, this.d, Long.valueOf(this.e), Long.valueOf(this.f), this.i, this.j, this.k, this.l, Integer.valueOf(this.m), this.n, this.u, this.v})), Integer.valueOf(Arrays.hashCode(this.g))})), Integer.valueOf(this.h), Long.valueOf(this.o), Long.valueOf(this.p), Long.valueOf(this.q), this.r, this.s, Boolean.valueOf(this.t)});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("PlanName", this.b, arrayList);
        arwa.b("ExpirationTime", this.c, arrayList);
        arwa.b("TrafficCategory", this.d, arrayList);
        arwa.b("QuotaBytes", Long.valueOf(this.e), arrayList);
        arwa.b("QuotaMinutes", Long.valueOf(this.f), arrayList);
        arwa.b("FlexTimeWindows", Arrays.toString(this.g), arrayList);
        int i = this.h;
        String str = (String) a.get(Integer.valueOf(i));
        if (str == null) {
            throw new IllegalArgumentException(a.j(i, "Illegal overusage policy string: "));
        }
        arwa.b("OverUsagePolicy", str, arrayList);
        arwa.b("RemainingBytes", Long.valueOf(this.p), arrayList);
        arwa.b("RemainingMinutes", Long.valueOf(this.q), arrayList);
        arwa.b("ShortDescription", this.k, arrayList);
        arwa.b("DisplayRefreshPeriod", this.l, arrayList);
        arwa.b("PlanType", Integer.valueOf(this.m), arrayList);
        arwa.b("Pmtcs", this.n, arrayList);
        arwa.b("SnapshotTime", Long.valueOf(this.o), arrayList);
        arwa.b("Description", this.r, arrayList);
        arwa.b("PlanId", this.i, arrayList);
        arwa.b("Balance", this.s, arrayList);
        arwa.b("ModuleName", this.j, arrayList);
        arwa.b("IsActive", Boolean.valueOf(this.t), arrayList);
        arwa.b("QoeMetrics", this.u, arrayList);
        arwa.b("DataPlanUsageHistory", this.v, arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = arxc.a(parcel);
        arxc.v(parcel, 1, this.b, false);
        arxc.v(parcel, 2, this.c, false);
        arxc.v(parcel, 3, this.d, false);
        arxc.q(parcel, 4, this.e);
        arxc.q(parcel, 5, this.f);
        arxc.J(parcel, 6, this.g, i);
        arxc.o(parcel, 7, this.h);
        arxc.v(parcel, 8, this.i, false);
        arxc.v(parcel, 9, this.j, false);
        arxc.v(parcel, 10, this.k, false);
        arxc.v(parcel, 11, this.l, false);
        arxc.o(parcel, 12, this.m);
        arxc.E(parcel, 13, this.n);
        arxc.q(parcel, 20, this.o);
        arxc.q(parcel, 21, this.p);
        arxc.q(parcel, 22, this.q);
        arxc.v(parcel, 23, this.r, false);
        arxc.v(parcel, 24, this.s, false);
        arxc.e(parcel, 25, this.t);
        arxc.t(parcel, 26, this.u, i, false);
        arxc.t(parcel, 27, this.v, i, false);
        arxc.o(parcel, 28, this.w);
        arxc.q(parcel, 29, this.x);
        arxc.q(parcel, 30, this.y);
        arxc.q(parcel, 31, this.z);
        arxc.q(parcel, 32, this.A);
        arxc.c(parcel, a2);
    }

    public MdpDataPlanStatus(String str, String str2, String str3, long j, long j2, MdpFlexTimeWindow[] mdpFlexTimeWindowArr, int i, String str4, String str5, String str6, String str7, int i2, List list, long j3, long j4, long j5, String str8, String str9, boolean z, QoeMetrics qoeMetrics, DataPlanUsageHistory dataPlanUsageHistory, int i3, long j6, long j7, long j8, long j9) {
        this.t = true;
        this.b = str;
        this.i = str4;
        this.j = str5;
        this.c = str2;
        this.d = str3;
        this.e = j;
        this.f = j2;
        this.g = mdpFlexTimeWindowArr;
        if (!a.keySet().contains(Integer.valueOf(i))) {
            throw new IllegalArgumentException(a.j(i, "Illegal overusage policy: "));
        }
        this.h = i;
        this.o = j3;
        this.p = j4;
        this.q = j5;
        this.r = str8;
        this.s = str9;
        this.k = str6;
        this.t = z;
        this.l = str7;
        this.m = i2;
        this.n = list;
        this.u = qoeMetrics;
        this.v = dataPlanUsageHistory;
        this.w = i3;
        this.x = j6;
        this.y = j7;
        this.z = j8;
        this.A = j9;
    }
}
