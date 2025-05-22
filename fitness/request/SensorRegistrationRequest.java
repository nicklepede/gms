package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.biik;
import defpackage.biim;
import defpackage.bink;
import defpackage.binm;
import defpackage.bipy;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class SensorRegistrationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bipy();
    public DataSource a;
    public DataType b;
    public final biim c;
    public final long d;
    public final long e;
    public final PendingIntent f;
    public final long g;
    public final int h;
    public final long i;
    public final List j;
    public final binm k;

    public SensorRegistrationRequest(DataSource dataSource, DataType dataType, biim biimVar, PendingIntent pendingIntent, long j, long j2, long j3, int i, List list, long j4, binm binmVar) {
        this.a = dataSource;
        this.b = dataType;
        this.c = biimVar;
        this.f = pendingIntent;
        this.d = j;
        this.g = j2;
        this.e = j3;
        this.h = i;
        this.j = list;
        this.i = j4;
        this.k = binmVar;
    }

    public final DataType a() {
        DataType dataType = this.b;
        if (dataType != null) {
            return dataType;
        }
        DataSource dataSource = this.a;
        if (dataSource == null) {
            return null;
        }
        return dataSource.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SensorRegistrationRequest)) {
            return false;
        }
        SensorRegistrationRequest sensorRegistrationRequest = (SensorRegistrationRequest) obj;
        return atyq.b(this.a, sensorRegistrationRequest.a) && atyq.b(this.b, sensorRegistrationRequest.b) && atyq.b(this.c, sensorRegistrationRequest.c) && this.d == sensorRegistrationRequest.d && this.g == sensorRegistrationRequest.g && this.e == sensorRegistrationRequest.e && this.h == sensorRegistrationRequest.h;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Long.valueOf(this.d), Long.valueOf(this.g), Long.valueOf(this.e), Integer.valueOf(this.h)});
    }

    public final String toString() {
        return String.format("SensorRegistrationRequest{type %s source %s interval %s fastest %s latency %s}", this.b, this.a, Long.valueOf(this.d), Long.valueOf(this.g), Long.valueOf(this.e));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, this.a, i, false);
        atzr.t(parcel, 2, this.b, i, false);
        biim biimVar = this.c;
        atzr.D(parcel, 3, biimVar == null ? null : biimVar.asBinder());
        atzr.q(parcel, 6, this.d);
        atzr.q(parcel, 7, this.e);
        atzr.t(parcel, 8, this.f, i, false);
        atzr.q(parcel, 9, this.g);
        atzr.o(parcel, 10, this.h);
        atzr.q(parcel, 12, this.i);
        binm binmVar = this.k;
        atzr.D(parcel, 13, binmVar != null ? binmVar.asBinder() : null);
        atzr.c(parcel, a);
    }

    public SensorRegistrationRequest(DataSource dataSource, DataType dataType, IBinder iBinder, long j, long j2, PendingIntent pendingIntent, long j3, int i, long j4, IBinder iBinder2) {
        biim biikVar;
        this.a = dataSource;
        this.b = dataType;
        binm binmVar = null;
        if (iBinder == null) {
            biikVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.data.IDataSourceListener");
            biikVar = queryLocalInterface instanceof biim ? (biim) queryLocalInterface : new biik(iBinder);
        }
        this.c = biikVar;
        this.d = j;
        this.g = j3;
        this.e = j2;
        this.f = pendingIntent;
        this.h = i;
        this.j = Collections.EMPTY_LIST;
        this.i = j4;
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.fitness.internal.IStatusCallback");
            binmVar = queryLocalInterface2 instanceof binm ? (binm) queryLocalInterface2 : new bink(iBinder2);
        }
        this.k = binmVar;
    }
}
