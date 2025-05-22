package com.google.android.gms.nearby.fastpair.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.ckno;
import defpackage.ckor;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class SassDeviceAvailableParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ckor();
    public int a;
    public ckno b;

    private SassDeviceAvailableParams() {
    }

    public final IBinder a() {
        return this.b.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SassDeviceAvailableParams) {
            SassDeviceAvailableParams sassDeviceAvailableParams = (SassDeviceAvailableParams) obj;
            if (atyq.b(Integer.valueOf(this.a), Integer.valueOf(sassDeviceAvailableParams.a)) && atyq.b(this.b, sassDeviceAvailableParams.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.D(parcel, 2, a());
        atzr.c(parcel, a);
    }

    public SassDeviceAvailableParams(int i, IBinder iBinder) {
        ckno cknoVar;
        if (iBinder == null) {
            cknoVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.fastpair.internal.IBooleanCallback");
            cknoVar = queryLocalInterface instanceof ckno ? (ckno) queryLocalInterface : new ckno(iBinder);
        }
        this.a = i;
        this.b = cknoVar;
    }
}
