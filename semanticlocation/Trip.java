package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.semanticlocation.PlaceCandidate;
import defpackage.atzr;
import defpackage.dbpp;
import defpackage.dbqb;
import defpackage.dbqd;
import defpackage.dbre;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class Trip extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dbre();
    public final Origin a;
    public final long b;
    public final List c;
    public final NameComponents d;
    public final boolean e;

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class Destination extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new dbpp();
        public final PlaceCandidate.Identifier a;

        public Destination(PlaceCandidate.Identifier identifier) {
            this.a = identifier;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            PlaceCandidate.Identifier identifier = this.a;
            int a = atzr.a(parcel);
            atzr.t(parcel, 1, identifier, i, false);
            atzr.c(parcel, a);
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class NameComponents extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new dbqb();
        public final List a;

        public NameComponents(List list) {
            this.a = list;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            List list = this.a;
            int a = atzr.a(parcel);
            atzr.y(parcel, 1, list, false);
            atzr.c(parcel, a);
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class Origin extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new dbqd();
        public final PlaceCandidate.Identifier a;
        public final PlaceCandidate.Point b;

        public Origin(PlaceCandidate.Identifier identifier, PlaceCandidate.Point point) {
            this.a = identifier;
            this.b = point;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            PlaceCandidate.Identifier identifier = this.a;
            int a = atzr.a(parcel);
            atzr.t(parcel, 1, identifier, i, false);
            atzr.t(parcel, 2, this.b, i, false);
            atzr.c(parcel, a);
        }
    }

    public Trip(Origin origin, long j, List list, NameComponents nameComponents, boolean z) {
        this.a = origin;
        this.b = j;
        this.c = list;
        this.d = nameComponents;
        this.e = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.b;
        int a = atzr.a(parcel);
        atzr.q(parcel, 1, j);
        atzr.y(parcel, 2, this.c, false);
        atzr.t(parcel, 3, this.d, i, false);
        atzr.t(parcel, 4, this.a, i, false);
        atzr.e(parcel, 5, this.e);
        atzr.c(parcel, a);
    }
}
