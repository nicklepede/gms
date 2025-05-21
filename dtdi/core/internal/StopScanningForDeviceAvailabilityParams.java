package com.google.android.gms.dtdi.core.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dtdi.core.AnalyticsInfo;
import defpackage.arbn;
import defpackage.arbp;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.ayxp;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class StopScanningForDeviceAvailabilityParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ayxp();
    public int a;
    public arbp b;
    public AnalyticsInfo c;

    private StopScanningForDeviceAvailabilityParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StopScanningForDeviceAvailabilityParams) {
            StopScanningForDeviceAvailabilityParams stopScanningForDeviceAvailabilityParams = (StopScanningForDeviceAvailabilityParams) obj;
            if (arwb.b(Integer.valueOf(this.a), Integer.valueOf(stopScanningForDeviceAvailabilityParams.a)) && arwb.b(this.b, stopScanningForDeviceAvailabilityParams.b) && arwb.b(this.c, stopScanningForDeviceAvailabilityParams.c)) {
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
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.D(parcel, 2, this.b.asBinder());
        arxc.t(parcel, 3, this.c, i, false);
        arxc.c(parcel, a);
    }

    public StopScanningForDeviceAvailabilityParams(int i, IBinder iBinder, AnalyticsInfo analyticsInfo) {
        arbp arbnVar;
        if (iBinder == null) {
            arbnVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            arbnVar = queryLocalInterface instanceof arbp ? (arbp) queryLocalInterface : new arbn(iBinder);
        }
        this.a = i;
        this.b = arbnVar;
        this.c = analyticsInfo;
    }
}
