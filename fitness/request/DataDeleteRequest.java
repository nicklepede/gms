package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.bgiu;
import defpackage.bgiw;
import defpackage.bgkj;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class DataDeleteRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bgkj();
    public final long a;
    public final long b;
    public final List c;
    public final List d;
    public final List e;
    public final boolean f;
    public final boolean g;
    public final bgiw h;
    public final boolean i;
    public final boolean j;

    public DataDeleteRequest(long j, long j2, List list, List list2, List list3, boolean z, boolean z2, boolean z3, boolean z4, IBinder iBinder) {
        bgiw bgiuVar;
        this.a = j;
        this.b = j2;
        this.c = DesugarCollections.unmodifiableList(list);
        this.d = DesugarCollections.unmodifiableList(list2);
        this.e = list3;
        this.f = z;
        this.g = z2;
        this.i = z3;
        this.j = z4;
        if (iBinder == null) {
            bgiuVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IStatusCallback");
            bgiuVar = queryLocalInterface instanceof bgiw ? (bgiw) queryLocalInterface : new bgiu(iBinder);
        }
        this.h = bgiuVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DataDeleteRequest)) {
            return false;
        }
        DataDeleteRequest dataDeleteRequest = (DataDeleteRequest) obj;
        return this.a == dataDeleteRequest.a && this.b == dataDeleteRequest.b && arwb.b(this.c, dataDeleteRequest.c) && arwb.b(this.d, dataDeleteRequest.d) && arwb.b(this.e, dataDeleteRequest.e) && this.f == dataDeleteRequest.f && this.g == dataDeleteRequest.g && this.i == dataDeleteRequest.i && this.j == dataDeleteRequest.j;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b)});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("startTimeMillis", Long.valueOf(this.a), arrayList);
        arwa.b("endTimeMillis", Long.valueOf(this.b), arrayList);
        arwa.b("dataSources", this.c, arrayList);
        arwa.b("dateTypes", this.d, arrayList);
        arwa.b("sessions", this.e, arrayList);
        arwa.b("deleteAllData", Boolean.valueOf(this.f), arrayList);
        arwa.b("deleteAllSessions", Boolean.valueOf(this.g), arrayList);
        if (this.i) {
            arwa.b("deleteByTimeRange", true, arrayList);
        }
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.a;
        int a = arxc.a(parcel);
        arxc.q(parcel, 1, j);
        arxc.q(parcel, 2, this.b);
        arxc.y(parcel, 3, this.c, false);
        arxc.y(parcel, 4, this.d, false);
        arxc.y(parcel, 5, this.e, false);
        arxc.e(parcel, 6, this.f);
        arxc.e(parcel, 7, this.g);
        bgiw bgiwVar = this.h;
        arxc.D(parcel, 8, bgiwVar == null ? null : bgiwVar.asBinder());
        arxc.e(parcel, 10, this.i);
        arxc.e(parcel, 11, this.j);
        arxc.c(parcel, a);
    }

    public DataDeleteRequest(long j, long j2, List list, List list2, List list3, boolean z, boolean z2, boolean z3, boolean z4, bgiw bgiwVar) {
        this.a = j;
        this.b = j2;
        this.c = DesugarCollections.unmodifiableList(list);
        this.d = DesugarCollections.unmodifiableList(list2);
        this.e = list3;
        this.f = z;
        this.g = z2;
        this.i = z3;
        this.j = z4;
        this.h = bgiwVar;
    }
}
