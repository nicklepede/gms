package com.google.android.gms.fitness.service;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataSource;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.bgdu;
import defpackage.bgdw;
import defpackage.bgrp;
import defpackage.bgrq;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class FitnessSensorServiceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bgrq();
    public final DataSource a;
    public final long b;
    public final long c;
    private final bgdw d;

    public FitnessSensorServiceRequest(bgrp bgrpVar) {
        this.a = bgrpVar.a;
        this.d = bgrpVar.b;
        this.b = bgrpVar.c;
        this.c = bgrpVar.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FitnessSensorServiceRequest)) {
            return false;
        }
        FitnessSensorServiceRequest fitnessSensorServiceRequest = (FitnessSensorServiceRequest) obj;
        return arwb.b(this.a, fitnessSensorServiceRequest.a) && this.b == fitnessSensorServiceRequest.b && this.c == fitnessSensorServiceRequest.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(this.b), Long.valueOf(this.c)});
    }

    public final String toString() {
        return String.format("FitnessSensorServiceRequest{%s}", this.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        DataSource dataSource = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, dataSource, i, false);
        arxc.D(parcel, 2, this.d.asBinder());
        arxc.q(parcel, 3, this.b);
        arxc.q(parcel, 4, this.c);
        arxc.c(parcel, a);
    }

    public FitnessSensorServiceRequest(DataSource dataSource, IBinder iBinder, long j, long j2) {
        bgdw bgduVar;
        this.a = dataSource;
        if (iBinder == null) {
            bgduVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.data.IDataSourceListener");
            bgduVar = queryLocalInterface instanceof bgdw ? (bgdw) queryLocalInterface : new bgdu(iBinder);
        }
        this.d = bgduVar;
        this.b = j;
        this.c = j2;
    }
}
