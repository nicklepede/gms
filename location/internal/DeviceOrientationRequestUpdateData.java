package com.google.android.gms.location.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.cbqp;
import defpackage.cbqr;
import defpackage.cchp;
import defpackage.cchu;
import defpackage.cchw;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class DeviceOrientationRequestUpdateData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cchp();
    public final int a;
    public final DeviceOrientationRequestInternal b;
    public final cbqr c;
    public final cchw d;

    public DeviceOrientationRequestUpdateData(int i, DeviceOrientationRequestInternal deviceOrientationRequestInternal, IBinder iBinder, IBinder iBinder2) {
        cbqr cbqpVar;
        this.a = i;
        this.b = deviceOrientationRequestInternal;
        cchw cchwVar = null;
        if (iBinder == null) {
            cbqpVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.IDeviceOrientationListener");
            cbqpVar = queryLocalInterface instanceof cbqr ? (cbqr) queryLocalInterface : new cbqp(iBinder);
        }
        this.c = cbqpVar;
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            cchwVar = queryLocalInterface2 instanceof cchw ? (cchw) queryLocalInterface2 : new cchu(iBinder2);
        }
        this.d = cchwVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.t(parcel, 2, this.b, i, false);
        cbqr cbqrVar = this.c;
        atzr.D(parcel, 3, cbqrVar == null ? null : cbqrVar.asBinder());
        cchw cchwVar = this.d;
        atzr.D(parcel, 4, cchwVar != null ? cchwVar.asBinder() : null);
        atzr.c(parcel, a);
    }
}
