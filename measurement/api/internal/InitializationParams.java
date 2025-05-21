package com.google.android.gms.measurement.api.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.cdgb;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class InitializationParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cdgb();
    public final long a;
    public final long b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;
    public final Bundle g;
    public final String h;

    public InitializationParams(long j, long j2, boolean z, String str, String str2, String str3, Bundle bundle, String str4) {
        this.a = j;
        this.b = j2;
        this.c = z;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = bundle;
        this.h = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.q(parcel, 1, this.a);
        arxc.q(parcel, 2, this.b);
        arxc.e(parcel, 3, this.c);
        arxc.v(parcel, 4, this.d, false);
        arxc.v(parcel, 5, this.e, false);
        arxc.v(parcel, 6, this.f, false);
        arxc.g(parcel, 7, this.g, false);
        arxc.v(parcel, 8, this.h, false);
        arxc.c(parcel, a);
    }
}
