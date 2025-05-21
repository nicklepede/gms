package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aqxu;
import defpackage.arwb;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.arzc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class ApiFeatureRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new arzc();
    private static final Comparator e = new Comparator() { // from class: arzb
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Feature feature = (Feature) obj;
            String str = feature.a;
            Feature feature2 = (Feature) obj2;
            String str2 = feature2.a;
            return !str.equals(str2) ? str.compareTo(str2) : Long.compare(feature.a(), feature2.a());
        }
    };
    public final List a;
    public final boolean b;
    public final String c;
    public final String d;

    public ApiFeatureRequest(List list, boolean z, String str, String str2) {
        arwm.s(list);
        this.a = list;
        this.b = z;
        this.c = str;
        this.d = str2;
    }

    public static ApiFeatureRequest a(List list, boolean z) {
        TreeSet treeSet = new TreeSet(e);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Collections.addAll(treeSet, ((aqxu) it.next()).gh());
        }
        return new ApiFeatureRequest(new ArrayList(treeSet), z, null, null);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ApiFeatureRequest)) {
            return false;
        }
        ApiFeatureRequest apiFeatureRequest = (ApiFeatureRequest) obj;
        return this.b == apiFeatureRequest.b && arwb.b(this.a, apiFeatureRequest.a) && arwb.b(this.c, apiFeatureRequest.c) && arwb.b(this.d, apiFeatureRequest.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.b), this.a, this.c, this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int a = arxc.a(parcel);
        arxc.y(parcel, 1, list, false);
        arxc.e(parcel, 2, this.b);
        arxc.v(parcel, 3, this.c, false);
        arxc.v(parcel, 4, this.d, false);
        arxc.c(parcel, a);
    }
}
