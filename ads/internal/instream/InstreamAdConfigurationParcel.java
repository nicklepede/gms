package com.google.android.gms.ads.internal.instream;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class InstreamAdConfigurationParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new a();
    public final int a;
    public final int b;
    public final String c;
    public final int d;

    public InstreamAdConfigurationParcel(int i, int i2, String str, int i3) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.b);
        arxc.v(parcel, 2, this.c, false);
        arxc.o(parcel, 3, this.d);
        arxc.o(parcel, ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, this.a);
        arxc.c(parcel, a);
    }
}
