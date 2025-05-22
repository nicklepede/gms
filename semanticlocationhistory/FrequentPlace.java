package com.google.android.gms.semanticlocationhistory;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.semanticlocation.PlaceCandidate;
import defpackage.atzr;
import defpackage.dcmm;
import defpackage.dcmn;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class FrequentPlace extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dcmm();
    public final PlaceCandidate.Identifier a;
    public final PlaceCandidate.Point b;
    public final int c;
    public final FrequentPlaceMetadata d;
    public final List e;

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class FrequentPlaceMetadata extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new dcmn();
        public final long a;

        public FrequentPlaceMetadata(long j) {
            this.a = j;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            long j = this.a;
            int a = atzr.a(parcel);
            atzr.q(parcel, 1, j);
            atzr.c(parcel, a);
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
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, identifier, i, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.o(parcel, 3, this.c);
        atzr.t(parcel, 4, this.d, i, false);
        atzr.E(parcel, 5, this.e);
        atzr.c(parcel, a);
    }
}
