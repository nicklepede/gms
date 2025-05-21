package com.google.android.gms.dtdi.core.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dtdi.core.DeviceFilter;
import defpackage.arbn;
import defpackage.arbp;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.ayww;
import defpackage.ayxl;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class StartOrUpdateDiscoveryParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ayxl();
    public DeviceFilter[] a;
    public arbp b;
    public int c;
    public ayww d;

    private StartOrUpdateDiscoveryParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StartOrUpdateDiscoveryParams) {
            StartOrUpdateDiscoveryParams startOrUpdateDiscoveryParams = (StartOrUpdateDiscoveryParams) obj;
            if (Arrays.equals(this.a, startOrUpdateDiscoveryParams.a) && arwb.b(this.d, startOrUpdateDiscoveryParams.d) && arwb.b(this.b, startOrUpdateDiscoveryParams.b) && arwb.b(Integer.valueOf(this.c), Integer.valueOf(startOrUpdateDiscoveryParams.c))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), this.d, this.b, Integer.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.J(parcel, 1, this.a, i);
        arxc.D(parcel, 2, this.d.a);
        arxc.D(parcel, 3, this.b.asBinder());
        arxc.o(parcel, 4, this.c);
        arxc.c(parcel, a);
    }

    public StartOrUpdateDiscoveryParams(DeviceFilter[] deviceFilterArr, IBinder iBinder, IBinder iBinder2, int i) {
        ayww aywwVar;
        arbp arbpVar = null;
        if (iBinder == null) {
            aywwVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dtdi.core.internal.IOnScanResultListener");
            aywwVar = queryLocalInterface instanceof ayww ? (ayww) queryLocalInterface : new ayww(iBinder);
        }
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            arbpVar = queryLocalInterface2 instanceof arbp ? (arbp) queryLocalInterface2 : new arbn(iBinder2);
        }
        this.a = deviceFilterArr;
        this.d = aywwVar;
        this.b = arbpVar;
        this.c = i;
    }
}
