package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.ccmt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class NearbyAlertRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ccmt();
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
        return this.a == nearbyAlertRequest.a && this.b == nearbyAlertRequest.b && atyq.b(this.c, nearbyAlertRequest.c) && this.f == nearbyAlertRequest.f && this.e == nearbyAlertRequest.e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), this.c, Integer.valueOf(this.f), Integer.valueOf(this.e)});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("transitionTypes", Integer.valueOf(this.a), arrayList);
        atyp.b("loiteringTimeMillis", Integer.valueOf(this.b), arrayList);
        atyp.b("nearbyAlertFilter", this.c, arrayList);
        atyp.b("priority", Integer.valueOf(this.f), arrayList);
        atyp.b("radiusType", Integer.valueOf(this.e), arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, i2);
        atzr.o(parcel, 2, this.b);
        atzr.t(parcel, 3, null, i, false);
        atzr.t(parcel, 4, this.c, i, false);
        atzr.e(parcel, 5, this.d);
        atzr.o(parcel, 6, this.e);
        atzr.o(parcel, 7, this.f);
        atzr.c(parcel, a);
    }
}
