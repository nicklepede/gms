package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.biic;
import defpackage.biie;
import defpackage.biih;
import defpackage.biip;
import defpackage.biit;
import defpackage.fkha;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class Goal extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new biih();
    public final long a;
    public final long b;
    public final List c;
    public final Recurrence d;
    public final int e;
    public final MetricObjective f;
    public final DurationObjective g;
    public final FrequencyObjective h;

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class DurationObjective extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new biic();
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
            atyp.b("duration", Long.valueOf(this.a), arrayList);
            return atyp.a(arrayList, this);
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
    public class FrequencyObjective extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new biie();
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
            atyp.b("frequency", Integer.valueOf(this.a), arrayList);
            return atyp.a(arrayList, this);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int i2 = this.a;
            int a = atzr.a(parcel);
            atzr.o(parcel, 1, i2);
            atzr.c(parcel, a);
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class MetricObjective extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new biip();
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
            return atyq.b(this.a, metricObjective.a) && this.b == metricObjective.b && this.c == metricObjective.c;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            atyp.b("dataTypeName", this.a, arrayList);
            atyp.b("value", Double.valueOf(this.b), arrayList);
            atyp.b("initialValue", Double.valueOf(this.c), arrayList);
            return atyp.a(arrayList, this);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            String str = this.a;
            int a = atzr.a(parcel);
            atzr.v(parcel, 1, str, false);
            atzr.j(parcel, 2, this.b);
            atzr.j(parcel, 3, this.c);
            atzr.c(parcel, a);
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class Recurrence extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new biit();
        public final int a;
        public final int b;

        public Recurrence(int i, int i2) {
            this.a = i;
            boolean z = false;
            if (i2 > 0 && i2 <= 3) {
                z = true;
            }
            atzb.l(z);
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
            atyp.b("count", Integer.valueOf(this.a), arrayList);
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
            atyp.b("unit", str, arrayList);
            return atyp.a(arrayList, this);
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
        return fkha.c(((Integer) list.get(0)).intValue());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Goal)) {
            return false;
        }
        Goal goal = (Goal) obj;
        return this.a == goal.a && this.b == goal.b && atyq.b(this.c, goal.c) && atyq.b(this.d, goal.d) && this.e == goal.e && atyq.b(this.f, goal.f) && atyq.b(this.g, goal.g) && atyq.b(this.h, goal.h);
    }

    public final int hashCode() {
        return this.e;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("activity", a(), arrayList);
        atyp.b("recurrence", this.d, arrayList);
        atyp.b("metricObjective", this.f, arrayList);
        atyp.b("durationObjective", this.g, arrayList);
        atyp.b("frequencyObjective", this.h, arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.a;
        int a = atzr.a(parcel);
        atzr.q(parcel, 1, j);
        atzr.q(parcel, 2, this.b);
        atzr.G(parcel, 3, this.c);
        atzr.t(parcel, 4, this.d, i, false);
        atzr.o(parcel, 5, this.e);
        atzr.t(parcel, 6, this.f, i, false);
        atzr.t(parcel, 7, this.g, i, false);
        atzr.t(parcel, 8, this.h, i, false);
        atzr.c(parcel, a);
    }
}
