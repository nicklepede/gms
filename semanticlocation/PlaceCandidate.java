package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.czfz;
import defpackage.czgj;
import defpackage.czgn;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class PlaceCandidate extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new czgj();
    public final Identifier a;
    public final int b;
    public final float c;

    @Deprecated
    public final float d;
    public final Point e;
    public final boolean f;
    public final boolean g;
    public final double h;

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class Identifier extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new czfz();
        public final long a;
        public final long b;

        public Identifier(long j, long j2) {
            this.a = j;
            this.b = j2;
        }

        public final String toString() {
            return String.format("0x%s:0x%s", Long.toHexString(this.b), Long.toHexString(this.a));
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            long j = this.a;
            int a = arxc.a(parcel);
            arxc.q(parcel, 1, j);
            arxc.q(parcel, 2, this.b);
            arxc.c(parcel, a);
        }
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class Point extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new czgn();
        public final int a;
        public final int b;

        public Point(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final String toString() {
            return "Point{latE7=" + this.a + ", lngE7=" + this.b + "}";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int i2 = this.a;
            int a = arxc.a(parcel);
            arxc.o(parcel, 1, i2);
            arxc.o(parcel, 2, this.b);
            arxc.c(parcel, a);
        }
    }

    public PlaceCandidate(Identifier identifier, int i, float f, float f2, Point point, boolean z, boolean z2, double d) {
        this.a = identifier;
        this.b = i;
        this.c = f;
        this.d = f2;
        this.e = point;
        this.f = z;
        this.g = z2;
        this.h = d;
    }

    public final String toString() {
        Identifier identifier = this.a;
        return "PlaceCandidate{placeLocation=" + String.valueOf(this.e) + ", isSensitiveForGorUsage=" + this.f + ", isEligibleForGorUsage=" + this.g + ", semanticTypeConfidenceScore=" + this.h + ", probability=" + this.c + ", identifier=" + String.valueOf(identifier) + ", semanticType=" + this.b + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Identifier identifier = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, identifier, i, false);
        arxc.o(parcel, 2, this.b);
        arxc.l(parcel, 3, this.c);
        arxc.l(parcel, 4, this.d);
        arxc.t(parcel, 5, this.e, i, false);
        arxc.e(parcel, 6, this.f);
        arxc.e(parcel, 7, this.g);
        arxc.j(parcel, 8, this.h);
        arxc.c(parcel, a);
    }
}
