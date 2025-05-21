package com.google.android.gms.semanticlocationhistory;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.semanticlocation.PlaceCandidate;
import defpackage.arxc;
import defpackage.dace;
import defpackage.dacf;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class FrequentPlace extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dace();
    public final PlaceCandidate.Identifier a;
    public final PlaceCandidate.Point b;
    public final int c;
    public final FrequentPlaceMetadata d;
    public final List e;

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class FrequentPlaceMetadata extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new dacf();
        public final long a;

        public FrequentPlaceMetadata(long j) {
            this.a = j;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            long j = this.a;
            int a = arxc.a(parcel);
            arxc.q(parcel, 1, j);
            arxc.c(parcel, a);
        }
    }

    public FrequentPlace(PlaceCandidate.Identifier identifier, PlaceCandidate.Point point, int i, FrequentPlaceMetadata frequentPlaceMetadata, List list) {
        this.a = identifier;
        this.b = point;
        this.c = i;
        this.d = frequentPlaceMetadata;
        this.e = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PlaceCandidate.Identifier identifier = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, identifier, i, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.o(parcel, 3, this.c);
        arxc.t(parcel, 4, this.d, i, false);
        arxc.E(parcel, 5, this.e);
        arxc.c(parcel, a);
    }
}
