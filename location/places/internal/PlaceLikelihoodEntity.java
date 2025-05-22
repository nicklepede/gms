package com.google.android.gms.location.places.internal;

import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.atzs;
import defpackage.ccmw;
import defpackage.ccno;
import defpackage.ccpp;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class PlaceLikelihoodEntity extends AbstractSafeParcelable implements ccno {
    public static final Parcelable.Creator CREATOR = new ccpp();
    public final PlaceEntity a;
    public final float b;

    public PlaceLikelihoodEntity(PlaceEntity placeEntity, float f) {
        this.a = placeEntity;
        this.b = f;
    }

    public static PlaceLikelihoodEntity d(PlaceEntity placeEntity, float f) {
        atzb.s(placeEntity);
        return new PlaceLikelihoodEntity(placeEntity, f);
    }

    @Override // defpackage.ccno
    public final float a() {
        return this.b;
    }

    public final ContentValues c() {
        ContentValues q = this.a.q();
        q.put("place_likelihood", Float.valueOf(this.b));
        q.put("data", atzs.n(this));
        return q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceLikelihoodEntity)) {
            return false;
        }
        PlaceLikelihoodEntity placeLikelihoodEntity = (PlaceLikelihoodEntity) obj;
        return this.a.equals(placeLikelihoodEntity.a) && this.b == placeLikelihoodEntity.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }

    @Override // defpackage.ccno
    public final ccmw iz() {
        return this.a;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("place", this.a, arrayList);
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
