package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.zog;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class ProxyRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new zog();
    final int a;
    public final String b;
    public final int c;
    public final long d;
    public final byte[] e;
    public final Bundle f;

    public ProxyRequest(int i, String str, int i2, long j, byte[] bArr, Bundle bundle) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = j;
        this.e = bArr;
        this.f = bundle;
    }

    public final String toString() {
        return "ProxyRequest[ url: " + this.b + ", method: " + this.c + " ]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.b;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.o(parcel, 2, this.c);
        arxc.q(parcel, 3, this.d);
        arxc.i(parcel, 4, this.e, false);
        arxc.g(parcel, 5, this.f, false);
        arxc.o(parcel, ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, this.a);
        arxc.c(parcel, a);
    }
}
