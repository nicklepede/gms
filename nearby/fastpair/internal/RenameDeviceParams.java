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
import defpackage.ckoo;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class RenameDeviceParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ckoo();
    public byte[] a;
    public String b;
    public cknz c;

    private RenameDeviceParams() {
    }

    public final IBinder a() {
        return this.c.asBinder();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RenameDeviceParams) {
            RenameDeviceParams renameDeviceParams = (RenameDeviceParams) obj;
            if (Arrays.equals(this.a, renameDeviceParams.a) && atyq.b(this.b, renameDeviceParams.b) && atyq.b(this.c, renameDeviceParams.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.i(parcel, 1, this.a, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.D(parcel, 3, a());
        atzr.c(parcel, a);
    }

    public RenameDeviceParams(byte[] bArr, String str, IBinder iBinder) {
        cknz cknxVar;
        if (iBinder == null) {
            cknxVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.fastpair.internal.IFastPairStatusCallback");
            cknxVar = queryLocalInterface instanceof cknz ? (cknz) queryLocalInterface : new cknx(iBinder);
        }
        this.a = bArr;
        this.b = str;
        this.c = cknxVar;
    }
}
