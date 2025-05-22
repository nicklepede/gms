package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atzr;
import defpackage.bima;
import defpackage.bimc;
import defpackage.bipf;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class DataSourcesRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bipf();
    public final List a;
    public final List b;
    public final bimc c;

    public DataSourcesRequest(DataSourcesRequest dataSourcesRequest, bimc bimcVar) {
        List list = dataSourcesRequest.a;
        List list2 = dataSourcesRequest.b;
        this.a = list;
        this.b = list2;
        this.c = bimcVar;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("dataTypes", this.a, arrayList);
        atyp.b("sourceTypes", this.b, arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int a = atzr.a(parcel);
        atzr.y(parcel, 1, list, false);
        atzr.E(parcel, 2, this.b);
        bimc bimcVar = this.c;
        atzr.D(parcel, 4, bimcVar == null ? null : bimcVar.asBinder());
        atzr.c(parcel, a);
    }

    public DataSourcesRequest(List list, List list2, IBinder iBinder) {
        bimc bimaVar;
        this.a = list;
        this.b = list2;
        if (iBinder == null) {
            bimaVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IDataSourcesCallback");
            bimaVar = queryLocalInterface instanceof bimc ? (bimc) queryLocalInterface : new bima(iBinder);
        }
        this.c = bimaVar;
    }
}
