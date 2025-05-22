package com.google.android.gms.nearby.messages.devices;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cmle;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class NearbyDevice extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cmle();
    public static final NearbyDevice a = new NearbyDevice("", null);
    final int b;
    public final String c;
    public final String d;

    public NearbyDevice(int i, String str, String str2) {
        Integer.valueOf(i).getClass();
        this.b = i;
        this.c = str == null ? "" : str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyDevice)) {
            return false;
        }
        NearbyDevice nearbyDevice = (NearbyDevice) obj;
        return atyq.b(this.c, nearbyDevice.c) && atyq.b(this.d, nearbyDevice.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, this.d});
    }

    public final String toString() {
        return "NearbyDevice{handle=" + this.c + ", bluetoothAddress=" + this.d + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.c;
        int a2 = atzr.a(parcel);
        atzr.v(parcel, 3, str, false);
        atzr.v(parcel, 6, this.d, false);
        atzr.o(parcel, ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, this.b);
        atzr.c(parcel, a2);
    }

    public NearbyDevice(String str, String str2) {
        this(1, str, str2);
    }
}
