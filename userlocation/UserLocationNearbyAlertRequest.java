package com.google.android.gms.userlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.dhtd;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class UserLocationNearbyAlertRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dhtd();
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
        return this.a == userLocationNearbyAlertRequest.a && this.b == userLocationNearbyAlertRequest.b && arwb.b(this.c, userLocationNearbyAlertRequest.c) && this.f == userLocationNearbyAlertRequest.f && this.e == userLocationNearbyAlertRequest.e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), this.c, Integer.valueOf(this.f), Integer.valueOf(this.e)});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("transitionTypes", Integer.valueOf(this.a), arrayList);
        arwa.b("loiteringTimeMillis", Integer.valueOf(this.b), arrayList);
        arwa.b("filter", this.c, arrayList);
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
        arxc.t(parcel, 4, this.c, i, false);
        arxc.e(parcel, 5, this.d);
        arxc.o(parcel, 6, this.e);
        arxc.o(parcel, 7, this.f);
        arxc.c(parcel, a);
    }
}
