package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.semanticlocation.PlaceCandidate;
import defpackage.atzr;
import defpackage.dbpf;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class Activity extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dbpf();
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
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, point, i, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.l(parcel, 3, this.c);
        atzr.l(parcel, 4, this.d);
        atzr.l(parcel, 5, this.e);
        atzr.t(parcel, 6, this.f, i, false);
        atzr.t(parcel, 7, this.g, i, false);
        atzr.c(parcel, a);
    }
}
