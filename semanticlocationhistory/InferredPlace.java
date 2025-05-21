package com.google.android.gms.semanticlocationhistory;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.semanticlocation.PlaceCandidate;
import defpackage.arxc;
import defpackage.dack;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class InferredPlace extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dack();
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
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, identifier, i, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.o(parcel, 3, this.c);
        arxc.c(parcel, a);
    }
}
