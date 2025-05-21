package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.bgdm;
import defpackage.bgdo;
import defpackage.bgdr;
import defpackage.bgdz;
import defpackage.bged;
import defpackage.fhrd;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class Goal extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bgdr();
    public final long a;
    public final long b;
    public final List c;
    public final Recurrence d;
    public final int e;
    public final MetricObjective f;
    public final DurationObjective g;
    public final FrequencyObjective h;

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class DurationObjective extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new bgdm();
        public final long a;

        public DurationObjective(long j) {
            this.a = j;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof DurationObjective) && this.a == ((DurationObjective) obj).a;
        }

        public final int hashCode() {
            return (int) this.a;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            arwa.b("duration", Long.valueOf(this.a), arrayList);
            return arwa.a(arrayList, this);
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
    public class FrequencyObjective extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new bgdo();
        public final int a;

        public FrequencyObjective(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof FrequencyObjective) && this.a == ((FrequencyObjective) obj).a;
        }

        public final int hashCode() {
            return this.a;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            arwa.b("frequency", Integer.valueOf(this.a), arrayList);
            return arwa.a(arrayList, this);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int i2 = this.a;
            int a = arxc.a(parcel);
            arxc.o(parcel, 1, i2);
            arxc.c(parcel, a);
        }
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class MetricObjective extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new bgdz();
        public final String a;
        public final double b;
        public final double c;

        public MetricObjective(String str, double d, double d2) {
            this.a = str;
            this.b = d;
            this.c = d2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MetricObjective)) {
                return false;
            }
            MetricObjective metricObjective = (MetricObjective) obj;
            return arwb.b(this.a, metricObjective.a) && this.b == metricObjective.b && this.c == metricObjective.c;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            arwa.b("dataTypeName", this.a, arrayList);
            arwa.b("value", Double.valueOf(this.b), arrayList);
            arwa.b("initialValue", Double.valueOf(this.c), arrayList);
            return arwa.a(arrayList, this);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            String str = this.a;
            int a = arxc.a(parcel);
            arxc.v(parcel, 1, str, false);
            arxc.j(parcel, 2, this.b);
            arxc.j(parcel, 3, this.c);
            arxc.c(parcel, a);
        }
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class Recurrence extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new bged();
        public final int a;
        public final int b;

        public Recurrence(int i, int i2) {
            this.a = i;
            boolean z = false;
            if (i2 > 0 && i2 <= 3) {
                z = true;
            }
            arwm.l(z);
            this.b = i2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Recurrence)) {
                return false;
            }
            Recurrence recurrence = (Recurrence) obj;
            return this.a == recurrence.a && this.b == recurrence.b;
        }

        public final int hashCode() {
            return this.b;
        }

        public final String toString() {
            String str;
            ArrayList arrayList = new ArrayList();
            arwa.b("count", Integer.valueOf(this.a), arrayList);
            int i = this.b;
            if (i == 1) {
                str = "day";
            } else if (i == 2) {
                str = "week";
            } else {
                if (i != 3) {
                    throw new IllegalArgumentException("invalid unit value");
                }
                str = "month";
            }
            arwa.b("unit", str, arrayList);
            return arwa.a(arrayList, this);
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

    public Goal(long j, long j2, List list, Recurrence recurrence, int i, MetricObjective metricObjective, DurationObjective durationObjective, FrequencyObjective frequencyObjective) {
        this.a = j;
        this.b = j2;
        this.c = list;
        this.d = recurrence;
        this.e = i;
        this.f = metricObjective;
        this.g = durationObjective;
        this.h = frequencyObjective;
    }

    public static String b(int i) {
        if (i == 0) {
            return "unknown";
        }
        if (i == 1) {
            return "metric";
        }
        if (i == 2) {
            return "duration";
        }
        if (i == 3) {
            return "frequency";
        }
        throw new IllegalArgumentException("invalid objective type value");
    }

    public final String a() {
        List list = this.c;
        if (list.isEmpty() || list.size() > 1) {
            return null;
        }
        return fhrd.c(((Integer) list.get(0)).intValue());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Goal)) {
            return false;
        }
        Goal goal = (Goal) obj;
        return this.a == goal.a && this.b == goal.b && arwb.b(this.c, goal.c) && arwb.b(this.d, goal.d) && this.e == goal.e && arwb.b(this.f, goal.f) && arwb.b(this.g, goal.g) && arwb.b(this.h, goal.h);
    }

    public final int hashCode() {
        return this.e;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("activity", a(), arrayList);
        arwa.b("recurrence", this.d, arrayList);
        arwa.b("metricObjective", this.f, arrayList);
        arwa.b("durationObjective", this.g, arrayList);
        arwa.b("frequencyObjective", this.h, arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.a;
        int a = arxc.a(parcel);
        arxc.q(parcel, 1, j);
        arxc.q(parcel, 2, this.b);
        arxc.G(parcel, 3, this.c);
        arxc.t(parcel, 4, this.d, i, false);
        arxc.o(parcel, 5, this.e);
        arxc.t(parcel, 6, this.f, i, false);
        arxc.t(parcel, 7, this.g, i, false);
        arxc.t(parcel, 8, this.h, i, false);
        arxc.c(parcel, a);
    }
}
