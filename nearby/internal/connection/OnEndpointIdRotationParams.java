package com.google.android.gms.nearby.internal.connection;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cjbd;
import defpackage.cjbf;
import defpackage.cjck;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class OnEndpointIdRotationParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cjck();
    public cjbf a;
    public String b;

    public OnEndpointIdRotationParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnEndpointIdRotationParams) {
            OnEndpointIdRotationParams onEndpointIdRotationParams = (OnEndpointIdRotationParams) obj;
            if (arwb.b(this.a, onEndpointIdRotationParams.a) && arwb.b(this.b, onEndpointIdRotationParams.b)) {
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
        int a = arxc.a(parcel);
        arxc.D(parcel, 1, this.a.asBinder());
        arxc.v(parcel, 2, this.b, false);
        arxc.c(parcel, a);
    }

    public OnEndpointIdRotationParams(IBinder iBinder, String str) {
        cjbf cjbdVar;
        if (iBinder == null) {
            cjbdVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IEndpointIdRotationResultListener");
            cjbdVar = queryLocalInterface instanceof cjbf ? (cjbf) queryLocalInterface : new cjbd(iBinder);
        }
        this.a = cjbdVar;
        this.b = str;
    }
}
