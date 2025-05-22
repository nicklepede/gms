package com.google.android.gms.fitness.service;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataSource;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.biik;
import defpackage.biim;
import defpackage.biwf;
import defpackage.biwg;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class FitnessSensorServiceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new biwg();
    public final DataSource a;
    public final long b;
    public final long c;
    private final biim d;

    public FitnessSensorServiceRequest(biwf biwfVar) {
        this.a = biwfVar.a;
        this.d = biwfVar.b;
        this.b = biwfVar.c;
        this.c = biwfVar.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FitnessSensorServiceRequest)) {
            return false;
        }
        FitnessSensorServiceRequest fitnessSensorServiceRequest = (FitnessSensorServiceRequest) obj;
        return atyq.b(this.a, fitnessSensorServiceRequest.a) && this.b == fitnessSensorServiceRequest.b && this.c == fitnessSensorServiceRequest.c;
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
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, dataSource, i, false);
        atzr.D(parcel, 2, this.d.asBinder());
        atzr.q(parcel, 3, this.b);
        atzr.q(parcel, 4, this.c);
        atzr.c(parcel, a);
    }

    public FitnessSensorServiceRequest(DataSource dataSource, IBinder iBinder, long j, long j2) {
        biim biikVar;
        this.a = dataSource;
        if (iBinder == null) {
            biikVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.data.IDataSourceListener");
            biikVar = queryLocalInterface instanceof biim ? (biim) queryLocalInterface : new biik(iBinder);
        }
        this.d = biikVar;
        this.b = j;
        this.c = j2;
    }
}
