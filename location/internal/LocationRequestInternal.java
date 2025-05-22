package com.google.android.gms.location.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.LocationRequest;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.auvd;
import defpackage.cbre;
import defpackage.ccla;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@Deprecated
/* loaded from: classes5.dex */
public class LocationRequestInternal extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ccla();
    public LocationRequest a;

    public LocationRequestInternal(LocationRequest locationRequest, List list, boolean z, boolean z2, boolean z3, boolean z4, long j) {
        cbre cbreVar = new cbre(locationRequest);
        if (list != null) {
            cbreVar.c = c(list);
        }
        if (z) {
            cbreVar.c(1);
        }
        if (z2) {
            cbreVar.l(2);
        }
        if (z3) {
            cbreVar.b = true;
        }
        if (z4) {
            cbreVar.a = true;
        }
        if (j != Long.MAX_VALUE) {
            cbreVar.f(j);
        }
        this.a = cbreVar.a();
    }

    private static WorkSource c(List list) {
        if (list.isEmpty()) {
            return null;
        }
        WorkSource workSource = new WorkSource();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ClientIdentity clientIdentity = (ClientIdentity) it.next();
            auvd.e(workSource, clientIdentity.a, clientIdentity.b);
        }
        return workSource;
    }

    public final void a(List list) {
        cbre cbreVar = new cbre(this.a);
        cbreVar.c = c(list);
        this.a = cbreVar.a();
    }

    public final void b(boolean z) {
        cbre cbreVar = new cbre(this.a);
        cbreVar.l(true != z ? 0 : 2);
        this.a = cbreVar.a();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LocationRequestInternal) {
            return atyq.b(this.a, ((LocationRequestInternal) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, this.a, i, false);
        atzr.c(parcel, a);
    }
}
