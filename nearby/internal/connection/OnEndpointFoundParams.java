package com.google.android.gms.nearby.internal.connection;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.connection.ConnectionsDevice;
import com.google.android.gms.nearby.connection.v3.dct.DctDevice;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cjci;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class OnEndpointFoundParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cjci();
    public String a;
    public String b;
    public String c;
    public BluetoothDevice d;
    public byte[] e;
    public int f;
    public ConnectionsDevice g;
    public DctDevice h;

    public OnEndpointFoundParams() {
        this.f = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnEndpointFoundParams) {
            OnEndpointFoundParams onEndpointFoundParams = (OnEndpointFoundParams) obj;
            if (arwb.b(this.a, onEndpointFoundParams.a) && arwb.b(this.b, onEndpointFoundParams.b) && arwb.b(this.c, onEndpointFoundParams.c) && arwb.b(this.d, onEndpointFoundParams.d) && Arrays.equals(this.e, onEndpointFoundParams.e) && arwb.b(Integer.valueOf(this.f), Integer.valueOf(onEndpointFoundParams.f)) && arwb.b(this.g, onEndpointFoundParams.g) && arwb.b(this.h, onEndpointFoundParams.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, Integer.valueOf(Arrays.hashCode(this.e)), Integer.valueOf(this.f), this.g, this.h});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, this.a, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.t(parcel, 4, this.d, i, false);
        arxc.i(parcel, 5, this.e, false);
        arxc.o(parcel, 6, this.f);
        arxc.t(parcel, 7, this.g, i, false);
        arxc.t(parcel, 8, this.h, i, false);
        arxc.c(parcel, a);
    }

    public OnEndpointFoundParams(String str, String str2, String str3, BluetoothDevice bluetoothDevice, byte[] bArr, int i, ConnectionsDevice connectionsDevice, DctDevice dctDevice) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = bluetoothDevice;
        this.e = bArr;
        this.f = i;
        this.g = connectionsDevice;
        this.h = dctDevice;
    }
}
