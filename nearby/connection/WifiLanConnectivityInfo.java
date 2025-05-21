package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.cfey;
import defpackage.cffb;
import defpackage.cfgm;
import defpackage.eiig;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@Deprecated
/* loaded from: classes5.dex */
public class WifiLanConnectivityInfo extends AbstractSafeParcelable implements cfey {
    public static final Parcelable.Creator CREATOR = new cfgm();
    public final byte[] a;
    private final byte[] b;
    private final byte[] c;
    private final byte[] d;

    public WifiLanConnectivityInfo(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = bArr;
        this.b = bArr2;
        this.c = bArr3;
        this.d = bArr4;
    }

    @Override // defpackage.cfey
    public final int a() {
        return 5;
    }

    public final byte[] b() {
        byte[] bArr = this.d;
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    public final byte[] c() {
        byte[] bArr = this.c;
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

    public final byte[] e() {
        byte[] bArr = this.a;
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof WifiLanConnectivityInfo) {
            WifiLanConnectivityInfo wifiLanConnectivityInfo = (WifiLanConnectivityInfo) obj;
            if (Arrays.equals(this.a, wifiLanConnectivityInfo.a) && Arrays.equals(this.b, wifiLanConnectivityInfo.b) && Arrays.equals(this.c, wifiLanConnectivityInfo.c) && Arrays.equals(this.d, wifiLanConnectivityInfo.d)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cffa
    public final byte[] g() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = this.a;
            if (bArr == null || bArr.length != 2) {
                throw new IllegalArgumentException("The Port can't be empty");
            }
            byteArrayOutputStream.write(2);
            byte[] bArr2 = this.b;
            boolean z = bArr2 != null && bArr2.length == 4;
            boolean z2 = bArr2 != null && bArr2.length == 16;
            byte[] bArr3 = this.c;
            boolean z3 = bArr3 != null && bArr3.length == 6;
            byteArrayOutputStream.write((true != z3 ? 0 : 8) | 16 | (true != z ? 0 : 64) | (true != z2 ? 0 : 32));
            if (z) {
                eiig.x(bArr2);
                byteArrayOutputStream.write(bArr2);
            }
            if (z2) {
                eiig.x(bArr2);
                byteArrayOutputStream.write(bArr2);
            }
            byteArrayOutputStream.write(bArr);
            if (z3) {
                eiig.x(bArr3);
                byteArrayOutputStream.write(bArr3);
            }
            byte[] bArr4 = this.d;
            if (bArr4 != null && bArr4.length > 0) {
                byteArrayOutputStream.write(bArr4);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.reset();
            byteArrayOutputStream.write(cffb.g(20, byteArray.length));
            byteArrayOutputStream.write(byteArray);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            Log.i("NearbyConnections", "Failed to write WifiLan data elements bytes.");
            return new byte[0];
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), Integer.valueOf(Arrays.hashCode(this.b)), Integer.valueOf(Arrays.hashCode(this.c)), Integer.valueOf(Arrays.hashCode(this.d))});
    }

    public final String toString() {
        return String.format("WifiLanConnectivityInfo:<wifiLanPort hash: %s>, <wifiLanIp hash: %s>, <BSSID hash: %s>, <actions hash: %s>", Integer.valueOf(Arrays.hashCode(this.a)), Integer.valueOf(Arrays.hashCode(this.b)), Integer.valueOf(Arrays.hashCode(this.c)), Integer.valueOf(Arrays.hashCode(this.d)));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.i(parcel, 1, e(), false);
        arxc.i(parcel, 2, d(), false);
        arxc.i(parcel, 3, c(), false);
        arxc.i(parcel, 4, b(), false);
        arxc.c(parcel, a);
    }
}
