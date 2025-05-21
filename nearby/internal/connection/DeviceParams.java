package com.google.android.gms.nearby.internal.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.presence.PresenceDevice;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cizp;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class DeviceParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cizp();
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
            if (arwb.b(Integer.valueOf(this.a), Integer.valueOf(deviceParams.a)) && arwb.b(this.b, deviceParams.b)) {
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
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.c(parcel, a);
    }

    public DeviceParams(int i, PresenceDevice presenceDevice) {
        this.a = i;
        this.b = presenceDevice;
    }
}
