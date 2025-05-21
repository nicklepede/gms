package com.google.android.gms.nearby.connection.v3.dct;

import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class DevicePlatform extends DctDeviceDataElement {
    public DevicePlatform(int i) {
        super(2, 1, new byte[]{(byte) i});
    }

    public final boolean equals(Object obj) {
        if (obj instanceof DevicePlatform) {
            return Arrays.equals(this.c, ((DevicePlatform) obj).c);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c);
    }

    @Override // com.google.android.gms.nearby.connection.v3.dct.DctDeviceDataElement
    public final String toString() {
        return String.format("DevicePlatform: %s", Arrays.toString(this.c));
    }
}
