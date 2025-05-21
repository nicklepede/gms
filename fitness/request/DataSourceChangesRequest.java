package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.bghj;
import defpackage.bgkn;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class DataSourceChangesRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bgkn();
    public final long a;
    public final bghj b;

    public DataSourceChangesRequest(IBinder iBinder, long j) {
        bghj bghjVar;
        if (iBinder == null) {
            bghjVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IDataSourceChangesCallback");
            bghjVar = queryLocalInterface instanceof bghj ? (bghj) queryLocalInterface : new bghj(iBinder);
        }
        this.b = bghjVar;
        this.a = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        bghj bghjVar = this.b;
        arxc.D(parcel, 1, bghjVar == null ? null : bghjVar.a);
        arxc.q(parcel, 2, this.a);
        arxc.c(parcel, a);
    }
}
