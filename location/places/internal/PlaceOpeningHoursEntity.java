package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.cafx;
import defpackage.cafy;
import defpackage.caha;
import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class PlaceOpeningHoursEntity extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new caha();
    final List a;
    final List b;

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class BusinessHoursInterval extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new cafx();
        final int a;
        final int b;

        public BusinessHoursInterval(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int a = arxc.a(parcel);
            arxc.o(parcel, 1, this.a);
            arxc.o(parcel, 2, this.b);
            arxc.c(parcel, a);
        }
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class ExceptionalHours extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new cafy();
        final int a;
        final int b;
        final int c;
        final int d;
        final int e;
        final int f;
        final List g;

        public ExceptionalHours(int i, int i2, int i3, int i4, int i5, int i6, List list) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
            this.g = DesugarCollections.unmodifiableList(list);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int a = arxc.a(parcel);
            arxc.o(parcel, 1, this.a);
            arxc.o(parcel, 2, this.b);
            arxc.o(parcel, 3, this.c);
            arxc.o(parcel, 4, this.d);
            arxc.o(parcel, 5, this.e);
            arxc.o(parcel, 6, this.f);
            arxc.y(parcel, 7, this.g, false);
            arxc.c(parcel, a);
        }
    }

    public PlaceOpeningHoursEntity(List list, List list2) {
        this.a = DesugarCollections.unmodifiableList(list);
        this.b = DesugarCollections.unmodifiableList(list2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int a = arxc.a(parcel);
        arxc.y(parcel, 1, list, false);
        arxc.y(parcel, 2, this.b, false);
        arxc.c(parcel, a);
    }
}
