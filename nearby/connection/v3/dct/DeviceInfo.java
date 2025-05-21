package com.google.android.gms.nearby.connection.v3.dct;

import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class DeviceInfo extends DctDeviceDataElement {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public DeviceInfo(byte[] r3) {
        /*
            r2 = this;
            int r0 = r3.length
            byte[] r3 = java.util.Arrays.copyOf(r3, r0)
            r1 = 7
            r2.<init>(r1, r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.nearby.connection.v3.dct.DeviceInfo.<init>(byte[]):void");
    }

    public final byte[] b() {
        byte[] bArr = this.c;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof DeviceInfo) {
            return Arrays.equals(this.c, ((DeviceInfo) obj).c);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c);
    }

    @Override // com.google.android.gms.nearby.connection.v3.dct.DctDeviceDataElement
    public final String toString() {
        return String.format("DeviceInfo: %s", Arrays.toString(this.c));
    }
}
