package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.amad;
import defpackage.amxr;
import defpackage.amye;
import defpackage.arxc;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class AdBreakStatus extends AbstractSafeParcelable {
    public final long b;
    public final long c;
    public final String d;
    public final String e;
    public final long f;
    public static final amye a = new amye("AdBreakStatus");
    public static final Parcelable.Creator CREATOR = new amad();

    public AdBreakStatus(long j, long j2, String str, String str2, long j3) {
        this.b = j;
        this.c = j2;
        this.d = str;
        this.e = str2;
        this.f = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdBreakStatus)) {
            return false;
        }
        AdBreakStatus adBreakStatus = (AdBreakStatus) obj;
        return this.b == adBreakStatus.b && this.c == adBreakStatus.c && amxr.u(this.d, adBreakStatus.d) && amxr.u(this.e, adBreakStatus.e) && this.f == adBreakStatus.f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.b), Long.valueOf(this.c), this.d, this.e, Long.valueOf(this.f)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.b;
        int a2 = arxc.a(parcel);
        arxc.q(parcel, 2, j);
        arxc.q(parcel, 3, this.c);
        arxc.v(parcel, 4, this.d, false);
        arxc.v(parcel, 5, this.e, false);
        arxc.q(parcel, 6, this.f);
        arxc.c(parcel, a2);
    }
}
