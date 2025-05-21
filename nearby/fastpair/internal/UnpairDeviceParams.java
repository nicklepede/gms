package com.google.android.gms.nearby.fastpair.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cifs;
import defpackage.cifu;
import defpackage.cigs;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class UnpairDeviceParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cigs();
    public byte[] a;
    public cifu b;

    public UnpairDeviceParams() {
    }

    public final IBinder a() {
        return this.b.asBinder();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UnpairDeviceParams) {
            UnpairDeviceParams unpairDeviceParams = (UnpairDeviceParams) obj;
            if (Arrays.equals(this.a, unpairDeviceParams.a) && arwb.b(this.b, unpairDeviceParams.b)) {
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
        int a = arxc.a(parcel);
        arxc.i(parcel, 1, this.a, false);
        arxc.D(parcel, 2, a());
        arxc.c(parcel, a);
    }

    public UnpairDeviceParams(byte[] bArr, IBinder iBinder) {
        cifu cifsVar;
        if (iBinder == null) {
            cifsVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.fastpair.internal.IFastPairStatusCallback");
            cifsVar = queryLocalInterface instanceof cifu ? (cifu) queryLocalInterface : new cifs(iBinder);
        }
        this.a = bArr;
        this.b = cifsVar;
    }
}
