package com.google.android.gms.location.places.fencing;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.ccoi;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class PlacefencingFilter extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ccoi();
    final List a;
    final List b;
    final List c;

    public PlacefencingFilter(List list, List list2, List list3) {
        List unmodifiableList = list != null ? DesugarCollections.unmodifiableList(list) : Collections.EMPTY_LIST;
        this.a = unmodifiableList;
        List unmodifiableList2 = list2 != null ? DesugarCollections.unmodifiableList(list2) : Collections.EMPTY_LIST;
        this.b = unmodifiableList2;
        List unmodifiableList3 = list3 != null ? DesugarCollections.unmodifiableList(list3) : Collections.EMPTY_LIST;
        this.c = unmodifiableList3;
        if (unmodifiableList.isEmpty() && unmodifiableList2.isEmpty() && unmodifiableList3.isEmpty()) {
            throw new IllegalArgumentException("PlacefencingFilter must specify something to filter");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int a = atzr.a(parcel);
        atzr.y(parcel, 1, list, false);
        atzr.E(parcel, 2, this.b);
        atzr.x(parcel, 3, this.c, false);
        atzr.c(parcel, a);
    }
}
