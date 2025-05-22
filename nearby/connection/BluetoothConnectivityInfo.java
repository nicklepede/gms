package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.chlq;
import defpackage.chlr;
import defpackage.chmk;
import defpackage.chmn;
import defpackage.ekvl;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class BluetoothConnectivityInfo extends AbstractSafeParcelable implements chmk {
    public static final Parcelable.Creator CREATOR = new chlq();
    private final byte[] a;
    private final byte[] b;
    private final byte[] c;

    public BluetoothConnectivityInfo(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = bArr;
        this.b = bArr2;
        this.c = bArr3;
    }

    @Override // defpackage.chmk
    public final int a() {
        return 2;
    }

    public final byte[] b() {
        byte[] bArr = this.c;
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    public final byte[] c() {
        byte[] bArr = this.a;
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    public final byte[] d() {
        byte[] bArr = this.b;
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof BluetoothConnectivityInfo) {
            BluetoothConnectivityInfo bluetoothConnectivityInfo = (BluetoothConnectivityInfo) obj;
            if (Arrays.equals(this.a, bluetoothConnectivityInfo.a) && Arrays.equals(this.b, bluetoothConnectivityInfo.b) && Arrays.equals(this.c, bluetoothConnectivityInfo.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.chmm
    public final byte[] g() {
        int length;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = this.a;
            if (bArr == null || bArr.length != 6) {
                throw new IllegalArgumentException("The MAC address can't be empty");
            }
            byteArrayOutputStream.write(0);
            byte[] bArr2 = this.b;
            boolean z = bArr2 != null && bArr2.length == 4;
            byteArrayOutputStream.write(true != z ? 64 : 96);
            byteArrayOutputStream.write(bArr);
            if (z) {
                ekvl.y(bArr2);
                byteArrayOutputStream.write(bArr2);
            }
            byte[] bArr3 = this.c;
            if (bArr3 != null && (length = bArr3.length) > 0) {
                Log.i("NearbyConnections", String.format("Writing %d action(s): %s", Integer.valueOf(length), chlr.b(bArr3)));
                byteArrayOutputStream.write(bArr3);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.reset();
            byteArrayOutputStream.write(chmn.g(20, byteArray.length));
            byteArrayOutputStream.write(byteArray);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            Log.i("NearbyConnections", "Failed to write Bluetooth data elements bytes.");
            return new byte[0];
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), Integer.valueOf(Arrays.hashCode(this.b)), Integer.valueOf(Arrays.hashCode(this.c))});
    }

    public final String toString() {
        byte[] bArr = this.a;
        Integer valueOf = bArr == null ? null : Integer.valueOf(Arrays.hashCode(bArr));
        byte[] bArr2 = this.b;
        Integer valueOf2 = bArr2 == null ? null : Integer.valueOf(Arrays.hashCode(bArr2));
        byte[] bArr3 = this.c;
        return String.format("BluetoothConnectivityInfo:<bluetoothMacAddress hash: %s, bluetoothUuid hash: %s, actions hash: %s>", valueOf, valueOf2, bArr3 != null ? Integer.valueOf(Arrays.hashCode(bArr3)) : null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.i(parcel, 1, c(), false);
        atzr.i(parcel, 2, d(), false);
        atzr.i(parcel, 3, b(), false);
        atzr.c(parcel, a);
    }
}
