package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atqs;
import defpackage.atyp;
import defpackage.atzr;
import defpackage.ccoz;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class HierarchicalPlaceLikelihoodEntity extends AbstractSafeParcelable implements atqs {
    public static final Parcelable.Creator CREATOR;
    public final PlaceEntity a;
    public final float b;
    final float c;
    final int d;
    final List e;

    static {
        List list = Collections.EMPTY_LIST;
        CREATOR = new ccoz();
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
        atyp.b("place", this.a, arrayList);
        atyp.b("likelihood", Float.valueOf(this.b), arrayList);
        atyp.b("hierarchyLikelihood", Float.valueOf(this.c), arrayList);
        atyp.b("hierarchyLevel", Integer.valueOf(this.d), arrayList);
        atyp.b("containedPlaceIds", this.e.toString(), arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, this.a, i, false);
        atzr.l(parcel, 2, this.b);
        atzr.l(parcel, 3, this.c);
        atzr.o(parcel, 4, this.d);
        atzr.x(parcel, 5, this.e, false);
        atzr.c(parcel, a);
    }

    @Override // defpackage.atqs
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}
