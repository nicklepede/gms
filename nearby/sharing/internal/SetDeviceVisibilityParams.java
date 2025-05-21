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
import defpackage.cnbq;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class SetDeviceVisibilityParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cnbq();
    public arbp a;
    public int b;
    public long c;
    public String d;

    public SetDeviceVisibilityParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SetDeviceVisibilityParams) {
            SetDeviceVisibilityParams setDeviceVisibilityParams = (SetDeviceVisibilityParams) obj;
            if (arwb.b(this.a, setDeviceVisibilityParams.a) && arwb.b(Integer.valueOf(this.b), Integer.valueOf(setDeviceVisibilityParams.b)) && arwb.b(Long.valueOf(this.c), Long.valueOf(setDeviceVisibilityParams.c)) && arwb.b(this.d, setDeviceVisibilityParams.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Long.valueOf(this.c), this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.D(parcel, 1, this.a.asBinder());
        arxc.o(parcel, 2, this.b);
        arxc.q(parcel, 3, this.c);
        arxc.v(parcel, 4, this.d, false);
        arxc.c(parcel, a);
    }

    public SetDeviceVisibilityParams(IBinder iBinder, int i, long j, String str) {
        arbp arbnVar;
        if (iBinder == null) {
            arbnVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            arbnVar = queryLocalInterface instanceof arbp ? (arbp) queryLocalInterface : new arbn(iBinder);
        }
        this.a = arbnVar;
        this.b = i;
        this.c = j;
        this.d = str;
    }
}
