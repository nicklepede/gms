package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.caec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class NearbyAlertRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new caec();
    public final int a;
    public final int b;
    public final NearbyAlertFilter c;
    public final boolean d;
    public final int e;
    public int f;

    public NearbyAlertRequest(int i, int i2, PlaceFilter placeFilter, NearbyAlertFilter nearbyAlertFilter, boolean z, int i3, int i4) {
        this.f = 110;
        this.a = i;
        this.b = i2;
        if (nearbyAlertFilter != null) {
            this.c = nearbyAlertFilter;
        } else {
            NearbyAlertFilter nearbyAlertFilter2 = null;
            if (placeFilter != null) {
                Set set = placeFilter.f;
                if (set == null || set.isEmpty()) {
                    Set set2 = placeFilter.e;
                    if (set2 != null && !set2.isEmpty()) {
                        nearbyAlertFilter2 = NearbyAlertFilter.c(placeFilter.e);
                    }
                } else {
                    this.c = NearbyAlertFilter.b(placeFilter.f);
                }
            }
            this.c = nearbyAlertFilter2;
        }
        this.d = z;
        this.e = i3;
        this.f = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyAlertRequest)) {
            return false;
        }
        NearbyAlertRequest nearbyAlertRequest = (NearbyAlertRequest) obj;
        return this.a == nearbyAlertRequest.a && this.b == nearbyAlertRequest.b && arwb.b(this.c, nearbyAlertRequest.c) && this.f == nearbyAlertRequest.f && this.e == nearbyAlertRequest.e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), this.c, Integer.valueOf(this.f), Integer.valueOf(this.e)});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("transitionTypes", Integer.valueOf(this.a), arrayList);
        arwa.b("loiteringTimeMillis", Integer.valueOf(this.b), arrayList);
        arwa.b("nearbyAlertFilter", this.c, arrayList);
        arwa.b("priority", Integer.valueOf(this.f), arrayList);
        arwa.b("radiusType", Integer.valueOf(this.e), arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, i2);
        arxc.o(parcel, 2, this.b);
        arxc.t(parcel, 3, null, i, false);
        arxc.t(parcel, 4, this.c, i, false);
        arxc.e(parcel, 5, this.d);
        arxc.o(parcel, 6, this.e);
        arxc.o(parcel, 7, this.f);
        arxc.c(parcel, a);
    }
}
