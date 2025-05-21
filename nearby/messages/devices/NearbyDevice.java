package com.google.android.gms.nearby.messages.devices;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.ckcz;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class NearbyDevice extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ckcz();
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
        return arwb.b(this.c, nearbyDevice.c) && arwb.b(this.d, nearbyDevice.d);
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
        int a2 = arxc.a(parcel);
        arxc.v(parcel, 3, str, false);
        arxc.v(parcel, 6, this.d, false);
        arxc.o(parcel, ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, this.b);
        arxc.c(parcel, a2);
    }

    public NearbyDevice(String str, String str2) {
        this(1, str, str2);
    }
}
