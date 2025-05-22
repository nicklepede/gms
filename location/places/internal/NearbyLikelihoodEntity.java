package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atzr;
import defpackage.ccmu;
import defpackage.ccmw;
import defpackage.ccpk;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class NearbyLikelihoodEntity extends AbstractSafeParcelable implements ccmu {
    public static final Parcelable.Creator CREATOR = new ccpk();
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

    @Override // defpackage.ccmu
    public final ccmw iz() {
        return this.a;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("nearby place", this.a, arrayList);
        atyp.b("likelihood", Float.valueOf(this.b), arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, this.a, i, false);
        atzr.l(parcel, 2, this.b);
        atzr.c(parcel, a);
    }

    @Override // defpackage.atqs
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}
