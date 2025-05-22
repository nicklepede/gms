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
import defpackage.bipg;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@Deprecated
/* loaded from: classes4.dex */
public class DataTypeCreateRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bipg();
    public final String a;
    public final List b;
    public final bimd c;

    public DataTypeCreateRequest(DataTypeCreateRequest dataTypeCreateRequest, bimd bimdVar) {
        String str = dataTypeCreateRequest.a;
        List list = dataTypeCreateRequest.b;
        this.a = str;
        this.b = DesugarCollections.unmodifiableList(list);
        this.c = bimdVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DataTypeCreateRequest)) {
            return false;
        }
        DataTypeCreateRequest dataTypeCreateRequest = (DataTypeCreateRequest) obj;
        return atyq.b(this.a, dataTypeCreateRequest.a) && atyq.b(this.b, dataTypeCreateRequest.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("name", this.a, arrayList);
        atyp.b("fields", this.b, arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.y(parcel, 2, this.b, false);
        bimd bimdVar = this.c;
        atzr.D(parcel, 3, bimdVar == null ? null : bimdVar.a);
        atzr.c(parcel, a);
    }

    public DataTypeCreateRequest(String str, List list, IBinder iBinder) {
        bimd bimdVar;
        this.a = str;
        this.b = DesugarCollections.unmodifiableList(list);
        if (iBinder == null) {
            bimdVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IDataTypeCallback");
            bimdVar = queryLocalInterface instanceof bimd ? (bimd) queryLocalInterface : new bimd(iBinder);
        }
        this.c = bimdVar;
    }
}
