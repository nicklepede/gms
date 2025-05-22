package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.biik;
import defpackage.biim;
import defpackage.bink;
import defpackage.binm;
import defpackage.bipz;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class SensorUnregistrationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bipz();
    public final biim a;
    public final PendingIntent b;
    public final binm c;

    public SensorUnregistrationRequest(biim biimVar, PendingIntent pendingIntent, binm binmVar) {
        this.a = biimVar;
        this.b = pendingIntent;
        this.c = binmVar;
    }

    public final String toString() {
        return String.format("SensorUnregistrationRequest{%s}", this.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        biim biimVar = this.a;
        int a = atzr.a(parcel);
        atzr.D(parcel, 1, biimVar == null ? null : biimVar.asBinder());
        atzr.t(parcel, 2, this.b, i, false);
        binm binmVar = this.c;
        atzr.D(parcel, 3, binmVar != null ? binmVar.asBinder() : null);
        atzr.c(parcel, a);
    }

    public SensorUnregistrationRequest(IBinder iBinder, PendingIntent pendingIntent, IBinder iBinder2) {
        biim biikVar;
        binm binmVar = null;
        if (iBinder == null) {
            biikVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.data.IDataSourceListener");
            biikVar = queryLocalInterface instanceof biim ? (biim) queryLocalInterface : new biik(iBinder);
        }
        this.a = biikVar;
        this.b = pendingIntent;
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.fitness.internal.IStatusCallback");
            binmVar = queryLocalInterface2 instanceof binm ? (binm) queryLocalInterface2 : new bink(iBinder2);
        }
        this.c = binmVar;
    }
}
