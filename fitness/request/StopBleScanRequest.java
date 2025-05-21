package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.bgiu;
import defpackage.bgiw;
import defpackage.bglc;
import defpackage.bgls;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@Deprecated
/* loaded from: classes4.dex */
public class StopBleScanRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bgls();
    public final bgiw a;
    public final bglc b;

    public StopBleScanRequest(bglc bglcVar, bgiw bgiwVar) {
        this.b = bglcVar;
        this.a = bgiwVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.D(parcel, 1, this.b.a);
        bgiw bgiwVar = this.a;
        arxc.D(parcel, 2, bgiwVar == null ? null : bgiwVar.asBinder());
        arxc.c(parcel, a);
    }

    public StopBleScanRequest(IBinder iBinder, IBinder iBinder2) {
        bglc bglcVar;
        bgiw bgiwVar = null;
        if (iBinder == null) {
            bglcVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.request.IBleScanCallback");
            bglcVar = queryLocalInterface instanceof bglc ? (bglc) queryLocalInterface : new bglc(iBinder);
        }
        this.b = bglcVar;
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.fitness.internal.IStatusCallback");
            bgiwVar = queryLocalInterface2 instanceof bgiw ? (bgiw) queryLocalInterface2 : new bgiu(iBinder2);
        }
        this.a = bgiwVar;
    }
}
