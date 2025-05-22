package com.google.android.gms.ads.internal.httpcache;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class HttpResponseParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new c();
    public final boolean a;
    public final String b;
    public final int c;
    public final byte[] d;
    public final String[] e;
    public final String[] f;
    public final boolean g;
    public final long h;

    public HttpResponseParcel(boolean z, String str, int i, byte[] bArr, String[] strArr, String[] strArr2, boolean z2, long j) {
        this.a = z;
        this.b = str;
        this.c = i;
        this.d = bArr;
        this.e = strArr;
        this.f = strArr2;
        this.g = z2;
        this.h = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.e(parcel, 1, this.a);
        atzr.v(parcel, 2, this.b, false);
        atzr.o(parcel, 3, this.c);
        atzr.i(parcel, 4, this.d, false);
        atzr.w(parcel, 5, this.e, false);
        atzr.w(parcel, 6, this.f, false);
        atzr.e(parcel, 7, this.g);
        atzr.q(parcel, 8, this.h);
        atzr.c(parcel, a);
    }
}
