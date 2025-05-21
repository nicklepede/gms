package com.google.android.gms.contextmanager.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.atrv;
import defpackage.atrw;
import defpackage.atrx;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class TimeFilterImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new atrv();
    public final ArrayList a;
    public final int[] b;

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class Interval extends AbstractSafeParcelable implements atrx {
        public static final Parcelable.Creator CREATOR = new atrw();
        public final long a;
        public final long b;

        public Interval(long j, long j2) {
            arwm.b(j >= -1);
            arwm.b(j2 > -1);
            if (j != -1) {
                arwm.b(j <= j2);
            }
            this.a = j;
            this.b = j2;
        }

        public final boolean a() {
            return this.b != Long.MAX_VALUE;
        }

        @Override // defpackage.atrx
        public final long b() {
            return this.b;
        }

        @Override // defpackage.atrx
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
            int a = arxc.a(parcel);
            arxc.q(parcel, 2, this.a);
            arxc.q(parcel, 3, this.b);
            arxc.c(parcel, a);
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
        return arwb.b(this.a, timeFilterImpl.a) && arwb.b(this.b, timeFilterImpl.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ArrayList arrayList = this.a;
        int a = arxc.a(parcel);
        arxc.y(parcel, 2, arrayList, false);
        arxc.p(parcel, 3, this.b, false);
        arxc.c(parcel, a);
    }
}
