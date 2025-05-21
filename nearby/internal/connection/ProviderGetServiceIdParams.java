package com.google.android.gms.nearby.internal.connection;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cjbw;
import defpackage.cjby;
import defpackage.cjdl;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class ProviderGetServiceIdParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cjdl();
    public cjby a;

    public ProviderGetServiceIdParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProviderGetServiceIdParams) {
            return arwb.b(this.a, ((ProviderGetServiceIdParams) obj).a);
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

    public ProviderGetServiceIdParams(IBinder iBinder) {
        cjby cjbwVar;
        if (iBinder == null) {
            cjbwVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IStringResultListener");
            cjbwVar = queryLocalInterface instanceof cjby ? (cjby) queryLocalInterface : new cjbw(iBinder);
        }
        this.a = cjbwVar;
    }
}
