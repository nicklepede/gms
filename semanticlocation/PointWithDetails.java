package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.semanticlocation.PlaceCandidate;
import defpackage.arxc;
import defpackage.czgo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class PointWithDetails extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new czgo();
    public final PlaceCandidate.Point a;
    public final long b;

    @Deprecated
    public final int c;

    public PointWithDetails(PlaceCandidate.Point point, long j, int i) {
        this.a = point;
        this.b = j;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PlaceCandidate.Point point = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, point, i, false);
        arxc.q(parcel, 2, this.b);
        arxc.o(parcel, 3, this.c);
        arxc.c(parcel, a);
    }
}
