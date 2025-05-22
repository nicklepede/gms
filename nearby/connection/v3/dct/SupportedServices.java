package com.google.android.gms.nearby.connection.v3.dct;

import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class SupportedServices extends DctDeviceDataElement {
    public SupportedServices(byte b) {
        super(6, 1, new byte[]{b});
    }

    public static int b(byte[] bArr) {
        if (bArr.length == 1) {
            return bArr[0];
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof SupportedServices) {
            return Arrays.equals(this.c, ((SupportedServices) obj).c);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c);
    }

    @Override // com.google.android.gms.nearby.connection.v3.dct.DctDeviceDataElement
    public final String toString() {
        return String.format("SupportedServices: %s", Arrays.toString(this.c));
    }
}
