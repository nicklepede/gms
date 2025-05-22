package com.google.android.gms.dtdi.core.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dtdi.core.DeviceFilter;
import defpackage.atec;
import defpackage.atee;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.bbaq;
import defpackage.bbbf;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class StartOrUpdateDiscoveryParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bbbf();
    public DeviceFilter[] a;
    public atee b;
    public int c;
    public bbaq d;

    private StartOrUpdateDiscoveryParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StartOrUpdateDiscoveryParams) {
            StartOrUpdateDiscoveryParams startOrUpdateDiscoveryParams = (StartOrUpdateDiscoveryParams) obj;
            if (Arrays.equals(this.a, startOrUpdateDiscoveryParams.a) && atyq.b(this.d, startOrUpdateDiscoveryParams.d) && atyq.b(this.b, startOrUpdateDiscoveryParams.b) && atyq.b(Integer.valueOf(this.c), Integer.valueOf(startOrUpdateDiscoveryParams.c))) {
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
        int a = atzr.a(parcel);
        atzr.J(parcel, 1, this.a, i);
        atzr.D(parcel, 2, this.d.a);
        atzr.D(parcel, 3, this.b.asBinder());
        atzr.o(parcel, 4, this.c);
        atzr.c(parcel, a);
    }

    public StartOrUpdateDiscoveryParams(DeviceFilter[] deviceFilterArr, IBinder iBinder, IBinder iBinder2, int i) {
        bbaq bbaqVar;
        atee ateeVar = null;
        if (iBinder == null) {
            bbaqVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dtdi.core.internal.IOnScanResultListener");
            bbaqVar = queryLocalInterface instanceof bbaq ? (bbaq) queryLocalInterface : new bbaq(iBinder);
        }
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            ateeVar = queryLocalInterface2 instanceof atee ? (atee) queryLocalInterface2 : new atec(iBinder2);
        }
        this.a = deviceFilterArr;
        this.d = bbaqVar;
        this.b = ateeVar;
        this.c = i;
    }
}
