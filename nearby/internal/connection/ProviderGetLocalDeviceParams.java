package com.google.android.gms.nearby.internal.connection;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cjau;
import defpackage.cjaw;
import defpackage.cjdk;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class ProviderGetLocalDeviceParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cjdk();
    public cjaw a;

    public ProviderGetLocalDeviceParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProviderGetLocalDeviceParams) {
            return arwb.b(this.a, ((ProviderGetLocalDeviceParams) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.D(parcel, 1, this.a.asBinder());
        arxc.c(parcel, a);
    }

    public ProviderGetLocalDeviceParams(IBinder iBinder) {
        cjaw cjauVar;
        if (iBinder == null) {
            cjauVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IDeviceResultListener");
            cjauVar = queryLocalInterface instanceof cjaw ? (cjaw) queryLocalInterface : new cjau(iBinder);
        }
        this.a = cjauVar;
    }
}
