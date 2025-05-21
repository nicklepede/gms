package com.google.android.gms.ads.internal.request;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@Deprecated
/* loaded from: classes2.dex */
public class HttpRequestParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new d();
    public final String a;
    public final int b;
    public final Bundle c;
    public final byte[] d;
    public final boolean e;
    public final String f;
    public final String g;

    public HttpRequestParcel(String str, int i, Bundle bundle, byte[] bArr, boolean z, String str2, String str3) {
        this.a = str;
        this.b = i;
        this.c = bundle;
        this.d = bArr;
        this.e = z;
        this.f = str2;
        this.g = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.o(parcel, 2, this.b);
        arxc.g(parcel, 3, this.c, false);
        arxc.i(parcel, 4, this.d, false);
        arxc.e(parcel, 5, this.e);
        arxc.v(parcel, 6, this.f, false);
        arxc.v(parcel, 7, this.g, false);
        arxc.c(parcel, a);
    }
}
