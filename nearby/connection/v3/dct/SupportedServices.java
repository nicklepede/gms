package com.google.android.gms.nearby.connection.v3.dct;

import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class SupportedServices extends DctDeviceDataElement {
    public static final /* synthetic */ int d = 0;

    public SupportedServices(byte b) {
        super(6, 1, new byte[]{b});
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
