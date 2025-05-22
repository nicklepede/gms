package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.ccoo;
import defpackage.ccop;
import defpackage.ccpr;
import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class PlaceOpeningHoursEntity extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ccpr();
    final List a;
    final List b;

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class BusinessHoursInterval extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new ccoo();
        final int a;
        final int b;

        public BusinessHoursInterval(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int a = atzr.a(parcel);
            atzr.o(parcel, 1, this.a);
            atzr.o(parcel, 2, this.b);
            atzr.c(parcel, a);
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class ExceptionalHours extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new ccop();
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
            int a = atzr.a(parcel);
            atzr.o(parcel, 1, this.a);
            atzr.o(parcel, 2, this.b);
            atzr.o(parcel, 3, this.c);
            atzr.o(parcel, 4, this.d);
            atzr.o(parcel, 5, this.e);
            atzr.o(parcel, 6, this.f);
            atzr.y(parcel, 7, this.g, false);
            atzr.c(parcel, a);
        }
    }

    public PlaceOpeningHoursEntity(List list, List list2) {
        this.a = DesugarCollections.unmodifiableList(list);
        this.b = DesugarCollections.unmodifiableList(list2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int a = atzr.a(parcel);
        atzr.y(parcel, 1, list, false);
        atzr.y(parcel, 2, this.b, false);
        atzr.c(parcel, a);
    }
}
