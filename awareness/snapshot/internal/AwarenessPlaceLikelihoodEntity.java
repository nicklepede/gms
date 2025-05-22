package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ajgz;
import defpackage.atyp;
import defpackage.atzr;
import defpackage.ccmw;
import defpackage.ccno;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class AwarenessPlaceLikelihoodEntity extends AbstractSafeParcelable implements ccno {
    public static final Parcelable.Creator CREATOR = new ajgz();
    public final AwarenessPlaceEntity a;
    public final float b;

    public AwarenessPlaceLikelihoodEntity(AwarenessPlaceEntity awarenessPlaceEntity, float f) {
        this.a = awarenessPlaceEntity;
        this.b = f;
    }

    @Override // defpackage.ccno
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
