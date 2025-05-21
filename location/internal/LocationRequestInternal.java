package com.google.android.gms.location.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.LocationRequest;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.asrj;
import defpackage.bzin;
import defpackage.cacj;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@Deprecated
/* loaded from: classes5.dex */
public class LocationRequestInternal extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cacj();
    public LocationRequest a;

    public LocationRequestInternal(LocationRequest locationRequest, List list, boolean z, boolean z2, boolean z3, boolean z4, long j) {
        bzin bzinVar = new bzin(locationRequest);
        if (list != null) {
            bzinVar.c = c(list);
        }
        if (z) {
            bzinVar.c(1);
        }
        if (z2) {
            bzinVar.l(2);
        }
        if (z3) {
            bzinVar.b = true;
        }
        if (z4) {
            bzinVar.a = true;
        }
        if (j != Long.MAX_VALUE) {
            bzinVar.f(j);
        }
        this.a = bzinVar.a();
    }

    private static WorkSource c(List list) {
        if (list.isEmpty()) {
            return null;
        }
        WorkSource workSource = new WorkSource();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ClientIdentity clientIdentity = (ClientIdentity) it.next();
            asrj.e(workSource, clientIdentity.a, clientIdentity.b);
        }
        return workSource;
    }

    public final void a(List list) {
        bzin bzinVar = new bzin(this.a);
        bzinVar.c = c(list);
        this.a = bzinVar.a();
    }

    public final void b(boolean z) {
        bzin bzinVar = new bzin(this.a);
        bzinVar.l(true != z ? 0 : 2);
        this.a = bzinVar.a();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LocationRequestInternal) {
            return arwb.b(this.a, ((LocationRequestInternal) obj).a);
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
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, this.a, i, false);
        arxc.c(parcel, a);
    }
}
