package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.bimd;
import defpackage.biph;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@Deprecated
/* loaded from: classes4.dex */
public class DataTypeReadRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new biph();
    public final String a;
    public final bimd b;

    public DataTypeReadRequest(String str, bimd bimdVar) {
        this.a = str;
        this.b = bimdVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof DataTypeReadRequest) && atyq.b(this.a, ((DataTypeReadRequest) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("name", this.a, arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.D(parcel, 3, this.b.a);
        atzr.c(parcel, a);
    }

    public DataTypeReadRequest(String str, IBinder iBinder) {
        bimd bimdVar;
        this.a = str;
        if (iBinder == null) {
            bimdVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IDataTypeCallback");
            bimdVar = queryLocalInterface instanceof bimd ? (bimd) queryLocalInterface : new bimd(iBinder);
        }
        this.b = bimdVar;
    }
}
