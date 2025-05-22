package com.google.android.gms.nearby.connection.v3.dct;

import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class TransmitPower extends DctDeviceDataElement {
    public TransmitPower(byte b) {
        super(3, 1, new byte[]{b});
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TransmitPower) {
            return Arrays.equals(this.c, ((TransmitPower) obj).c);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c);
    }

    @Override // com.google.android.gms.nearby.connection.v3.dct.DctDeviceDataElement
    public final String toString() {
        return String.format("TransmitPower: %s", Arrays.toString(this.c));
    }
}
