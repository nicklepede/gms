package com.google.android.gms.semanticlocationhistory;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dcmo;
import defpackage.dcmx;
import defpackage.dcmy;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class FrequentTrip extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dcmo();
    public final List a;
    public final Metadata b;
    public final List c;
    public final int d;
    public final int e;
    public final int f;
    public final float g;
    public final int h;

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class Metadata extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new dcmx();
        public final long a;

        public Metadata(long j) {
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

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class ModeDistribution extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new dcmy();
        public final int a;
        public final float b;

        public ModeDistribution(int i, float f) {
            this.a = i;
            this.b = f;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int i2 = this.a;
            int a = atzr.a(parcel);
            atzr.o(parcel, 1, i2);
            atzr.l(parcel, 2, this.b);
            atzr.c(parcel, a);
        }
    }

    public FrequentTrip(List list, Metadata metadata, List list2, int i, int i2, int i3, float f, int i4) {
        this.a = list;
        this.b = metadata;
        this.c = list2;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = f;
        this.h = i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int a = atzr.a(parcel);
        atzr.y(parcel, 1, list, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.y(parcel, 3, this.c, false);
        atzr.o(parcel, 4, this.d);
        atzr.o(parcel, 5, this.e);
        atzr.o(parcel, 6, this.f);
        atzr.l(parcel, 7, this.g);
        atzr.o(parcel, 8, this.h);
        atzr.c(parcel, a);
    }
}
