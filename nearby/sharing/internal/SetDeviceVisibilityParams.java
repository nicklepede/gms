package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atec;
import defpackage.atee;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cpjy;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class SetDeviceVisibilityParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cpjy();
    public atee a;
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
            if (atyq.b(this.a, setDeviceVisibilityParams.a) && atyq.b(Integer.valueOf(this.b), Integer.valueOf(setDeviceVisibilityParams.b)) && atyq.b(Long.valueOf(this.c), Long.valueOf(setDeviceVisibilityParams.c)) && atyq.b(this.d, setDeviceVisibilityParams.d)) {
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
        int a = atzr.a(parcel);
        atzr.D(parcel, 1, this.a.asBinder());
        atzr.o(parcel, 2, this.b);
        atzr.q(parcel, 3, this.c);
        atzr.v(parcel, 4, this.d, false);
        atzr.c(parcel, a);
    }

    public SetDeviceVisibilityParams(IBinder iBinder, int i, long j, String str) {
        atee atecVar;
        if (iBinder == null) {
            atecVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            atecVar = queryLocalInterface instanceof atee ? (atee) queryLocalInterface : new atec(iBinder);
        }
        this.a = atecVar;
        this.b = i;
        this.c = j;
        this.d = str;
    }
}
