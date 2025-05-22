package com.google.android.gms.appusage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.wfk;
import defpackage.wfm;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class AppUsageIntervals extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new wfk();
    public final List a;
    public final List b;
    public final List c;

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public final class Interval extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new wfm();
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
            int a = atzr.a(parcel);
            atzr.o(parcel, 1, i2);
            atzr.q(parcel, 2, this.b);
            atzr.q(parcel, 3, this.c);
            atzr.c(parcel, a);
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
        int a = atzr.a(parcel);
        atzr.x(parcel, 1, list, false);
        atzr.E(parcel, 2, this.b);
        atzr.y(parcel, 3, this.c, false);
        atzr.c(parcel, a);
    }
}
