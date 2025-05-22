package com.google.android.gms.nearby.fastpair.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cknx;
import defpackage.cknz;
import defpackage.ckpa;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class UpdateActiveTrackingMethodParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ckpa();
    public byte[] a;
    public cknz b;

    public UpdateActiveTrackingMethodParams() {
    }

    public final IBinder a() {
        return this.b.asBinder();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UpdateActiveTrackingMethodParams) {
            UpdateActiveTrackingMethodParams updateActiveTrackingMethodParams = (UpdateActiveTrackingMethodParams) obj;
            if (Arrays.equals(this.a, updateActiveTrackingMethodParams.a) && atyq.b(this.b, updateActiveTrackingMethodParams.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.i(parcel, 1, this.a, false);
        atzr.D(parcel, 2, a());
        atzr.c(parcel, a);
    }

    public UpdateActiveTrackingMethodParams(byte[] bArr, IBinder iBinder) {
        cknz cknxVar;
        if (iBinder == null) {
            cknxVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.fastpair.internal.IFastPairStatusCallback");
            cknxVar = queryLocalInterface instanceof cknz ? (cknz) queryLocalInterface : new cknx(iBinder);
        }
        this.a = bArr;
        this.b = cknxVar;
    }
}
