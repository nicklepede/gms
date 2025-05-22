package com.google.android.gms.nearby.internal.connection;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.clji;
import defpackage.cljk;
import defpackage.clkp;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class OnEndpointIdRotationParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new clkp();
    public cljk a;
    public String b;

    public OnEndpointIdRotationParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnEndpointIdRotationParams) {
            OnEndpointIdRotationParams onEndpointIdRotationParams = (OnEndpointIdRotationParams) obj;
            if (atyq.b(this.a, onEndpointIdRotationParams.a) && atyq.b(this.b, onEndpointIdRotationParams.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.D(parcel, 1, this.a.asBinder());
        atzr.v(parcel, 2, this.b, false);
        atzr.c(parcel, a);
    }

    public OnEndpointIdRotationParams(IBinder iBinder, String str) {
        cljk cljiVar;
        if (iBinder == null) {
            cljiVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IEndpointIdRotationResultListener");
            cljiVar = queryLocalInterface instanceof cljk ? (cljk) queryLocalInterface : new clji(iBinder);
        }
        this.a = cljiVar;
        this.b = str;
    }
}
