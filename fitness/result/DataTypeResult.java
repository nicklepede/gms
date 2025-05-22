package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataType;
import defpackage.atau;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.biqu;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@Deprecated
/* loaded from: classes4.dex */
public class DataTypeResult extends AbstractSafeParcelable implements atau {
    public static final Parcelable.Creator CREATOR = new biqu();
    public final Status a;
    public final DataType b;

    public DataTypeResult(Status status, DataType dataType) {
        this.a = status;
        this.b = dataType;
    }

    @Override // defpackage.atau
    public final Status a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataTypeResult)) {
            return false;
        }
        DataTypeResult dataTypeResult = (DataTypeResult) obj;
        return this.a.equals(dataTypeResult.a) && atyq.b(this.b, dataTypeResult.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("status", this.a, arrayList);
        atyp.b("dataType", this.b, arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Status status = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, status, i, false);
        atzr.t(parcel, 3, this.b, i, false);
        atzr.c(parcel, a);
    }
}
