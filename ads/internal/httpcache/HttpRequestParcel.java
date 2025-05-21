package com.google.android.gms.ads.internal.httpcache;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class HttpRequestParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new b();
    public final String a;
    public final String[] b;
    public final String[] c;

    public HttpRequestParcel(String str, String[] strArr, String[] strArr2) {
        this.a = str;
        this.b = strArr;
        this.c = strArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.w(parcel, 2, this.b, false);
        arxc.w(parcel, 3, this.c, false);
        arxc.c(parcel, a);
    }
}
