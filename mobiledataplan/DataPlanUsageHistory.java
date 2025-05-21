package com.google.android.gms.mobiledataplan;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cdzd;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class DataPlanUsageHistory extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cdzd();
    public final Integer a;
    public final List b;

    public DataPlanUsageHistory(Integer num, List list) {
        this.a = num;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataPlanUsageHistory)) {
            return false;
        }
        DataPlanUsageHistory dataPlanUsageHistory = (DataPlanUsageHistory) obj;
        return arwb.b(this.a, dataPlanUsageHistory.a) && arwb.b(this.b, dataPlanUsageHistory.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("dataRecordDuration", this.a, arrayList);
        arwa.b("dataUsage", this.b, arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.a;
        int a = arxc.a(parcel);
        arxc.F(parcel, 1, num);
        arxc.H(parcel, 2, this.b);
        arxc.c(parcel, a);
    }
}
