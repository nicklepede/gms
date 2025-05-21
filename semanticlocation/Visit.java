package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.czhh;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class Visit extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new czhh();
    public final int a;
    public final float b;

    @Deprecated
    public final float c;
    public final PlaceCandidate d;
    public final AdditionalPlaceCandidates e;
    public final boolean f;
    public final TemporarilyClosedPlaceCandidates g;
    public final boolean h;

    public Visit(int i, float f, float f2, PlaceCandidate placeCandidate, AdditionalPlaceCandidates additionalPlaceCandidates, boolean z, TemporarilyClosedPlaceCandidates temporarilyClosedPlaceCandidates, boolean z2) {
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = placeCandidate;
        this.e = additionalPlaceCandidates;
        this.f = z;
        this.g = temporarilyClosedPlaceCandidates;
        this.h = z2;
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
        arxc.e(parcel, 6, this.f);
        arxc.t(parcel, 7, this.g, i, false);
        arxc.e(parcel, 8, this.h);
        arxc.c(parcel, a);
    }
}
