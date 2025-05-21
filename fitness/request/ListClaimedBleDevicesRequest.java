package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.bgiy;
import defpackage.bgld;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@Deprecated
/* loaded from: classes4.dex */
public class ListClaimedBleDevicesRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bgld();
    public final bgiy a;

    public ListClaimedBleDevicesRequest(bgiy bgiyVar) {
        this.a = bgiyVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.D(parcel, 1, this.a.a);
        arxc.c(parcel, a);
    }

    public ListClaimedBleDevicesRequest(IBinder iBinder) {
        bgiy bgiyVar;
        if (iBinder == null) {
            bgiyVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.ble.IBleDevicesCallback");
            bgiyVar = queryLocalInterface instanceof bgiy ? (bgiy) queryLocalInterface : new bgiy(iBinder);
        }
        this.a = bgiyVar;
    }
}
