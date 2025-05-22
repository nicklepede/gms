package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.bink;
import defpackage.binm;
import defpackage.bioz;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class DataDeleteRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bioz();
    public final long a;
    public final long b;
    public final List c;
    public final List d;
    public final List e;
    public final boolean f;
    public final boolean g;
    public final binm h;
    public final boolean i;
    public final boolean j;

    public DataDeleteRequest(long j, long j2, List list, List list2, List list3, boolean z, boolean z2, boolean z3, boolean z4, IBinder iBinder) {
        binm binkVar;
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
            binkVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IStatusCallback");
            binkVar = queryLocalInterface instanceof binm ? (binm) queryLocalInterface : new bink(iBinder);
        }
        this.h = binkVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DataDeleteRequest)) {
            return false;
        }
        DataDeleteRequest dataDeleteRequest = (DataDeleteRequest) obj;
        return this.a == dataDeleteRequest.a && this.b == dataDeleteRequest.b && atyq.b(this.c, dataDeleteRequest.c) && atyq.b(this.d, dataDeleteRequest.d) && atyq.b(this.e, dataDeleteRequest.e) && this.f == dataDeleteRequest.f && this.g == dataDeleteRequest.g && this.i == dataDeleteRequest.i && this.j == dataDeleteRequest.j;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b)});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("startTimeMillis", Long.valueOf(this.a), arrayList);
        atyp.b("endTimeMillis", Long.valueOf(this.b), arrayList);
        atyp.b("dataSources", this.c, arrayList);
        atyp.b("dateTypes", this.d, arrayList);
        atyp.b("sessions", this.e, arrayList);
        atyp.b("deleteAllData", Boolean.valueOf(this.f), arrayList);
        atyp.b("deleteAllSessions", Boolean.valueOf(this.g), arrayList);
        if (this.i) {
            atyp.b("deleteByTimeRange", true, arrayList);
        }
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.a;
        int a = atzr.a(parcel);
        atzr.q(parcel, 1, j);
        atzr.q(parcel, 2, this.b);
        atzr.y(parcel, 3, this.c, false);
        atzr.y(parcel, 4, this.d, false);
        atzr.y(parcel, 5, this.e, false);
        atzr.e(parcel, 6, this.f);
        atzr.e(parcel, 7, this.g);
        binm binmVar = this.h;
        atzr.D(parcel, 8, binmVar == null ? null : binmVar.asBinder());
        atzr.e(parcel, 10, this.i);
        atzr.e(parcel, 11, this.j);
        atzr.c(parcel, a);
    }

    public DataDeleteRequest(long j, long j2, List list, List list2, List list3, boolean z, boolean z2, boolean z3, boolean z4, binm binmVar) {
        this.a = j;
        this.b = j2;
        this.c = DesugarCollections.unmodifiableList(list);
        this.d = DesugarCollections.unmodifiableList(list2);
        this.e = list3;
        this.f = z;
        this.g = z2;
        this.i = z3;
        this.j = z4;
        this.h = binmVar;
    }
}
