package com.google.android.gms.ads.internal.util.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class VersionInfoParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new n();
    public String a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;

    public VersionInfoParcel(String str, int i, int i2, boolean z, boolean z2) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.v(parcel, 2, this.a, false);
        arxc.o(parcel, 3, this.b);
        arxc.o(parcel, 4, this.c);
        arxc.e(parcel, 5, this.d);
        arxc.e(parcel, 6, this.e);
        arxc.c(parcel, a);
    }

    public VersionInfoParcel(int i, int i2) {
        this(defpackage.a.s(i2, i, "afma-sdk-a-v", ".", ".0"), i, i2, true, false);
    }
}
