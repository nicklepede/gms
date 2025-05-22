package com.google.android.gms.home.matter.commissioning;

import android.bluetooth.BluetoothAdapter;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.home.matter.common.Discriminator;
import com.google.android.gms.home.matter.common.NetworkLocation;
import defpackage.atyq;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.bngu;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class DeviceInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bngu();
    public final int a;
    public final int b;
    public final Discriminator c;
    public final String d;
    public final NetworkLocation e;
    public final String f;

    public DeviceInfo(int i, int i2, Discriminator discriminator, String str, NetworkLocation networkLocation, String str2) {
        this.a = i;
        this.b = i2;
        this.c = discriminator;
        this.d = str;
        this.e = networkLocation;
        this.f = str2;
    }

    public static void a(String str) {
        atzb.d(str == null || BluetoothAdapter.checkBluetoothAddress(str), "Invalid Bluetooth address %s", String.valueOf(str));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceInfo)) {
            return false;
        }
        DeviceInfo deviceInfo = (DeviceInfo) obj;
        return this.a == deviceInfo.a && this.b == deviceInfo.b && atyq.b(this.c, deviceInfo.c) && atyq.b(this.d, deviceInfo.d) && atyq.b(this.e, deviceInfo.e) && atyq.b(this.f, deviceInfo.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), this.c, this.d, this.e, this.f});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, i2);
        atzr.o(parcel, 2, this.b);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.v(parcel, 4, this.d, false);
        atzr.t(parcel, 5, this.e, i, false);
        atzr.v(parcel, 6, this.f, false);
        atzr.c(parcel, a);
    }
}
