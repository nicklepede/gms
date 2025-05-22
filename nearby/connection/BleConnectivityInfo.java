package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.chlo;
import defpackage.chmk;
import defpackage.chmn;
import defpackage.ekti;
import defpackage.ekvl;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class BleConnectivityInfo extends AbstractSafeParcelable implements chmk {
    public static final Parcelable.Creator CREATOR = new chlo();
    public final byte[] a;
    public final byte[] b;
    public final byte[] c;
    public final byte[] d;
    public final byte[] e;

    public BleConnectivityInfo(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.a = bArr;
        this.b = bArr2;
        this.c = bArr3;
        this.d = bArr4;
        this.e = bArr5;
    }

    @Override // defpackage.chmk
    public final int a() {
        return 4;
    }

    public final byte[] b() {
        byte[] bArr = this.c;
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    public final byte[] c() {
        byte[] bArr = this.b;
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    public final byte[] d() {
        byte[] bArr = this.a;
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    public final byte[] e() {
        byte[] bArr = this.e;
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof BleConnectivityInfo) {
            BleConnectivityInfo bleConnectivityInfo = (BleConnectivityInfo) obj;
            if (Arrays.equals(this.a, bleConnectivityInfo.a) && Arrays.equals(this.b, bleConnectivityInfo.b) && Arrays.equals(this.c, bleConnectivityInfo.c) && Arrays.equals(this.d, bleConnectivityInfo.d) && Arrays.equals(this.e, bleConnectivityInfo.e)) {
                return true;
            }
        }
        return false;
    }

    public final byte[] f() {
        byte[] bArr = this.d;
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    @Override // defpackage.chmm
    public final byte[] g() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(1);
            byte[] bArr = this.a;
            boolean z = bArr != null && bArr.length == 6;
            byte[] bArr2 = this.b;
            boolean z2 = bArr2 != null && bArr2.length > 0;
            byte[] bArr3 = this.d;
            boolean z3 = bArr3 != null && bArr3.length == 2;
            byte[] bArr4 = this.e;
            boolean z4 = bArr4 != null && bArr4.length == 2;
            int i = true != z ? 0 : 64;
            int i2 = true != z2 ? 0 : 32;
            byteArrayOutputStream.write((true != z4 ? 0 : 8) | i | i2 | (true != z3 ? 0 : 16));
            if (z) {
                ekvl.y(bArr);
                byteArrayOutputStream.write(bArr);
            }
            if (z2) {
                ekvl.y(bArr2);
                byteArrayOutputStream.write((byte) bArr2.length);
                byteArrayOutputStream.write(bArr2);
            }
            if (z3) {
                ekvl.y(bArr3);
                byteArrayOutputStream.write(bArr3);
            }
            if (z4) {
                ekvl.y(bArr4);
                byteArrayOutputStream.write(bArr4);
            }
            byte[] bArr5 = this.c;
            if (bArr5 != null && bArr5.length > 0) {
                byteArrayOutputStream.write(bArr5);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.reset();
            byteArrayOutputStream.write(chmn.g(20, byteArray.length));
            byteArrayOutputStream.write(byteArray);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            Log.i("NearbyConnections", "Failed to write Ble data elements bytes.");
            return new byte[0];
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), Integer.valueOf(Arrays.hashCode(this.b)), Integer.valueOf(Arrays.hashCode(this.c)), Integer.valueOf(Arrays.hashCode(this.d)), Integer.valueOf(Arrays.hashCode(this.e))});
    }

    public final String toString() {
        String d;
        byte[] bArr = this.a;
        if (bArr != null && bArr.length == 6) {
            StringBuilder sb = new StringBuilder(18);
            for (int i = 0; i < 6; i++) {
                byte b = bArr[i];
                if (sb.length() > 0) {
                    sb.append(':');
                }
                sb.append(String.format("%02x", Byte.valueOf(b)));
            }
            d = ekti.d(sb.toString());
        } else {
            d = null;
        }
        byte[] bArr2 = this.b;
        Integer valueOf = bArr2 == null ? null : Integer.valueOf(Arrays.hashCode(bArr2));
        byte[] bArr3 = this.c;
        Integer valueOf2 = bArr3 == null ? null : Integer.valueOf(Arrays.hashCode(bArr3));
        byte[] bArr4 = this.d;
        Integer valueOf3 = bArr4 == null ? null : Integer.valueOf(Arrays.hashCode(bArr4));
        byte[] bArr5 = this.e;
        return String.format("BleConnectivityInfo:<bleMacAddress hash: %s, bleGattCharacteristic hash: %s, actions hash: %s, psm hash: %s, deviceToken hash : %s>", d, valueOf, valueOf2, valueOf3, bArr5 != null ? Integer.valueOf(Arrays.hashCode(bArr5)) : null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.i(parcel, 1, d(), false);
        atzr.i(parcel, 2, c(), false);
        atzr.i(parcel, 3, b(), false);
        atzr.i(parcel, 4, f(), false);
        atzr.i(parcel, 5, e(), false);
        atzr.c(parcel, a);
    }
}
