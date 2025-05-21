package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.semanticlocation.PlaceCandidate;
import defpackage.arxc;
import defpackage.czfr;
import defpackage.czgd;
import defpackage.czgf;
import defpackage.czhg;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class Trip extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new czhg();
    public final Origin a;
    public final long b;
    public final List c;
    public final NameComponents d;
    public final boolean e;

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class Destination extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new czfr();
        public final PlaceCandidate.Identifier a;

        public Destination(PlaceCandidate.Identifier identifier) {
            this.a = identifier;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            PlaceCandidate.Identifier identifier = this.a;
            int a = arxc.a(parcel);
            arxc.t(parcel, 1, identifier, i, false);
            arxc.c(parcel, a);
        }
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class NameComponents extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new czgd();
        public final List a;

        public NameComponents(List list) {
            this.a = list;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            List list = this.a;
            int a = arxc.a(parcel);
            arxc.y(parcel, 1, list, false);
            arxc.c(parcel, a);
        }
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class Origin extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new czgf();
        public final PlaceCandidate.Identifier a;
        public final PlaceCandidate.Point b;

        public Origin(PlaceCandidate.Identifier identifier, PlaceCandidate.Point point) {
            this.a = identifier;
            this.b = point;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            PlaceCandidate.Identifier identifier = this.a;
            int a = arxc.a(parcel);
            arxc.t(parcel, 1, identifier, i, false);
            arxc.t(parcel, 2, this.b, i, false);
            arxc.c(parcel, a);
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
        int a = arxc.a(parcel);
        arxc.q(parcel, 1, j);
        arxc.y(parcel, 2, this.c, false);
        arxc.t(parcel, 3, this.d, i, false);
        arxc.t(parcel, 4, this.a, i, false);
        arxc.e(parcel, 5, this.e);
        arxc.c(parcel, a);
    }
}
