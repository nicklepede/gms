package com.google.android.gms.appdatasearch;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.a;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.vnf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class Feature extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new vnf();
    public final int a;
    final Bundle b;

    public Feature(int i, Bundle bundle) {
        this.a = i;
        this.b = bundle;
    }

    public static Feature a(int i, Feature[] featureArr) {
        if (featureArr != null) {
            for (Feature feature : featureArr) {
                if (feature.a == i) {
                    return feature;
                }
            }
        }
        return null;
    }

    public static void c(List list, Feature feature) {
        if (feature != null) {
            for (int i = 0; i < list.size(); i++) {
                int i2 = ((Feature) list.get(i)).a;
                int i3 = feature.a;
                if (i2 == i3) {
                    throw new IllegalStateException(a.l(i3, "Feature ", " already exists"));
                }
            }
            list.add(feature);
        }
    }

    public final String b(String str) {
        return this.b.getString(str);
    }

    public final void d(String str, String str2) {
        this.b.putString(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Feature)) {
            return false;
        }
        Feature feature = (Feature) obj;
        if (this.a != feature.a) {
            return false;
        }
        Bundle bundle = this.b;
        if (bundle == null) {
            return feature.b == null;
        }
        Bundle bundle2 = feature.b;
        if (bundle2 == null || bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            if (!bundle2.containsKey(str) || !atyq.b(bundle.getString(str), bundle2.getString(str))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(this.a));
        Bundle bundle = this.b;
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                arrayList.add(str);
                String string = bundle.getString(str);
                if (string != null) {
                    arrayList.add(string);
                }
            }
        }
        return Arrays.hashCode(arrayList.toArray(new Object[0]));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.g(parcel, 2, this.b, false);
        atzr.c(parcel, a);
    }

    public Feature(int i) {
        this(i, new Bundle());
    }
}
