package com.google.android.gms.location.places.fencing;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.ccoh;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class PlaceIdCollection extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ccoh();
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
        int a = atzr.a(parcel);
        atzr.x(parcel, 1, list, false);
        atzr.c(parcel, a);
    }
}
