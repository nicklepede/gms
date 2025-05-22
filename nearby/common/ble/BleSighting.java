package com.google.android.gms.nearby.common.ble;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.chfm;
import defpackage.chfp;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class BleSighting extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new chfp();
    public final BluetoothDevice a;
    public final chfm b;
    public final byte[] c;
    public final int d;
    public final long e;

    public BleSighting(BluetoothDevice bluetoothDevice, byte[] bArr, int i, long j) {
        this.a = bluetoothDevice;
        this.c = bArr;
        this.d = i;
        this.e = j;
        this.b = chfm.a(bArr);
    }

    public static BleSighting a(ScanResult scanResult) {
        ScanRecord scanRecord = scanResult.getScanRecord();
        if (scanRecord == null) {
            return null;
        }
        return new BleSighting(scanResult.getDevice(), scanRecord.getBytes(), scanResult.getRssi(), scanResult.getTimestampNanos());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleSighting)) {
            return false;
        }
        BleSighting bleSighting = (BleSighting) obj;
        return atyq.b(this.a, bleSighting.a) && this.d == bleSighting.d && Arrays.equals(this.c, bleSighting.c) && this.e == bleSighting.e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.d), Long.valueOf(this.e), Integer.valueOf(Arrays.hashCode(this.c))});
    }

    public final String toString() {
        return "BleSighting{device=" + String.valueOf(this.a) + ", bleRecord=" + this.b.toString() + ", rssi=" + this.d + ", timestampNanos=" + this.e + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 2, this.a, i, false);
        atzr.i(parcel, 3, this.c, false);
        atzr.o(parcel, 4, this.d);
        atzr.q(parcel, 5, this.e);
        atzr.c(parcel, a);
    }
}
