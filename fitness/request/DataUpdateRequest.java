package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataSet;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.bgiu;
import defpackage.bgiw;
import defpackage.bgku;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class DataUpdateRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bgku();
    public final long a;
    public final long b;
    public final DataSet c;
    public final bgiw d;

    public DataUpdateRequest(long j, long j2, DataSet dataSet, IBinder iBinder) {
        bgiw bgiuVar;
        this.a = j;
        this.b = j2;
        this.c = dataSet;
        if (iBinder == null) {
            bgiuVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IStatusCallback");
            bgiuVar = queryLocalInterface instanceof bgiw ? (bgiw) queryLocalInterface : new bgiu(iBinder);
        }
        this.d = bgiuVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DataUpdateRequest)) {
            return false;
        }
        DataUpdateRequest dataUpdateRequest = (DataUpdateRequest) obj;
        return this.a == dataUpdateRequest.a && this.b == dataUpdateRequest.b && arwb.b(this.c, dataUpdateRequest.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b), this.c});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("startTimeMillis", Long.valueOf(this.a), arrayList);
        arwa.b("endTimeMillis", Long.valueOf(this.b), arrayList);
        arwa.b("dataSet", this.c, arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.a;
        int a = arxc.a(parcel);
        arxc.q(parcel, 1, j);
        arxc.q(parcel, 2, this.b);
        arxc.t(parcel, 3, this.c, i, false);
        bgiw bgiwVar = this.d;
        arxc.D(parcel, 4, bgiwVar == null ? null : bgiwVar.asBinder());
        arxc.c(parcel, a);
    }
}
