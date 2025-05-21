package com.google.android.gms.dtdi.core.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dtdi.core.TokenWrapper;
import defpackage.arbn;
import defpackage.arbp;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.ayvq;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class CloseDeviceParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ayvq();
    public TokenWrapper a;
    public arbp b;

    private CloseDeviceParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CloseDeviceParams) {
            CloseDeviceParams closeDeviceParams = (CloseDeviceParams) obj;
            if (arwb.b(this.a, closeDeviceParams.a) && arwb.b(this.b, closeDeviceParams.b)) {
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
        arxc.t(parcel, 1, this.a, i, false);
        arxc.D(parcel, 2, this.b.asBinder());
        arxc.c(parcel, a);
    }

    public CloseDeviceParams(TokenWrapper tokenWrapper, IBinder iBinder) {
        arbp arbnVar;
        if (iBinder == null) {
            arbnVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            arbnVar = queryLocalInterface instanceof arbp ? (arbp) queryLocalInterface : new arbn(iBinder);
        }
        this.a = tokenWrapper;
        this.b = arbnVar;
    }
}
