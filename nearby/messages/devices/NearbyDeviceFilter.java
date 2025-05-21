package com.google.android.gms.nearby.messages.devices;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.ckda;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class NearbyDeviceFilter extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ckda();
    final int a;
    public final int b;
    public final byte[] c;
    public final boolean d;

    public NearbyDeviceFilter(int i, int i2, byte[] bArr, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = bArr;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.b);
        arxc.i(parcel, 2, this.c, false);
        arxc.e(parcel, 3, this.d);
        arxc.o(parcel, ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, this.a);
        arxc.c(parcel, a);
    }
}
