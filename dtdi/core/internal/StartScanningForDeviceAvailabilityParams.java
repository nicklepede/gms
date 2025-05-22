package com.google.android.gms.dtdi.core.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dtdi.core.AnalyticsInfo;
import com.google.android.gms.dtdi.core.DeviceFilter;
import defpackage.atec;
import defpackage.atee;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.bbac;
import defpackage.bbbg;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class StartScanningForDeviceAvailabilityParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bbbg();
    public DeviceFilter[] a;
    public int b;
    public atee c;
    public AnalyticsInfo d;
    public bbac e;

    private StartScanningForDeviceAvailabilityParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StartScanningForDeviceAvailabilityParams) {
            StartScanningForDeviceAvailabilityParams startScanningForDeviceAvailabilityParams = (StartScanningForDeviceAvailabilityParams) obj;
            if (Arrays.equals(this.a, startScanningForDeviceAvailabilityParams.a) && atyq.b(this.e, startScanningForDeviceAvailabilityParams.e) && atyq.b(Integer.valueOf(this.b), Integer.valueOf(startScanningForDeviceAvailabilityParams.b)) && atyq.b(this.c, startScanningForDeviceAvailabilityParams.c) && atyq.b(this.d, startScanningForDeviceAvailabilityParams.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), this.e, Integer.valueOf(this.b), this.c, this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.J(parcel, 1, this.a, i);
        atzr.D(parcel, 2, this.e.a);
        atzr.o(parcel, 3, this.b);
        atzr.D(parcel, 4, this.c.asBinder());
        atzr.t(parcel, 5, this.d, i, false);
        atzr.c(parcel, a);
    }

    public StartScanningForDeviceAvailabilityParams(DeviceFilter[] deviceFilterArr, IBinder iBinder, int i, IBinder iBinder2, AnalyticsInfo analyticsInfo) {
        bbac bbacVar;
        atee ateeVar = null;
        if (iBinder == null) {
            bbacVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dtdi.core.internal.IDeviceAvailabilityListener");
            bbacVar = queryLocalInterface instanceof bbac ? (bbac) queryLocalInterface : new bbac(iBinder);
        }
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            ateeVar = queryLocalInterface2 instanceof atee ? (atee) queryLocalInterface2 : new atec(iBinder2);
        }
        this.a = deviceFilterArr;
        this.e = bbacVar;
        this.b = i;
        this.c = ateeVar;
        this.d = analyticsInfo;
    }
}
