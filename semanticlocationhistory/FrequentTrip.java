package com.google.android.gms.semanticlocationhistory;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.dacg;
import defpackage.dacp;
import defpackage.dacq;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class FrequentTrip extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dacg();
    public final List a;
    public final Metadata b;
    public final List c;
    public final int d;
    public final int e;
    public final int f;
    public final float g;
    public final int h;

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class Metadata extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new dacp();
        public final long a;

        public Metadata(long j) {
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
    public class ModeDistribution extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new dacq();
        public final int a;
        public final float b;

        public ModeDistribution(int i, float f) {
            this.a = i;
            this.b = f;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int i2 = this.a;
            int a = arxc.a(parcel);
            arxc.o(parcel, 1, i2);
            arxc.l(parcel, 2, this.b);
            arxc.c(parcel, a);
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
        int a = arxc.a(parcel);
        arxc.y(parcel, 1, list, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.y(parcel, 3, this.c, false);
        arxc.o(parcel, 4, this.d);
        arxc.o(parcel, 5, this.e);
        arxc.o(parcel, 6, this.f);
        arxc.l(parcel, 7, this.g);
        arxc.o(parcel, 8, this.h);
        arxc.c(parcel, a);
    }
}
