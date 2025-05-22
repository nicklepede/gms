package com.google.android.gms.semanticlocationhistory;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.semanticlocation.PlaceCandidate;
import defpackage.atzr;
import defpackage.dcms;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class InferredPlace extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dcms();
    public final PlaceCandidate.Identifier a;
    public final PlaceCandidate.Point b;
    public final int c;

    public InferredPlace(PlaceCandidate.Identifier identifier, PlaceCandidate.Point point, int i) {
        this.a = identifier;
        this.b = point;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PlaceCandidate.Identifier identifier = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, identifier, i, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.o(parcel, 3, this.c);
        atzr.c(parcel, a);
    }
}
