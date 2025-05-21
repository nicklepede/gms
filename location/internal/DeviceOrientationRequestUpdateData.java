package com.google.android.gms.location.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.bzhy;
import defpackage.bzia;
import defpackage.bzyy;
import defpackage.bzzd;
import defpackage.bzzf;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class DeviceOrientationRequestUpdateData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bzyy();
    public final int a;
    public final DeviceOrientationRequestInternal b;
    public final bzia c;
    public final bzzf d;

    public DeviceOrientationRequestUpdateData(int i, DeviceOrientationRequestInternal deviceOrientationRequestInternal, IBinder iBinder, IBinder iBinder2) {
        bzia bzhyVar;
        this.a = i;
        this.b = deviceOrientationRequestInternal;
        bzzf bzzfVar = null;
        if (iBinder == null) {
            bzhyVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.IDeviceOrientationListener");
            bzhyVar = queryLocalInterface instanceof bzia ? (bzia) queryLocalInterface : new bzhy(iBinder);
        }
        this.c = bzhyVar;
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            bzzfVar = queryLocalInterface2 instanceof bzzf ? (bzzf) queryLocalInterface2 : new bzzd(iBinder2);
        }
        this.d = bzzfVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.t(parcel, 2, this.b, i, false);
        bzia bziaVar = this.c;
        arxc.D(parcel, 3, bziaVar == null ? null : bziaVar.asBinder());
        bzzf bzzfVar = this.d;
        arxc.D(parcel, 4, bzzfVar != null ? bzzfVar.asBinder() : null);
        arxc.c(parcel, a);
    }
}
