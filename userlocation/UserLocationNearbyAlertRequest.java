package com.google.android.gms.userlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.dkel;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class UserLocationNearbyAlertRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dkel();
    public final int a;
    public final int b;
    public final UserLocationNearbyAlertFilter c;
    public final boolean d;
    public final int e;
    public final int f;

    public UserLocationNearbyAlertRequest(int i, int i2, UserLocationNearbyAlertFilter userLocationNearbyAlertFilter, boolean z, int i3, int i4) {
        this.a = i;
        this.b = i2;
        if (userLocationNearbyAlertFilter != null) {
            this.c = userLocationNearbyAlertFilter;
        } else {
            this.c = null;
        }
        this.d = z;
        this.e = i3;
        this.f = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserLocationNearbyAlertRequest)) {
            return false;
        }
        UserLocationNearbyAlertRequest userLocationNearbyAlertRequest = (UserLocationNearbyAlertRequest) obj;
        return this.a == userLocationNearbyAlertRequest.a && this.b == userLocationNearbyAlertRequest.b && atyq.b(this.c, userLocationNearbyAlertRequest.c) && this.f == userLocationNearbyAlertRequest.f && this.e == userLocationNearbyAlertRequest.e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), this.c, Integer.valueOf(this.f), Integer.valueOf(this.e)});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("transitionTypes", Integer.valueOf(this.a), arrayList);
        atyp.b("loiteringTimeMillis", Integer.valueOf(this.b), arrayList);
        atyp.b("filter", this.c, arrayList);
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
        atzr.t(parcel, 4, this.c, i, false);
        atzr.e(parcel, 5, this.d);
        atzr.o(parcel, 6, this.e);
        atzr.o(parcel, 7, this.f);
        atzr.c(parcel, a);
    }
}
