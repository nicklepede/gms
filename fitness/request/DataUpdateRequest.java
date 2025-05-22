package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataSet;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.bink;
import defpackage.binm;
import defpackage.bipk;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class DataUpdateRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bipk();
    public final long a;
    public final long b;
    public final DataSet c;
    public final binm d;

    public DataUpdateRequest(long j, long j2, DataSet dataSet, IBinder iBinder) {
        binm binkVar;
        this.a = j;
        this.b = j2;
        this.c = dataSet;
        if (iBinder == null) {
            binkVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IStatusCallback");
            binkVar = queryLocalInterface instanceof binm ? (binm) queryLocalInterface : new bink(iBinder);
        }
        this.d = binkVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DataUpdateRequest)) {
            return false;
        }
        DataUpdateRequest dataUpdateRequest = (DataUpdateRequest) obj;
        return this.a == dataUpdateRequest.a && this.b == dataUpdateRequest.b && atyq.b(this.c, dataUpdateRequest.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b), this.c});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("startTimeMillis", Long.valueOf(this.a), arrayList);
        atyp.b("endTimeMillis", Long.valueOf(this.b), arrayList);
        atyp.b("dataSet", this.c, arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.a;
        int a = atzr.a(parcel);
        atzr.q(parcel, 1, j);
        atzr.q(parcel, 2, this.b);
        atzr.t(parcel, 3, this.c, i, false);
        binm binmVar = this.d;
        atzr.D(parcel, 4, binmVar == null ? null : binmVar.asBinder());
        atzr.c(parcel, a);
    }
}
