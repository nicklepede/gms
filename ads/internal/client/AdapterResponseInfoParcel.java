package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class AdapterResponseInfoParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new l();
    public final String a;
    public final long b;
    public final AdErrorParcel c;
    public final Bundle d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public AdapterResponseInfoParcel(String str, long j, AdErrorParcel adErrorParcel, Bundle bundle, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = j;
        this.c = adErrorParcel;
        this.d = bundle;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.q(parcel, 2, this.b);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.g(parcel, 4, this.d, false);
        arxc.v(parcel, 5, this.e, false);
        arxc.v(parcel, 6, this.f, false);
        arxc.v(parcel, 7, this.g, false);
        arxc.v(parcel, 8, this.h, false);
        arxc.c(parcel, a);
    }
}
