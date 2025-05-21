package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.bghh;
import defpackage.bgkl;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class DataPointChangesRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bgkl();
    public final long a;
    public final int b;
    public final bghh c;

    public DataPointChangesRequest(IBinder iBinder, long j, int i) {
        bghh bghhVar;
        if (iBinder == null) {
            bghhVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IDataPointChangesCallback");
            bghhVar = queryLocalInterface instanceof bghh ? (bghh) queryLocalInterface : new bghh(iBinder);
        }
        this.c = bghhVar;
        this.a = j;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        bghh bghhVar = this.c;
        arxc.D(parcel, 1, bghhVar == null ? null : bghhVar.a);
        arxc.q(parcel, 2, this.a);
        arxc.o(parcel, 3, this.b);
        arxc.c(parcel, a);
    }
}
