package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.semanticlocation.PlaceCandidate;
import defpackage.atzr;
import defpackage.dbqm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class PointWithDetails extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dbqm();
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
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, point, i, false);
        atzr.q(parcel, 2, this.b);
        atzr.o(parcel, 3, this.c);
        atzr.c(parcel, a);
    }
}
