package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.chmk;
import defpackage.chmn;
import defpackage.choa;
import defpackage.elgo;
import defpackage.eqba;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class WifiLanConnectivityInfoV2 extends AbstractSafeParcelable implements chmk {
    public static final Parcelable.Creator CREATOR = new choa();
    public static final elgo a = elgo.q((byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0);
    public final byte[] b;
    private final byte[] c;
    private final byte[] d;
    private final byte[] e;

    public WifiLanConnectivityInfoV2(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.b = bArr;
        this.c = bArr2;
        this.d = bArr3;
        this.e = bArr4;
    }

    @Override // defpackage.chmk
    public final int a() {
        return 5;
    }

    public final byte[] b() {
        return (byte[]) this.c.clone();
    }

    public final byte[] c() {
        return (byte[]) this.b.clone();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof WifiLanConnectivityInfoV2) {
            WifiLanConnectivityInfoV2 wifiLanConnectivityInfoV2 = (WifiLanConnectivityInfoV2) obj;
            if (Arrays.equals(this.b, wifiLanConnectivityInfoV2.b) && Arrays.equals(this.c, wifiLanConnectivityInfoV2.c) && Arrays.equals(this.d, wifiLanConnectivityInfoV2.d) && Arrays.equals(this.e, wifiLanConnectivityInfoV2.e)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.chmm
    public final byte[] g() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = this.b;
            int i = 2;
            boolean z = true;
            atzb.c(bArr.length == 2, "The Port can't be empty");
            byte[] bArr2 = this.c;
            int length = bArr2.length;
            if (length != 4) {
                if (length == 16) {
                    length = 16;
                } else {
                    z = false;
                }
            }
            atzb.c(z, "The IP address has invalid length");
            if (length != 4) {
                i = 3;
            }
            byteArrayOutputStream.write(i);
            byteArrayOutputStream.write(bArr2);
            byteArrayOutputStream.write(bArr);
            byte[] bArr3 = this.d;
            if (bArr3 == null || bArr3.length != 6) {
                byteArrayOutputStream.write(eqba.e(a));
            } else {
                byteArrayOutputStream.write(bArr3);
            }
            byte[] bArr4 = this.e;
            if (bArr4 != null && bArr4.length > 0) {
                byteArrayOutputStream.write(bArr4);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.reset();
            byteArrayOutputStream.write(chmn.g(20, byteArray.length));
            byteArrayOutputStream.write(byteArray);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            Log.i("NearbyConnections", "Failed to write WifiLan data elements bytes.");
            return new byte[0];
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.b)), Integer.valueOf(Arrays.hashCode(this.c)), Integer.valueOf(Arrays.hashCode(this.d)), Integer.valueOf(Arrays.hashCode(this.e))});
    }

    public final String toString() {
        return String.format("WifiLanConnectivityInfoV2:<wifiLanPort hash: %s>, <wifiLanIp hash: %s>, <BSSID hash: %s>, <actions hash: %s>", Integer.valueOf(Arrays.hashCode(this.b)), Integer.valueOf(Arrays.hashCode(this.c)), Integer.valueOf(Arrays.hashCode(this.d)), Integer.valueOf(Arrays.hashCode(this.e)));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = atzr.a(parcel);
        atzr.i(parcel, 1, c(), false);
        atzr.i(parcel, 2, b(), false);
        byte[] bArr = this.d;
        atzr.i(parcel, 3, bArr == null ? null : (byte[]) bArr.clone(), false);
        byte[] bArr2 = this.e;
        atzr.i(parcel, 4, bArr2 != null ? (byte[]) bArr2.clone() : null, false);
        atzr.c(parcel, a2);
    }
}
