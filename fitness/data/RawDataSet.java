package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.bgat;
import defpackage.bgec;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class RawDataSet extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bgec();
    public final int a;
    public final List b;

    public RawDataSet(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RawDataSet)) {
            return false;
        }
        RawDataSet rawDataSet = (RawDataSet) obj;
        return this.a == rawDataSet.a && arwb.b(this.b, rawDataSet.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a)});
    }

    public final String toString() {
        return String.format("RawDataSet{%s@[%s]}", Integer.valueOf(this.a), this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.y(parcel, 3, this.b, false);
        arxc.c(parcel, a);
    }

    public RawDataSet(DataSet dataSet, List list) {
        this.b = dataSet.e(list);
        this.a = bgat.a(dataSet.b, list);
    }
}
