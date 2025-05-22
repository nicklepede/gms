package com.google.android.gms.location.geofencer.manager;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.ccer;
import defpackage.ccgg;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class GeofenceInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ccgg();
    public final GeofenceRequest a;
    public final ccer b;
    public final boolean c;

    public GeofenceInfo(GeofenceRequest geofenceRequest, ccer ccerVar, boolean z) {
        fxxm.f(geofenceRequest, "request");
        fxxm.f(ccerVar, "state");
        this.a = geofenceRequest;
        this.b = ccerVar;
        this.c = z;
    }

    public static /* synthetic */ GeofenceInfo a(GeofenceInfo geofenceInfo, GeofenceRequest geofenceRequest, ccer ccerVar, boolean z, int i) {
        if ((i & 1) != 0) {
            geofenceRequest = geofenceInfo.a;
        }
        if ((i & 2) != 0) {
            ccerVar = geofenceInfo.b;
        }
        if ((i & 4) != 0) {
            z = geofenceInfo.c;
        }
        fxxm.f(geofenceRequest, "request");
        fxxm.f(ccerVar, "state");
        return new GeofenceInfo(geofenceRequest, ccerVar, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GeofenceInfo)) {
            return false;
        }
        GeofenceInfo geofenceInfo = (GeofenceInfo) obj;
        return fxxm.n(this.a, geofenceInfo.a) && this.b == geofenceInfo.b && this.c == geofenceInfo.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        return "GeofenceInfo(request=" + this.a + ", state=" + this.b + ", isInitialTransition=" + this.c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fxxm.f(parcel, "parcel");
        GeofenceRequest geofenceRequest = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, geofenceRequest, i, false);
        atzr.o(parcel, 2, this.b.a());
        atzr.e(parcel, 3, this.c);
        atzr.c(parcel, a);
    }
}
