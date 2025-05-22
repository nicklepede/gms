package com.google.android.gms.mobiledataplan;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cgij;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class CellularInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cgij();
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
        return atyq.b(this.a, cellularInfo.a) && atyq.b(this.b, cellularInfo.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("connectionType", this.a, arrayList);
        atyp.b("meteredness", this.b, arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.a;
        int a = atzr.a(parcel);
        atzr.F(parcel, 1, num);
        atzr.F(parcel, 2, this.b);
        atzr.c(parcel, a);
    }
}
