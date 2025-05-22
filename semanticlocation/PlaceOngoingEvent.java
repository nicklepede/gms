package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dbqk;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class PlaceOngoingEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dbqk();
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
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, i2);
        atzr.l(parcel, 2, this.b);
        atzr.l(parcel, 3, this.c);
        atzr.t(parcel, 4, this.d, i, false);
        atzr.t(parcel, 5, this.e, i, false);
        atzr.c(parcel, a);
    }
}
