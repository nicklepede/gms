package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.bgiu;
import defpackage.bgiw;
import defpackage.bgkv;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class DeleteAllUserDataRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bgkv();
    public final bgiw a;

    public DeleteAllUserDataRequest(bgiw bgiwVar) {
        this.a = bgiwVar;
    }

    public final String toString() {
        return String.format("DisableFitRequest", new Object[0]);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        bgiw bgiwVar = this.a;
        int a = arxc.a(parcel);
        arxc.D(parcel, 1, bgiwVar.asBinder());
        arxc.c(parcel, a);
    }

    public DeleteAllUserDataRequest(IBinder iBinder) {
        bgiw bgiuVar;
        if (iBinder == null) {
            bgiuVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IStatusCallback");
            bgiuVar = queryLocalInterface instanceof bgiw ? (bgiw) queryLocalInterface : new bgiu(iBinder);
        }
        this.a = bgiuVar;
    }
}
