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
import defpackage.bipa;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class DataInsertRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bipa();
    public final DataSet a;
    public final binm b;
    public final boolean c;

    public DataInsertRequest(DataSet dataSet, binm binmVar, boolean z) {
        this.a = dataSet;
        this.b = binmVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof DataInsertRequest) && atyq.b(this.a, ((DataInsertRequest) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("dataSet", this.a, arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        DataSet dataSet = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, dataSet, i, false);
        binm binmVar = this.b;
        atzr.D(parcel, 2, binmVar == null ? null : binmVar.asBinder());
        atzr.e(parcel, 4, this.c);
        atzr.c(parcel, a);
    }

    public DataInsertRequest(DataSet dataSet, IBinder iBinder, boolean z) {
        binm binkVar;
        this.a = dataSet;
        if (iBinder == null) {
            binkVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IStatusCallback");
            binkVar = queryLocalInterface instanceof binm ? (binm) queryLocalInterface : new bink(iBinder);
        }
        this.b = binkVar;
        this.c = z;
    }
}
