package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arod;
import defpackage.arwa;
import defpackage.arxc;
import defpackage.cagi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class HierarchicalPlaceLikelihoodEntity extends AbstractSafeParcelable implements arod {
    public static final Parcelable.Creator CREATOR;
    public final PlaceEntity a;
    public final float b;
    final float c;
    final int d;
    final List e;

    static {
        List list = Collections.EMPTY_LIST;
        CREATOR = new cagi();
    }

    public HierarchicalPlaceLikelihoodEntity(PlaceEntity placeEntity, float f, float f2, int i, List list) {
        this.a = placeEntity;
        this.b = f;
        this.c = f2;
        this.d = i;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HierarchicalPlaceLikelihoodEntity)) {
            return false;
        }
        HierarchicalPlaceLikelihoodEntity hierarchicalPlaceLikelihoodEntity = (HierarchicalPlaceLikelihoodEntity) obj;
        return this.a.equals(hierarchicalPlaceLikelihoodEntity.a) && this.b == hierarchicalPlaceLikelihoodEntity.b && this.c == hierarchicalPlaceLikelihoodEntity.c && this.d == hierarchicalPlaceLikelihoodEntity.d && this.e.equals(hierarchicalPlaceLikelihoodEntity.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("place", this.a, arrayList);
        arwa.b("likelihood", Float.valueOf(this.b), arrayList);
        arwa.b("hierarchyLikelihood", Float.valueOf(this.c), arrayList);
        arwa.b("hierarchyLevel", Integer.valueOf(this.d), arrayList);
        arwa.b("containedPlaceIds", this.e.toString(), arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, this.a, i, false);
        arxc.l(parcel, 2, this.b);
        arxc.l(parcel, 3, this.c);
        arxc.o(parcel, 4, this.d);
        arxc.x(parcel, 5, this.e, false);
        arxc.c(parcel, a);
    }

    @Override // defpackage.arod
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}
