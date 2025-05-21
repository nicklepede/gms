package com.google.android.gms.nearby.internal.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.connection.BleConnectivityInfo;
import com.google.android.gms.nearby.connection.BluetoothConnectivityInfo;
import com.google.android.gms.nearby.connection.WifiLanConnectivityInfo;
import com.google.android.gms.nearby.connection.WifiLanConnectivityInfoV2;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cjcr;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class OnStartListeningForIncomingConnectionsResultParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cjcr();
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
            if (arwb.b(Integer.valueOf(this.a), Integer.valueOf(onStartListeningForIncomingConnectionsResultParams.a)) && arwb.b(this.b, onStartListeningForIncomingConnectionsResultParams.b) && arwb.b(this.c, onStartListeningForIncomingConnectionsResultParams.c) && arwb.b(this.d, onStartListeningForIncomingConnectionsResultParams.d) && arwb.b(this.e, onStartListeningForIncomingConnectionsResultParams.e) && arwb.b(this.f, onStartListeningForIncomingConnectionsResultParams.f)) {
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
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.v(parcel, 2, this.b, false);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.t(parcel, 4, this.d, i, false);
        arxc.t(parcel, 5, this.e, i, false);
        arxc.t(parcel, 6, this.f, i, false);
        arxc.c(parcel, a);
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
