package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arxc;
import defpackage.caed;
import defpackage.caef;
import defpackage.cagt;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class NearbyLikelihoodEntity extends AbstractSafeParcelable implements caed {
    public static final Parcelable.Creator CREATOR = new cagt();
    public final PlaceEntity a;
    public final float b;

    public NearbyLikelihoodEntity(PlaceEntity placeEntity, float f) {
        this.a = placeEntity;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyLikelihoodEntity)) {
            return false;
        }
        NearbyLikelihoodEntity nearbyLikelihoodEntity = (NearbyLikelihoodEntity) obj;
        return this.a.equals(nearbyLikelihoodEntity.a) && this.b == nearbyLikelihoodEntity.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }

    @Override // defpackage.caed
    public final caef ik() {
        return this.a;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("nearby place", this.a, arrayList);
        arwa.b("likelihood", Float.valueOf(this.b), arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, this.a, i, false);
        arxc.l(parcel, 2, this.b);
        arxc.c(parcel, a);
    }

    @Override // defpackage.arod
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}
