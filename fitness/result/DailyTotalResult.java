package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataType;
import defpackage.aqyf;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.bgdc;
import defpackage.bglx;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class DailyTotalResult extends AbstractSafeParcelable implements aqyf {
    public static final Parcelable.Creator CREATOR = new bglx();
    public final Status a;
    public final DataSet b;

    public DailyTotalResult(Status status, DataSet dataSet) {
        this.a = status;
        this.b = dataSet;
    }

    public static DailyTotalResult b(Status status, DataType dataType) {
        bgdc bgdcVar = new bgdc();
        bgdcVar.b = 1;
        bgdcVar.a = dataType;
        return new DailyTotalResult(status, DataSet.a(bgdcVar.a()).a());
    }

    @Override // defpackage.aqyf
    public final Status a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DailyTotalResult)) {
            return false;
        }
        DailyTotalResult dailyTotalResult = (DailyTotalResult) obj;
        return this.a.equals(dailyTotalResult.a) && arwb.b(this.b, dailyTotalResult.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("status", this.a, arrayList);
        arwa.b("dataPoint", this.b, arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Status status = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, status, i, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.c(parcel, a);
    }
}
