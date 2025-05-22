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
import defpackage.ckop;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class RequestPeripheralActiveParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ckop();
    public cknz a;
    public long b;
    public String c;

    private RequestPeripheralActiveParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RequestPeripheralActiveParams) {
            RequestPeripheralActiveParams requestPeripheralActiveParams = (RequestPeripheralActiveParams) obj;
            if (atyq.b(this.a, requestPeripheralActiveParams.a) && atyq.b(Long.valueOf(this.b), Long.valueOf(requestPeripheralActiveParams.b)) && atyq.b(this.c, requestPeripheralActiveParams.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(this.b), this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.D(parcel, 1, this.a.asBinder());
        atzr.q(parcel, 2, this.b);
        atzr.v(parcel, 3, this.c, false);
        atzr.c(parcel, a);
    }

    public RequestPeripheralActiveParams(IBinder iBinder, long j, String str) {
        cknz cknxVar;
        if (iBinder == null) {
            cknxVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.fastpair.internal.IFastPairStatusCallback");
            cknxVar = queryLocalInterface instanceof cknz ? (cknz) queryLocalInterface : new cknx(iBinder);
        }
        this.a = cknxVar;
        this.b = j;
        this.c = str;
    }
}
