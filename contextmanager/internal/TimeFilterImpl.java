package com.google.android.gms.contextmanager.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.avvy;
import defpackage.avvz;
import defpackage.avwa;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class TimeFilterImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new avvy();
    public final ArrayList a;
    public final int[] b;

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class Interval extends AbstractSafeParcelable implements avwa {
        public static final Parcelable.Creator CREATOR = new avvz();
        public final long a;
        public final long b;

        public Interval(long j, long j2) {
            atzb.b(j >= -1);
            atzb.b(j2 > -1);
            if (j != -1) {
                atzb.b(j <= j2);
            }
            this.a = j;
            this.b = j2;
        }

        public final boolean a() {
            return this.b != Long.MAX_VALUE;
        }

        @Override // defpackage.avwa
        public final long b() {
            return this.b;
        }

        @Override // defpackage.avwa
        public final long c() {
            return this.a;
        }

        public final boolean d() {
            return this.a != -1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Interval)) {
                return false;
            }
            Interval interval = (Interval) obj;
            return this.a == interval.a && this.b == interval.b;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b)});
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int a = atzr.a(parcel);
            atzr.q(parcel, 2, this.a);
            atzr.q(parcel, 3, this.b);
            atzr.c(parcel, a);
        }
    }

    public TimeFilterImpl(ArrayList arrayList, int[] iArr) {
        this.a = arrayList;
        this.b = iArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeFilterImpl)) {
            return false;
        }
        TimeFilterImpl timeFilterImpl = (TimeFilterImpl) obj;
        return atyq.b(this.a, timeFilterImpl.a) && atyq.b(this.b, timeFilterImpl.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ArrayList arrayList = this.a;
        int a = atzr.a(parcel);
        atzr.y(parcel, 2, arrayList, false);
        atzr.p(parcel, 3, this.b, false);
        atzr.c(parcel, a);
    }
}
