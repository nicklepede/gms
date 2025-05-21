package com.google.android.gms.dtdi.core.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dtdi.core.AnalyticsInfo;
import com.google.android.gms.dtdi.core.DeviceFilter;
import defpackage.arbn;
import defpackage.arbp;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.aywi;
import defpackage.ayxm;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class StartScanningForDeviceAvailabilityParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ayxm();
    public DeviceFilter[] a;
    public int b;
    public arbp c;
    public AnalyticsInfo d;
    public aywi e;

    private StartScanningForDeviceAvailabilityParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StartScanningForDeviceAvailabilityParams) {
            StartScanningForDeviceAvailabilityParams startScanningForDeviceAvailabilityParams = (StartScanningForDeviceAvailabilityParams) obj;
            if (Arrays.equals(this.a, startScanningForDeviceAvailabilityParams.a) && arwb.b(this.e, startScanningForDeviceAvailabilityParams.e) && arwb.b(Integer.valueOf(this.b), Integer.valueOf(startScanningForDeviceAvailabilityParams.b)) && arwb.b(this.c, startScanningForDeviceAvailabilityParams.c) && arwb.b(this.d, startScanningForDeviceAvailabilityParams.d)) {
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
        int a = arxc.a(parcel);
        arxc.J(parcel, 1, this.a, i);
        arxc.D(parcel, 2, this.e.a);
        arxc.o(parcel, 3, this.b);
        arxc.D(parcel, 4, this.c.asBinder());
        arxc.t(parcel, 5, this.d, i, false);
        arxc.c(parcel, a);
    }

    public StartScanningForDeviceAvailabilityParams(DeviceFilter[] deviceFilterArr, IBinder iBinder, int i, IBinder iBinder2, AnalyticsInfo analyticsInfo) {
        aywi aywiVar;
        arbp arbpVar = null;
        if (iBinder == null) {
            aywiVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dtdi.core.internal.IDeviceAvailabilityListener");
            aywiVar = queryLocalInterface instanceof aywi ? (aywi) queryLocalInterface : new aywi(iBinder);
        }
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            arbpVar = queryLocalInterface2 instanceof arbp ? (arbp) queryLocalInterface2 : new arbn(iBinder2);
        }
        this.a = deviceFilterArr;
        this.e = aywiVar;
        this.b = i;
        this.c = arbpVar;
        this.d = analyticsInfo;
    }
}
