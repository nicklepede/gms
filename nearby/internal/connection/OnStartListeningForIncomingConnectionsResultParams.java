package com.google.android.gms.nearby.internal.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.connection.BleConnectivityInfo;
import com.google.android.gms.nearby.connection.BluetoothConnectivityInfo;
import com.google.android.gms.nearby.connection.WifiLanConnectivityInfo;
import com.google.android.gms.nearby.connection.WifiLanConnectivityInfoV2;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.clkw;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class OnStartListeningForIncomingConnectionsResultParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new clkw();
    public int a;
    public String b;
    public BleConnectivityInfo c;
    public BluetoothConnectivityInfo d;
    public WifiLanConnectivityInfo e;
    public WifiLanConnectivityInfoV2 f;

    public OnStartListeningForIncomingConnectionsResultParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnStartListeningForIncomingConnectionsResultParams) {
            OnStartListeningForIncomingConnectionsResultParams onStartListeningForIncomingConnectionsResultParams = (OnStartListeningForIncomingConnectionsResultParams) obj;
            if (atyq.b(Integer.valueOf(this.a), Integer.valueOf(onStartListeningForIncomingConnectionsResultParams.a)) && atyq.b(this.b, onStartListeningForIncomingConnectionsResultParams.b) && atyq.b(this.c, onStartListeningForIncomingConnectionsResultParams.c) && atyq.b(this.d, onStartListeningForIncomingConnectionsResultParams.d) && atyq.b(this.e, onStartListeningForIncomingConnectionsResultParams.e) && atyq.b(this.f, onStartListeningForIncomingConnectionsResultParams.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.d, this.e, this.f});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.v(parcel, 2, this.b, false);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.t(parcel, 4, this.d, i, false);
        atzr.t(parcel, 5, this.e, i, false);
        atzr.t(parcel, 6, this.f, i, false);
        atzr.c(parcel, a);
    }

    public OnStartListeningForIncomingConnectionsResultParams(int i, String str, BleConnectivityInfo bleConnectivityInfo, BluetoothConnectivityInfo bluetoothConnectivityInfo, WifiLanConnectivityInfo wifiLanConnectivityInfo, WifiLanConnectivityInfoV2 wifiLanConnectivityInfoV2) {
        this.a = i;
        this.b = str;
        this.c = bleConnectivityInfo;
        this.d = bluetoothConnectivityInfo;
        this.e = wifiLanConnectivityInfo;
        this.f = wifiLanConnectivityInfoV2;
    }
}
