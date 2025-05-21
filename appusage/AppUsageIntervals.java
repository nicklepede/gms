package com.google.android.gms.appusage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.ujl;
import defpackage.ujn;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class AppUsageIntervals extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ujl();
    public final List a;
    public final List b;
    public final List c;

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public final class Interval extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new ujn();
        public final int a;
        public final long b;
        public final long c;

        public Interval(int i, long j, long j2) {
            this.a = i;
            this.b = j;
            this.c = j2;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int i2 = this.a;
            int a = arxc.a(parcel);
            arxc.o(parcel, 1, i2);
            arxc.q(parcel, 2, this.b);
            arxc.q(parcel, 3, this.c);
            arxc.c(parcel, a);
        }
    }

    public AppUsageIntervals(List list, List list2, List list3) {
        this.a = list;
        this.b = list2;
        this.c = list3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int a = arxc.a(parcel);
        arxc.x(parcel, 1, list, false);
        arxc.E(parcel, 2, this.b);
        arxc.y(parcel, 3, this.c, false);
        arxc.c(parcel, a);
    }
}
