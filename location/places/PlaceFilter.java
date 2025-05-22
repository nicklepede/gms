package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.atyp;
import defpackage.atzr;
import defpackage.ccnn;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@Deprecated
/* loaded from: classes5.dex */
public final class PlaceFilter extends AbstractPlaceFilter {
    public static final Parcelable.Creator CREATOR = new ccnn();
    final List a;
    public final boolean b;
    final List c;
    final List d;
    public final Set e;
    public final Set f;
    private final Set g;

    static {
        new PlaceFilter();
    }

    public PlaceFilter() {
        this(Collections.EMPTY_LIST, false, Collections.EMPTY_LIST, Collections.EMPTY_LIST);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceFilter)) {
            return false;
        }
        PlaceFilter placeFilter = (PlaceFilter) obj;
        return this.e.equals(placeFilter.e) && this.b == placeFilter.b && this.g.equals(placeFilter.g) && this.f.equals(placeFilter.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.e, Boolean.valueOf(this.b), this.g, this.f});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Set set = this.e;
        if (!set.isEmpty()) {
            atyp.b("types", set, arrayList);
        }
        atyp.b("requireOpenNow", Boolean.valueOf(this.b), arrayList);
        Set set2 = this.f;
        if (!set2.isEmpty()) {
            atyp.b("placeIds", set2, arrayList);
        }
        Set set3 = this.g;
        if (!set3.isEmpty()) {
            atyp.b("requestedUserDataTypes", set3, arrayList);
        }
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.E(parcel, 1, this.a);
        atzr.e(parcel, 3, this.b);
        atzr.y(parcel, 4, this.c, false);
        atzr.x(parcel, 6, this.d, false);
        atzr.c(parcel, a);
    }

    public PlaceFilter(List list, boolean z, List list2, List list3) {
        this.a = list;
        this.b = z;
        this.c = list3;
        this.d = list2;
        this.e = a(list);
        this.g = a(list3);
        this.f = a(list2);
    }
}
