package com.google.android.gms.mobiledataplan;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cdzc;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class CellularInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cdzc();
    public final Integer a;
    public final Integer b;

    public CellularInfo(Integer num, Integer num2) {
        this.a = num;
        this.b = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CellularInfo)) {
            return false;
        }
        CellularInfo cellularInfo = (CellularInfo) obj;
        return arwb.b(this.a, cellularInfo.a) && arwb.b(this.b, cellularInfo.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("connectionType", this.a, arrayList);
        arwa.b("meteredness", this.b, arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.a;
        int a = arxc.a(parcel);
        arxc.F(parcel, 1, num);
        arxc.F(parcel, 2, this.b);
        arxc.c(parcel, a);
    }
}
