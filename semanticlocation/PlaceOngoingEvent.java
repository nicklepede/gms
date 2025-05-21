package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.czgm;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class PlaceOngoingEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new czgm();
    public final int a;
    public final float b;

    @Deprecated
    public final float c;
    public final PlaceCandidate d;
    public final AdditionalPlaceCandidates e;

    public PlaceOngoingEvent(int i, float f, float f2, PlaceCandidate placeCandidate, AdditionalPlaceCandidates additionalPlaceCandidates) {
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = placeCandidate;
        this.e = additionalPlaceCandidates;
    }

    public final String toString() {
        AdditionalPlaceCandidates additionalPlaceCandidates = this.e;
        return "PlaceOngoingEvent{hierarchyLevel=" + this.a + ", probability=" + this.b + ", topCandidate=" + String.valueOf(this.d) + ", additionalPlaceCandidates=" + String.valueOf(additionalPlaceCandidates) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, i2);
        arxc.l(parcel, 2, this.b);
        arxc.l(parcel, 3, this.c);
        arxc.t(parcel, 4, this.d, i, false);
        arxc.t(parcel, 5, this.e, i, false);
        arxc.c(parcel, a);
    }
}
