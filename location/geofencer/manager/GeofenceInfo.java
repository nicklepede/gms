package com.google.android.gms.location.geofencer.manager;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.bzwa;
import defpackage.bzxp;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class GeofenceInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bzxp();
    public final GeofenceRequest a;
    public final bzwa b;
    public final boolean c;

    public GeofenceInfo(GeofenceRequest geofenceRequest, bzwa bzwaVar, boolean z) {
        fvbo.f(geofenceRequest, "request");
        fvbo.f(bzwaVar, "state");
        this.a = geofenceRequest;
        this.b = bzwaVar;
        this.c = z;
    }

    public static /* synthetic */ GeofenceInfo a(GeofenceInfo geofenceInfo, GeofenceRequest geofenceRequest, bzwa bzwaVar, boolean z, int i) {
        if ((i & 1) != 0) {
            geofenceRequest = geofenceInfo.a;
        }
        if ((i & 2) != 0) {
            bzwaVar = geofenceInfo.b;
        }
        if ((i & 4) != 0) {
            z = geofenceInfo.c;
        }
        fvbo.f(geofenceRequest, "request");
        fvbo.f(bzwaVar, "state");
        return new GeofenceInfo(geofenceRequest, bzwaVar, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GeofenceInfo)) {
            return false;
        }
        GeofenceInfo geofenceInfo = (GeofenceInfo) obj;
        return fvbo.n(this.a, geofenceInfo.a) && this.b == geofenceInfo.b && this.c == geofenceInfo.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        return "GeofenceInfo(request=" + this.a + ", state=" + this.b + ", isInitialTransition=" + this.c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fvbo.f(parcel, "parcel");
        GeofenceRequest geofenceRequest = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, geofenceRequest, i, false);
        arxc.o(parcel, 2, this.b.a());
        arxc.e(parcel, 3, this.c);
        arxc.c(parcel, a);
    }
}
