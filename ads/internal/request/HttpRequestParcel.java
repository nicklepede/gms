package com.google.android.gms.ads.internal.request;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
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
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.o(parcel, 2, this.b);
        atzr.g(parcel, 3, this.c, false);
        atzr.i(parcel, 4, this.d, false);
        atzr.e(parcel, 5, this.e);
        atzr.v(parcel, 6, this.f, false);
        atzr.v(parcel, 7, this.g, false);
        atzr.c(parcel, a);
    }
}
