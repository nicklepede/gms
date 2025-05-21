package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.bgir;
import defpackage.bglk;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class SessionChangesRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bglk();
    public final long a;
    public final int b;
    public final bgir c;

    public SessionChangesRequest(IBinder iBinder, long j, int i) {
        bgir bgirVar;
        if (iBinder == null) {
            bgirVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.ISessionChangesCallback");
            bgirVar = queryLocalInterface instanceof bgir ? (bgir) queryLocalInterface : new bgir(iBinder);
        }
        this.c = bgirVar;
        this.a = j;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        bgir bgirVar = this.c;
        arxc.D(parcel, 1, bgirVar == null ? null : bgirVar.a);
        arxc.q(parcel, 2, this.a);
        arxc.o(parcel, 3, this.b);
        arxc.c(parcel, a);
    }
}
