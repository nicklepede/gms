package com.google.android.gms.semanticlocationhistory;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.semanticlocation.PlaceCandidate;
import defpackage.arxc;
import defpackage.dacl;
import defpackage.dacs;
import defpackage.dact;
import defpackage.dacz;
import defpackage.dada;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class Persona extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dacs();
    public final PersonaMetadata a;
    public final List b;
    public final List c;

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class LocationAffinity extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new dacl();
        public final PlaceCandidate.Identifier a;
        public final float b;
        public final long c;
        public final float d;
        public final float e;
        public final float f;

        public LocationAffinity(PlaceCandidate.Identifier identifier, float f, long j, float f2, float f3, float f4) {
            this.a = identifier;
            this.b = f;
            this.c = j;
            this.d = f2;
            this.e = f3;
            this.f = f4;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            PlaceCandidate.Identifier identifier = this.a;
            int a = arxc.a(parcel);
            arxc.t(parcel, 1, identifier, i, false);
            arxc.l(parcel, 2, this.b);
            arxc.q(parcel, 3, this.c);
            arxc.l(parcel, 4, this.d);
            arxc.l(parcel, 5, this.e);
            arxc.l(parcel, 6, this.f);
            arxc.c(parcel, a);
        }
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class PersonaMetadata extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new dact();
        public final long a;

        public PersonaMetadata(long j) {
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

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class TravelModeAffinity extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new dacz();
        public final int a;
        public final float b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final TripSummary g;
        public final TripSummary h;
        public final TripSummary i;

        public TravelModeAffinity(int i, float f, int i2, int i3, int i4, int i5, TripSummary tripSummary, TripSummary tripSummary2, TripSummary tripSummary3) {
            this.a = i;
            this.b = f;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            this.f = i5;
            this.g = tripSummary;
            this.h = tripSummary2;
            this.i = tripSummary3;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int i2 = this.a;
            int a = arxc.a(parcel);
            arxc.o(parcel, 1, i2);
            arxc.l(parcel, 2, this.b);
            arxc.o(parcel, 3, this.c);
            arxc.o(parcel, 4, this.d);
            arxc.o(parcel, 5, this.e);
            arxc.o(parcel, 6, this.f);
            arxc.t(parcel, 7, this.g, i, false);
            arxc.t(parcel, 8, this.h, i, false);
            arxc.t(parcel, 9, this.i, i, false);
            arxc.c(parcel, a);
        }
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class TripSummary extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new dada();
        public final float a;
        public final float b;
        public final long c;
        public final long d;
        public final int e;
        public final int f;

        public TripSummary(float f, float f2, long j, long j2, int i, int i2) {
            this.a = f;
            this.b = f2;
            this.c = j;
            this.d = j2;
            this.e = i;
            this.f = i2;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            float f = this.a;
            int a = arxc.a(parcel);
            arxc.l(parcel, 1, f);
            arxc.l(parcel, 2, this.b);
            arxc.q(parcel, 3, this.c);
            arxc.q(parcel, 4, this.d);
            arxc.o(parcel, 5, this.e);
            arxc.o(parcel, 6, this.f);
            arxc.c(parcel, a);
        }
    }

    public Persona(PersonaMetadata personaMetadata, List list, List list2) {
        this.a = personaMetadata;
        this.b = list;
        this.c = list2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PersonaMetadata personaMetadata = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, personaMetadata, i, false);
        arxc.y(parcel, 2, this.b, false);
        arxc.y(parcel, 3, this.c, false);
        arxc.c(parcel, a);
    }
}
