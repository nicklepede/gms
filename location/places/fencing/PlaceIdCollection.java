package com.google.android.gms.location.places.fencing;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.cafq;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class PlaceIdCollection extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cafq();
    final List a;

    public PlaceIdCollection(List list) {
        if (list == null) {
            throw new NullPointerException("Null list of place IDs is not valid.");
        }
        HashSet hashSet = new HashSet(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!TextUtils.isEmpty(str)) {
                hashSet.add(str);
            }
        }
        if (hashSet.isEmpty()) {
            throw new IllegalArgumentException("Empty list of Place IDs is not valid.");
        }
        if (hashSet.size() > 10) {
            throw new IllegalArgumentException(String.format(Locale.US, "No more than %d place IDs are permitted in a single PlaceIdCollection, but %d were specified.", 10, Integer.valueOf(hashSet.size())));
        }
        this.a = DesugarCollections.unmodifiableList(new ArrayList(hashSet));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int a = arxc.a(parcel);
        arxc.x(parcel, 1, list, false);
        arxc.c(parcel, a);
    }
}
