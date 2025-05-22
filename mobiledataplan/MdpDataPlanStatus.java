package com.google.android.gms.mobiledataplan;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.a;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cgjf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
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
        CREATOR = new cgjf();
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
            if (atyq.b(this.b, mdpDataPlanStatus.b) && atyq.b(this.c, mdpDataPlanStatus.c) && atyq.b(this.d, mdpDataPlanStatus.d) && atyq.b(Long.valueOf(this.e), Long.valueOf(mdpDataPlanStatus.e)) && atyq.b(Long.valueOf(this.f), Long.valueOf(mdpDataPlanStatus.f)) && Arrays.equals(this.g, mdpDataPlanStatus.g) && atyq.b(Integer.valueOf(this.h), Integer.valueOf(mdpDataPlanStatus.h)) && atyq.b(Long.valueOf(this.o), Long.valueOf(mdpDataPlanStatus.o)) && atyq.b(Long.valueOf(this.p), Long.valueOf(mdpDataPlanStatus.p)) && atyq.b(Long.valueOf(this.q), Long.valueOf(mdpDataPlanStatus.q)) && atyq.b(this.r, mdpDataPlanStatus.r) && atyq.b(this.i, mdpDataPlanStatus.i) && atyq.b(this.s, mdpDataPlanStatus.s) && atyq.b(this.j, mdpDataPlanStatus.j) && atyq.b(Boolean.valueOf(this.t), Boolean.valueOf(mdpDataPlanStatus.t)) && atyq.b(this.k, mdpDataPlanStatus.k) && atyq.b(this.l, mdpDataPlanStatus.l) && atyq.b(Integer.valueOf(this.m), Integer.valueOf(mdpDataPlanStatus.m)) && atyq.b(this.n, mdpDataPlanStatus.n) && atyq.b(this.u, mdpDataPlanStatus.u) && atyq.b(this.v, mdpDataPlanStatus.v)) {
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
        atyp.b("PlanName", this.b, arrayList);
        atyp.b("ExpirationTime", this.c, arrayList);
        atyp.b("TrafficCategory", this.d, arrayList);
        atyp.b("QuotaBytes", Long.valueOf(this.e), arrayList);
        atyp.b("QuotaMinutes", Long.valueOf(this.f), arrayList);
        atyp.b("FlexTimeWindows", Arrays.toString(this.g), arrayList);
        int i = this.h;
        String str = (String) a.get(Integer.valueOf(i));
        if (str == null) {
            throw new IllegalArgumentException(a.j(i, "Illegal overusage policy string: "));
        }
        atyp.b("OverUsagePolicy", str, arrayList);
        atyp.b("RemainingBytes", Long.valueOf(this.p), arrayList);
        atyp.b("RemainingMinutes", Long.valueOf(this.q), arrayList);
        atyp.b("ShortDescription", this.k, arrayList);
        atyp.b("DisplayRefreshPeriod", this.l, arrayList);
        atyp.b("PlanType", Integer.valueOf(this.m), arrayList);
        atyp.b("Pmtcs", this.n, arrayList);
        atyp.b("SnapshotTime", Long.valueOf(this.o), arrayList);
        atyp.b("Description", this.r, arrayList);
        atyp.b("PlanId", this.i, arrayList);
        atyp.b("Balance", this.s, arrayList);
        atyp.b("ModuleName", this.j, arrayList);
        atyp.b("IsActive", Boolean.valueOf(this.t), arrayList);
        atyp.b("QoeMetrics", this.u, arrayList);
        atyp.b("DataPlanUsageHistory", this.v, arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = atzr.a(parcel);
        atzr.v(parcel, 1, this.b, false);
        atzr.v(parcel, 2, this.c, false);
        atzr.v(parcel, 3, this.d, false);
        atzr.q(parcel, 4, this.e);
        atzr.q(parcel, 5, this.f);
        atzr.J(parcel, 6, this.g, i);
        atzr.o(parcel, 7, this.h);
        atzr.v(parcel, 8, this.i, false);
        atzr.v(parcel, 9, this.j, false);
        atzr.v(parcel, 10, this.k, false);
        atzr.v(parcel, 11, this.l, false);
        atzr.o(parcel, 12, this.m);
        atzr.E(parcel, 13, this.n);
        atzr.q(parcel, 20, this.o);
        atzr.q(parcel, 21, this.p);
        atzr.q(parcel, 22, this.q);
        atzr.v(parcel, 23, this.r, false);
        atzr.v(parcel, 24, this.s, false);
        atzr.e(parcel, 25, this.t);
        atzr.t(parcel, 26, this.u, i, false);
        atzr.t(parcel, 27, this.v, i, false);
        atzr.o(parcel, 28, this.w);
        atzr.q(parcel, 29, this.x);
        atzr.q(parcel, 30, this.y);
        atzr.q(parcel, 31, this.z);
        atzr.q(parcel, 32, this.A);
        atzr.c(parcel, a2);
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
