package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.bgiu;
import defpackage.bgiw;
import defpackage.bglu;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class UnclaimBleDeviceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bglu();
    public final String a;
    public final bgiw b;

    public UnclaimBleDeviceRequest(String str, bgiw bgiwVar) {
        this.a = str;
        this.b = bgiwVar;
    }

    public final String toString() {
        return String.format("UnclaimBleDeviceRequest{%s}", this.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 2, str, false);
        bgiw bgiwVar = this.b;
        arxc.D(parcel, 3, bgiwVar == null ? null : bgiwVar.asBinder());
        arxc.c(parcel, a);
    }

    public UnclaimBleDeviceRequest(String str, IBinder iBinder) {
        bgiw bgiuVar;
        this.a = str;
        if (iBinder == null) {
            bgiuVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IStatusCallback");
            bgiuVar = queryLocalInterface instanceof bgiw ? (bgiw) queryLocalInterface : new bgiu(iBinder);
        }
        this.b = bgiuVar;
    }
}
