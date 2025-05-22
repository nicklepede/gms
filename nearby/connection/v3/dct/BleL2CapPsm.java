package com.google.android.gms.nearby.connection.v3.dct;

import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class BleL2CapPsm extends DctDeviceDataElement {
    public BleL2CapPsm(int i) {
        super(4, 2, new byte[]{(byte) (i & 255), (byte) ((i >> 8) & 255)});
    }

    public final boolean equals(Object obj) {
        if (obj instanceof BleL2CapPsm) {
            return Arrays.equals(this.c, ((BleL2CapPsm) obj).c);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c);
    }

    @Override // com.google.android.gms.nearby.connection.v3.dct.DctDeviceDataElement
    public final String toString() {
        return String.format("BleL2CapPsm: %s", Arrays.toString(this.c));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public BleL2CapPsm(byte[] r4) {
        /*
            r3 = this;
            int r0 = r4.length
            byte[] r4 = java.util.Arrays.copyOf(r4, r0)
            r1 = 4
            r2 = 2
            r3.<init>(r1, r2, r4)
            if (r0 != r2) goto Ld
            return
        Ld:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r2 = 0
            r1[r2] = r4
            r4 = 1
            r1[r4] = r0
            java.lang.String r4 = "Incorrect size for BLE L2CAP PSM: expected %d, actual %d"
            java.lang.String r4 = java.lang.String.format(r4, r1)
            java.lang.String r0 = "NC_BleL2CapPsm"
            android.util.Log.i(r0, r4)
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Incorrect size for BLE L2CAP PSM."
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.nearby.connection.v3.dct.BleL2CapPsm.<init>(byte[]):void");
    }
}
