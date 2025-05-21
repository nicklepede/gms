package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ahgj;
import defpackage.arwa;
import defpackage.arxc;
import defpackage.caef;
import defpackage.caex;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class AwarenessPlaceLikelihoodEntity extends AbstractSafeParcelable implements caex {
    public static final Parcelable.Creator CREATOR = new ahgj();
    public final AwarenessPlaceEntity a;
    public final float b;

    public AwarenessPlaceLikelihoodEntity(AwarenessPlaceEntity awarenessPlaceEntity, float f) {
        this.a = awarenessPlaceEntity;
        this.b = f;
    }

    @Override // defpackage.caex
    public final float a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AwarenessPlaceLikelihoodEntity)) {
            return false;
        }
        AwarenessPlaceLikelihoodEntity awarenessPlaceLikelihoodEntity = (AwarenessPlaceLikelihoodEntity) obj;
        return this.a.equals(awarenessPlaceLikelihoodEntity.a) && this.b == awarenessPlaceLikelihoodEntity.b;
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
