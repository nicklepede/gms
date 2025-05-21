package com.google.android.gms.usonia.directory.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.usonia.DeviceInfo;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.dhxb;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class OnDeviceOfflineParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dhxb();
    public DeviceInfo a;

    private OnDeviceOfflineParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnDeviceOfflineParams) {
            return arwb.b(this.a, ((OnDeviceOfflineParams) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, this.a, i, false);
        arxc.c(parcel, a);
    }

    public OnDeviceOfflineParams(DeviceInfo deviceInfo) {
        this.a = deviceInfo;
    }
}
