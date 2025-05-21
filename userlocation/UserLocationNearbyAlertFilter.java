package com.google.android.gms.userlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.dhtc;
import defpackage.eitj;
import defpackage.ejcb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class UserLocationNearbyAlertFilter extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dhtc();
    final List a;
    final List b;
    final String c;

    public UserLocationNearbyAlertFilter(List list, List list2, String str) {
        List arrayList;
        List arrayList2;
        if (list == null) {
            int i = eitj.d;
            arrayList = ejcb.a;
        } else {
            arrayList = new ArrayList(new HashSet(list));
        }
        this.a = arrayList;
        if (list2 == null) {
            int i2 = eitj.d;
            arrayList2 = ejcb.a;
        } else {
            arrayList2 = new ArrayList(new HashSet(list2));
        }
        this.b = arrayList2;
        Collections.sort(arrayList);
        Collections.sort(arrayList2);
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserLocationNearbyAlertFilter)) {
            return false;
        }
        UserLocationNearbyAlertFilter userLocationNearbyAlertFilter = (UserLocationNearbyAlertFilter) obj;
        return this.b.equals(userLocationNearbyAlertFilter.b) && this.a.equals(userLocationNearbyAlertFilter.a) && arwb.b(this.c, userLocationNearbyAlertFilter.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a, this.c});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.b;
        if (!list.isEmpty()) {
            arwa.b("types", list, arrayList);
        }
        List list2 = this.a;
        if (!list2.isEmpty()) {
            arwa.b("placeIds", list2, arrayList);
        }
        String str = this.c;
        if (str != null) {
            arwa.b("chainName", str, arrayList);
        }
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int a = arxc.a(parcel);
        arxc.x(parcel, 1, list, false);
        arxc.E(parcel, 2, this.b);
        arxc.v(parcel, 4, this.c, false);
        arxc.c(parcel, a);
    }
}
