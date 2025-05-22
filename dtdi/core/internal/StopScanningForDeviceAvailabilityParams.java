package com.google.android.gms.dtdi.core.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dtdi.core.AnalyticsInfo;
import defpackage.atec;
import defpackage.atee;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.bbbj;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class StopScanningForDeviceAvailabilityParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bbbj();
    public int a;
    public atee b;
    public AnalyticsInfo c;

    private StopScanningForDeviceAvailabilityParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StopScanningForDeviceAvailabilityParams) {
            StopScanningForDeviceAvailabilityParams stopScanningForDeviceAvailabilityParams = (StopScanningForDeviceAvailabilityParams) obj;
            if (atyq.b(Integer.valueOf(this.a), Integer.valueOf(stopScanningForDeviceAvailabilityParams.a)) && atyq.b(this.b, stopScanningForDeviceAvailabilityParams.b) && atyq.b(this.c, stopScanningForDeviceAvailabilityParams.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.D(parcel, 2, this.b.asBinder());
        atzr.t(parcel, 3, this.c, i, false);
        atzr.c(parcel, a);
    }

    public StopScanningForDeviceAvailabilityParams(int i, IBinder iBinder, AnalyticsInfo analyticsInfo) {
        atee atecVar;
        if (iBinder == null) {
            atecVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            atecVar = queryLocalInterface instanceof atee ? (atee) queryLocalInterface : new atec(iBinder);
        }
        this.a = i;
        this.b = atecVar;
        this.c = analyticsInfo;
    }
}
