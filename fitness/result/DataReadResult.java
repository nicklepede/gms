package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.Bucket;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.RawBucket;
import com.google.android.gms.fitness.data.RawDataSet;
import com.google.android.gms.fitness.data.Session;
import defpackage.aqyf;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.bgdc;
import defpackage.bglz;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class DataReadResult extends AbstractSafeParcelable implements aqyf {
    public static final Parcelable.Creator CREATOR = new bglz();
    public final List a;
    public final Status b;
    public final List c;
    public int d;
    public final List e;

    public DataReadResult(List list, Status status, List list2, int i, List list3) {
        this.b = status;
        this.d = i;
        this.e = list3;
        this.a = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.a.add(new DataSet((RawDataSet) it.next(), list3));
        }
        this.c = new ArrayList(list2.size());
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            RawBucket rawBucket = (RawBucket) it2.next();
            List list4 = this.c;
            long j = rawBucket.a;
            long j2 = rawBucket.b;
            Session session = rawBucket.c;
            int i2 = rawBucket.d;
            List list5 = rawBucket.e;
            ArrayList arrayList = new ArrayList(list5.size());
            Iterator it3 = list5.iterator();
            while (it3.hasNext()) {
                arrayList.add(new DataSet((RawDataSet) it3.next(), list3));
            }
            list4.add(new Bucket(j, j2, session, i2, arrayList, rawBucket.f));
        }
    }

    public static DataReadResult b(Status status, List list, List list2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(DataSet.a((DataSource) it.next()).a());
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            DataType dataType = (DataType) it2.next();
            bgdc bgdcVar = new bgdc();
            bgdcVar.b = 1;
            bgdcVar.a = dataType;
            bgdcVar.b("Default");
            arrayList.add(DataSet.a(bgdcVar.a()).a());
        }
        return new DataReadResult(arrayList, Collections.EMPTY_LIST, status);
    }

    @Override // defpackage.aqyf
    public final Status a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataReadResult)) {
            return false;
        }
        DataReadResult dataReadResult = (DataReadResult) obj;
        return this.b.equals(dataReadResult.b) && arwb.b(this.a, dataReadResult.a) && arwb.b(this.c, dataReadResult.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a, this.c});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("status", this.b, arrayList);
        List list = this.a;
        int size = list.size();
        Object obj = list;
        if (size > 5) {
            obj = list.size() + " data sets";
        }
        arwa.b("dataSets", obj, arrayList);
        List list2 = this.c;
        int size2 = list2.size();
        Object obj2 = list2;
        if (size2 > 5) {
            obj2 = list2.size() + " buckets";
        }
        arwa.b("buckets", obj2, arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int a = arxc.a(parcel);
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new RawDataSet((DataSet) it.next(), this.e));
        }
        arxc.G(parcel, 1, arrayList);
        arxc.t(parcel, 2, this.b, i, false);
        List list2 = this.c;
        ArrayList arrayList2 = new ArrayList(list2.size());
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new RawBucket((Bucket) it2.next(), this.e));
        }
        arxc.G(parcel, 3, arrayList2);
        arxc.o(parcel, 5, this.d);
        arxc.y(parcel, 6, this.e, false);
        arxc.c(parcel, a);
    }

    public DataReadResult(List list, List list2, Status status) {
        this.a = list;
        this.b = status;
        this.c = list2;
        this.d = 1;
        this.e = new ArrayList();
    }
}
