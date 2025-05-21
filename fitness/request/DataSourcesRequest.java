package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arxc;
import defpackage.bghk;
import defpackage.bghm;
import defpackage.bgkp;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class DataSourcesRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bgkp();
    public final List a;
    public final List b;
    public final bghm c;

    public DataSourcesRequest(DataSourcesRequest dataSourcesRequest, bghm bghmVar) {
        List list = dataSourcesRequest.a;
        List list2 = dataSourcesRequest.b;
        this.a = list;
        this.b = list2;
        this.c = bghmVar;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("dataTypes", this.a, arrayList);
        arwa.b("sourceTypes", this.b, arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int a = arxc.a(parcel);
        arxc.y(parcel, 1, list, false);
        arxc.E(parcel, 2, this.b);
        bghm bghmVar = this.c;
        arxc.D(parcel, 4, bghmVar == null ? null : bghmVar.asBinder());
        arxc.c(parcel, a);
    }

    public DataSourcesRequest(List list, List list2, IBinder iBinder) {
        bghm bghkVar;
        this.a = list;
        this.b = list2;
        if (iBinder == null) {
            bghkVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IDataSourcesCallback");
            bghkVar = queryLocalInterface instanceof bghm ? (bghm) queryLocalInterface : new bghk(iBinder);
        }
        this.c = bghkVar;
    }
}
