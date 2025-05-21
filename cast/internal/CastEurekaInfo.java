package com.google.android.gms.cast.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.amxq;
import defpackage.arxc;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class CastEurekaInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new amxq();
    public final int a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final boolean i;

    public CastEurekaInfo(int i, boolean z, boolean z2, String str, String str2, String str3, String str4, String str5, boolean z3) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = z3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CastEurekaInfo)) {
            return false;
        }
        CastEurekaInfo castEurekaInfo = (CastEurekaInfo) obj;
        return this.a == castEurekaInfo.a && this.b == castEurekaInfo.b && this.c == castEurekaInfo.c && TextUtils.equals(this.d, castEurekaInfo.d) && TextUtils.equals(this.e, castEurekaInfo.e) && TextUtils.equals(this.f, castEurekaInfo.f) && TextUtils.equals(this.g, castEurekaInfo.g) && TextUtils.equals(this.h, castEurekaInfo.h) && this.i == castEurekaInfo.i;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c), this.d, this.e, this.f, this.g, this.h, Boolean.valueOf(this.i)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = arxc.a(parcel);
        arxc.o(parcel, 2, i2);
        arxc.e(parcel, 3, this.b);
        arxc.e(parcel, 4, this.c);
        arxc.v(parcel, 5, this.d, false);
        arxc.v(parcel, 6, this.e, false);
        arxc.v(parcel, 7, this.f, false);
        arxc.v(parcel, 8, this.g, false);
        arxc.v(parcel, 9, this.h, false);
        arxc.e(parcel, 10, this.i);
        arxc.c(parcel, a);
    }
}
