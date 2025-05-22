package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.bime;
import defpackage.bipn;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class DebugInfoRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bipn();
    public final bime a;

    public DebugInfoRequest(IBinder iBinder) {
        bime bimeVar;
        if (iBinder == null) {
            bimeVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IDebugInfoCallback");
            bimeVar = queryLocalInterface instanceof bime ? (bime) queryLocalInterface : new bime(iBinder);
        }
        this.a = bimeVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.D(parcel, 1, this.a.a);
        atzr.c(parcel, a);
    }
}
