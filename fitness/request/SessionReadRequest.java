package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.bini;
import defpackage.biqc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class SessionReadRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new biqc();
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final List e;
    public final List f;
    public final boolean g;
    public final boolean h;
    public final List i;
    public final boolean j;
    public final boolean k;
    public final bini l;

    public SessionReadRequest(String str, String str2, long j, long j2, List list, List list2, boolean z, boolean z2, List list3, IBinder iBinder, boolean z3, boolean z4) {
        bini biniVar;
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = list;
        this.f = list2;
        this.g = z;
        this.h = z2;
        this.i = list3;
        if (iBinder == null) {
            biniVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.ISessionReadCallback");
            biniVar = queryLocalInterface instanceof bini ? (bini) queryLocalInterface : new bini(iBinder);
        }
        this.l = biniVar;
        this.j = z3;
        this.k = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionReadRequest)) {
            return false;
        }
        SessionReadRequest sessionReadRequest = (SessionReadRequest) obj;
        return atyq.b(this.a, sessionReadRequest.a) && this.b.equals(sessionReadRequest.b) && this.c == sessionReadRequest.c && this.d == sessionReadRequest.d && atyq.b(this.e, sessionReadRequest.e) && atyq.b(this.f, sessionReadRequest.f) && this.g == sessionReadRequest.g && this.i.equals(sessionReadRequest.i) && this.h == sessionReadRequest.h && this.j == sessionReadRequest.j && this.k == sessionReadRequest.k;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Long.valueOf(this.c), Long.valueOf(this.d)});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("sessionName", this.a, arrayList);
        atyp.b("sessionId", this.b, arrayList);
        atyp.b("startTimeMillis", Long.valueOf(this.c), arrayList);
        atyp.b("endTimeMillis", Long.valueOf(this.d), arrayList);
        atyp.b("dataTypes", this.e, arrayList);
        atyp.b("dataSources", this.f, arrayList);
        atyp.b("sessionsFromAllApps", Boolean.valueOf(this.g), arrayList);
        atyp.b("excludedPackages", this.i, arrayList);
        atyp.b("useServer", Boolean.valueOf(this.h), arrayList);
        atyp.b("activitySessionsIncluded", Boolean.valueOf(this.j), arrayList);
        atyp.b("sleepSessionsIncluded", Boolean.valueOf(this.k), arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.q(parcel, 3, this.c);
        atzr.q(parcel, 4, this.d);
        atzr.y(parcel, 5, this.e, false);
        atzr.y(parcel, 6, this.f, false);
        atzr.e(parcel, 7, this.g);
        atzr.e(parcel, 8, this.h);
        atzr.x(parcel, 9, this.i, false);
        bini biniVar = this.l;
        atzr.D(parcel, 10, biniVar == null ? null : biniVar.a);
        atzr.e(parcel, 12, this.j);
        atzr.e(parcel, 13, this.k);
        atzr.c(parcel, a);
    }
}
