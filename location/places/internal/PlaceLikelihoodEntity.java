package com.google.android.gms.location.places.internal;

import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.arxd;
import defpackage.caef;
import defpackage.caex;
import defpackage.cagy;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class PlaceLikelihoodEntity extends AbstractSafeParcelable implements caex {
    public static final Parcelable.Creator CREATOR = new cagy();
    public final PlaceEntity a;
    public final float b;

    public PlaceLikelihoodEntity(PlaceEntity placeEntity, float f) {
        this.a = placeEntity;
        this.b = f;
    }

    public static PlaceLikelihoodEntity d(PlaceEntity placeEntity, float f) {
        arwm.s(placeEntity);
        return new PlaceLikelihoodEntity(placeEntity, f);
    }

    @Override // defpackage.caex
    public final float a() {
        return this.b;
    }

    public final ContentValues c() {
        ContentValues q = this.a.q();
        q.put("place_likelihood", Float.valueOf(this.b));
        q.put("data", arxd.n(this));
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

    @Override // defpackage.caex
    public final caef ik() {
        return this.a;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("place", this.a, arrayList);
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
