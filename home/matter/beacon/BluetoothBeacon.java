package com.google.android.gms.home.matter.beacon;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.home.matter.commissioning.DeviceInfo;
import defpackage.atzr;
import defpackage.bngp;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class BluetoothBeacon extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bngp();
    public final DeviceInfo a;

    public BluetoothBeacon(DeviceInfo deviceInfo) {
        this.a = deviceInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BluetoothBeacon) {
            return this.a.equals(((BluetoothBeacon) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        DeviceInfo deviceInfo = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, deviceInfo, i, false);
        atzr.c(parcel, a);
    }
}
