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
import defpackage.cigk;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class RequestPeripheralActiveParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cigk();
    public cifu a;
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
            if (arwb.b(this.a, requestPeripheralActiveParams.a) && arwb.b(Long.valueOf(this.b), Long.valueOf(requestPeripheralActiveParams.b)) && arwb.b(this.c, requestPeripheralActiveParams.c)) {
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
        int a = arxc.a(parcel);
        arxc.D(parcel, 1, this.a.asBinder());
        arxc.q(parcel, 2, this.b);
        arxc.v(parcel, 3, this.c, false);
        arxc.c(parcel, a);
    }

    public RequestPeripheralActiveParams(IBinder iBinder, long j, String str) {
        cifu cifsVar;
        if (iBinder == null) {
            cifsVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.fastpair.internal.IFastPairStatusCallback");
            cifsVar = queryLocalInterface instanceof cifu ? (cifu) queryLocalInterface : new cifs(iBinder);
        }
        this.a = cifsVar;
        this.b = j;
        this.c = str;
    }
}
