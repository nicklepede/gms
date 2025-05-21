package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.bgdu;
import defpackage.bgdw;
import defpackage.bgiu;
import defpackage.bgiw;
import defpackage.bgli;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class SensorRegistrationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bgli();
    public DataSource a;
    public DataType b;
    public final bgdw c;
    public final long d;
    public final long e;
    public final PendingIntent f;
    public final long g;
    public final int h;
    public final long i;
    public final List j;
    public final bgiw k;

    public SensorRegistrationRequest(DataSource dataSource, DataType dataType, bgdw bgdwVar, PendingIntent pendingIntent, long j, long j2, long j3, int i, List list, long j4, bgiw bgiwVar) {
        this.a = dataSource;
        this.b = dataType;
        this.c = bgdwVar;
        this.f = pendingIntent;
        this.d = j;
        this.g = j2;
        this.e = j3;
        this.h = i;
        this.j = list;
        this.i = j4;
        this.k = bgiwVar;
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
        return arwb.b(this.a, sensorRegistrationRequest.a) && arwb.b(this.b, sensorRegistrationRequest.b) && arwb.b(this.c, sensorRegistrationRequest.c) && this.d == sensorRegistrationRequest.d && this.g == sensorRegistrationRequest.g && this.e == sensorRegistrationRequest.e && this.h == sensorRegistrationRequest.h;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Long.valueOf(this.d), Long.valueOf(this.g), Long.valueOf(this.e), Integer.valueOf(this.h)});
    }

    public final String toString() {
        return String.format("SensorRegistrationRequest{type %s source %s interval %s fastest %s latency %s}", this.b, this.a, Long.valueOf(this.d), Long.valueOf(this.g), Long.valueOf(this.e));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, this.a, i, false);
        arxc.t(parcel, 2, this.b, i, false);
        bgdw bgdwVar = this.c;
        arxc.D(parcel, 3, bgdwVar == null ? null : bgdwVar.asBinder());
        arxc.q(parcel, 6, this.d);
        arxc.q(parcel, 7, this.e);
        arxc.t(parcel, 8, this.f, i, false);
        arxc.q(parcel, 9, this.g);
        arxc.o(parcel, 10, this.h);
        arxc.q(parcel, 12, this.i);
        bgiw bgiwVar = this.k;
        arxc.D(parcel, 13, bgiwVar != null ? bgiwVar.asBinder() : null);
        arxc.c(parcel, a);
    }

    public SensorRegistrationRequest(DataSource dataSource, DataType dataType, IBinder iBinder, long j, long j2, PendingIntent pendingIntent, long j3, int i, long j4, IBinder iBinder2) {
        bgdw bgduVar;
        this.a = dataSource;
        this.b = dataType;
        bgiw bgiwVar = null;
        if (iBinder == null) {
            bgduVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.data.IDataSourceListener");
            bgduVar = queryLocalInterface instanceof bgdw ? (bgdw) queryLocalInterface : new bgdu(iBinder);
        }
        this.c = bgduVar;
        this.d = j;
        this.g = j3;
        this.e = j2;
        this.f = pendingIntent;
        this.h = i;
        this.j = Collections.EMPTY_LIST;
        this.i = j4;
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.fitness.internal.IStatusCallback");
            bgiwVar = queryLocalInterface2 instanceof bgiw ? (bgiw) queryLocalInterface2 : new bgiu(iBinder2);
        }
        this.k = bgiwVar;
    }
}
