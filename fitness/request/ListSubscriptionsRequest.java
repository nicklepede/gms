package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataType;
import defpackage.arxc;
import defpackage.bgio;
import defpackage.bgle;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class ListSubscriptionsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bgle();
    public final DataType a;
    public final bgio b;

    public ListSubscriptionsRequest(DataType dataType, bgio bgioVar) {
        this.a = dataType;
        this.b = bgioVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, this.a, i, false);
        bgio bgioVar = this.b;
        arxc.D(parcel, 2, bgioVar == null ? null : bgioVar.a);
        arxc.c(parcel, a);
    }

    public ListSubscriptionsRequest(DataType dataType, IBinder iBinder) {
        bgio bgioVar;
        this.a = dataType;
        if (iBinder == null) {
            bgioVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IListSubscriptionsCallback");
            bgioVar = queryLocalInterface instanceof bgio ? (bgio) queryLocalInterface : new bgio(iBinder);
        }
        this.b = bgioVar;
    }
}
