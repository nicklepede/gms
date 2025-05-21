package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cmvx;
import defpackage.cmvz;
import defpackage.cnah;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class IsFastInitNotificationEnabledParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cnah();
    public cmvz a;

    public IsFastInitNotificationEnabledParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IsFastInitNotificationEnabledParams) {
            return arwb.b(this.a, ((IsFastInitNotificationEnabledParams) obj).a);
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

    public IsFastInitNotificationEnabledParams(IBinder iBinder) {
        cmvz cmvxVar;
        if (iBinder == null) {
            cmvxVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.IBooleanResultListener");
            cmvxVar = queryLocalInterface instanceof cmvz ? (cmvz) queryLocalInterface : new cmvx(iBinder);
        }
        this.a = cmvxVar;
    }
}
