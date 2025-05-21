package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.amac;
import defpackage.amxr;
import defpackage.arxc;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class AdBreakInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new amac();
    public final long a;
    public final String b;
    public final long c;
    public final boolean d;
    public final String[] e;
    public final boolean f;
    public final boolean g;

    public AdBreakInfo(long j, String str, long j2, boolean z, String[] strArr, boolean z2, boolean z3) {
        this.a = j;
        this.b = str;
        this.c = j2;
        this.d = z;
        this.e = strArr;
        this.f = z2;
        this.g = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdBreakInfo)) {
            return false;
        }
        AdBreakInfo adBreakInfo = (AdBreakInfo) obj;
        return amxr.u(this.b, adBreakInfo.b) && this.a == adBreakInfo.a && this.c == adBreakInfo.c && this.d == adBreakInfo.d && Arrays.equals(this.e, adBreakInfo.e) && this.f == adBreakInfo.f && this.g == adBreakInfo.g;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.a;
        int a = arxc.a(parcel);
        arxc.q(parcel, 2, j);
        arxc.v(parcel, 3, this.b, false);
        arxc.q(parcel, 4, this.c);
        arxc.e(parcel, 5, this.d);
        arxc.w(parcel, 6, this.e, false);
        arxc.e(parcel, 7, this.f);
        arxc.e(parcel, 8, this.g);
        arxc.c(parcel, a);
    }
}
