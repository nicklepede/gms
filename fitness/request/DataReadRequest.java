package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.Bucket;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import defpackage.arwb;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.bghi;
import defpackage.bgkm;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class DataReadRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bgkm();
    public final List a;
    public final List b;
    public final long c;
    public final long d;
    public final List e;
    public final List f;
    public final int g;
    public final long h;
    public final DataSource i;
    public final int j;
    public final boolean k;
    public final boolean l;
    public final List m;
    public final List n;
    public final bghi o;

    public DataReadRequest(List list, List list2, long j, long j2, List list3, List list4, int i, long j3, DataSource dataSource, int i2, boolean z, boolean z2, IBinder iBinder, List list5, List list6) {
        bghi bghiVar;
        this.a = list;
        this.b = list2;
        this.c = j;
        this.d = j2;
        this.e = list3;
        this.f = list4;
        this.g = i;
        this.h = j3;
        this.i = dataSource;
        this.j = i2;
        this.k = z;
        this.l = z2;
        if (iBinder == null) {
            bghiVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IDataReadCallback");
            bghiVar = queryLocalInterface instanceof bghi ? (bghi) queryLocalInterface : new bghi(iBinder);
        }
        this.o = bghiVar;
        List list7 = list5 == null ? Collections.EMPTY_LIST : list5;
        this.m = list7;
        List list8 = list6 == null ? Collections.EMPTY_LIST : list6;
        this.n = list8;
        arwm.c(list7.size() == list8.size(), "Unequal number of interval start and end times.");
    }

    public final long a(TimeUnit timeUnit) {
        return timeUnit.convert(this.h, TimeUnit.MILLISECONDS);
    }

    public final long b(TimeUnit timeUnit) {
        return timeUnit.convert(this.d, TimeUnit.MILLISECONDS);
    }

    public final long c(TimeUnit timeUnit) {
        return timeUnit.convert(this.c, TimeUnit.MILLISECONDS);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DataReadRequest) {
            DataReadRequest dataReadRequest = (DataReadRequest) obj;
            if (this.a.equals(dataReadRequest.a) && this.b.equals(dataReadRequest.b) && this.c == dataReadRequest.c && this.d == dataReadRequest.d && this.g == dataReadRequest.g && this.f.equals(dataReadRequest.f) && this.e.equals(dataReadRequest.e) && arwb.b(this.i, dataReadRequest.i) && this.h == dataReadRequest.h && this.l == dataReadRequest.l && this.j == dataReadRequest.j && this.k == dataReadRequest.k && arwb.b(this.o, dataReadRequest.o)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.g), Long.valueOf(this.c), Long.valueOf(this.d)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataReadRequest{");
        List list = this.a;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                sb.append(((DataType) it.next()).a());
                sb.append(" ");
            }
        }
        List list2 = this.b;
        if (!list2.isEmpty()) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                sb.append(((DataSource) it2.next()).a());
                sb.append(" ");
            }
        }
        int i = this.g;
        if (i != 0) {
            sb.append("bucket by ");
            sb.append(Bucket.c(i));
            long j = this.h;
            if (j > 0) {
                sb.append(" >");
                sb.append(j);
                sb.append("ms");
            }
            sb.append(": ");
        }
        List list3 = this.e;
        if (!list3.isEmpty()) {
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                sb.append(((DataType) it3.next()).a());
                sb.append(" ");
            }
        }
        List list4 = this.f;
        if (!list4.isEmpty()) {
            Iterator it4 = list4.iterator();
            while (it4.hasNext()) {
                sb.append(((DataSource) it4.next()).a());
                sb.append(" ");
            }
        }
        long j2 = this.c;
        Locale locale = Locale.US;
        Long valueOf = Long.valueOf(j2);
        Long valueOf2 = Long.valueOf(this.d);
        sb.append(String.format(locale, "(%tF %tT - %tF %tT)", valueOf, valueOf, valueOf2, valueOf2));
        DataSource dataSource = this.i;
        if (dataSource != null) {
            sb.append("activities: ");
            sb.append(dataSource.a());
        }
        if (this.l) {
            sb.append(" +server");
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int a = arxc.a(parcel);
        arxc.y(parcel, 1, list, false);
        arxc.y(parcel, 2, this.b, false);
        arxc.q(parcel, 3, this.c);
        arxc.q(parcel, 4, this.d);
        arxc.y(parcel, 5, this.e, false);
        arxc.y(parcel, 6, this.f, false);
        arxc.o(parcel, 7, this.g);
        arxc.q(parcel, 8, this.h);
        arxc.t(parcel, 9, this.i, i, false);
        arxc.o(parcel, 10, this.j);
        arxc.e(parcel, 12, this.k);
        arxc.e(parcel, 13, this.l);
        bghi bghiVar = this.o;
        arxc.D(parcel, 14, bghiVar == null ? null : bghiVar.a);
        arxc.H(parcel, 18, this.m);
        arxc.H(parcel, 19, this.n);
        arxc.c(parcel, a);
    }
}
