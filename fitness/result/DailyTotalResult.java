package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataType;
import defpackage.atau;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.bihs;
import defpackage.biqn;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class DailyTotalResult extends AbstractSafeParcelable implements atau {
    public static final Parcelable.Creator CREATOR = new biqn();
    public final Status a;
    public final DataSet b;

    public DailyTotalResult(Status status, DataSet dataSet) {
        this.a = status;
        this.b = dataSet;
    }

    public static DailyTotalResult b(Status status, DataType dataType) {
        bihs bihsVar = new bihs();
        bihsVar.b = 1;
        bihsVar.a = dataType;
        return new DailyTotalResult(status, DataSet.a(bihsVar.a()).a());
    }

    @Override // defpackage.atau
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
        return this.a.equals(dailyTotalResult.a) && atyq.b(this.b, dailyTotalResult.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("status", this.a, arrayList);
        atyp.b("dataPoint", this.b, arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Status status = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, status, i, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.c(parcel, a);
    }
}
