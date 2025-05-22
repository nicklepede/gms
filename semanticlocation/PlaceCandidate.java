package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dbpx;
import defpackage.dbqh;
import defpackage.dbql;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class PlaceCandidate extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dbqh();
    public final Identifier a;
    public final int b;
    public final float c;

    @Deprecated
    public final float d;
    public final Point e;
    public final boolean f;
    public final boolean g;
    public final double h;

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class Identifier extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new dbpx();
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
            int a = atzr.a(parcel);
            atzr.q(parcel, 1, j);
            atzr.q(parcel, 2, this.b);
            atzr.c(parcel, a);
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class Point extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new dbql();
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
            int a = atzr.a(parcel);
            atzr.o(parcel, 1, i2);
            atzr.o(parcel, 2, this.b);
            atzr.c(parcel, a);
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
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, identifier, i, false);
        atzr.o(parcel, 2, this.b);
        atzr.l(parcel, 3, this.c);
        atzr.l(parcel, 4, this.d);
        atzr.t(parcel, 5, this.e, i, false);
        atzr.e(parcel, 6, this.f);
        atzr.e(parcel, 7, this.g);
        atzr.j(parcel, 8, this.h);
        atzr.c(parcel, a);
    }
}
