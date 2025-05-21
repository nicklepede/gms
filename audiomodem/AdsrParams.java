package com.google.android.gms.audiomodem;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.uku;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class AdsrParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new uku();
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final float e;

    public AdsrParams(long j, long j2, long j3, long j4, float f) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = f;
    }

    public final long a() {
        return this.a + this.b + this.c + this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsrParams)) {
            return false;
        }
        AdsrParams adsrParams = (AdsrParams) obj;
        return this.a == adsrParams.a && this.b == adsrParams.b && this.c == adsrParams.c && this.d == adsrParams.d && this.e == adsrParams.e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c), Long.valueOf(this.d), Float.valueOf(this.e)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.a;
        int a = arxc.a(parcel);
        arxc.q(parcel, 2, j);
        arxc.q(parcel, 3, this.b);
        arxc.q(parcel, 4, this.c);
        arxc.q(parcel, 5, this.d);
        arxc.l(parcel, 6, this.e);
        arxc.c(parcel, a);
    }
}
