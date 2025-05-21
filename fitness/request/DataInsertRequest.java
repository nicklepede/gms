package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataSet;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.bgiu;
import defpackage.bgiw;
import defpackage.bgkk;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class DataInsertRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bgkk();
    public final DataSet a;
    public final bgiw b;
    public final boolean c;

    public DataInsertRequest(DataSet dataSet, bgiw bgiwVar, boolean z) {
        this.a = dataSet;
        this.b = bgiwVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof DataInsertRequest) && arwb.b(this.a, ((DataInsertRequest) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("dataSet", this.a, arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        DataSet dataSet = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, dataSet, i, false);
        bgiw bgiwVar = this.b;
        arxc.D(parcel, 2, bgiwVar == null ? null : bgiwVar.asBinder());
        arxc.e(parcel, 4, this.c);
        arxc.c(parcel, a);
    }

    public DataInsertRequest(DataSet dataSet, IBinder iBinder, boolean z) {
        bgiw bgiuVar;
        this.a = dataSet;
        if (iBinder == null) {
            bgiuVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IStatusCallback");
            bgiuVar = queryLocalInterface instanceof bgiw ? (bgiw) queryLocalInterface : new bgiu(iBinder);
        }
        this.b = bgiuVar;
        this.c = z;
    }
}
