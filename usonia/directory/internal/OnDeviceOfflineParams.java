package com.google.android.gms.usonia.directory.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.usonia.DeviceInfo;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.dkij;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class OnDeviceOfflineParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dkij();
    public DeviceInfo a;

    private OnDeviceOfflineParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnDeviceOfflineParams) {
            return atyq.b(this.a, ((OnDeviceOfflineParams) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, this.a, i, false);
        atzr.c(parcel, a);
    }

    public OnDeviceOfflineParams(DeviceInfo deviceInfo) {
        this.a = deviceInfo;
    }
}
