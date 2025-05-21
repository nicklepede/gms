package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.bgdu;
import defpackage.bgdw;
import defpackage.bgiu;
import defpackage.bgiw;
import defpackage.bglj;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class SensorUnregistrationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bglj();
    public final bgdw a;
    public final PendingIntent b;
    public final bgiw c;

    public SensorUnregistrationRequest(bgdw bgdwVar, PendingIntent pendingIntent, bgiw bgiwVar) {
        this.a = bgdwVar;
        this.b = pendingIntent;
        this.c = bgiwVar;
    }

    public final String toString() {
        return String.format("SensorUnregistrationRequest{%s}", this.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        bgdw bgdwVar = this.a;
        int a = arxc.a(parcel);
        arxc.D(parcel, 1, bgdwVar == null ? null : bgdwVar.asBinder());
        arxc.t(parcel, 2, this.b, i, false);
        bgiw bgiwVar = this.c;
        arxc.D(parcel, 3, bgiwVar != null ? bgiwVar.asBinder() : null);
        arxc.c(parcel, a);
    }

    public SensorUnregistrationRequest(IBinder iBinder, PendingIntent pendingIntent, IBinder iBinder2) {
        bgdw bgduVar;
        bgiw bgiwVar = null;
        if (iBinder == null) {
            bgduVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.data.IDataSourceListener");
            bgduVar = queryLocalInterface instanceof bgdw ? (bgdw) queryLocalInterface : new bgdu(iBinder);
        }
        this.a = bgduVar;
        this.b = pendingIntent;
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.fitness.internal.IStatusCallback");
            bgiwVar = queryLocalInterface2 instanceof bgiw ? (bgiw) queryLocalInterface2 : new bgiu(iBinder2);
        }
        this.c = bgiwVar;
    }
}
