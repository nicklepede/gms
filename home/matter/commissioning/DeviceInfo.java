package com.google.android.gms.home.matter.commissioning;

import android.bluetooth.BluetoothAdapter;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.home.matter.common.Discriminator;
import com.google.android.gms.home.matter.common.NetworkLocation;
import defpackage.arwb;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.blad;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class DeviceInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new blad();
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
        arwm.d(str == null || BluetoothAdapter.checkBluetoothAddress(str), "Invalid Bluetooth address %s", String.valueOf(str));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceInfo)) {
            return false;
        }
        DeviceInfo deviceInfo = (DeviceInfo) obj;
        return this.a == deviceInfo.a && this.b == deviceInfo.b && arwb.b(this.c, deviceInfo.c) && arwb.b(this.d, deviceInfo.d) && arwb.b(this.e, deviceInfo.e) && arwb.b(this.f, deviceInfo.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), this.c, this.d, this.e, this.f});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, i2);
        arxc.o(parcel, 2, this.b);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.v(parcel, 4, this.d, false);
        arxc.t(parcel, 5, this.e, i, false);
        arxc.v(parcel, 6, this.f, false);
        arxc.c(parcel, a);
    }
}
