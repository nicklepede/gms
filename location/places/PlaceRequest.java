package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.ccnw;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class PlaceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ccnw();
    public final PlaceFilter a;
    public final long b;
    public final int c;
    public final long d;
    public final boolean e;
    public final boolean f;

    public PlaceRequest(PlaceFilter placeFilter, long j, int i, long j2, boolean z, boolean z2) {
        this.a = placeFilter;
        this.b = j;
        this.c = i;
        this.d = j2;
        this.e = z;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceRequest)) {
            return false;
        }
        PlaceRequest placeRequest = (PlaceRequest) obj;
        return atyq.b(this.a, placeRequest.a) && this.b == placeRequest.b && this.c == placeRequest.c && this.d == placeRequest.d && this.e == placeRequest.e && this.f == placeRequest.f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(this.b), Integer.valueOf(this.c), Long.valueOf(this.d), Boolean.valueOf(this.e), Boolean.valueOf(this.f)});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("filter", this.a, arrayList);
        atyp.b("interval", Long.valueOf(this.b), arrayList);
        atyp.b("priority", Integer.valueOf(this.c), arrayList);
        atyp.b("expireAt", Long.valueOf(this.d), arrayList);
        atyp.b("receiveFailures", Boolean.valueOf(this.e), arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PlaceFilter placeFilter = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 2, placeFilter, i, false);
        atzr.q(parcel, 3, this.b);
        atzr.o(parcel, 4, this.c);
        atzr.q(parcel, 5, this.d);
        atzr.e(parcel, 6, this.e);
        atzr.e(parcel, 7, this.f);
        atzr.c(parcel, a);
    }
}
