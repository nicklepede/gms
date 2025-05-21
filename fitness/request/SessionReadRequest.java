package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.bgis;
import defpackage.bglm;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class SessionReadRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bglm();
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
    public final bgis l;

    public SessionReadRequest(String str, String str2, long j, long j2, List list, List list2, boolean z, boolean z2, List list3, IBinder iBinder, boolean z3, boolean z4) {
        bgis bgisVar;
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
            bgisVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.ISessionReadCallback");
            bgisVar = queryLocalInterface instanceof bgis ? (bgis) queryLocalInterface : new bgis(iBinder);
        }
        this.l = bgisVar;
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
        return arwb.b(this.a, sessionReadRequest.a) && this.b.equals(sessionReadRequest.b) && this.c == sessionReadRequest.c && this.d == sessionReadRequest.d && arwb.b(this.e, sessionReadRequest.e) && arwb.b(this.f, sessionReadRequest.f) && this.g == sessionReadRequest.g && this.i.equals(sessionReadRequest.i) && this.h == sessionReadRequest.h && this.j == sessionReadRequest.j && this.k == sessionReadRequest.k;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Long.valueOf(this.c), Long.valueOf(this.d)});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("sessionName", this.a, arrayList);
        arwa.b("sessionId", this.b, arrayList);
        arwa.b("startTimeMillis", Long.valueOf(this.c), arrayList);
        arwa.b("endTimeMillis", Long.valueOf(this.d), arrayList);
        arwa.b("dataTypes", this.e, arrayList);
        arwa.b("dataSources", this.f, arrayList);
        arwa.b("sessionsFromAllApps", Boolean.valueOf(this.g), arrayList);
        arwa.b("excludedPackages", this.i, arrayList);
        arwa.b("useServer", Boolean.valueOf(this.h), arrayList);
        arwa.b("activitySessionsIncluded", Boolean.valueOf(this.j), arrayList);
        arwa.b("sleepSessionsIncluded", Boolean.valueOf(this.k), arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.q(parcel, 3, this.c);
        arxc.q(parcel, 4, this.d);
        arxc.y(parcel, 5, this.e, false);
        arxc.y(parcel, 6, this.f, false);
        arxc.e(parcel, 7, this.g);
        arxc.e(parcel, 8, this.h);
        arxc.x(parcel, 9, this.i, false);
        bgis bgisVar = this.l;
        arxc.D(parcel, 10, bgisVar == null ? null : bgisVar.a);
        arxc.e(parcel, 12, this.j);
        arxc.e(parcel, 13, this.k);
        arxc.c(parcel, a);
    }
}
