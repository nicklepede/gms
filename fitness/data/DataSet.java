package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.bgda;
import defpackage.bgdb;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class DataSet extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new bgdb();
    public final int a;
    public final DataSource b;
    public final List c;
    public final List d;

    public DataSet(int i, DataSource dataSource, List list, List list2) {
        this.a = i;
        this.b = dataSource;
        this.c = new ArrayList(list.size());
        this.d = i < 2 ? Collections.singletonList(dataSource) : list2;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.c.add(new DataPoint(this.d, (RawDataPoint) it.next()));
        }
    }

    public static bgda a(DataSource dataSource) {
        arwm.t(dataSource, "DataSource should be specified");
        return new bgda(dataSource);
    }

    public final DataType b() {
        return this.b.a;
    }

    public final List c() {
        return DesugarCollections.unmodifiableList(this.c);
    }

    final List d() {
        return e(this.d);
    }

    final List e(List list) {
        List list2 = this.c;
        ArrayList arrayList = new ArrayList(list2.size());
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new RawDataPoint((DataPoint) it.next(), list));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DataSet)) {
            return false;
        }
        DataSet dataSet = (DataSet) obj;
        return arwb.b(this.b, dataSet.b) && arwb.b(this.c, dataSet.c);
    }

    @Deprecated
    public final void f(DataPoint dataPoint) {
        this.c.add(dataPoint);
        DataSource c = dataPoint.c();
        if (c != null) {
            List list = this.d;
            if (list.contains(c)) {
                return;
            }
            list.add(c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b});
    }

    public final String toString() {
        List d = d();
        Locale locale = Locale.US;
        String a = this.b.a();
        List list = this.c;
        Object obj = d;
        if (list.size() >= 10) {
            obj = String.format(Locale.US, "%d data points, first 5: %s", Integer.valueOf(list.size()), d.subList(0, 5));
        }
        return String.format(locale, "DataSet{%s %s}", a, obj);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        DataSource dataSource = this.b;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, dataSource, i, false);
        arxc.G(parcel, 3, d());
        arxc.y(parcel, 4, this.d, false);
        arxc.o(parcel, ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, this.a);
        arxc.c(parcel, a);
    }

    public DataSet(DataSource dataSource) {
        this.a = 3;
        arwm.s(dataSource);
        this.b = dataSource;
        this.c = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        arrayList.add(dataSource);
    }

    public DataSet(RawDataSet rawDataSet, List list) {
        this.a = 3;
        this.b = (DataSource) list.get(rawDataSet.a);
        this.d = list;
        List list2 = rawDataSet.b;
        this.c = new ArrayList(list2.size());
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            this.c.add(new DataPoint(this.d, (RawDataPoint) it.next()));
        }
    }
}
