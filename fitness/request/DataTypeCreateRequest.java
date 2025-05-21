package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.bghn;
import defpackage.bgkq;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@Deprecated
/* loaded from: classes4.dex */
public class DataTypeCreateRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bgkq();
    public final String a;
    public final List b;
    public final bghn c;

    public DataTypeCreateRequest(DataTypeCreateRequest dataTypeCreateRequest, bghn bghnVar) {
        String str = dataTypeCreateRequest.a;
        List list = dataTypeCreateRequest.b;
        this.a = str;
        this.b = DesugarCollections.unmodifiableList(list);
        this.c = bghnVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DataTypeCreateRequest)) {
            return false;
        }
        DataTypeCreateRequest dataTypeCreateRequest = (DataTypeCreateRequest) obj;
        return arwb.b(this.a, dataTypeCreateRequest.a) && arwb.b(this.b, dataTypeCreateRequest.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("name", this.a, arrayList);
        arwa.b("fields", this.b, arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.y(parcel, 2, this.b, false);
        bghn bghnVar = this.c;
        arxc.D(parcel, 3, bghnVar == null ? null : bghnVar.a);
        arxc.c(parcel, a);
    }

    public DataTypeCreateRequest(String str, List list, IBinder iBinder) {
        bghn bghnVar;
        this.a = str;
        this.b = DesugarCollections.unmodifiableList(list);
        if (iBinder == null) {
            bghnVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IDataTypeCallback");
            bghnVar = queryLocalInterface instanceof bghn ? (bghn) queryLocalInterface : new bghn(iBinder);
        }
        this.c = bghnVar;
    }
}
