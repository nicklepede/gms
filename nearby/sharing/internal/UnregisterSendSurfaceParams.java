package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arbn;
import defpackage.arbp;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cmxr;
import defpackage.cmxt;
import defpackage.cncj;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class UnregisterSendSurfaceParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cncj();
    public cmxt a;
    public arbp b;

    public UnregisterSendSurfaceParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UnregisterSendSurfaceParams) {
            UnregisterSendSurfaceParams unregisterSendSurfaceParams = (UnregisterSendSurfaceParams) obj;
            if (arwb.b(this.a, unregisterSendSurfaceParams.a) && arwb.b(this.b, unregisterSendSurfaceParams.b)) {
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
        arxc.D(parcel, 2, this.b.asBinder());
        arxc.c(parcel, a);
    }

    public UnregisterSendSurfaceParams(IBinder iBinder, IBinder iBinder2) {
        cmxt cmxrVar;
        arbp arbpVar = null;
        if (iBinder == null) {
            cmxrVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.ITransferUpdateCallback");
            cmxrVar = queryLocalInterface instanceof cmxt ? (cmxt) queryLocalInterface : new cmxr(iBinder);
        }
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            arbpVar = queryLocalInterface2 instanceof arbp ? (arbp) queryLocalInterface2 : new arbn(iBinder2);
        }
        this.a = cmxrVar;
        this.b = arbpVar;
    }
}
