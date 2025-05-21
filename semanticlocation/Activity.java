package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.semanticlocation.PlaceCandidate;
import defpackage.arxc;
import defpackage.czfh;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class Activity extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new czfh();
    public final PlaceCandidate.Point a;
    public final PlaceCandidate.Point b;
    public final float c;
    public final float d;

    @Deprecated
    public final float e;
    public final ActivityCandidate f;
    public final AdditionalActivityCandidates g;

    public Activity(PlaceCandidate.Point point, PlaceCandidate.Point point2, float f, float f2, float f3, ActivityCandidate activityCandidate, AdditionalActivityCandidates additionalActivityCandidates) {
        this.a = point;
        this.b = point2;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = activityCandidate;
        this.g = additionalActivityCandidates;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PlaceCandidate.Point point = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, point, i, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.l(parcel, 3, this.c);
        arxc.l(parcel, 4, this.d);
        arxc.l(parcel, 5, this.e);
        arxc.t(parcel, 6, this.f, i, false);
        arxc.t(parcel, 7, this.g, i, false);
        arxc.c(parcel, a);
    }
}
