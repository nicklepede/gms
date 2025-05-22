package com.google.android.gms.userlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.dkek;
import defpackage.elgo;
import defpackage.elpg;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class UserLocationNearbyAlertFilter extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dkek();
    final List a;
    final List b;
    final String c;

    public UserLocationNearbyAlertFilter(List list, List list2, String str) {
        List arrayList;
        List arrayList2;
        if (list == null) {
            int i = elgo.d;
            arrayList = elpg.a;
        } else {
            arrayList = new ArrayList(new HashSet(list));
        }
        this.a = arrayList;
        if (list2 == null) {
            int i2 = elgo.d;
            arrayList2 = elpg.a;
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
        return this.b.equals(userLocationNearbyAlertFilter.b) && this.a.equals(userLocationNearbyAlertFilter.a) && atyq.b(this.c, userLocationNearbyAlertFilter.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a, this.c});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.b;
        if (!list.isEmpty()) {
            atyp.b("types", list, arrayList);
        }
        List list2 = this.a;
        if (!list2.isEmpty()) {
            atyp.b("placeIds", list2, arrayList);
        }
        String str = this.c;
        if (str != null) {
            atyp.b("chainName", str, arrayList);
        }
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int a = atzr.a(parcel);
        atzr.x(parcel, 1, list, false);
        atzr.E(parcel, 2, this.b);
        atzr.v(parcel, 4, this.c, false);
        atzr.c(parcel, a);
    }
}
