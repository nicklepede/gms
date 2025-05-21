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
import defpackage.bgkr;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@Deprecated
/* loaded from: classes4.dex */
public class DataTypeReadRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bgkr();
    public final String a;
    public final bghn b;

    public DataTypeReadRequest(String str, bghn bghnVar) {
        this.a = str;
        this.b = bghnVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof DataTypeReadRequest) && arwb.b(this.a, ((DataTypeReadRequest) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("name", this.a, arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.D(parcel, 3, this.b.a);
        arxc.c(parcel, a);
    }

    public DataTypeReadRequest(String str, IBinder iBinder) {
        bghn bghnVar;
        this.a = str;
        if (iBinder == null) {
            bghnVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IDataTypeCallback");
            bghnVar = queryLocalInterface instanceof bghn ? (bghn) queryLocalInterface : new bghn(iBinder);
        }
        this.b = bghnVar;
    }
}
