package com.google.android.gms.location.places.fencing;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.cafr;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class PlacefencingFilter extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cafr();
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
        int a = arxc.a(parcel);
        arxc.y(parcel, 1, list, false);
        arxc.E(parcel, 2, this.b);
        arxc.x(parcel, 3, this.c, false);
        arxc.c(parcel, a);
    }
}
