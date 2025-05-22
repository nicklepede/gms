package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.bino;
import defpackage.bipt;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@Deprecated
/* loaded from: classes4.dex */
public class ListClaimedBleDevicesRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bipt();
    public final bino a;

    public ListClaimedBleDevicesRequest(bino binoVar) {
        this.a = binoVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.D(parcel, 1, this.a.a);
        atzr.c(parcel, a);
    }

    public ListClaimedBleDevicesRequest(IBinder iBinder) {
        bino binoVar;
        if (iBinder == null) {
            binoVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.ble.IBleDevicesCallback");
            binoVar = queryLocalInterface instanceof bino ? (bino) queryLocalInterface : new bino(iBinder);
        }
        this.a = binoVar;
    }
}
