package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.atyp;
import defpackage.atzr;
import defpackage.ccms;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class NearbyAlertFilter extends AbstractPlaceFilter {
    public static final Parcelable.Creator CREATOR = new ccms();
    final List a;
    final List b;
    public final String c;
    public final Set d;
    public final Set e;

    public NearbyAlertFilter(List list, List list2, String str) {
        this.a = list;
        this.b = list2;
        this.c = str;
        this.d = a(list);
        this.e = a(list2);
    }

    public static NearbyAlertFilter b(Collection collection) {
        if (collection == null) {
            throw new IllegalArgumentException("NearbyAlertFilters must contain a list of place IDs to match results with.");
        }
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("NearbyAlertFilters must contain at least one place ID to match results with.");
        }
        return new NearbyAlertFilter(arrayList, null, null);
    }

    public static NearbyAlertFilter c(Collection collection) {
        if (collection == null) {
            throw new IllegalArgumentException("NearbyAlertFilters must contain a list of place types to match results with.");
        }
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num != null) {
                arrayList.add(num);
            }
        }
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("NearbyAlertFilters must contain at least one place type to match results with.");
        }
        return new NearbyAlertFilter(null, arrayList, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyAlertFilter)) {
            return false;
        }
        NearbyAlertFilter nearbyAlertFilter = (NearbyAlertFilter) obj;
        String str = this.c;
        if ((str != null || nearbyAlertFilter.c == null) && this.e.equals(nearbyAlertFilter.e) && this.d.equals(nearbyAlertFilter.d)) {
            return str == null || str.equals(nearbyAlertFilter.c);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.e, this.d, this.c});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Set set = this.e;
        if (!set.isEmpty()) {
            atyp.b("types", set, arrayList);
        }
        Set set2 = this.d;
        if (!set2.isEmpty()) {
            atyp.b("placeIds", set2, arrayList);
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
