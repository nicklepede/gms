package com.google.android.gms.nearby.internal.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.presence.PresenceDevice;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.clhu;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class DeviceParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new clhu();
    public int a;
    public PresenceDevice b;

    public DeviceParams() {
        this.a = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DeviceParams) {
            DeviceParams deviceParams = (DeviceParams) obj;
            if (atyq.b(Integer.valueOf(this.a), Integer.valueOf(deviceParams.a)) && atyq.b(this.b, deviceParams.b)) {
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
        atzr.t(parcel, 2, this.b, i, false);
        atzr.c(parcel, a);
    }

    public DeviceParams(int i, PresenceDevice presenceDevice) {
        this.a = i;
        this.b = presenceDevice;
    }
}
