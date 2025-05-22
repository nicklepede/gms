package com.google.android.gms.mobiledataplan;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cgik;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class DataPlanUsageHistory extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cgik();
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
        return atyq.b(this.a, dataPlanUsageHistory.a) && atyq.b(this.b, dataPlanUsageHistory.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("dataRecordDuration", this.a, arrayList);
        atyp.b("dataUsage", this.b, arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.a;
        int a = atzr.a(parcel);
        atzr.F(parcel, 1, num);
        atzr.H(parcel, 2, this.b);
        atzr.c(parcel, a);
    }
}
